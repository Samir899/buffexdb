package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Prescapular_lymph_node;

public interface Prescapular_lymph_nodeRepository extends CrudRepository<Prescapular_lymph_node, Integer>{
	
	@Query("SELECT u FROM Prescapular_lymph_node u WHERE u.ERR2353771>=:lowerLimit and u.ERR2353772>=:lowerLimit and u.ERR2353773>=:lowerLimit and u.ERR2353774>=:lowerLimit and u.ERR2353775>=:lowerLimit and u.ERR2353776>=:lowerLimit and u.ERR2353777>=:lowerLimit and u.ERR2354261>=:lowerLimit and u.ERR2354262>=:lowerLimit and u.ERR2354263>=:lowerLimit and u.ERR2354264>=:lowerLimit and u.ERR2354265>=:lowerLimit and u.ERR2354266>=:lowerLimit and u.ERR2354267>=:lowerLimit and u.ERR2354268>=:lowerLimit and u.ERR2354269>=:lowerLimit and u.ERR2352929>=:lowerLimit and u.ERR2352930>=:lowerLimit and u.ERR2352931>=:lowerLimit and u.ERR2352932>=:lowerLimit and u.ERR2352933>=:lowerLimit and u.ERR2352934>=:lowerLimit and u.ERR2352935>=:lowerLimit and u.ERR2353442>=:lowerLimit and u.ERR2353443>=:lowerLimit and u.ERR2353444>=:lowerLimit and u.ERR2353445>=:lowerLimit and u.ERR2353446>=:lowerLimit and u.ERR2353447>=:lowerLimit and u.ERR2353448>=:lowerLimit and u.ERR2353449>=:lowerLimit and u.ERR2353450>=:lowerLimit and "
			+ "u.ERR2353771<=:upperLimit and u.ERR2353772<=:upperLimit and u.ERR2353773<=:upperLimit and u.ERR2353774<=:upperLimit and u.ERR2353775<=:upperLimit and u.ERR2353776<=:upperLimit and u.ERR2353777<=:upperLimit and u.ERR2354261<=:upperLimit and u.ERR2354262<=:upperLimit and u.ERR2354263<=:upperLimit and u.ERR2354264<=:upperLimit and u.ERR2354265<=:upperLimit and u.ERR2354266<=:upperLimit and u.ERR2354267<=:upperLimit and u.ERR2354268<=:upperLimit and u.ERR2354269<=:upperLimit and u.ERR2352929<=:upperLimit and u.ERR2352930<=:upperLimit and u.ERR2352931<=:upperLimit and u.ERR2352932<=:upperLimit and u.ERR2352933<=:upperLimit and u.ERR2352934<=:upperLimit and u.ERR2352935<=:upperLimit and u.ERR2353442<=:upperLimit and u.ERR2353443<=:upperLimit and u.ERR2353444<=:upperLimit and u.ERR2353445<=:upperLimit and u.ERR2353446<=:upperLimit and u.ERR2353447<=:upperLimit and u.ERR2353448<=:upperLimit and u.ERR2353449<=:upperLimit and u.ERR2353450<=:upperLimit "
			+ "ORDER BY ERR2353771, ERR2353772, ERR2353773, ERR2353774, ERR2353775, ERR2353776, ERR2353777, ERR2354261, ERR2354262, ERR2354263, ERR2354264, ERR2354265, ERR2354266, ERR2354267, ERR2354268, ERR2354269, ERR2352929, ERR2352930, ERR2352931, ERR2352932, ERR2352933, ERR2352934, ERR2352935, ERR2353442, ERR2353443, ERR2353444, ERR2353445, ERR2353446, ERR2353447, ERR2353448, ERR2353449, ERR2353450 LIMIT 100")
	public List<Prescapular_lymph_node> getPrescapular_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353771) as ERR2353771, sum(ERR2353772) as ERR2353772, sum(ERR2353773) as ERR2353773, sum(ERR2353774) as ERR2353774, sum(ERR2353775) as ERR2353775, sum(ERR2353776) as ERR2353776, sum(ERR2353777) as ERR2353777, sum(ERR2354261) as ERR2354261, sum(ERR2354262) as ERR2354262, sum(ERR2354263) as ERR2354263, sum(ERR2354264) as ERR2354264, sum(ERR2354265) as ERR2354265, sum(ERR2354266) as ERR2354266, sum(ERR2354267) as ERR2354267, sum(ERR2354268) as ERR2354268, sum(ERR2354269) as ERR2354269, sum(ERR2352929) as ERR2352929, sum(ERR2352930) as ERR2352930, sum(ERR2352931) as ERR2352931, sum(ERR2352932) as ERR2352932, sum(ERR2352933) as ERR2352933, sum(ERR2352934) as ERR2352934, sum(ERR2352935) as ERR2352935, sum(ERR2353442) as ERR2353442, sum(ERR2353443) as ERR2353443, sum(ERR2353444) as ERR2353444, sum(ERR2353445) as ERR2353445, sum(ERR2353446) as ERR2353446, sum(ERR2353447) as ERR2353447, sum(ERR2353448) as ERR2353448, sum(ERR2353449) as ERR2353449, sum(ERR2353450) as ERR2353450 FROM Prescapular_lymph_node")
	public Map <String, Double> getSum();
}
