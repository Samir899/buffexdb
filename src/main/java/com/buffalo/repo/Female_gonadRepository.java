package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.buffalo.entity.Female_gonad;

public interface Female_gonadRepository extends CrudRepository<Female_gonad, Integer>{

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
	
	@Query("SELECT sum(ERR2354607) as ERR2354607, sum(ERR2354608) as ERR2354608, sum(ERR2354609) as ERR2354609, "
			+ "sum(ERR2354610) as ERR2354610, sum(ERR2354611) as ERR2354611, sum(ERR2354612) as ERR2354612, "
			+ "sum(ERR2354613) as ERR2354613, sum(ERR2354614) as ERR2354614, sum(ERR2354615) as ERR2354615, "
			+ "sum(ERR2354616) as ERR2354616, sum(ERR2354617) as ERR2354617, sum(ERR2354618) as ERR2354618, "
			+ "sum(ERR2354619) as ERR2354619, sum(ERR2354620) as ERR2354620, sum(ERR2354621) as ERR2354621, "
			+ "sum(ERR2354622) as ERR2354622, sum(ERR2354623) as ERR2354623, sum(ERR2354624) as ERR2354624, "
			+ "sum(ERR2354625) as ERR2354625, sum(ERR2354626) as ERR2354626, sum(ERR2354627) as ERR2354627, "
			+ "sum(ERR2354628) as ERR2354628, sum(ERR2354629) as ERR2354629, sum(ERR2354848) as ERR2354848, "
			+ "sum(ERR2354849) as ERR2354849, sum(ERR2354850) as ERR2354850, sum(ERR2354851) as ERR2354851, "
			+ "sum(ERR2354852) as ERR2354852, sum(ERR2354853) as ERR2354853, sum(ERR2354854) as ERR2354854, "
			+ "sum(ERR2354855) as ERR2354855, sum(ERR2354856) as ERR2354856, sum(ERR2354857) as ERR2354857, "
			+ "sum(ERR2354858) as ERR2354858, sum(ERR2354859) as ERR2354859, sum(ERR2354860) as ERR2354860, "
			+ "sum(ERR2354861) as ERR2354861, sum(ERR2354862) as ERR2354862, sum(ERR2354863) as ERR2354863, "
			+ "sum(ERR2354864) as ERR2354864, sum(ERR2354865) as ERR2354865, sum(ERR2354866) as ERR2354866, "
			+ "sum(ERR2354867) as ERR2354867, sum(ERR2354868) as ERR2354868, sum(ERR2354869) as ERR2354869, "
			+ "sum(ERR2354870) as ERR2354870, sum(ERR2352899) as ERR2352899, sum(ERR2352900) as ERR2352900, "
			+ "sum(ERR2352901) as ERR2352901, sum(ERR2352902) as ERR2352902, sum(ERR2352903) as ERR2352903, "
			+ "sum(ERR2352904) as ERR2352904, sum(ERR2352905) as ERR2352905, sum(ERR2352906) as ERR2352906, "
			+ "sum(ERR2352907) as ERR2352907, sum(ERR2353383) as ERR2353383, sum(ERR2353384) as ERR2353384, "
			+ "sum(ERR2353385) as ERR2353385, sum(ERR2353386) as ERR2353386, sum(ERR2353387) as ERR2353387, "
			+ "sum(ERR2353388) as ERR2353388, sum(ERR2353389) as ERR2353389, sum(ERR2353390) as ERR2353390, "
			+ "sum(ERR2353391) as ERR2353391, sum(ERR2353392) as ERR2353392, sum(ERR2353393) as ERR2353393, "
			+ "sum(ERR2353394) as ERR2353394, sum(ERR2353395) as ERR2353395, sum(ERR2353396) as ERR2353396, "
			+ "sum(ERR2353397) as ERR2353397, sum(ERR2353398) as ERR2353398, sum(ERR2353399) as ERR2353399, "
			+ "sum(ERR2353400) as ERR2353400, sum(ERR2353401) as ERR2353401, sum(ERR2353402) as ERR2353402, "
			+ "sum(ERR2353403) as ERR2353403, sum(ERR2353404) as ERR2353404, sum(ERR2353405) as ERR2353405 FROM Female_gonad")
	public Map <String, Double> getSum();
	
}
