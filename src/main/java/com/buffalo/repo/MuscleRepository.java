package com.buffalo.repo;

import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Muscle;

public interface MuscleRepository extends CrudRepository<Muscle, Integer>{
	
	@Query("SELECT u FROM Muscle u WHERE u.SRR13435634>=:lowerLimit and u.SRR13435635>=:lowerLimit and u.SRR13435636>=:lowerLimit and u.SRR13435637>=:lowerLimit and u.SRR13435638>=:lowerLimit and u.SRR10312259>=:lowerLimit and u.SRR10312260>=:lowerLimit and u.SRR10312261>=:lowerLimit and u.SRR15721759>=:lowerLimit and u.SRR13435639>=:lowerLimit and "
			+ "u.SRR13435634<=:upperLimit and u.SRR13435635<=:upperLimit and u.SRR13435636<=:upperLimit and u.SRR13435637<=:upperLimit and u.SRR13435638<=:upperLimit and u.SRR10312259<=:upperLimit and u.SRR10312260<=:upperLimit and u.SRR10312261<=:upperLimit and u.SRR15721759<=:upperLimit and u.SRR13435639<=:upperLimit "
			+ "ORDER BY SRR13435634, SRR13435635, SRR13435636, SRR13435637, SRR13435638, SRR10312259, SRR10312260, SRR10312261, SRR15721759, SRR13435639 LIMIT 100")
	public List<Muscle> getMuscleSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR13435634) as SRR13435634, sum(SRR13435635) as SRR13435635, sum(SRR13435636) as SRR13435636, "
			+ "sum(SRR13435637) as SRR13435637, sum(SRR13435638) as SRR13435638, sum(SRR10312259) as SRR10312259,"
			+ " sum(SRR10312260) as SRR10312260, sum(SRR10312261) as SRR10312261, sum(SRR15721759) as SRR15721759,"
			+ " sum(SRR13435639) as SRR13435639 FROM Muscle")
	public Map <String, Double> getSum();
}
