package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Ovary;

public interface OvaryRepository extends CrudRepository<Ovary, Integer>{

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
