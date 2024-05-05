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
import com.buffalo.entity.Cardiac_atrium;
import com.buffalo.entity.Genes;

public interface Cardiac_atriumRepository extends CrudRepository<Cardiac_atrium, Integer>{
	
	@Query("SELECT u FROM Cardiac_atrium u WHERE u.ERR2353467>=:lowerLimit and u.ERR2353468>=:lowerLimit and u.ERR2353785>=:lowerLimit and u.ERR2353786>=:lowerLimit and u.ERR2353787>=:lowerLimit and u.ERR2353788>=:lowerLimit and u.ERR2353789>=:lowerLimit and u.ERR2353790>=:lowerLimit and u.ERR2353791>=:lowerLimit and u.ERR2354279>=:lowerLimit and u.ERR2354280>=:lowerLimit and u.ERR2354281>=:lowerLimit and u.ERR2354282>=:lowerLimit and u.ERR2354283>=:lowerLimit and u.ERR2354284>=:lowerLimit and u.ERR2354285>=:lowerLimit and u.ERR2354286>=:lowerLimit and u.ERR2354287>=:lowerLimit and u.ERR2354648>=:lowerLimit and u.ERR2354649>=:lowerLimit and u.ERR2354650>=:lowerLimit and u.ERR2354651>=:lowerLimit and u.ERR2354652>=:lowerLimit and u.ERR2354653>=:lowerLimit and u.ERR2354654>=:lowerLimit and u.ERR2354655>=:lowerLimit and u.ERR2354656>=:lowerLimit and u.ERR2352943>=:lowerLimit and u.ERR2352944>=:lowerLimit and u.ERR2352945>=:lowerLimit and u.ERR2352946>=:lowerLimit and u.ERR2352947>=:lowerLimit and u.ERR2352948>=:lowerLimit and u.ERR2352949>=:lowerLimit and u.ERR2353460>=:lowerLimit and u.ERR2353461>=:lowerLimit and u.ERR2353462>=:lowerLimit and u.ERR2353463>=:lowerLimit and u.ERR2353464>=:lowerLimit and u.ERR2353465>=:lowerLimit and u.ERR2353466>=:lowerLimit and "
			+ "u.ERR2353467<=:upperLimit and u.ERR2353468<=:upperLimit and u.ERR2353785<=:upperLimit and u.ERR2353786<=:upperLimit and u.ERR2353787<=:upperLimit and u.ERR2353788<=:upperLimit and u.ERR2353789<=:upperLimit and u.ERR2353790<=:upperLimit and u.ERR2353791<=:upperLimit and u.ERR2354279<=:upperLimit and u.ERR2354280<=:upperLimit and u.ERR2354281<=:upperLimit and u.ERR2354282<=:upperLimit and u.ERR2354283<=:upperLimit and u.ERR2354284<=:upperLimit and u.ERR2354285<=:upperLimit and u.ERR2354286<=:upperLimit and u.ERR2354287<=:upperLimit and u.ERR2354648<=:upperLimit and u.ERR2354649<=:upperLimit and u.ERR2354650<=:upperLimit and u.ERR2354651<=:upperLimit and u.ERR2354652<=:upperLimit and u.ERR2354653<=:upperLimit and u.ERR2354654<=:upperLimit and u.ERR2354655<=:upperLimit and u.ERR2354656<=:upperLimit and u.ERR2352943<=:upperLimit and u.ERR2352944<=:upperLimit and u.ERR2352945<=:upperLimit and u.ERR2352946<=:upperLimit and u.ERR2352947<=:upperLimit and u.ERR2352948<=:upperLimit and u.ERR2352949<=:upperLimit and u.ERR2353460<=:upperLimit and u.ERR2353461<=:upperLimit and u.ERR2353462<=:upperLimit and u.ERR2353463<=:upperLimit and u.ERR2353464<=:upperLimit and u.ERR2353465<=:upperLimit and u.ERR2353466<=:upperLimit "
			+ "ORDER BY ERR2353467, ERR2353468, ERR2353785, ERR2353786, ERR2353787, ERR2353788, ERR2353789, ERR2353790, ERR2353791, ERR2354279, ERR2354280, ERR2354281, ERR2354282, ERR2354283, ERR2354284, ERR2354285, ERR2354286, ERR2354287, ERR2354648, ERR2354649, ERR2354650, ERR2354651, ERR2354652, ERR2354653, ERR2354654, ERR2354655, ERR2354656, ERR2352943, ERR2352944, ERR2352945, ERR2352946, ERR2352947, ERR2352948, ERR2352949, ERR2353460, ERR2353461, ERR2353462, ERR2353463, ERR2353464, ERR2353465, ERR2353466 LIMIT 50")
	public List<Cardiac_atrium> getCardiac_atriumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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

