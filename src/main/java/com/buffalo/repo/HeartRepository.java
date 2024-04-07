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
import com.buffalo.entity.Heart;

public interface HeartRepository extends CrudRepository<Heart, Integer>{

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
