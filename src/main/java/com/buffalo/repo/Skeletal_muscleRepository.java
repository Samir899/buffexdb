package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Skeletal_muscle;

public interface Skeletal_muscleRepository extends CrudRepository<Skeletal_muscle, Integer>{
	
	@Query("SELECT u FROM Skeletal_muscle u WHERE u.SRR24057916>=:lowerLimit and u.SRR24057917>=:lowerLimit and u.SRR24057918>=:lowerLimit and u.SRR24057920>=:lowerLimit and "
			+ "u.SRR24057916<=:upperLimit and u.SRR24057917<=:upperLimit and u.SRR24057918<=:upperLimit and u.SRR24057920<=:upperLimit "
			+ "ORDER BY SRR24057916, SRR24057917, SRR24057918, SRR24057920 LIMIT 100")
	public List<Skeletal_muscle> getSkeletal_muscleSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR24057916) as SRR24057916, sum(SRR24057917) as SRR24057917, sum(SRR24057918) as SRR24057918, sum(SRR24057920) as SRR24057920 FROM Skeletal_muscle")
	public Map <String, Double> getSum();
}
