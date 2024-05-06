package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Pylorus;

public interface PylorusRepository extends CrudRepository<Pylorus, Integer>{
	
	@Query("SELECT u FROM Pylorus u WHERE u.ERR2353778>=:lowerLimit and u.ERR2353779>=:lowerLimit and u.ERR2353780>=:lowerLimit and u.ERR2353781>=:lowerLimit and u.ERR2353782>=:lowerLimit and u.ERR2353783>=:lowerLimit and u.ERR2353784>=:lowerLimit and u.ERR2354270>=:lowerLimit and u.ERR2354271>=:lowerLimit and u.ERR2354272>=:lowerLimit and u.ERR2354273>=:lowerLimit and u.ERR2354274>=:lowerLimit and u.ERR2354275>=:lowerLimit and u.ERR2354276>=:lowerLimit and u.ERR2354277>=:lowerLimit and u.ERR2354278>=:lowerLimit and u.ERR2354639>=:lowerLimit and u.ERR2354640>=:lowerLimit and u.ERR2354641>=:lowerLimit and u.ERR2354642>=:lowerLimit and u.ERR2354643>=:lowerLimit and u.ERR2354644>=:lowerLimit and u.ERR2354645>=:lowerLimit and u.ERR2354646>=:lowerLimit and u.ERR2354647>=:lowerLimit and u.ERR2352936>=:lowerLimit and u.ERR2352937>=:lowerLimit and u.ERR2352938>=:lowerLimit and u.ERR2352939>=:lowerLimit and u.ERR2352940>=:lowerLimit and u.ERR2352941>=:lowerLimit and u.ERR2352942>=:lowerLimit and u.ERR2353451>=:lowerLimit and u.ERR2353452>=:lowerLimit and u.ERR2353453>=:lowerLimit and u.ERR2353454>=:lowerLimit and u.ERR2353455>=:lowerLimit and u.ERR2353456>=:lowerLimit and u.ERR2353457>=:lowerLimit and u.ERR2353458>=:lowerLimit and u.ERR2353459>=:lowerLimit and "
			+ "u.ERR2353778<=:upperLimit and u.ERR2353779<=:upperLimit and u.ERR2353780<=:upperLimit and u.ERR2353781<=:upperLimit and u.ERR2353782<=:upperLimit and u.ERR2353783<=:upperLimit and u.ERR2353784<=:upperLimit and u.ERR2354270<=:upperLimit and u.ERR2354271<=:upperLimit and u.ERR2354272<=:upperLimit and u.ERR2354273<=:upperLimit and u.ERR2354274<=:upperLimit and u.ERR2354275<=:upperLimit and u.ERR2354276<=:upperLimit and u.ERR2354277<=:upperLimit and u.ERR2354278<=:upperLimit and u.ERR2354639<=:upperLimit and u.ERR2354640<=:upperLimit and u.ERR2354641<=:upperLimit and u.ERR2354642<=:upperLimit and u.ERR2354643<=:upperLimit and u.ERR2354644<=:upperLimit and u.ERR2354645<=:upperLimit and u.ERR2354646<=:upperLimit and u.ERR2354647<=:upperLimit and u.ERR2352936<=:upperLimit and u.ERR2352937<=:upperLimit and u.ERR2352938<=:upperLimit and u.ERR2352939<=:upperLimit and u.ERR2352940<=:upperLimit and u.ERR2352941<=:upperLimit and u.ERR2352942<=:upperLimit and u.ERR2353451<=:upperLimit and u.ERR2353452<=:upperLimit and u.ERR2353453<=:upperLimit and u.ERR2353454<=:upperLimit and u.ERR2353455<=:upperLimit and u.ERR2353456<=:upperLimit and u.ERR2353457<=:upperLimit and u.ERR2353458<=:upperLimit and u.ERR2353459<=:upperLimit "
			+ "ORDER BY ERR2353778, ERR2353779, ERR2353780, ERR2353781, ERR2353782, ERR2353783, ERR2353784, ERR2354270, ERR2354271, ERR2354272, ERR2354273, ERR2354274, ERR2354275, ERR2354276, ERR2354277, ERR2354278, ERR2354639, ERR2354640, ERR2354641, ERR2354642, ERR2354643, ERR2354644, ERR2354645, ERR2354646, ERR2354647, ERR2352936, ERR2352937, ERR2352938, ERR2352939, ERR2352940, ERR2352941, ERR2352942, ERR2353451, ERR2353452, ERR2353453, ERR2353454, ERR2353455, ERR2353456, ERR2353457, ERR2353458, ERR2353459 LIMIT 100")
	public List<Pylorus> getPylorusSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353778) as ERR2353778, sum(ERR2353779) as ERR2353779, sum(ERR2353780) as ERR2353780, sum(ERR2353781) as ERR2353781, sum(ERR2353782) as ERR2353782, sum(ERR2353783) as ERR2353783, sum(ERR2353784) as ERR2353784, sum(ERR2354270) as ERR2354270, sum(ERR2354271) as ERR2354271, sum(ERR2354272) as ERR2354272, sum(ERR2354273) as ERR2354273, sum(ERR2354274) as ERR2354274, sum(ERR2354275) as ERR2354275, sum(ERR2354276) as ERR2354276, sum(ERR2354277) as ERR2354277, sum(ERR2354278) as ERR2354278, sum(ERR2354639) as ERR2354639, sum(ERR2354640) as ERR2354640, sum(ERR2354641) as ERR2354641, sum(ERR2354642) as ERR2354642, sum(ERR2354643) as ERR2354643, sum(ERR2354644) as ERR2354644, sum(ERR2354645) as ERR2354645, sum(ERR2354646) as ERR2354646, sum(ERR2354647) as ERR2354647, sum(ERR2352936) as ERR2352936, sum(ERR2352937) as ERR2352937, sum(ERR2352938) as ERR2352938, sum(ERR2352939) as ERR2352939, sum(ERR2352940) as ERR2352940, sum(ERR2352941) as ERR2352941, sum(ERR2352942) as ERR2352942, sum(ERR2353451) as ERR2353451, sum(ERR2353452) as ERR2353452, sum(ERR2353453) as ERR2353453, sum(ERR2353454) as ERR2353454, sum(ERR2353455) as ERR2353455, sum(ERR2353456) as ERR2353456, sum(ERR2353457) as ERR2353457, sum(ERR2353458) as ERR2353458, sum(ERR2353459) as ERR2353459 FROM Pylorus")
	public Map <String, Double> getSum();
}
