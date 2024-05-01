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
import com.buffalo.entity.Epididymis;
import com.buffalo.entity.Genes;

public interface EpididymisRepository extends CrudRepository<Epididymis, Integer>{
	
	@Query("SELECT u FROM Epididymis u WHERE u.ERR2353645>=:lowerLimit and u.ERR2353646>=:lowerLimit and u.ERR2353647>=:lowerLimit and u.ERR2353648>=:lowerLimit and u.ERR2353649>=:lowerLimit and u.ERR2353650>=:lowerLimit and u.ERR2353651>=:lowerLimit and u.ERR2354028>=:lowerLimit and u.ERR2354029>=:lowerLimit and u.ERR2354030>=:lowerLimit and u.ERR2354031>=:lowerLimit and u.ERR2354032>=:lowerLimit and u.ERR2354033>=:lowerLimit and u.ERR2354034>=:lowerLimit and u.ERR2354035>=:lowerLimit and u.ERR2354036>=:lowerLimit and u.ERR2352624>=:lowerLimit and u.ERR2352625>=:lowerLimit and u.ERR2352626>=:lowerLimit and u.ERR2352627>=:lowerLimit and u.ERR2352628>=:lowerLimit and u.ERR2352629>=:lowerLimit and u.ERR2352630>=:lowerLimit and u.ERR2352631>=:lowerLimit and u.ERR2352632>=:lowerLimit and "
			+ "u.ERR2353645<=:upperLimit and u.ERR2353646<=:upperLimit and u.ERR2353647<=:upperLimit and u.ERR2353648<=:upperLimit and u.ERR2353649<=:upperLimit and u.ERR2353650<=:upperLimit and u.ERR2353651<=:upperLimit and u.ERR2354028<=:upperLimit and u.ERR2354029<=:upperLimit and u.ERR2354030<=:upperLimit and u.ERR2354031<=:upperLimit and u.ERR2354032<=:upperLimit and u.ERR2354033<=:upperLimit and u.ERR2354034<=:upperLimit and u.ERR2354035<=:upperLimit and u.ERR2354036<=:upperLimit and u.ERR2352624<=:upperLimit and u.ERR2352625<=:upperLimit and u.ERR2352626<=:upperLimit and u.ERR2352627<=:upperLimit and u.ERR2352628<=:upperLimit and u.ERR2352629<=:upperLimit and u.ERR2352630<=:upperLimit and u.ERR2352631<=:upperLimit and u.ERR2352632<=:upperLimit "
			+ "ORDER BY ERR2353645, ERR2353646, ERR2353647, ERR2353648, ERR2353649, ERR2353650, ERR2353651, ERR2354028, ERR2354029, ERR2354030, ERR2354031, ERR2354032, ERR2354033, ERR2354034, ERR2354035, ERR2354036, ERR2352624, ERR2352625, ERR2352626, ERR2352627, ERR2352628, ERR2352629, ERR2352630, ERR2352631, ERR2352632 LIMIT 100")
	public List<Epididymis> getEpididymisSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353645) as ERR2353645, sum(ERR2353646) as ERR2353646, sum(ERR2353647) as ERR2353647, "
			+ "sum(ERR2353648) as ERR2353648, sum(ERR2353649) as ERR2353649, sum(ERR2353650) as ERR2353650, "
			+ "sum(ERR2353651) as ERR2353651, sum(ERR2354028) as ERR2354028, sum(ERR2354029) as ERR2354029, "
			+ "sum(ERR2354030) as ERR2354030, sum(ERR2354031) as ERR2354031, sum(ERR2354032) as ERR2354032, "
			+ "sum(ERR2354033) as ERR2354033, sum(ERR2354034) as ERR2354034, sum(ERR2354035) as ERR2354035, "
			+ "sum(ERR2354036) as ERR2354036, sum(ERR2352624) as ERR2352624, sum(ERR2352625) as ERR2352625, "
			+ "sum(ERR2352626) as ERR2352626, sum(ERR2352627) as ERR2352627, sum(ERR2352628) as ERR2352628, "
			+ "sum(ERR2352629) as ERR2352629, sum(ERR2352630) as ERR2352630, sum(ERR2352631) as ERR2352631, "
			+ "sum(ERR2352632) as ERR2352632 FROM Epididymis")
	public Map <String, Double> getSum();
}
