package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Pancreas;

public interface PancreasRepository extends CrudRepository<Pancreas, Integer>{
	
	@Query("SELECT u FROM Pancreas u WHERE u.ERR2353750>=:lowerLimit and u.ERR2353751>=:lowerLimit and u.ERR2353752>=:lowerLimit and u.ERR2353753>=:lowerLimit and u.ERR2353754>=:lowerLimit and u.ERR2353755>=:lowerLimit and u.ERR2353756>=:lowerLimit and u.ERR2354234>=:lowerLimit and u.ERR2354235>=:lowerLimit and u.ERR2354236>=:lowerLimit and u.ERR2354237>=:lowerLimit and u.ERR2354238>=:lowerLimit and u.ERR2354239>=:lowerLimit and u.ERR2354240>=:lowerLimit and u.ERR2354241>=:lowerLimit and u.ERR2354242>=:lowerLimit and u.ERR2352908>=:lowerLimit and u.ERR2352909>=:lowerLimit and u.ERR2352910>=:lowerLimit and u.ERR2352911>=:lowerLimit and u.ERR2352912>=:lowerLimit and u.ERR2352913>=:lowerLimit and u.ERR2352914>=:lowerLimit and u.ERR2353406>=:lowerLimit and u.ERR2353407>=:lowerLimit and u.ERR2353408>=:lowerLimit and u.ERR2353409>=:lowerLimit and u.ERR2353410>=:lowerLimit and u.ERR2353411>=:lowerLimit and u.ERR2353412>=:lowerLimit and u.ERR2353413>=:lowerLimit and u.ERR2353414>=:lowerLimit and "
			+ "u.ERR2353750<=:upperLimit and u.ERR2353751<=:upperLimit and u.ERR2353752<=:upperLimit and u.ERR2353753<=:upperLimit and u.ERR2353754<=:upperLimit and u.ERR2353755<=:upperLimit and u.ERR2353756<=:upperLimit and u.ERR2354234<=:upperLimit and u.ERR2354235<=:upperLimit and u.ERR2354236<=:upperLimit and u.ERR2354237<=:upperLimit and u.ERR2354238<=:upperLimit and u.ERR2354239<=:upperLimit and u.ERR2354240<=:upperLimit and u.ERR2354241<=:upperLimit and u.ERR2354242<=:upperLimit and u.ERR2352908<=:upperLimit and u.ERR2352909<=:upperLimit and u.ERR2352910<=:upperLimit and u.ERR2352911<=:upperLimit and u.ERR2352912<=:upperLimit and u.ERR2352913<=:upperLimit and u.ERR2352914<=:upperLimit and u.ERR2353406<=:upperLimit and u.ERR2353407<=:upperLimit and u.ERR2353408<=:upperLimit and u.ERR2353409<=:upperLimit and u.ERR2353410<=:upperLimit and u.ERR2353411<=:upperLimit and u.ERR2353412<=:upperLimit and u.ERR2353413<=:upperLimit and u.ERR2353414<=:upperLimit "
			+ "ORDER BY ERR2353750, ERR2353751, ERR2353752, ERR2353753, ERR2353754, ERR2353755, ERR2353756, ERR2354234, ERR2354235, ERR2354236, ERR2354237, ERR2354238, ERR2354239, ERR2354240, ERR2354241, ERR2354242, ERR2352908, ERR2352909, ERR2352910, ERR2352911, ERR2352912, ERR2352913, ERR2352914, ERR2353406, ERR2353407, ERR2353408, ERR2353409, ERR2353410, ERR2353411, ERR2353412, ERR2353413, ERR2353414 LIMIT 100")
	public List<Pancreas> getPancreasSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353750) as ERR2353750, sum(ERR2353751) as ERR2353751, sum(ERR2353752) as ERR2353752, sum(ERR2353753) as ERR2353753, sum(ERR2353754) as ERR2353754, sum(ERR2353755) as ERR2353755, sum(ERR2353756) as ERR2353756, sum(ERR2354234) as ERR2354234, sum(ERR2354235) as ERR2354235, sum(ERR2354236) as ERR2354236, sum(ERR2354237) as ERR2354237, sum(ERR2354238) as ERR2354238, sum(ERR2354239) as ERR2354239, sum(ERR2354240) as ERR2354240, sum(ERR2354241) as ERR2354241, sum(ERR2354242) as ERR2354242, sum(ERR2352908) as ERR2352908, sum(ERR2352909) as ERR2352909, sum(ERR2352910) as ERR2352910, sum(ERR2352911) as ERR2352911, sum(ERR2352912) as ERR2352912, sum(ERR2352913) as ERR2352913, sum(ERR2352914) as ERR2352914, sum(ERR2353406) as ERR2353406, sum(ERR2353407) as ERR2353407, sum(ERR2353408) as ERR2353408, sum(ERR2353409) as ERR2353409, sum(ERR2353410) as ERR2353410, sum(ERR2353411) as ERR2353411, sum(ERR2353412) as ERR2353412, sum(ERR2353413) as ERR2353413, sum(ERR2353414) as ERR2353414 FROM Pancreas")
	public Map <String, Double> getSum();
}
