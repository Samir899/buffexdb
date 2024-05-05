package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Mesentric_lymph_node;

public interface Mesentric_lymph_nodeRepository extends CrudRepository<Mesentric_lymph_node, Integer>{

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
