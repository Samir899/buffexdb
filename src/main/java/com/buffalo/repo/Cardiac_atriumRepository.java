package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Cardiac_atrium;
import com.buffalo.entity.Genes;

public interface Cardiac_atriumRepository extends CrudRepository<Cardiac_atrium, Integer>{

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
	
	@Query("SELECT sum(ERR2353467) as ERR2353467, sum(ERR2353468) as ERR2353468, sum(ERR2353785) as ERR2353785, "
			+ "sum(ERR2353786) as ERR2353786, sum(ERR2353787) as ERR2353787, sum(ERR2353788) as ERR2353788, "
			+ "sum(ERR2353789) as ERR2353789, sum(ERR2353790) as ERR2353790, sum(ERR2353791) as ERR2353791, "
			+ "sum(ERR2354279) as ERR2354279, sum(ERR2354280) as ERR2354280, sum(ERR2354281) as ERR2354281, "
			+ "sum(ERR2354282) as ERR2354282, sum(ERR2354283) as ERR2354283, sum(ERR2354284) as ERR2354284, "
			+ "sum(ERR2354285) as ERR2354285, sum(ERR2354286) as ERR2354286, sum(ERR2354287) as ERR2354287, "
			+ "sum(ERR2354648) as ERR2354648, sum(ERR2354649) as ERR2354649, sum(ERR2354650) as ERR2354650, "
			+ "sum(ERR2354651) as ERR2354651, sum(ERR2354652) as ERR2354652, sum(ERR2354653) as ERR2354653, "
			+ "sum(ERR2354654) as ERR2354654, sum(ERR2354655) as ERR2354655, sum(ERR2354656) as ERR2354656, "
			+ "sum(ERR2352943) as ERR2352943, sum(ERR2352944) as ERR2352944, sum(ERR2352945) as ERR2352945, "
			+ "sum(ERR2352946) as ERR2352946, sum(ERR2352947) as ERR2352947, sum(ERR2352948) as ERR2352948, "
			+ "sum(ERR2352949) as ERR2352949, sum(ERR2353460) as ERR2353460, sum(ERR2353461) as ERR2353461, "
			+ "sum(ERR2353462) as ERR2353462, sum(ERR2353463) as ERR2353463, sum(ERR2353464) as ERR2353464, "
			+ "sum(ERR2353465) as ERR2353465, sum(ERR2353466) as ERR2353466 FROM Cardiac_atrium")
	public Map <String, Double> getSum();
}

