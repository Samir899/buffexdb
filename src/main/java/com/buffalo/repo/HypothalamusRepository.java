package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Hypothalamus;

public interface HypothalamusRepository extends CrudRepository<Hypothalamus, Integer>{
	
	@Query("SELECT u FROM Hypothalamus u WHERE u.SRR24057944>=:lowerLimit and u.SRR24057945>=:lowerLimit and u.SRR24057946>=:lowerLimit and u.SRR24057947>=:lowerLimit and u.SRR15721742>=:lowerLimit and "
			+ "u.SRR24057944<=:upperLimit and u.SRR24057945<=:upperLimit and u.SRR24057946<=:upperLimit and u.SRR24057947<=:upperLimit and u.SRR15721742<=:upperLimit "
			+ "ORDER BY SRR24057944, SRR24057945, SRR24057946, SRR24057947, SRR15721742 LIMIT 100")
	public List<Hypothalamus> getHypothalamusSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

//	@Query("SELECT u FROM Genes u WHERE u.geneId = :geneId")
//	public Genes getGeneByGeneId(@Param("geneId") String geneId);
//	
//	@Query("SELECT u FROM Genes u WHERE u.geneName = :geneName")
//	public List<Genes> getGeneByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.geneName = :geneName")
//	public List<String> getGeneIdByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT u FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<Genes> getGeneByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<String> getGeneIdByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT u FROM Genes u WHERE u.strand = :strand")
//	public List<Genes> getGeneByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.strand = :strand")
//	public List<String> getGeneIdByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes")
//	public List<String> getAllGeneId();
//	
//	@Query(value = "Select u from Genes u where u.geneId In :geneIds")
//	public List<Genes> getGenesByGeneList(List<String> geneIds);
	
	@Query("SELECT sum(SRR24057944) as SRR24057944, sum(SRR24057945) as SRR24057945, sum(SRR24057946) as SRR24057946,"
			+ " sum(SRR24057947) as SRR24057947, sum(SRR15721742) as SRR15721742 FROM Hypothalamus")
	
	public Map <String, Double> getSum();
}
