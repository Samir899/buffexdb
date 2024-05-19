package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Lungs;

public interface LungRepository extends CrudRepository<Lungs, Integer>{
	
	@Query("SELECT u FROM Lungs u WHERE u.ERR315645>=:lowerLimit and u.SRR24057925>=:lowerLimit and u.SRR24057926>=:lowerLimit and u.SRR24057927>=:lowerLimit and u.SRR24057928>=:lowerLimit and u.SRR15721739>=:lowerLimit and "
			+ "u.ERR315645<=:upperLimit and u.SRR24057925<=:upperLimit and u.SRR24057926<=:upperLimit and u.SRR24057927<=:upperLimit and u.SRR24057928<=:upperLimit and u.SRR15721739<=:upperLimit "
			+ "ORDER BY ERR315645, SRR24057925, SRR24057926, SRR24057927, SRR24057928, SRR15721739 LIMIT 100")
	public List<Lungs> getLungSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315645) as ERR315645, sum(SRR24057925) as SRR24057925, sum(SRR24057926) as SRR24057926, "
			+ "sum(SRR24057927) as SRR24057927, sum(SRR24057928) as SRR24057928, sum(SRR15721739) as SRR15721739 FROM Lungs")
	
	public Map<String, Double> getSum();
}
