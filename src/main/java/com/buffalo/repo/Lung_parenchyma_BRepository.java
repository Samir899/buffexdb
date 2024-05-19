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
import com.buffalo.entity.Lung_parenchyma_B;

public interface Lung_parenchyma_BRepository extends CrudRepository<Lung_parenchyma_B, String>{
	
	@Query("SELECT u FROM Lung_parenchyma_B u WHERE u.ERR2354556>=:lowerLimit and u.ERR2354557>=:lowerLimit and u.ERR2354558>=:lowerLimit and u.ERR2354559>=:lowerLimit and u.ERR2354560>=:lowerLimit and u.ERR2354561>=:lowerLimit and u.ERR2354562>=:lowerLimit and u.ERR2354563>=:lowerLimit and u.ERR2354564>=:lowerLimit and u.ERR2354565>=:lowerLimit and u.ERR2354807>=:lowerLimit and u.ERR2354808>=:lowerLimit and u.ERR2354809>=:lowerLimit and u.ERR2354810>=:lowerLimit and u.ERR2354811>=:lowerLimit and u.ERR2354812>=:lowerLimit and u.ERR2354813>=:lowerLimit and u.ERR2354814>=:lowerLimit and u.ERR2354815>=:lowerLimit and u.ERR2354816>=:lowerLimit and u.ERR2354817>=:lowerLimit and u.ERR2354818>=:lowerLimit and u.ERR2354819>=:lowerLimit and u.ERR2354820>=:lowerLimit and u.ERR2354821>=:lowerLimit and u.ERR2354822>=:lowerLimit and u.ERR2354823>=:lowerLimit and u.ERR2354824>=:lowerLimit and u.ERR2354825>=:lowerLimit and u.ERR2354826>=:lowerLimit and u.ERR2354827>=:lowerLimit and u.ERR2354828>=:lowerLimit and u.ERR2354829>=:lowerLimit and u.ERR2354985>=:lowerLimit and u.ERR2354986>=:lowerLimit and u.ERR2354987>=:lowerLimit and u.ERR2354988>=:lowerLimit and u.ERR2354989>=:lowerLimit and u.ERR2354990>=:lowerLimit and u.ERR2354991>=:lowerLimit and u.ERR2354992>=:lowerLimit and u.ERR2354993>=:lowerLimit and u.ERR2354994>=:lowerLimit and u.ERR2354995>=:lowerLimit and u.ERR2354996>=:lowerLimit and u.ERR2354997>=:lowerLimit and u.ERR2354998>=:lowerLimit and u.ERR2354999>=:lowerLimit and u.ERR2355000>=:lowerLimit and u.ERR2355001>=:lowerLimit and u.ERR2355002>=:lowerLimit and u.ERR2355003>=:lowerLimit and u.ERR2355004>=:lowerLimit and u.ERR2355005>=:lowerLimit and u.ERR2355006>=:lowerLimit and u.ERR2355007>=:lowerLimit and "
			+ "u.ERR2354556<=:upperLimit and u.ERR2354557<=:upperLimit and u.ERR2354558<=:upperLimit and u.ERR2354559<=:upperLimit and u.ERR2354560<=:upperLimit and u.ERR2354561<=:upperLimit and u.ERR2354562<=:upperLimit and u.ERR2354563<=:upperLimit and u.ERR2354564<=:upperLimit and u.ERR2354565<=:upperLimit and u.ERR2354807<=:upperLimit and u.ERR2354808<=:upperLimit and u.ERR2354809<=:upperLimit and u.ERR2354810<=:upperLimit and u.ERR2354811<=:upperLimit and u.ERR2354812<=:upperLimit and u.ERR2354813<=:upperLimit and u.ERR2354814<=:upperLimit and u.ERR2354815<=:upperLimit and u.ERR2354816<=:upperLimit and u.ERR2354817<=:upperLimit and u.ERR2354818<=:upperLimit and u.ERR2354819<=:upperLimit and u.ERR2354820<=:upperLimit and u.ERR2354821<=:upperLimit and u.ERR2354822<=:upperLimit and u.ERR2354823<=:upperLimit and u.ERR2354824<=:upperLimit and u.ERR2354825<=:upperLimit and u.ERR2354826<=:upperLimit and u.ERR2354827<=:upperLimit and u.ERR2354828<=:upperLimit and u.ERR2354829<=:upperLimit and u.ERR2354985<=:upperLimit and u.ERR2354986<=:upperLimit and u.ERR2354987<=:upperLimit and u.ERR2354988<=:upperLimit and u.ERR2354989<=:upperLimit and u.ERR2354990<=:upperLimit and u.ERR2354991<=:upperLimit and u.ERR2354992<=:upperLimit and u.ERR2354993<=:upperLimit and u.ERR2354994<=:upperLimit and u.ERR2354995<=:upperLimit and u.ERR2354996<=:upperLimit and u.ERR2354997<=:upperLimit and u.ERR2354998<=:upperLimit and u.ERR2354999<=:upperLimit and u.ERR2355000<=:upperLimit and u.ERR2355001<=:upperLimit and u.ERR2355002<=:upperLimit and u.ERR2355003<=:upperLimit and u.ERR2355004<=:upperLimit and u.ERR2355005<=:upperLimit and u.ERR2355006<=:upperLimit and u.ERR2355007<=:upperLimit "
			+ "ORDER BY ERR2354556, ERR2354557, ERR2354558, ERR2354559, ERR2354560, ERR2354561, ERR2354562, ERR2354563, ERR2354564, ERR2354565, ERR2354807, ERR2354808, ERR2354809, ERR2354810, ERR2354811, ERR2354812, ERR2354813, ERR2354814, ERR2354815, ERR2354816, ERR2354817, ERR2354818, ERR2354819, ERR2354820, ERR2354821, ERR2354822, ERR2354823, ERR2354824, ERR2354825, ERR2354826, ERR2354827, ERR2354828, ERR2354829, ERR2354985, ERR2354986, ERR2354987, ERR2354988, ERR2354989, ERR2354990, ERR2354991, ERR2354992, ERR2354993, ERR2354994, ERR2354995, ERR2354996, ERR2354997, ERR2354998, ERR2354999, ERR2355000, ERR2355001, ERR2355002, ERR2355003, ERR2355004, ERR2355005, ERR2355006, ERR2355007 LIMIT 100")
	public List<Lung_parenchyma_B> getLung_parenchyma_BSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2354556) as ERR2354556, sum(ERR2354557) as ERR2354557, sum(ERR2354558) as ERR2354558, "
			+ "sum(ERR2354559) as ERR2354559, sum(ERR2354560) as ERR2354560, sum(ERR2354561) as ERR2354561, "
			+ "sum(ERR2354562) as ERR2354562, sum(ERR2354563) as ERR2354563, sum(ERR2354564) as ERR2354564, "
			+ "sum(ERR2354565) as ERR2354565, sum(ERR2354807) as ERR2354807, sum(ERR2354808) as ERR2354808, "
			+ "sum(ERR2354809) as ERR2354809, sum(ERR2354810) as ERR2354810, sum(ERR2354811) as ERR2354811, "
			+ "sum(ERR2354812) as ERR2354812, sum(ERR2354813) as ERR2354813, sum(ERR2354814) as ERR2354814, "
			+ "sum(ERR2354815) as ERR2354815, sum(ERR2354816) as ERR2354816, sum(ERR2354817) as ERR2354817, "
			+ "sum(ERR2354818) as ERR2354818, sum(ERR2354819) as ERR2354819, sum(ERR2354820) as ERR2354820, "
			+ "sum(ERR2354821) as ERR2354821, sum(ERR2354822) as ERR2354822, sum(ERR2354823) as ERR2354823, "
			+ "sum(ERR2354824) as ERR2354824, sum(ERR2354825) as ERR2354825, sum(ERR2354826) as ERR2354826, "
			+ "sum(ERR2354827) as ERR2354827, sum(ERR2354828) as ERR2354828, sum(ERR2354829) as ERR2354829, "
			+ "sum(ERR2354985) as ERR2354985, sum(ERR2354986) as ERR2354986, sum(ERR2354987) as ERR2354987, "
			+ "sum(ERR2354988) as ERR2354988, sum(ERR2354989) as ERR2354989, sum(ERR2354990) as ERR2354990, "
			+ "sum(ERR2354991) as ERR2354991, sum(ERR2354992) as ERR2354992, sum(ERR2354993) as ERR2354993, "
			+ "sum(ERR2354994) as ERR2354994, sum(ERR2354995) as ERR2354995, sum(ERR2354996) as ERR2354996, "
			+ "sum(ERR2354997) as ERR2354997, sum(ERR2354998) as ERR2354998, sum(ERR2354999) as ERR2354999, "
			+ "sum(ERR2355000) as ERR2355000, sum(ERR2355001) as ERR2355001, sum(ERR2355002) as ERR2355002, "
			+ "sum(ERR2355003) as ERR2355003, sum(ERR2355004) as ERR2355004, sum(ERR2355005) as ERR2355005, "
			+ "sum(ERR2355006) as ERR2355006, sum(ERR2355007) as ERR2355007 FROM Lung_parenchyma_B")
	public Map <String, Double> getSum();
}
