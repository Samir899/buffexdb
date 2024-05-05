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
import com.buffalo.entity.Ear_skin;
import com.buffalo.entity.Genes;

public interface Ear_skinRepository extends CrudRepository<Ear_skin, Integer>{
	
	@Query("SELECT u FROM Ear_skin u WHERE u.SRR11842086>=:lowerLimit and u.SRR11842087>=:lowerLimit and u.SRR11842088>=:lowerLimit and u.SRR11842089>=:lowerLimit and u.SRR11842090>=:lowerLimit and u.SRR11842091>=:lowerLimit and "
			+ "u.SRR11842086<=:upperLimit and u.SRR11842087<=:upperLimit and u.SRR11842088<=:upperLimit and u.SRR11842089<=:upperLimit and u.SRR11842090<=:upperLimit and u.SRR11842091<=:upperLimit "
			+ "ORDER BY SRR11842086,SRR11842087,SRR11842088,SRR11842089,SRR11842090,SRR11842091 LIMIT 100")
	public List<Ear_skin> getEar_skinSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR11842086) as SRR11842086, sum(SRR11842087) as SRR11842087, sum(SRR11842088) as SRR11842088, "
			+ "sum(SRR11842089) as SRR11842089, sum(SRR11842090) as SRR11842090, sum(SRR11842091) as SRR11842091 FROM Ear_skin")
	public Map <String, Double> getSum();
}
