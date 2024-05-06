package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Ovary;

public interface OvaryRepository extends CrudRepository<Ovary, Integer>{
	
	@Query("SELECT u FROM Ovary u WHERE u.SRR24057913>=:lowerLimit and u.SRR24057914>=:lowerLimit and u.SRR24057915>=:lowerLimit and u.SRR15721744>=:lowerLimit and u.SRR13931407>=:lowerLimit and u.SRR13931408>=:lowerLimit and u.SRR13931409>=:lowerLimit and u.SRR13931410>=:lowerLimit and u.SRR13931411>=:lowerLimit and u.SRR13931412>=:lowerLimit and u.SRR13931413>=:lowerLimit and u.SRR13931414>=:lowerLimit and u.SRR13931415>=:lowerLimit and u.SRR18933388>=:lowerLimit and "
			+ "u.SRR24057913<=:upperLimit and u.SRR24057914<=:upperLimit and u.SRR24057915<=:upperLimit and u.SRR15721744<=:upperLimit and u.SRR13931407<=:upperLimit and u.SRR13931408<=:upperLimit and u.SRR13931409<=:upperLimit and u.SRR13931410<=:upperLimit and u.SRR13931411<=:upperLimit and u.SRR13931412<=:upperLimit and u.SRR13931413<=:upperLimit and u.SRR13931414<=:upperLimit and u.SRR13931415<=:upperLimit and u.SRR18933388<=:upperLimit "
			+ "ORDER BY SRR24057913, SRR24057914, SRR24057915, SRR15721744, SRR13931407, SRR13931408, SRR13931409, SRR13931410, SRR13931411, SRR13931412, SRR13931413, SRR13931414, SRR13931415, SRR18933388 LIMIT 100")
	public List<Ovary> getOvarySorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR13931407) as SRR13931407, sum(SRR13931408) as SRR13931408, sum(SRR13931409) as SRR13931409, "
			+ "sum(SRR13931410) as SRR13931410, sum(SRR13931411) as SRR13931411, sum(SRR13931412) as SRR13931412, "
			+ "sum(SRR13931413) as SRR13931413, sum(SRR13931414) as SRR13931414, sum(SRR13931415) as SRR13931415, "
			+ "sum(SRR15721744) as SRR15721744, sum(SRR24057913) as SRR24057913, sum(SRR24057914) as SRR24057914, "
			+ "sum(SRR24057915) as SRR24057915, sum(SRR18933388) as SRR18933388 FROM Ovary")
	public Map <String, Double> getSum();
}
