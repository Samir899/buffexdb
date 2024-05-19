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
import com.buffalo.entity.Mesentric_lymph_node;

public interface Mesentric_lymph_nodeRepository extends CrudRepository<Mesentric_lymph_node, Integer>{
	
	@Query("SELECT u FROM Mesentric_lymph_node u WHERE u.ERR315640>=:lowerLimit and u.ERR2353736>=:lowerLimit and u.ERR2353737>=:lowerLimit and u.ERR2353738>=:lowerLimit and u.ERR2353739>=:lowerLimit and u.ERR2353740>=:lowerLimit and u.ERR2353741>=:lowerLimit and u.ERR2353742>=:lowerLimit and u.ERR2354193>=:lowerLimit and u.ERR2354194>=:lowerLimit and u.ERR2354195>=:lowerLimit and u.ERR2354196>=:lowerLimit and u.ERR2354197>=:lowerLimit and u.ERR2354198>=:lowerLimit and u.ERR2354199>=:lowerLimit and u.ERR2354200>=:lowerLimit and u.ERR2354201>=:lowerLimit and u.ERR2354589>=:lowerLimit and u.ERR2354590>=:lowerLimit and u.ERR2354591>=:lowerLimit and u.ERR2354592>=:lowerLimit and u.ERR2354593>=:lowerLimit and u.ERR2354594>=:lowerLimit and u.ERR2354595>=:lowerLimit and u.ERR2354596>=:lowerLimit and u.ERR2354597>=:lowerLimit and u.ERR2354830>=:lowerLimit and u.ERR2354831>=:lowerLimit and u.ERR2354832>=:lowerLimit and u.ERR2354833>=:lowerLimit and u.ERR2354834>=:lowerLimit and u.ERR2354835>=:lowerLimit and u.ERR2354836>=:lowerLimit and u.ERR2354837>=:lowerLimit and u.ERR2354838>=:lowerLimit and u.ERR2352885>=:lowerLimit and u.ERR2352886>=:lowerLimit and u.ERR2352887>=:lowerLimit and u.ERR2352888>=:lowerLimit and u.ERR2352889>=:lowerLimit and u.ERR2352890>=:lowerLimit and u.ERR2352891>=:lowerLimit and u.ERR2353342>=:lowerLimit and u.ERR2353343>=:lowerLimit and u.ERR2353344>=:lowerLimit and u.ERR2353345>=:lowerLimit and u.ERR2353346>=:lowerLimit and u.ERR2353347>=:lowerLimit and u.ERR2353348>=:lowerLimit and u.ERR2353349>=:lowerLimit and u.ERR2353350>=:lowerLimit and "
			+ "u.ERR315640<=:upperLimit and u.ERR2353736<=:upperLimit and u.ERR2353737<=:upperLimit and u.ERR2353738<=:upperLimit and u.ERR2353739<=:upperLimit and u.ERR2353740<=:upperLimit and u.ERR2353741<=:upperLimit and u.ERR2353742<=:upperLimit and u.ERR2354193<=:upperLimit and u.ERR2354194<=:upperLimit and u.ERR2354195<=:upperLimit and u.ERR2354196<=:upperLimit and u.ERR2354197<=:upperLimit and u.ERR2354198<=:upperLimit and u.ERR2354199<=:upperLimit and u.ERR2354200<=:upperLimit and u.ERR2354201<=:upperLimit and u.ERR2354589<=:upperLimit and u.ERR2354590<=:upperLimit and u.ERR2354591<=:upperLimit and u.ERR2354592<=:upperLimit and u.ERR2354593<=:upperLimit and u.ERR2354594<=:upperLimit and u.ERR2354595<=:upperLimit and u.ERR2354596<=:upperLimit and u.ERR2354597<=:upperLimit and u.ERR2354830<=:upperLimit and u.ERR2354831<=:upperLimit and u.ERR2354832<=:upperLimit and u.ERR2354833<=:upperLimit and u.ERR2354834<=:upperLimit and u.ERR2354835<=:upperLimit and u.ERR2354836<=:upperLimit and u.ERR2354837<=:upperLimit and u.ERR2354838<=:upperLimit and u.ERR2352885<=:upperLimit and u.ERR2352886<=:upperLimit and u.ERR2352887<=:upperLimit and u.ERR2352888<=:upperLimit and u.ERR2352889<=:upperLimit and u.ERR2352890<=:upperLimit and u.ERR2352891<=:upperLimit and u.ERR2353342<=:upperLimit and u.ERR2353343<=:upperLimit and u.ERR2353344<=:upperLimit and u.ERR2353345<=:upperLimit and u.ERR2353346<=:upperLimit and u.ERR2353347<=:upperLimit and u.ERR2353348<=:upperLimit and u.ERR2353349<=:upperLimit and u.ERR2353350<=:upperLimit "
			+ "ORDER BY ERR315640, ERR2353736, ERR2353737, ERR2353738, ERR2353739, ERR2353740, ERR2353741, ERR2353742, ERR2354193, ERR2354194, ERR2354195, ERR2354196, ERR2354197, ERR2354198, ERR2354199, ERR2354200, ERR2354201, ERR2354589, ERR2354590, ERR2354591, ERR2354592, ERR2354593, ERR2354594, ERR2354595, ERR2354596, ERR2354597, ERR2354830, ERR2354831, ERR2354832, ERR2354833, ERR2354834, ERR2354835, ERR2354836, ERR2354837, ERR2354838, ERR2352885, ERR2352886, ERR2352887, ERR2352888, ERR2352889, ERR2352890, ERR2352891, ERR2353342, ERR2353343, ERR2353344, ERR2353345, ERR2353346, ERR2353347, ERR2353348, ERR2353349, ERR2353350 LIMIT 100")
	public List<Mesentric_lymph_node> getMesentric_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315640) as ERR315640, sum(ERR2353736) as ERR2353736, sum(ERR2353737) as ERR2353737, "
			+ "sum(ERR2353738) as ERR2353738, sum(ERR2353739) as ERR2353739, sum(ERR2353740) as ERR2353740, "
			+ "sum(ERR2353741) as ERR2353741, sum(ERR2353742) as ERR2353742, sum(ERR2354193) as ERR2354193, "
			+ "sum(ERR2354194) as ERR2354194, sum(ERR2354195) as ERR2354195, sum(ERR2354196) as ERR2354196, "
			+ "sum(ERR2354197) as ERR2354197, sum(ERR2354198) as ERR2354198, sum(ERR2354199) as ERR2354199, "
			+ "sum(ERR2354200) as ERR2354200, sum(ERR2354201) as ERR2354201, sum(ERR2354589) as ERR2354589, "
			+ "sum(ERR2354590) as ERR2354590, sum(ERR2354591) as ERR2354591, sum(ERR2354592) as ERR2354592, "
			+ "sum(ERR2354593) as ERR2354593, sum(ERR2354594) as ERR2354594, sum(ERR2354595) as ERR2354595, "
			+ "sum(ERR2354596) as ERR2354596, sum(ERR2354597) as ERR2354597, sum(ERR2354830) as ERR2354830, "
			+ "sum(ERR2354831) as ERR2354831, sum(ERR2354832) as ERR2354832, sum(ERR2354833) as ERR2354833, "
			+ "sum(ERR2354834) as ERR2354834, sum(ERR2354835) as ERR2354835, sum(ERR2354836) as ERR2354836, "
			+ "sum(ERR2354837) as ERR2354837, sum(ERR2354838) as ERR2354838, sum(ERR2352885) as ERR2352885, "
			+ "sum(ERR2352886) as ERR2352886, sum(ERR2352887) as ERR2352887, sum(ERR2352888) as ERR2352888, "
			+ "sum(ERR2352889) as ERR2352889, sum(ERR2352890) as ERR2352890, sum(ERR2352891) as ERR2352891, "
			+ "sum(ERR2353342) as ERR2353342, sum(ERR2353343) as ERR2353343, sum(ERR2353344) as ERR2353344, "
			+ "sum(ERR2353345) as ERR2353345, sum(ERR2353346) as ERR2353346, sum(ERR2353347) as ERR2353347, "
			+ "sum(ERR2353348) as ERR2353348, sum(ERR2353349) as ERR2353349, sum(ERR2353350) as ERR2353350 FROM Mesentric_lymph_node")
	
	public Map <String, Double> getSum();
}
