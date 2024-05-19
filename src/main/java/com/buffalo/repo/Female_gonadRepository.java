package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Female_gonad;

public interface Female_gonadRepository extends CrudRepository<Female_gonad, Integer>{
	
	@Query("SELECT u FROM Female_gonad u WHERE u.ERR2354607>=:lowerLimit and u.ERR2354608>=:lowerLimit and u.ERR2354609>=:lowerLimit and u.ERR2354610>=:lowerLimit and u.ERR2354611>=:lowerLimit and u.ERR2354612>=:lowerLimit and u.ERR2354613>=:lowerLimit and u.ERR2354614>=:lowerLimit and u.ERR2354615>=:lowerLimit and u.ERR2354616>=:lowerLimit and u.ERR2354617>=:lowerLimit and u.ERR2354618>=:lowerLimit and u.ERR2354619>=:lowerLimit and u.ERR2354620>=:lowerLimit and u.ERR2354621>=:lowerLimit and u.ERR2354622>=:lowerLimit and u.ERR2354623>=:lowerLimit and u.ERR2354624>=:lowerLimit and u.ERR2354625>=:lowerLimit and u.ERR2354626>=:lowerLimit and u.ERR2354627>=:lowerLimit and u.ERR2354628>=:lowerLimit and u.ERR2354629>=:lowerLimit and u.ERR2354848>=:lowerLimit and u.ERR2354849>=:lowerLimit and u.ERR2354850>=:lowerLimit and u.ERR2354851>=:lowerLimit and u.ERR2354852>=:lowerLimit and u.ERR2354853>=:lowerLimit and u.ERR2354854>=:lowerLimit and u.ERR2354855>=:lowerLimit and u.ERR2354856>=:lowerLimit and u.ERR2354857>=:lowerLimit and u.ERR2354858>=:lowerLimit and u.ERR2354859>=:lowerLimit and u.ERR2354860>=:lowerLimit and u.ERR2354861>=:lowerLimit and u.ERR2354862>=:lowerLimit and u.ERR2354863>=:lowerLimit and u.ERR2354864>=:lowerLimit and u.ERR2354865>=:lowerLimit and u.ERR2354866>=:lowerLimit and u.ERR2354867>=:lowerLimit and u.ERR2354868>=:lowerLimit and u.ERR2354869>=:lowerLimit and u.ERR2354870>=:lowerLimit and u.ERR2352899>=:lowerLimit and u.ERR2352900>=:lowerLimit and u.ERR2352901>=:lowerLimit and u.ERR2352902>=:lowerLimit and u.ERR2352903>=:lowerLimit and u.ERR2352904>=:lowerLimit and u.ERR2352905>=:lowerLimit and u.ERR2352906>=:lowerLimit and u.ERR2352907>=:lowerLimit and u.ERR2353383>=:lowerLimit and u.ERR2353384>=:lowerLimit and u.ERR2353385>=:lowerLimit and u.ERR2353386>=:lowerLimit and u.ERR2353387>=:lowerLimit and u.ERR2353388>=:lowerLimit and u.ERR2353389>=:lowerLimit and u.ERR2353390>=:lowerLimit and u.ERR2353391>=:lowerLimit and u.ERR2353392>=:lowerLimit and u.ERR2353393>=:lowerLimit and u.ERR2353394>=:lowerLimit and u.ERR2353395>=:lowerLimit and u.ERR2353396>=:lowerLimit and u.ERR2353397>=:lowerLimit and u.ERR2353398>=:lowerLimit and u.ERR2353399>=:lowerLimit and u.ERR2353400>=:lowerLimit and u.ERR2353401>=:lowerLimit and u.ERR2353402>=:lowerLimit and u.ERR2353403>=:lowerLimit and u.ERR2353404>=:lowerLimit and u.ERR2353405>=:lowerLimit and "
			+ "u.ERR2354607<=:upperLimit and u.ERR2354608<=:upperLimit and u.ERR2354609<=:upperLimit and u.ERR2354610<=:upperLimit and u.ERR2354611<=:upperLimit and u.ERR2354612<=:upperLimit and u.ERR2354613<=:upperLimit and u.ERR2354614<=:upperLimit and u.ERR2354615<=:upperLimit and u.ERR2354616<=:upperLimit and u.ERR2354617<=:upperLimit and u.ERR2354618<=:upperLimit and u.ERR2354619<=:upperLimit and u.ERR2354620<=:upperLimit and u.ERR2354621<=:upperLimit and u.ERR2354622<=:upperLimit and u.ERR2354623<=:upperLimit and u.ERR2354624<=:upperLimit and u.ERR2354625<=:upperLimit and u.ERR2354626<=:upperLimit and u.ERR2354627<=:upperLimit and u.ERR2354628<=:upperLimit and u.ERR2354629<=:upperLimit and u.ERR2354848<=:upperLimit and u.ERR2354849<=:upperLimit and u.ERR2354850<=:upperLimit and u.ERR2354851<=:upperLimit and u.ERR2354852<=:upperLimit and u.ERR2354853<=:upperLimit and u.ERR2354854<=:upperLimit and u.ERR2354855<=:upperLimit and u.ERR2354856<=:upperLimit and u.ERR2354857<=:upperLimit and u.ERR2354858<=:upperLimit and u.ERR2354859<=:upperLimit and u.ERR2354860<=:upperLimit and u.ERR2354861<=:upperLimit and u.ERR2354862<=:upperLimit and u.ERR2354863<=:upperLimit and u.ERR2354864<=:upperLimit and u.ERR2354865<=:upperLimit and u.ERR2354866<=:upperLimit and u.ERR2354867<=:upperLimit and u.ERR2354868<=:upperLimit and u.ERR2354869<=:upperLimit and u.ERR2354870<=:upperLimit and u.ERR2352899<=:upperLimit and u.ERR2352900<=:upperLimit and u.ERR2352901<=:upperLimit and u.ERR2352902<=:upperLimit and u.ERR2352903<=:upperLimit and u.ERR2352904<=:upperLimit and u.ERR2352905<=:upperLimit and u.ERR2352906<=:upperLimit and u.ERR2352907<=:upperLimit and u.ERR2353383<=:upperLimit and u.ERR2353384<=:upperLimit and u.ERR2353385<=:upperLimit and u.ERR2353386<=:upperLimit and u.ERR2353387<=:upperLimit and u.ERR2353388<=:upperLimit and u.ERR2353389<=:upperLimit and u.ERR2353390<=:upperLimit and u.ERR2353391<=:upperLimit and u.ERR2353392<=:upperLimit and u.ERR2353393<=:upperLimit and u.ERR2353394<=:upperLimit and u.ERR2353395<=:upperLimit and u.ERR2353396<=:upperLimit and u.ERR2353397<=:upperLimit and u.ERR2353398<=:upperLimit and u.ERR2353399<=:upperLimit and u.ERR2353400<=:upperLimit and u.ERR2353401<=:upperLimit and u.ERR2353402<=:upperLimit and u.ERR2353403<=:upperLimit and u.ERR2353404<=:upperLimit and u.ERR2353405<=:upperLimit "
			+ "ORDER BY ERR2354607, ERR2354608, ERR2354609, ERR2354610, ERR2354611, ERR2354612, ERR2354613, ERR2354614, ERR2354615, ERR2354616, ERR2354617, ERR2354618, ERR2354619, ERR2354620, ERR2354621, ERR2354622, ERR2354623, ERR2354624, ERR2354625, ERR2354626, ERR2354627, ERR2354628, ERR2354629, ERR2354848, ERR2354849, ERR2354850, ERR2354851, ERR2354852, ERR2354853, ERR2354854, ERR2354855, ERR2354856, ERR2354857, ERR2354858, ERR2354859, ERR2354860, ERR2354861, ERR2354862, ERR2354863, ERR2354864, ERR2354865, ERR2354866, ERR2354867, ERR2354868, ERR2354869, ERR2354870, ERR2352899, ERR2352900, ERR2352901, ERR2352902, ERR2352903, ERR2352904, ERR2352905, ERR2352906, ERR2352907, ERR2353383, ERR2353384, ERR2353385, ERR2353386, ERR2353387, ERR2353388, ERR2353389, ERR2353390, ERR2353391, ERR2353392, ERR2353393, ERR2353394, ERR2353395, ERR2353396, ERR2353397, ERR2353398, ERR2353399, ERR2353400, ERR2353401, ERR2353402, ERR2353403, ERR2353404, ERR2353405 LIMIT 100")
	public List<Female_gonad> getFemale_gonadSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
