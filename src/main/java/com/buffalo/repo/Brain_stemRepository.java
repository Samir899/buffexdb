package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain_stem;


public interface Brain_stemRepository extends CrudRepository<Brain_stem, Integer>{

	@Query("SELECT u FROM Brain_stem u WHERE u.SRR24057957>=:lowerLimit and u.SRR24057958>=:lowerLimit and u.SRR24057959>=:lowerLimit and u.SRR24057960>=:lowerLimit and "
			+ "u.SRR24057957<=:upperLimit and u.SRR24057958<=:upperLimit and u.SRR24057959<=:upperLimit and u.SRR24057960<=:upperLimit "
			+ "ORDER BY SRR24057957, SRR24057958, SRR24057959, SRR24057960 LIMIT 50")
	public List<Brain_stem> getBrain_stemSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
	
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
	
	@Query("SELECT sum(SRR24057957) as SRR24057957, sum(SRR24057958) as SRR24057958, sum(SRR24057959) as SRR24057959, sum(SRR24057960) as SRR24057960 FROM Brain_stem")
	public Map <String, Double> getSum();
}
