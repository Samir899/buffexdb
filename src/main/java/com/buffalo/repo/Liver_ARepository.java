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
import com.buffalo.entity.Genes;
import com.buffalo.entity.Liver_A;

public interface Liver_ARepository extends CrudRepository<Liver_A, Integer>{
	
	@Query("SELECT u FROM Liver_A u WHERE u.ERR2352665 >= :lowerLimit and u.ERR2352666 >= :lowerLimit and u.ERR2352667 >= :lowerLimit"
			+ " and u.ERR2352668>=:lowerLimit and u.ERR2352669>=:lowerLimit and u.ERR2352670>=:lowerLimit and u.ERR2352671>=:lowerLimit and"
			+ " u.ERR2352672>=:lowerLimit and u.ERR2352673>=:lowerLimit and u.ERR2352674>=:lowerLimit and u.ERR2352675>=:lowerLimit and"
			+ " u.ERR2352676>=:lowerLimit and u.ERR2352677>=:lowerLimit and u.ERR2352678>=:lowerLimit and u.ERR2352679>=:lowerLimit and"
			+ " u.ERR2352680>=:lowerLimit and u.ERR2352681>=:lowerLimit and u.ERR2352682>=:lowerLimit and u.ERR2352683>=:lowerLimit and"
			+ " u.ERR2352684>=:lowerLimit and u.ERR2352685>=:lowerLimit and u.ERR2352686>=:lowerLimit and u.ERR2352687>=:lowerLimit and"
			+ " u.ERR2352858>=:lowerLimit and u.ERR2352859>=:lowerLimit and u.ERR2352860>=:lowerLimit and u.ERR2352861>=:lowerLimit and"
			+ " u.ERR2352862>=:lowerLimit and u.ERR2352863>=:lowerLimit and u.ERR2352864>=:lowerLimit and u.ERR2352865>=:lowerLimit and"
			+ " u.ERR2352866>=:lowerLimit and u.ERR2353241>=:lowerLimit and u.ERR2353242>=:lowerLimit and u.ERR2353243>=:lowerLimit and"
			+ " u.ERR2353244>=:lowerLimit and u.ERR2353245>=:lowerLimit and u.ERR2353246>=:lowerLimit and u.ERR2353247>=:lowerLimit and"
			+ " u.ERR2353248>=:lowerLimit and u.ERR2353249>=:lowerLimit and u.ERR2353250>=:lowerLimit and u.ERR2353251>=:lowerLimit and"
			+ " u.ERR2353252>=:lowerLimit and u.ERR2353253>=:lowerLimit and u.ERR2353254>=:lowerLimit and u.ERR2353256>=:lowerLimit and"
			+ " u.ERR2353257>=:lowerLimit and u.ERR2353258>=:lowerLimit and u.ERR2353259>=:lowerLimit and u.ERR2353260>=:lowerLimit and"
			+ " u.ERR2353261>=:lowerLimit and u.ERR2353262>=:lowerLimit and u.ERR2353263>=:lowerLimit and u.ERR2353709>=:lowerLimit and"
			+ " u.ERR2353710>=:lowerLimit and u.ERR2353711>=:lowerLimit and u.ERR2353712>=:lowerLimit and u.ERR2353713>=:lowerLimit and"
			+ " u.ERR2353714>=:lowerLimit and u.ERR2353715>=:lowerLimit and u.ERR2353716>=:lowerLimit and u.ERR2353717>=:lowerLimit and"
			+ " u.ERR2354101>=:lowerLimit and u.ERR2354102>=:lowerLimit and u.ERR2354103>=:lowerLimit and u.ERR2354104>=:lowerLimit and"
			+ " u.ERR2354105>=:lowerLimit and u.ERR2354106>=:lowerLimit and u.ERR2354107>=:lowerLimit and u.ERR2354108>=:lowerLimit and"
			+ " u.ERR2354109>=:lowerLimit and u.ERR2354110>=:lowerLimit and u.ERR2354111>=:lowerLimit and u.ERR2354112>=:lowerLimit and"
			+ " u.ERR2354113>=:lowerLimit and u.ERR2354114>=:lowerLimit and u.ERR2354115>=:lowerLimit and u.ERR2354116>=:lowerLimit and"
			+ " u.ERR2354117>=:lowerLimit and u.ERR2354118>=:lowerLimit and u.ERR2354119>=:lowerLimit and u.ERR2354120>=:lowerLimit and"
			+ " u.ERR2354121>=:lowerLimit and u.ERR2354122>=:lowerLimit and u.ERR2354123>=:lowerLimit and u.ERR2354520>=:lowerLimit and"
			+ " u.ERR2354521>=:lowerLimit and u.ERR2354522>=:lowerLimit and u.ERR2354523>=:lowerLimit and u.ERR2354524>=:lowerLimit and"
			+ " u.ERR2354525>=:lowerLimit and u.ERR2354526>=:lowerLimit and u.ERR2354527>=:lowerLimit and u.ERR2354528>=:lowerLimit and"
			+ " u.ERR2354529>=:lowerLimit and u.ERR2354530>=:lowerLimit and u.ERR2354531>=:lowerLimit and u.ERR2354532>=:lowerLimit and"
			+ " u.ERR2354533>=:lowerLimit and u.ERR2352665<=:upperLimit and u.ERR2352666<=:upperLimit and u.ERR2352667<=:upperLimit and"
			+ " u.ERR2352668<=:upperLimit and u.ERR2352669<=:upperLimit and u.ERR2352670<=:upperLmit and u.ERR2352671<=:upperLimit and"
			+ " u.ERR2352672<=:upperLimit and u.ERR2352673<=:upperLimit and u.ERR2352674<=:upperLimit and u.ERR2352675<=:upperLimit and"
			+ " u.ERR2352676<=:upperLimit and u.ERR2352677<=:upperLimit and u.ERR2352678<=:upperLimit and u.ERR2352679<=:upperLimit and"
			+ " u.ERR2352680<=:upperLimit and u.ERR2352681<=:upperLimit and u.ERR2352682<=:upperLimit and u.ERR2352683<=:upperLimit and"
			+ " u.ERR2352684<=:upperLimit and u.ERR2352685<=:upperLimit and u.ERR2352686<=:upperLimit and u.ERR2352687<=:upperLimit and"
			+ " u.ERR2352858<=:upperLimit and u.ERR2352859<=:upperLimit and u.ERR2352860<=:upperLimit and u.ERR2352861<=:upperLimit and"
			+ " u.ERR2352862<=:upperLimit and u.ERR2352863<=:upperLimit and u.ERR2352864<=:upperLimit and u.ERR2352865<=:upperLimit and"
			+ " u.ERR2352866<=:upperLimit and u.ERR2353241<=:upperLimit and u.ERR2353242<=:upperLimit and u.ERR2353243<=:upperLimit and"
			+ " u.ERR2353244<=:upperLimit and u.ERR2353245<=:upperLimit and u.ERR2353246<=:upperLimit and u.ERR2353247<=:upperLimit and"
			+ " u.ERR2353248<=:upperLimit and u.ERR2353249<=:upperLimit and u.ERR2353250<=:upperLimit and u.ERR2353251<=:upperLimit and"
			+ " u.ERR2353252<=:upperLimit and u.ERR2353253<=:upperLimit and u.ERR2353254<=:upperLimit and u.ERR2353256<=:upperLimit and "
			+ " u.ERR2353257<=:upperLimit and u.ERR2353258<=:upperLimit and u.ERR2353259<=:upperLimit and u.ERR2353260<=:upperLimit and"
			+ " u.ERR2353261<=:upperLimit and u.ERR2353262<=:upperLimit and u.ERR2353263<=:upperLimit and u.ERR2353709<=:upperLimit and"
			+ " u.ERR2353710<=:upperLimit and u.ERR2353711<=:upperLimit and u.ERR2353712<=:upperLimit and u.ERR2353713<=:upperLimit and"
			+ " u.ERR2353714<=:upperLimit and u.ERR2353715<=:upperLimit and u.ERR2353716<=:upperLimit and u.ERR2353717<=:upperLimit and"
			+ " u.ERR2354101<=:upperLimit and u.ERR2354102<=:upperLimit and u.ERR2354103<=:upperLimit and u.ERR2354104<=:upperLimit and"
			+ " u.ERR2354105<=:upperLimit and u.ERR2354106<=:upperLimit and u.ERR2354107<=:upperLimit and u.ERR2354108<=:upperLimit and"
			+ " u.ERR2354109<=:upperLimit and u.ERR2354110<=:upperLimit and u.ERR2354111<=:upperLimit and u.ERR2354112<=:upperLimit and"
			+ " u.ERR2354113<=:upperLimit and u.ERR2354114<=:upperLimit and u.ERR2354115<=:upperLimit and u.ERR2354116<=:upperLimit and"
			+ " u.ERR2354117<=:upperLimit and u.ERR2354118<=:upperLimit and u.ERR2354119<=:upperLimit and u.ERR2354120<=:upperLimit and"
			+ " u.ERR2354121<=:upperLimit and u.ERR2354122<=:upperLimit and u.ERR2354123<=:upperLimit and u.ERR2354520<=:upperLimit and"
			+ " u.ERR2354521<=:upperLimit and u.ERR2354522<=:upperLimit and u.ERR2354523<=:upperLimit and u.ERR2354524<=:upperLimit and"
			+ " u.ERR2354525<=:upperLimit and u.ERR2354526<=:upperLimit and u.ERR2354527<=:upperLimit and u.ERR2354528<=:upperLimit and"
			+ " u.ERR2354529<=:upperLimit and u.ERR2354530<=:upperLimit and u.ERR2354531<=:upperLimit and u.ERR2354532<=:upperLimit and"
			+ " u.ERR2354533<=:upperLimit ORDER BY ERR2352665, ERR2352666, ERR2352667, ERR2352668, ERR2352669, ERR2352670, ERR2352671, ERR2352672, ERR2352673, "
			+ "ERR2352674, ERR2352675, ERR2352676, ERR2352677, ERR2352678, ERR2352679, ERR2352680, ERR2352681, ERR2352682, ERR2352683, ERR2352684, ERR2352685, "
			+ "ERR2352686, ERR2352687, ERR2352858, ERR2352859, ERR2352860, ERR2352861, ERR2352862, ERR2352863, ERR2352864, ERR2352865, ERR2352866, ERR2353241, "
			+ "ERR2353242, ERR2353243, ERR2353244, ERR2353245, ERR2353246, ERR2353247, ERR2353248, ERR2353249, ERR2353250, ERR2353251, ERR2353252, ERR2353253, "
			+ "ERR2353254, ERR2353256, ERR2353257, ERR2353258, ERR2353259, ERR2353260, ERR2353261, ERR2353262, ERR2353263, ERR2353709, ERR2353710, ERR2353711, "
			+ "ERR2353712, ERR2353713, ERR2353714, ERR2353715, ERR2353716, ERR2353717, ERR2354101, ERR2354102, ERR2354103, ERR2354104, ERR2354105, ERR2354106, "
			+ "ERR2354107, ERR2354108, ERR2354109, ERR2354110, ERR2354111, ERR2354112, ERR2354113, ERR2354114, ERR2354115, ERR2354116, ERR2354117, ERR2354118, "
			+ "ERR2354119, ERR2354120, ERR2354121, ERR2354122, ERR2354123, ERR2354520, ERR2354521, ERR2354522, ERR2354523, ERR2354524, ERR2354525, ERR2354526, "
			+ "ERR2354527, ERR2354528, ERR2354529, ERR2354530, ERR2354531, ERR2354532, ERR2354533 LIMIT 50")
	public List<Liver_A> getLiver_ASorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2352665) as ERR2352665, sum(ERR2352666) as ERR2352666, sum(ERR2352667) as ERR2352667, "
			+ "sum(ERR2352668) as ERR2352668, sum(ERR2352669) as ERR2352669, sum(ERR2352670) as ERR2352670, "
			+ "sum(ERR2352671) as ERR2352671, sum(ERR2352672) as ERR2352672, sum(ERR2352673) as ERR2352673, "
			+ "sum(ERR2352674) as ERR2352674, sum(ERR2352675) as ERR2352675, sum(ERR2352676) as ERR2352676, "
			+ "sum(ERR2352677) as ERR2352677, sum(ERR2352678) as ERR2352678, sum(ERR2352679) as ERR2352679, "
			+ "sum(ERR2352680) as ERR2352680, sum(ERR2352681) as ERR2352681, sum(ERR2352682) as ERR2352682, "
			+ "sum(ERR2352683) as ERR2352683, sum(ERR2352684) as ERR2352684, sum(ERR2352685) as ERR2352685, "
			+ "sum(ERR2352686) as ERR2352686, sum(ERR2352687) as ERR2352687, sum(ERR2352858) as ERR2352858, "
			+ "sum(ERR2352859) as ERR2352859, sum(ERR2352860) as ERR2352860, sum(ERR2352861) as ERR2352861, "
			+ "sum(ERR2352862) as ERR2352862, sum(ERR2352863) as ERR2352863, sum(ERR2352864) as ERR2352864, "
			+ "sum(ERR2352865) as ERR2352865, sum(ERR2352866) as ERR2352866, sum(ERR2353241) as ERR2353241, "
			+ "sum(ERR2353242) as ERR2353242, sum(ERR2353243) as ERR2353243, sum(ERR2353244) as ERR2353244, "
			+ "sum(ERR2353245) as ERR2353245, sum(ERR2353246) as ERR2353246, sum(ERR2353247) as ERR2353247, "
			+ "sum(ERR2353248) as ERR2353248, sum(ERR2353249) as ERR2353249, sum(ERR2353250) as ERR2353250, "
			+ "sum(ERR2353251) as ERR2353251, sum(ERR2353252) as ERR2353252, sum(ERR2353253) as ERR2353253, "
			+ "sum(ERR2353254) as ERR2353254, sum(ERR2353256) as ERR2353256, sum(ERR2353257) as ERR2353257, "
			+ "sum(ERR2353258) as ERR2353258, sum(ERR2353259) as ERR2353259, sum(ERR2353260) as ERR2353260, "
			+ "sum(ERR2353261) as ERR2353261, sum(ERR2353262) as ERR2353262, sum(ERR2353263) as ERR2353263, "
			+ "sum(ERR2353709) as ERR2353709, sum(ERR2353710) as ERR2353710, sum(ERR2353711) as ERR2353711, "
			+ "sum(ERR2353712) as ERR2353712, sum(ERR2353713) as ERR2353713, sum(ERR2353714) as ERR2353714, "
			+ "sum(ERR2353715) as ERR2353715, sum(ERR2353716) as ERR2353716, sum(ERR2353717) as ERR2353717, "
			+ "sum(ERR2354101) as ERR2354101, sum(ERR2354102) as ERR2354102, sum(ERR2354103) as ERR2354103, "
			+ "sum(ERR2354104) as ERR2354104, sum(ERR2354105) as ERR2354105, sum(ERR2354106) as ERR2354106, "
			+ "sum(ERR2354107) as ERR2354107, sum(ERR2354108) as ERR2354108, sum(ERR2354109) as ERR2354109, "
			+ "sum(ERR2354110) as ERR2354110, sum(ERR2354111) as ERR2354111, sum(ERR2354112) as ERR2354112, "
			+ "sum(ERR2354113) as ERR2354113, sum(ERR2354114) as ERR2354114, sum(ERR2354115) as ERR2354115, "
			+ "sum(ERR2354116) as ERR2354116, sum(ERR2354117) as ERR2354117, sum(ERR2354118) as ERR2354118, "
			+ "sum(ERR2354119) as ERR2354119, sum(ERR2354120) as ERR2354120, sum(ERR2354121) as ERR2354121, "
			+ "sum(ERR2354122) as ERR2354122, sum(ERR2354123) as ERR2354123, sum(ERR2354520) as ERR2354520, "
			+ "sum(ERR2354521) as ERR2354521, sum(ERR2354522) as ERR2354522, sum(ERR2354523) as ERR2354523, "
			+ "sum(ERR2354524) as ERR2354524, sum(ERR2354525) as ERR2354525, sum(ERR2354526) as ERR2354526, "
			+ "sum(ERR2354527) as ERR2354527, sum(ERR2354528) as ERR2354528, sum(ERR2354529) as ERR2354529, "
			+ "sum(ERR2354530) as ERR2354530, sum(ERR2354531) as ERR2354531, sum(ERR2354532) as ERR2354532, "
			+ "sum(ERR2354533) as ERR2354533 FROM Liver_A")
	public Map <String, Double> getSum();
}
