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
import com.buffalo.entity.Reticulum_A;

public interface Reticulum_ARepository extends CrudRepository<Reticulum_A, Integer>{

	@Query("SELECT u FROM Reticulum_A u WHERE u.ERR2352957>=:lowerLimit and u.ERR2352958>=:lowerLimit and u.ERR2352959>=:lowerLimit and u.ERR2352960>=:lowerLimit and u.ERR2352961>=:lowerLimit and u.ERR2352962>=:lowerLimit and u.ERR2352963>=:lowerLimit and u.ERR2352964>=:lowerLimit and u.ERR2352965>=:lowerLimit and u.ERR2353478>=:lowerLimit and u.ERR2353479>=:lowerLimit and u.ERR2353480>=:lowerLimit and u.ERR2353481>=:lowerLimit and u.ERR2353482>=:lowerLimit and u.ERR2353483>=:lowerLimit and u.ERR2353484>=:lowerLimit and u.ERR2353485>=:lowerLimit and u.ERR2353486>=:lowerLimit and u.ERR2353487>=:lowerLimit and u.ERR2353488>=:lowerLimit and u.ERR2353489>=:lowerLimit and u.ERR2353490>=:lowerLimit and u.ERR2353491>=:lowerLimit and u.ERR2353492>=:lowerLimit and u.ERR2353493>=:lowerLimit and u.ERR2353494>=:lowerLimit and u.ERR2353495>=:lowerLimit and u.ERR2353496>=:lowerLimit and u.ERR2353497>=:lowerLimit and u.ERR2353498>=:lowerLimit and u.ERR2353499>=:lowerLimit and u.ERR2353500>=:lowerLimit and u.ERR2353799>=:lowerLimit and u.ERR2353800>=:lowerLimit and u.ERR2353801>=:lowerLimit and u.ERR2353802>=:lowerLimit and u.ERR2353803>=:lowerLimit and u.ERR2353804>=:lowerLimit and u.ERR2353805>=:lowerLimit and u.ERR2353806>=:lowerLimit and u.ERR2353807>=:lowerLimit and u.ERR2354297>=:lowerLimit and u.ERR2354298>=:lowerLimit and u.ERR2354299>=:lowerLimit and u.ERR2354300>=:lowerLimit and u.ERR2354301>=:lowerLimit and u.ERR2354302>=:lowerLimit and u.ERR2354303>=:lowerLimit and u.ERR2354304>=:lowerLimit and u.ERR2354305>=:lowerLimit and u.ERR2354306>=:lowerLimit and u.ERR2354307>=:lowerLimit and u.ERR2354308>=:lowerLimit and u.ERR2354309>=:lowerLimit and u.ERR2354310>=:lowerLimit and u.ERR2354311>=:lowerLimit and u.ERR2354312>=:lowerLimit and u.ERR2354313>=:lowerLimit and u.ERR2354314>=:lowerLimit and u.ERR2354315>=:lowerLimit and u.ERR2354316>=:lowerLimit and u.ERR2354317>=:lowerLimit and u.ERR2354318>=:lowerLimit and u.ERR2354319>=:lowerLimit and u.ERR2354666>=:lowerLimit and u.ERR2354667>=:lowerLimit and u.ERR2354668>=:lowerLimit and u.ERR2354669>=:lowerLimit and u.ERR2354670>=:lowerLimit and u.ERR2354671>=:lowerLimit and u.ERR2354672>=:lowerLimit and u.ERR2354673>=:lowerLimit and u.ERR2354674>=:lowerLimit and u.ERR2354675>=:lowerLimit and u.ERR2354676>=:lowerLimit and u.ERR2354677>=:lowerLimit and u.ERR2354678>=:lowerLimit and u.ERR2354679>=:lowerLimit and u.ERR2354680>=:lowerLimit and u.ERR2354681>=:lowerLimit and "
			+ "u.ERR2352957<=:upperLimit and u.ERR2352958<=:upperLimit and u.ERR2352959<=:upperLimit and u.ERR2352960<=:upperLimit and u.ERR2352961<=:upperLimit and u.ERR2352962<=:upperLimit and u.ERR2352963<=:upperLimit and u.ERR2352964<=:upperLimit and u.ERR2352965<=:upperLimit and u.ERR2353478<=:upperLimit and u.ERR2353479<=:upperLimit and u.ERR2353480<=:upperLimit and u.ERR2353481<=:upperLimit and u.ERR2353482<=:upperLimit and u.ERR2353483<=:upperLimit and u.ERR2353484<=:upperLimit and u.ERR2353485<=:upperLimit and u.ERR2353486<=:upperLimit and u.ERR2353487<=:upperLimit and u.ERR2353488<=:upperLimit and u.ERR2353489<=:upperLimit and u.ERR2353490<=:upperLimit and u.ERR2353491<=:upperLimit and u.ERR2353492<=:upperLimit and u.ERR2353493<=:upperLimit and u.ERR2353494<=:upperLimit and u.ERR2353495<=:upperLimit and u.ERR2353496<=:upperLimit and u.ERR2353497<=:upperLimit and u.ERR2353498<=:upperLimit and u.ERR2353499<=:upperLimit and u.ERR2353500<=:upperLimit and u.ERR2353799<=:upperLimit and u.ERR2353800<=:upperLimit and u.ERR2353801<=:upperLimit and u.ERR2353802<=:upperLimit and u.ERR2353803<=:upperLimit and u.ERR2353804<=:upperLimit and u.ERR2353805<=:upperLimit and u.ERR2353806<=:upperLimit and u.ERR2353807<=:upperLimit and u.ERR2354297<=:upperLimit and u.ERR2354298<=:upperLimit and u.ERR2354299<=:upperLimit and u.ERR2354300<=:upperLimit and u.ERR2354301<=:upperLimit and u.ERR2354302<=:upperLimit and u.ERR2354303<=:upperLimit and u.ERR2354304<=:upperLimit and u.ERR2354305<=:upperLimit and u.ERR2354306<=:upperLimit and u.ERR2354307<=:upperLimit and u.ERR2354308<=:upperLimit and u.ERR2354309<=:upperLimit and u.ERR2354310<=:upperLimit and u.ERR2354311<=:upperLimit and u.ERR2354312<=:upperLimit and u.ERR2354313<=:upperLimit and u.ERR2354314<=:upperLimit and u.ERR2354315<=:upperLimit and u.ERR2354316<=:upperLimit and u.ERR2354317<=:upperLimit and u.ERR2354318<=:upperLimit and u.ERR2354319<=:upperLimit and u.ERR2354666<=:upperLimit and u.ERR2354667<=:upperLimit and u.ERR2354668<=:upperLimit and u.ERR2354669<=:upperLimit and u.ERR2354670<=:upperLimit and u.ERR2354671<=:upperLimit and u.ERR2354672<=:upperLimit and u.ERR2354673<=:upperLimit and u.ERR2354674<=:upperLimit and u.ERR2354675<=:upperLimit and u.ERR2354676<=:upperLimit and u.ERR2354677<=:upperLimit and u.ERR2354678<=:upperLimit and u.ERR2354679<=:upperLimit and u.ERR2354680<=:upperLimit and u.ERR2354681<=:upperLimit "
			+ "ORDER BY ERR2352957, ERR2352958, ERR2352959, ERR2352960, ERR2352961, ERR2352962, ERR2352963, ERR2352964, ERR2352965, ERR2353478, ERR2353479, ERR2353480, ERR2353481, ERR2353482, ERR2353483, ERR2353484, ERR2353485, ERR2353486, ERR2353487, ERR2353488, ERR2353489, ERR2353490, ERR2353491, ERR2353492, ERR2353493, ERR2353494, ERR2353495, ERR2353496, ERR2353497, ERR2353498, ERR2353499, ERR2353500, ERR2353799, ERR2353800, ERR2353801, ERR2353802, ERR2353803, ERR2353804, ERR2353805, ERR2353806, ERR2353807, ERR2354297, ERR2354298, ERR2354299, ERR2354300, ERR2354301, ERR2354302, ERR2354303, ERR2354304, ERR2354305, ERR2354306, ERR2354307, ERR2354308, ERR2354309, ERR2354310, ERR2354311, ERR2354312, ERR2354313, ERR2354314, ERR2354315, ERR2354316, ERR2354317, ERR2354318, ERR2354319, ERR2354666, ERR2354667, ERR2354668, ERR2354669, ERR2354670, ERR2354671, ERR2354672, ERR2354673, ERR2354674, ERR2354675, ERR2354676, ERR2354677, ERR2354678, ERR2354679, ERR2354680, ERR2354681 LIMIT 100")
	public List<Reticulum_A> getReticulum_ASorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
