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
import com.buffalo.entity.Heart;

public interface HeartRepository extends CrudRepository<Heart, Integer>{
	
	@Query("SELECT u FROM Heart u WHERE u.ERR315631>=:lowerLimit and u.ERR2353510>=:lowerLimit and u.ERR2353511>=:lowerLimit and u.ERR2353512>=:lowerLimit and u.ERR2353513>=:lowerLimit and u.ERR2353514>=:lowerLimit and u.ERR2353515>=:lowerLimit and u.ERR2353516>=:lowerLimit and u.ERR2353517>=:lowerLimit and u.ERR2353518>=:lowerLimit and u.ERR2353652>=:lowerLimit and u.ERR2353653>=:lowerLimit and u.ERR2353654>=:lowerLimit and u.ERR2353655>=:lowerLimit and u.ERR2353656>=:lowerLimit and u.ERR2353657>=:lowerLimit and u.ERR2353658>=:lowerLimit and u.ERR2353659>=:lowerLimit and u.ERR2353660>=:lowerLimit and u.ERR2353815>=:lowerLimit and u.ERR2353816>=:lowerLimit and u.ERR2353817>=:lowerLimit and u.ERR2353818>=:lowerLimit and u.ERR2353819>=:lowerLimit and u.ERR2353820>=:lowerLimit and u.ERR2353821>=:lowerLimit and u.ERR2354170>=:lowerLimit and u.ERR2354171>=:lowerLimit and u.ERR2354172>=:lowerLimit and u.ERR2354173>=:lowerLimit and u.ERR2354174>=:lowerLimit and u.ERR2354175>=:lowerLimit and u.ERR2354176>=:lowerLimit and u.ERR2354177>=:lowerLimit and u.ERR2354178>=:lowerLimit and u.ERR2354179>=:lowerLimit and u.ERR2354180>=:lowerLimit and u.ERR2354181>=:lowerLimit and u.ERR2354182>=:lowerLimit and u.ERR2354183>=:lowerLimit and u.ERR2354184>=:lowerLimit and u.ERR2354185>=:lowerLimit and u.ERR2354186>=:lowerLimit and u.ERR2354187>=:lowerLimit and u.ERR2354188>=:lowerLimit and u.ERR2354189>=:lowerLimit and u.ERR2354190>=:lowerLimit and u.ERR2354191>=:lowerLimit and u.ERR2354192>=:lowerLimit and u.ERR2354329>=:lowerLimit and u.ERR2354330>=:lowerLimit and u.ERR2354331>=:lowerLimit and u.ERR2354332>=:lowerLimit and u.ERR2354333>=:lowerLimit and u.ERR2354334>=:lowerLimit and u.ERR2354335>=:lowerLimit and u.ERR2354336>=:lowerLimit and u.ERR2354337>=:lowerLimit and u.ERR2354566>=:lowerLimit and u.ERR2354567>=:lowerLimit and u.ERR2354568>=:lowerLimit and u.ERR2354569>=:lowerLimit and u.ERR2354570>=:lowerLimit and u.ERR2354571>=:lowerLimit and u.ERR2354572>=:lowerLimit and u.ERR2354573>=:lowerLimit and u.ERR2354574>=:lowerLimit and u.ERR2354575>=:lowerLimit and u.ERR2354576>=:lowerLimit and u.ERR2354577>=:lowerLimit and u.ERR2354578>=:lowerLimit and u.ERR2354579>=:lowerLimit and u.ERR2354580>=:lowerLimit and u.ERR2354581>=:lowerLimit and u.ERR2354582>=:lowerLimit and u.ERR2354583>=:lowerLimit and u.ERR2354584>=:lowerLimit and u.ERR2354585>=:lowerLimit and u.ERR2354586>=:lowerLimit and u.ERR2354587>=:lowerLimit and u.ERR2354588>=:lowerLimit and u.ERR2354698>=:lowerLimit and u.ERR2354699>=:lowerLimit and u.ERR2354700>=:lowerLimit and u.ERR2354701>=:lowerLimit and u.ERR2354702>=:lowerLimit and u.ERR2354703>=:lowerLimit and u.ERR2354704>=:lowerLimit and u.ERR2354705>=:lowerLimit and u.ERR2354706>=:lowerLimit and u.ERR2352817>=:lowerLimit and u.ERR2352973>=:lowerLimit and u.ERR2352974>=:lowerLimit and u.ERR2352975>=:lowerLimit and u.ERR2352976>=:lowerLimit and u.ERR2352977>=:lowerLimit and u.ERR2352978>=:lowerLimit and u.ERR2352979>=:lowerLimit and u.ERR2353310>=:lowerLimit and u.ERR2353311>=:lowerLimit and u.ERR2353312>=:lowerLimit and u.ERR2353313>=:lowerLimit and u.ERR2353314>=:lowerLimit and u.ERR2353315>=:lowerLimit and u.ERR2353316>=:lowerLimit and u.ERR2353317>=:lowerLimit and u.ERR2353318>=:lowerLimit and u.ERR2353319>=:lowerLimit and u.ERR2353320>=:lowerLimit and u.ERR2353321>=:lowerLimit and u.ERR2353322>=:lowerLimit and u.ERR2353323>=:lowerLimit and u.ERR2353324>=:lowerLimit and u.ERR2353325>=:lowerLimit and u.ERR2353326>=:lowerLimit and u.ERR2353327>=:lowerLimit and u.ERR2353328>=:lowerLimit and u.ERR2353329>=:lowerLimit and u.ERR2353330>=:lowerLimit and u.ERR2353331>=:lowerLimit and u.ERR2353332>=:lowerLimit and u.SRR15721745>=:lowerLimit and u.SRR24057939>=:lowerLimit and u.SRR24057940>=:lowerLimit and u.SRR24057942>=:lowerLimit and u.SRR24057943>=:lowerLimit and "
			+ "u.ERR315631<=:upperLimit and u.ERR2353510<=:upperLimit and u.ERR2353511<=:upperLimit and u.ERR2353512<=:upperLimit and u.ERR2353513<=:upperLimit and u.ERR2353514<=:upperLimit and u.ERR2353515<=:upperLimit and u.ERR2353516<=:upperLimit and u.ERR2353517<=:upperLimit and u.ERR2353518<=:upperLimit and u.ERR2353652<=:upperLimit and u.ERR2353653<=:upperLimit and u.ERR2353654<=:upperLimit and u.ERR2353655<=:upperLimit and u.ERR2353656<=:upperLimit and u.ERR2353657<=:upperLimit and u.ERR2353658<=:upperLimit and u.ERR2353659<=:upperLimit and u.ERR2353660<=:upperLimit and u.ERR2353815<=:upperLimit and u.ERR2353816<=:upperLimit and u.ERR2353817<=:upperLimit and u.ERR2353818<=:upperLimit and u.ERR2353819<=:upperLimit and u.ERR2353820<=:upperLimit and u.ERR2353821<=:upperLimit and u.ERR2354170<=:upperLimit and u.ERR2354171<=:upperLimit and u.ERR2354172<=:upperLimit and u.ERR2354173<=:upperLimit and u.ERR2354174<=:upperLimit and u.ERR2354175<=:upperLimit and u.ERR2354176<=:upperLimit and u.ERR2354177<=:upperLimit and u.ERR2354178<=:upperLimit and u.ERR2354179<=:upperLimit and u.ERR2354180<=:upperLimit and u.ERR2354181<=:upperLimit and u.ERR2354182<=:upperLimit and u.ERR2354183<=:upperLimit and u.ERR2354184<=:upperLimit and u.ERR2354185<=:upperLimit and u.ERR2354186<=:upperLimit and u.ERR2354187<=:upperLimit and u.ERR2354188<=:upperLimit and u.ERR2354189<=:upperLimit and u.ERR2354190<=:upperLimit and u.ERR2354191<=:upperLimit and u.ERR2354192<=:upperLimit and u.ERR2354329<=:upperLimit and u.ERR2354330<=:upperLimit and u.ERR2354331<=:upperLimit and u.ERR2354332<=:upperLimit and u.ERR2354333<=:upperLimit and u.ERR2354334<=:upperLimit and u.ERR2354335<=:upperLimit and u.ERR2354336<=:upperLimit and u.ERR2354337<=:upperLimit and u.ERR2354566<=:upperLimit and u.ERR2354567<=:upperLimit and u.ERR2354568<=:upperLimit and u.ERR2354569<=:upperLimit and u.ERR2354570<=:upperLimit and u.ERR2354571<=:upperLimit and u.ERR2354572<=:upperLimit and u.ERR2354573<=:upperLimit and u.ERR2354574<=:upperLimit and u.ERR2354575<=:upperLimit and u.ERR2354576<=:upperLimit and u.ERR2354577<=:upperLimit and u.ERR2354578<=:upperLimit and u.ERR2354579<=:upperLimit and u.ERR2354580<=:upperLimit and u.ERR2354581<=:upperLimit and u.ERR2354582<=:upperLimit and u.ERR2354583<=:upperLimit and u.ERR2354584<=:upperLimit and u.ERR2354585<=:upperLimit and u.ERR2354586<=:upperLimit and u.ERR2354587<=:upperLimit and u.ERR2354588<=:upperLimit and u.ERR2354698<=:upperLimit and u.ERR2354699<=:upperLimit and u.ERR2354700<=:upperLimit and u.ERR2354701<=:upperLimit and u.ERR2354702<=:upperLimit and u.ERR2354703<=:upperLimit and u.ERR2354704<=:upperLimit and u.ERR2354705<=:upperLimit and u.ERR2354706<=:upperLimit and u.ERR2352817<=:upperLimit and u.ERR2352973<=:upperLimit and u.ERR2352974<=:upperLimit and u.ERR2352975<=:upperLimit and u.ERR2352976<=:upperLimit and u.ERR2352977<=:upperLimit and u.ERR2352978<=:upperLimit and u.ERR2352979<=:upperLimit and u.ERR2353310<=:upperLimit and u.ERR2353311<=:upperLimit and u.ERR2353312<=:upperLimit and u.ERR2353313<=:upperLimit and u.ERR2353314<=:upperLimit and u.ERR2353315<=:upperLimit and u.ERR2353316<=:upperLimit and u.ERR2353317<=:upperLimit and u.ERR2353318<=:upperLimit and u.ERR2353319<=:upperLimit and u.ERR2353320<=:upperLimit and u.ERR2353321<=:upperLimit and u.ERR2353322<=:upperLimit and u.ERR2353323<=:upperLimit and u.ERR2353324<=:upperLimit and u.ERR2353325<=:upperLimit and u.ERR2353326<=:upperLimit and u.ERR2353327<=:upperLimit and u.ERR2353328<=:upperLimit and u.ERR2353329<=:upperLimit and u.ERR2353330<=:upperLimit and u.ERR2353331<=:upperLimit and u.ERR2353332<=:upperLimit and u.SRR15721745<=:upperLimit and u.SRR24057939<=:upperLimit and u.SRR24057940<=:upperLimit and u.SRR24057942<=:upperLimit and u.SRR24057943<=:upperLimit "
			+ "ORDER BY ERR315631, ERR2353510, ERR2353511, ERR2353512, ERR2353513, ERR2353514, ERR2353515, ERR2353516, ERR2353517, ERR2353518, ERR2353652, ERR2353653, ERR2353654, ERR2353655, ERR2353656, ERR2353657, ERR2353658, ERR2353659, ERR2353660, ERR2353815, ERR2353816, ERR2353817, ERR2353818, ERR2353819, ERR2353820, ERR2353821, ERR2354170, ERR2354171, ERR2354172, ERR2354173, ERR2354174, ERR2354175, ERR2354176, ERR2354177, ERR2354178, ERR2354179, ERR2354180, ERR2354181, ERR2354182, ERR2354183, ERR2354184, ERR2354185, ERR2354186, ERR2354187, ERR2354188, ERR2354189, ERR2354190, ERR2354191, ERR2354192, ERR2354329, ERR2354330, ERR2354331, ERR2354332, ERR2354333, ERR2354334, ERR2354335, ERR2354336, ERR2354337, ERR2354566, ERR2354567, ERR2354568, ERR2354569, ERR2354570, ERR2354571, ERR2354572, ERR2354573, ERR2354574, ERR2354575, ERR2354576, ERR2354577, ERR2354578, ERR2354579, ERR2354580, ERR2354581, ERR2354582, ERR2354583, ERR2354584, ERR2354585, ERR2354586, ERR2354587, ERR2354588, ERR2354698, ERR2354699, ERR2354700, ERR2354701, ERR2354702, ERR2354703, ERR2354704, ERR2354705, ERR2354706, ERR2352817, ERR2352973, ERR2352974, ERR2352975, ERR2352976, ERR2352977, ERR2352978, ERR2352979, ERR2353310, ERR2353311, ERR2353312, ERR2353313, ERR2353314, ERR2353315, ERR2353316, ERR2353317, ERR2353318, ERR2353319, ERR2353320, ERR2353321, ERR2353322, ERR2353323, ERR2353324, ERR2353325, ERR2353326, ERR2353327, ERR2353328, ERR2353329, ERR2353330, ERR2353331, ERR2353332, SRR15721745, SRR24057939, SRR24057940, SRR24057942, SRR24057943 LIMIT 100")
	public List<Heart> getHeartSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315631) as ERR315631, sum(ERR2353510) as ERR2353510, sum(ERR2353511) as ERR2353511, "
			+ "sum(ERR2353512) as ERR2353512, sum(ERR2353513) as ERR2353513, sum(ERR2353514) as ERR2353514, "
			+ "sum(ERR2353515) as ERR2353515, sum(ERR2353516) as ERR2353516, sum(ERR2353517) as ERR2353517, "
			+ "sum(ERR2353518) as ERR2353518, sum(ERR2353652) as ERR2353652, sum(ERR2353653) as ERR2353653, "
			+ "sum(ERR2353654) as ERR2353654, sum(ERR2353655) as ERR2353655, sum(ERR2353656) as ERR2353656, "
			+ "sum(ERR2353657) as ERR2353657, sum(ERR2353658) as ERR2353658, sum(ERR2353659) as ERR2353659, "
			+ "sum(ERR2353660) as ERR2353660, sum(ERR2353815) as ERR2353815, sum(ERR2353816) as ERR2353816, "
			+ "sum(ERR2353817) as ERR2353817, sum(ERR2353818) as ERR2353818, sum(ERR2353819) as ERR2353819, "
			+ "sum(ERR2353820) as ERR2353820, sum(ERR2353821) as ERR2353821, sum(ERR2354170) as ERR2354170, "
			+ "sum(ERR2354171) as ERR2354171, sum(ERR2354172) as ERR2354172, sum(ERR2354173) as ERR2354173, "
			+ "sum(ERR2354174) as ERR2354174, sum(ERR2354175) as ERR2354175, sum(ERR2354176) as ERR2354176, "
			+ "sum(ERR2354177) as ERR2354177, sum(ERR2354178) as ERR2354178, sum(ERR2354179) as ERR2354179, "
			+ "sum(ERR2354180) as ERR2354180, sum(ERR2354181) as ERR2354181, sum(ERR2354182) as ERR2354182, "
			+ "sum(ERR2354183) as ERR2354183, sum(ERR2354184) as ERR2354184, sum(ERR2354185) as ERR2354185, "
			+ "sum(ERR2354186) as ERR2354186, sum(ERR2354187) as ERR2354187, sum(ERR2354188) as ERR2354188, "
			+ "sum(ERR2354189) as ERR2354189, sum(ERR2354190) as ERR2354190, sum(ERR2354191) as ERR2354191, "
			+ "sum(ERR2354192) as ERR2354192, sum(ERR2354329) as ERR2354329, sum(ERR2354330) as ERR2354330, "
			+ "sum(ERR2354331) as ERR2354331, sum(ERR2354332) as ERR2354332, sum(ERR2354333) as ERR2354333, "
			+ "sum(ERR2354334) as ERR2354334, sum(ERR2354335) as ERR2354335, sum(ERR2354336) as ERR2354336, "
			+ "sum(ERR2354337) as ERR2354337, sum(ERR2354566) as ERR2354566, sum(ERR2354567) as ERR2354567, "
			+ "sum(ERR2354568) as ERR2354568, sum(ERR2354569) as ERR2354569, sum(ERR2354570) as ERR2354570, "
			+ "sum(ERR2354571) as ERR2354571, sum(ERR2354572) as ERR2354572, sum(ERR2354573) as ERR2354573, "
			+ "sum(ERR2354574) as ERR2354574, sum(ERR2354575) as ERR2354575, sum(ERR2354576) as ERR2354576, "
			+ "sum(ERR2354577) as ERR2354577, sum(ERR2354578) as ERR2354578, sum(ERR2354579) as ERR2354579, "
			+ "sum(ERR2354580) as ERR2354580, sum(ERR2354581) as ERR2354581, sum(ERR2354582) as ERR2354582, "
			+ "sum(ERR2354583) as ERR2354583, sum(ERR2354584) as ERR2354584, sum(ERR2354585) as ERR2354585, "
			+ "sum(ERR2354586) as ERR2354586, sum(ERR2354587) as ERR2354587, sum(ERR2354588) as ERR2354588, "
			+ "sum(ERR2354698) as ERR2354698, sum(ERR2354699) as ERR2354699, sum(ERR2354700) as ERR2354700, "
			+ "sum(ERR2354701) as ERR2354701, sum(ERR2354702) as ERR2354702, sum(ERR2354703) as ERR2354703, "
			+ "sum(ERR2354704) as ERR2354704, sum(ERR2354705) as ERR2354705, sum(ERR2354706) as ERR2354706, "
			+ "sum(ERR2352817) as ERR2352817, sum(ERR2352973) as ERR2352973, sum(ERR2352974) as ERR2352974, "
			+ "sum(ERR2352975) as ERR2352975, sum(ERR2352976) as ERR2352976, sum(ERR2352977) as ERR2352977, "
			+ "sum(ERR2352978) as ERR2352978, sum(ERR2352979) as ERR2352979, sum(ERR2353310) as ERR2353310, "
			+ "sum(ERR2353311) as ERR2353311, sum(ERR2353312) as ERR2353312, sum(ERR2353313) as ERR2353313, "
			+ "sum(ERR2353314) as ERR2353314, sum(ERR2353315) as ERR2353315, sum(ERR2353316) as ERR2353316, "
			+ "sum(ERR2353317) as ERR2353317, sum(ERR2353318) as ERR2353318, sum(ERR2353319) as ERR2353319, "
			+ "sum(ERR2353320) as ERR2353320, sum(ERR2353321) as ERR2353321, sum(ERR2353322) as ERR2353322, "
			+ "sum(ERR2353323) as ERR2353323, sum(ERR2353324) as ERR2353324, sum(ERR2353325) as ERR2353325, "
			+ "sum(ERR2353326) as ERR2353326, sum(ERR2353327) as ERR2353327, sum(ERR2353328) as ERR2353328, "
			+ "sum(ERR2353329) as ERR2353329, sum(ERR2353330) as ERR2353330, sum(ERR2353331) as ERR2353331, "
			+ "sum(ERR2353332) as ERR2353332, sum(SRR15721745) as SRR15721745, sum(SRR24057939) as SRR24057939, "
			+ "sum(SRR24057940) as SRR24057940, sum(SRR24057942) as SRR24057942, sum(SRR24057943) as SRR24057943 FROM Heart")
	public Map <String, Double> getSum();
}
