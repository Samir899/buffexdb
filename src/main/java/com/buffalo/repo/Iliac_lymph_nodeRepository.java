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
import com.buffalo.entity.Iliac_lymph_node;
import com.buffalo.entity.Intestine;

public interface Iliac_lymph_nodeRepository extends CrudRepository<Iliac_lymph_node, Integer>{
	
	@Query("SELECT u FROM Iliac_lymph_node u WHERE u.ERR2353661>=:lowerLimit and u.ERR2353662>=:lowerLimit and u.ERR2353663>=:lowerLimit and u.ERR2353664>=:lowerLimit and u.ERR2353665>=:lowerLimit and u.ERR2353666>=:lowerLimit and u.ERR2353667>=:lowerLimit and u.ERR2352818>=:lowerLimit and u.ERR2352819>=:lowerLimit and u.ERR2352821>=:lowerLimit and u.ERR2352822>=:lowerLimit and u.ERR2352823>=:lowerLimit and u.ERR2352824>=:lowerLimit and "
			+ "u.ERR2353661<=:upperLimit and u.ERR2353662<=:upperLimit and u.ERR2353663<=:upperLimit and u.ERR2353664<=:upperLimit and u.ERR2353665<=:upperLimit and u.ERR2353666<=:upperLimit and u.ERR2353667<=:upperLimit and u.ERR2352818<=:upperLimit and u.ERR2352819<=:upperLimit and u.ERR2352821<=:upperLimit and u.ERR2352822<=:upperLimit and u.ERR2352823<=:upperLimit and u.ERR2352824<=:upperLimit "
			+ "ORDER BY ERR2353661, ERR2353662, ERR2353663, ERR2353664, ERR2353665, ERR2353666, ERR2353667, ERR2352818, ERR2352819, ERR2352821, ERR2352822, ERR2352823, ERR2352824 LIMIT 100")
	public List<Iliac_lymph_node> getIliac_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353661) as ERR2353661, sum(ERR2353662) as ERR2353662, sum(ERR2353663) as ERR2353663, "
			+ "sum(ERR2353664) as ERR2353664, sum(ERR2353665) as ERR2353665, sum(ERR2353666) as ERR2353666, "
			+ "sum(ERR2353667) as ERR2353667, sum(ERR2352818) as ERR2352818, sum(ERR2352819) as ERR2352819, "
			+ "sum(ERR2352821) as ERR2352821, sum(ERR2352822) as ERR2352822, sum(ERR2352823) as ERR2352823, "
			+ "sum(ERR2352824) as ERR2352824 FROM Iliac_lymph_node")
	public Map <String, Double> getSum();
}
