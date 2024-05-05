package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Reticulum_A;

public interface Reticulum_ARepository extends CrudRepository<Reticulum_A, Integer>{

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
	
	@Query("SELECT sum(ERR2352957) as ERR2352957, sum(ERR2352958) as ERR2352958, sum(ERR2352959) as ERR2352959, "
			+ "sum(ERR2352960) as ERR2352960, sum(ERR2352961) as ERR2352961, sum(ERR2352962) as ERR2352962, "
			+ "sum(ERR2352963) as ERR2352963, sum(ERR2352964) as ERR2352964, sum(ERR2352965) as ERR2352965, "
			+ "sum(ERR2353478) as ERR2353478, sum(ERR2353479) as ERR2353479, sum(ERR2353480) as ERR2353480, "
			+ "sum(ERR2353481) as ERR2353481, sum(ERR2353482) as ERR2353482, sum(ERR2353483) as ERR2353483, "
			+ "sum(ERR2353484) as ERR2353484, sum(ERR2353485) as ERR2353485, sum(ERR2353486) as ERR2353486, "
			+ "sum(ERR2353487) as ERR2353487, sum(ERR2353488) as ERR2353488, sum(ERR2353489) as ERR2353489, "
			+ "sum(ERR2353490) as ERR2353490, sum(ERR2353491) as ERR2353491, sum(ERR2353492) as ERR2353492, "
			+ "sum(ERR2353493) as ERR2353493, sum(ERR2353494) as ERR2353494, sum(ERR2353495) as ERR2353495, "
			+ "sum(ERR2353496) as ERR2353496, sum(ERR2353497) as ERR2353497, sum(ERR2353498) as ERR2353498, "
			+ "sum(ERR2353499) as ERR2353499, sum(ERR2353500) as ERR2353500, sum(ERR2353799) as ERR2353799, "
			+ "sum(ERR2353800) as ERR2353800, sum(ERR2353801) as ERR2353801, sum(ERR2353802) as ERR2353802, "
			+ "sum(ERR2353803) as ERR2353803, sum(ERR2353804) as ERR2353804, sum(ERR2353805) as ERR2353805, "
			+ "sum(ERR2353806) as ERR2353806, sum(ERR2353807) as ERR2353807, sum(ERR2354297) as ERR2354297, "
			+ "sum(ERR2354298) as ERR2354298, sum(ERR2354299) as ERR2354299, sum(ERR2354300) as ERR2354300, "
			+ "sum(ERR2354301) as ERR2354301, sum(ERR2354302) as ERR2354302, sum(ERR2354303) as ERR2354303, "
			+ "sum(ERR2354304) as ERR2354304, sum(ERR2354305) as ERR2354305, sum(ERR2354306) as ERR2354306, "
			+ "sum(ERR2354307) as ERR2354307, sum(ERR2354308) as ERR2354308, sum(ERR2354309) as ERR2354309, "
			+ "sum(ERR2354310) as ERR2354310, sum(ERR2354311) as ERR2354311, sum(ERR2354312) as ERR2354312, "
			+ "sum(ERR2354313) as ERR2354313, sum(ERR2354314) as ERR2354314, sum(ERR2354315) as ERR2354315, "
			+ "sum(ERR2354316) as ERR2354316, sum(ERR2354317) as ERR2354317, sum(ERR2354318) as ERR2354318, "
			+ "sum(ERR2354319) as ERR2354319, sum(ERR2354666) as ERR2354666, sum(ERR2354667) as ERR2354667, "
			+ "sum(ERR2354668) as ERR2354668, sum(ERR2354669) as ERR2354669, sum(ERR2354670) as ERR2354670, "
			+ "sum(ERR2354671) as ERR2354671, sum(ERR2354672) as ERR2354672, sum(ERR2354673) as ERR2354673, "
			+ "sum(ERR2354674) as ERR2354674, sum(ERR2354675) as ERR2354675, sum(ERR2354676) as ERR2354676, "
			+ "sum(ERR2354677) as ERR2354677, sum(ERR2354678) as ERR2354678, sum(ERR2354679) as ERR2354679, "
			+ "sum(ERR2354680) as ERR2354680, sum(ERR2354681) as ERR2354681 FROM Reticulum_A")
	public Map <String, Double> getSum();
}
