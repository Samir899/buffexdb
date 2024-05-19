package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Testis;

public interface TestisRepository extends CrudRepository<Testis, Integer>{
	
	@Query("SELECT u FROM Testis u WHERE u.ERR2353836>=:lowerLimit and u.ERR2353837>=:lowerLimit and u.ERR2353838>=:lowerLimit and u.ERR2353839>=:lowerLimit and u.ERR2353840>=:lowerLimit and u.ERR2353841>=:lowerLimit and u.ERR2353842>=:lowerLimit and u.ERR2353843>=:lowerLimit and u.ERR2353844>=:lowerLimit and u.ERR2354365>=:lowerLimit and u.ERR2354366>=:lowerLimit and u.ERR2354367>=:lowerLimit and u.ERR2354368>=:lowerLimit and u.ERR2354369>=:lowerLimit and u.ERR2354370>=:lowerLimit and u.ERR2354371>=:lowerLimit and u.ERR2354372>=:lowerLimit and u.ERR2354373>=:lowerLimit and u.ERR2354374>=:lowerLimit and u.ERR2354375>=:lowerLimit and u.ERR2354376>=:lowerLimit and u.ERR2354377>=:lowerLimit and u.ERR2354378>=:lowerLimit and u.ERR2354379>=:lowerLimit and u.ERR2354380>=:lowerLimit and u.ERR2354381>=:lowerLimit and u.ERR2354382>=:lowerLimit and u.ERR2354383>=:lowerLimit and u.ERR2354384>=:lowerLimit and u.ERR2354385>=:lowerLimit and u.ERR2354386>=:lowerLimit and u.ERR2354387>=:lowerLimit and u.ERR2352738>=:lowerLimit and u.ERR2352739>=:lowerLimit and u.ERR2352740>=:lowerLimit and u.ERR2352741>=:lowerLimit and u.ERR2352742>=:lowerLimit and u.ERR2352743>=:lowerLimit and u.ERR2352744>=:lowerLimit and u.ERR2352745>=:lowerLimit and u.ERR2352746>=:lowerLimit and u.ERR2352747>=:lowerLimit and u.ERR2352748>=:lowerLimit and u.ERR2352749>=:lowerLimit and u.ERR2352750>=:lowerLimit and u.ERR2352751>=:lowerLimit and u.ERR2352752>=:lowerLimit and u.ERR2352753>=:lowerLimit and u.ERR2352754>=:lowerLimit and u.ERR2352755>=:lowerLimit and u.ERR2352756>=:lowerLimit and u.ERR2352757>=:lowerLimit and u.ERR2352758>=:lowerLimit and u.ERR2352759>=:lowerLimit and u.ERR2352760>=:lowerLimit and "
			+ "u.ERR2353836<=:upperLimit and u.ERR2353837<=:upperLimit and u.ERR2353838<=:upperLimit and u.ERR2353839<=:upperLimit and u.ERR2353840<=:upperLimit and u.ERR2353841<=:upperLimit and u.ERR2353842<=:upperLimit and u.ERR2353843<=:upperLimit and u.ERR2353844<=:upperLimit and u.ERR2354365<=:upperLimit and u.ERR2354366<=:upperLimit and u.ERR2354367<=:upperLimit and u.ERR2354368<=:upperLimit and u.ERR2354369<=:upperLimit and u.ERR2354370<=:upperLimit and u.ERR2354371<=:upperLimit and u.ERR2354372<=:upperLimit and u.ERR2354373<=:upperLimit and u.ERR2354374<=:upperLimit and u.ERR2354375<=:upperLimit and u.ERR2354376<=:upperLimit and u.ERR2354377<=:upperLimit and u.ERR2354378<=:upperLimit and u.ERR2354379<=:upperLimit and u.ERR2354380<=:upperLimit and u.ERR2354381<=:upperLimit and u.ERR2354382<=:upperLimit and u.ERR2354383<=:upperLimit and u.ERR2354384<=:upperLimit and u.ERR2354385<=:upperLimit and u.ERR2354386<=:upperLimit and u.ERR2354387<=:upperLimit and u.ERR2352738<=:upperLimit and u.ERR2352739<=:upperLimit and u.ERR2352740<=:upperLimit and u.ERR2352741<=:upperLimit and u.ERR2352742<=:upperLimit and u.ERR2352743<=:upperLimit and u.ERR2352744<=:upperLimit and u.ERR2352745<=:upperLimit and u.ERR2352746<=:upperLimit and u.ERR2352747<=:upperLimit and u.ERR2352748<=:upperLimit and u.ERR2352749<=:upperLimit and u.ERR2352750<=:upperLimit and u.ERR2352751<=:upperLimit and u.ERR2352752<=:upperLimit and u.ERR2352753<=:upperLimit and u.ERR2352754<=:upperLimit and u.ERR2352755<=:upperLimit and u.ERR2352756<=:upperLimit and u.ERR2352757<=:upperLimit and u.ERR2352758<=:upperLimit and u.ERR2352759<=:upperLimit and u.ERR2352760<=:upperLimit "
			+ "ORDER BY ERR2353836, ERR2353837, ERR2353838, ERR2353839, ERR2353840, ERR2353841, ERR2353842, ERR2353843, ERR2353844, ERR2354365, ERR2354366, ERR2354367, ERR2354368, ERR2354369, ERR2354370, ERR2354371, ERR2354372, ERR2354373, ERR2354374, ERR2354375, ERR2354376, ERR2354377, ERR2354378, ERR2354379, ERR2354380, ERR2354381, ERR2354382, ERR2354383, ERR2354384, ERR2354385, ERR2354386, ERR2354387, ERR2352738, ERR2352739, ERR2352740, ERR2352741, ERR2352742, ERR2352743, ERR2352744, ERR2352745, ERR2352746, ERR2352747, ERR2352748, ERR2352749, ERR2352750, ERR2352751, ERR2352752, ERR2352753, ERR2352754, ERR2352755, ERR2352756, ERR2352757, ERR2352758, ERR2352759, ERR2352760 LIMIT 100")
	public List<Testis> getTestisSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353836) as ERR2353836, sum(ERR2353837) as ERR2353837, sum(ERR2353838) as ERR2353838, sum(ERR2353839) as ERR2353839, sum(ERR2353840) as ERR2353840, sum(ERR2353841) as ERR2353841, sum(ERR2353842) as ERR2353842, sum(ERR2353843) as ERR2353843, sum(ERR2353844) as ERR2353844, sum(ERR2354365) as ERR2354365, sum(ERR2354366) as ERR2354366, sum(ERR2354367) as ERR2354367, sum(ERR2354368) as ERR2354368, sum(ERR2354369) as ERR2354369, sum(ERR2354370) as ERR2354370, sum(ERR2354371) as ERR2354371, sum(ERR2354372) as ERR2354372, sum(ERR2354373) as ERR2354373, sum(ERR2354374) as ERR2354374, sum(ERR2354375) as ERR2354375, sum(ERR2354376) as ERR2354376, sum(ERR2354377) as ERR2354377, sum(ERR2354378) as ERR2354378, sum(ERR2354379) as ERR2354379, sum(ERR2354380) as ERR2354380, sum(ERR2354381) as ERR2354381, sum(ERR2354382) as ERR2354382, sum(ERR2354383) as ERR2354383, sum(ERR2354384) as ERR2354384, sum(ERR2354385) as ERR2354385, sum(ERR2354386) as ERR2354386, sum(ERR2354387) as ERR2354387, sum(ERR2352738) as ERR2352738, sum(ERR2352739) as ERR2352739, sum(ERR2352740) as ERR2352740, sum(ERR2352741) as ERR2352741, sum(ERR2352742) as ERR2352742, sum(ERR2352743) as ERR2352743, sum(ERR2352744) as ERR2352744, sum(ERR2352745) as ERR2352745, sum(ERR2352746) as ERR2352746, sum(ERR2352747) as ERR2352747, sum(ERR2352748) as ERR2352748, sum(ERR2352749) as ERR2352749, sum(ERR2352750) as ERR2352750, sum(ERR2352751) as ERR2352751, sum(ERR2352752) as ERR2352752, sum(ERR2352753) as ERR2352753, sum(ERR2352754) as ERR2352754, sum(ERR2352755) as ERR2352755, sum(ERR2352756) as ERR2352756, sum(ERR2352757) as ERR2352757, sum(ERR2352758) as ERR2352758, sum(ERR2352759) as ERR2352759, sum(ERR2352760) as ERR2352760 FROM Testis")
	public Map <String, Double> getSum();
}
