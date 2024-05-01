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
import com.buffalo.entity.Kidney_cortex;

public interface Kidney_cortexRepository extends CrudRepository<Kidney_cortex, Integer>{

	@Query("SELECT u FROM Kidney_cortex u WHERE u.ERR2352842 >= :lowerLimit and u.ERR2352843 >= :lowerLimit and u.ERR2352844 >= :lowerLimit and u.ERR2352845 >= :lowerLimit and u.ERR2352846 >= :lowerLimit and u.ERR2352847 >= :lowerLimit and u.ERR2352848 >= :lowerLimit and u.ERR2353209 >= :lowerLimit and u.ERR2353210 >= :lowerLimit and u.ERR2353211 >= :lowerLimit and u.ERR2353212 >= :lowerLimit and u.ERR2353213 >= :lowerLimit and u.ERR2353214 >= :lowerLimit and u.ERR2353215 >= :lowerLimit and u.ERR2353216 >= :lowerLimit and u.ERR2353217 >= :lowerLimit and u.ERR2353693 >= :lowerLimit and u.ERR2353694 >= :lowerLimit and u.ERR2353695 >= :lowerLimit and u.ERR2353696 >= :lowerLimit and u.ERR2353697 >= :lowerLimit and u.ERR2353698 >= :lowerLimit and u.ERR2353699 >= :lowerLimit and u.ERR2354069 >= :lowerLimit and u.ERR2354070 >= :lowerLimit and u.ERR2354071 >= :lowerLimit and u.ERR2354072 >= :lowerLimit and u.ERR2354073 >= :lowerLimit and u.ERR2354074 >= :lowerLimit and u.ERR2354075 >= :lowerLimit and u.ERR2354076 >= :lowerLimit and u.ERR2354077 >= :lowerLimit and u.ERR2354752 >= :lowerLimit and u.ERR2354753 >= :lowerLimit and u.ERR2354754 >= :lowerLimit and u.ERR2354755 >= :lowerLimit and u.ERR2354756 >= :lowerLimit and u.ERR2354757 >= :lowerLimit and u.ERR2354758 >= :lowerLimit and u.ERR2354759 >= :lowerLimit and u.ERR2354760 >= :lowerLimit and u.SRR24057935 >= :lowerLimit and u.SRR24057936 >= :lowerLimit and u.SRR24057937 >= :lowerLimit and u.SRR24057938 >= :lowerLimit and "
			+ "u.ERR2352842<=:upperLimit and u.ERR2352843<=:upperLimit and u.ERR2352844<=:upperLimit and u.ERR2352845<=:upperLimit and u.ERR2352846<=:upperLimit and u.ERR2352847<=:upperLimit and u.ERR2352848<=:upperLimit and u.ERR2353209<=:upperLimit and u.ERR2353210<=:upperLimit and u.ERR2353211<=:upperLimit and u.ERR2353212<=:upperLimit and u.ERR2353213<=:upperLimit and u.ERR2353214<=:upperLimit and u.ERR2353215<=:upperLimit and u.ERR2353216<=:upperLimit and u.ERR2353217<=:upperLimit and u.ERR2353693<=:upperLimit and u.ERR2353694<=:upperLimit and u.ERR2353695<=:upperLimit and u.ERR2353696<=:upperLimit and u.ERR2353697<=:upperLimit and u.ERR2353698<=:upperLimit and u.ERR2353699<=:upperLimit and u.ERR2354069<=:upperLimit and u.ERR2354070<=:upperLimit and u.ERR2354071<=:upperLimit and u.ERR2354072<=:upperLimit and u.ERR2354073<=:upperLimit and u.ERR2354074<=:upperLimit and u.ERR2354075<=:upperLimit and u.ERR2354076<=:upperLimit and u.ERR2354077<=:upperLimit and u.ERR2354752<=:upperLimit and u.ERR2354753<=:upperLimit and u.ERR2354754<=:upperLimit and u.ERR2354755<=:upperLimit and u.ERR2354756<=:upperLimit and u.ERR2354757<=:upperLimit and u.ERR2354758<=:upperLimit and u.ERR2354759<=:upperLimit and u.ERR2354760<=:upperLimit and u.SRR24057935<=:upperLimit and u.SRR24057936<=:upperLimit and u.SRR24057937<=:upperLimit and u.SRR24057938<=:upperLimit "
			+ " ORDER BY ERR2352842, ERR2352843, ERR2352844, ERR2352845, ERR2352846, ERR2352847, ERR2352848, ERR2353209, ERR2353210, ERR2353211, ERR2353212, ERR2353213, ERR2353214, ERR2353215, ERR2353216, ERR2353217, ERR2353693, ERR2353694, ERR2353695, ERR2353696, ERR2353697, ERR2353698, ERR2353699, ERR2354069, ERR2354070, ERR2354071, ERR2354072, ERR2354073, ERR2354074, ERR2354075, ERR2354076, ERR2354077, ERR2354752, ERR2354753, ERR2354754, ERR2354755, ERR2354756, ERR2354757, ERR2354758, ERR2354759, ERR2354760, SRR24057935, SRR24057936, SRR24057937, SRR24057938 LIMIT 50")
	public List<Kidney_cortex> getKidney_cortexSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(ERR2352842) as ERR2352842, sum(ERR2352843) as ERR2352843, sum(ERR2352844) as ERR2352844, sum(ERR2352845) as ERR2352845, sum(ERR2352846) as ERR2352846, sum(ERR2352847) as ERR2352847, sum(ERR2352848) as ERR2352848, sum(ERR2353209) as ERR2353209, sum(ERR2353210) as ERR2353210, sum(ERR2353211) as ERR2353211, sum(ERR2353212) as ERR2353212, sum(ERR2353213) as ERR2353213, sum(ERR2353214) as ERR2353214, sum(ERR2353215) as ERR2353215, sum(ERR2353216) as ERR2353216, sum(ERR2353217) as ERR2353217, sum(ERR2353693) as ERR2353693, sum(ERR2353694) as ERR2353694, sum(ERR2353695) as ERR2353695, sum(ERR2353696) as ERR2353696, sum(ERR2353697) as ERR2353697, sum(ERR2353698) as ERR2353698, sum(ERR2353699) as ERR2353699, sum(ERR2354069) as ERR2354069, sum(ERR2354070) as ERR2354070, sum(ERR2354071) as ERR2354071, sum(ERR2354072) as ERR2354072, sum(ERR2354073) as ERR2354073, sum(ERR2354074) as ERR2354074, sum(ERR2354075) as ERR2354075, sum(ERR2354076) as ERR2354076, sum(ERR2354077) as ERR2354077, sum(ERR2354752) as ERR2354752, sum(ERR2354753) as ERR2354753, sum(ERR2354754) as ERR2354754, sum(ERR2354755) as ERR2354755, sum(ERR2354756) as ERR2354756, sum(ERR2354757) as ERR2354757, sum(ERR2354758) as ERR2354758, sum(ERR2354759) as ERR2354759, sum(ERR2354760) as ERR2354760, sum(SRR24057935) as SRR24057935, sum(SRR24057936) as SRR24057936, sum(SRR24057937) as SRR24057937, sum(SRR24057938) as SRR24057938 FROM Kidney_cortex")
	public Map <String, Double> getSum();
}
