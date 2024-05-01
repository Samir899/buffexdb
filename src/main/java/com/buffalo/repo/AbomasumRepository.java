package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Abomasum;
import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;

public interface AbomasumRepository extends CrudRepository<Abomasum, Integer>{
	@Query("SELECT u FROM Abomasum u WHERE u.ERR315618>=:lowerLimit and u.ERR2353596>=:lowerLimit and u.ERR2353597>=:lowerLimit and u.ERR2353598>=:lowerLimit and u.ERR2353599>=:lowerLimit and u.ERR2353600>=:lowerLimit and u.ERR2353601>=:lowerLimit and u.ERR2353602>=:lowerLimit and u.ERR2353910>=:lowerLimit and u.ERR2353911>=:lowerLimit and u.ERR2353912>=:lowerLimit and u.ERR2353913>=:lowerLimit and u.ERR2353914>=:lowerLimit and u.ERR2353915>=:lowerLimit and u.ERR2353916>=:lowerLimit and u.ERR2353917>=:lowerLimit and u.ERR2353918>=:lowerLimit and u.ERR2354429>=:lowerLimit and u.ERR2354430>=:lowerLimit and u.ERR2354431>=:lowerLimit and u.ERR2354432>=:lowerLimit and u.ERR2354433>=:lowerLimit and u.ERR2354434>=:lowerLimit and u.ERR2354435>=:lowerLimit and u.ERR2354436>=:lowerLimit and u.ERR2354437>=:lowerLimit and u.ERR2354716>=:lowerLimit and u.ERR2354717>=:lowerLimit and u.ERR2354718>=:lowerLimit and u.ERR2354719>=:lowerLimit and u.ERR2354720>=:lowerLimit and u.ERR2354721>=:lowerLimit and u.ERR2354722>=:lowerLimit and u.ERR2354723>=:lowerLimit and u.ERR2354724>=:lowerLimit and u.ERR2354921>=:lowerLimit and u.ERR2354922>=:lowerLimit and u.ERR2354923>=:lowerLimit and u.ERR2354924>=:lowerLimit and u.ERR2354925>=:lowerLimit and u.ERR2354926>=:lowerLimit and u.ERR2354927>=:lowerLimit and u.ERR2354928>=:lowerLimit and u.ERR2354929>=:lowerLimit and u.ERR2352761>=:lowerLimit and u.ERR2352762>=:lowerLimit and u.ERR2352763>=:lowerLimit and u.ERR2352764>=:lowerLimit and u.ERR2352765>=:lowerLimit and u.ERR2352766>=:lowerLimit and u.ERR2352767>=:lowerLimit and u.ERR2353041>=:lowerLimit and u.ERR2353042>=:lowerLimit and u.ERR2353043>=:lowerLimit and u.ERR2353044>=:lowerLimit and u.ERR2353045>=:lowerLimit and u.ERR2353046>=:lowerLimit and u.ERR2353047>=:lowerLimit and u.ERR2353048>=:lowerLimit and u.ERR2353049>=:lowerLimit and "
			+ "u.ERR315618<=:upperLimit and u.ERR2353596<=:upperLimit and u.ERR2353597<=:upperLimit and u.ERR2353598<=:upperLimit and u.ERR2353599<=:upperLimit and u.ERR2353600<=:upperLimit and u.ERR2353601<=:upperLimit and u.ERR2353602<=:upperLimit and u.ERR2353910<=:upperLimit and u.ERR2353911<=:upperLimit and u.ERR2353912<=:upperLimit and u.ERR2353913<=:upperLimit and u.ERR2353914<=:upperLimit and u.ERR2353915<=:upperLimit and u.ERR2353916<=:upperLimit and u.ERR2353917<=:upperLimit and u.ERR2353918<=:upperLimit and u.ERR2354429<=:upperLimit and u.ERR2354430<=:upperLimit and u.ERR2354431<=:upperLimit and u.ERR2354432<=:upperLimit and u.ERR2354433<=:upperLimit and u.ERR2354434<=:upperLimit and u.ERR2354435<=:upperLimit and u.ERR2354436<=:upperLimit and u.ERR2354437<=:upperLimit and u.ERR2354716<=:upperLimit and u.ERR2354717<=:upperLimit and u.ERR2354718<=:upperLimit and u.ERR2354719<=:upperLimit and u.ERR2354720<=:upperLimit and u.ERR2354721<=:upperLimit and u.ERR2354722<=:upperLimit and u.ERR2354723<=:upperLimit and u.ERR2354724<=:upperLimit and u.ERR2354921<=:upperLimit and u.ERR2354922<=:upperLimit and u.ERR2354923<=:upperLimit and u.ERR2354924<=:upperLimit and u.ERR2354925<=:upperLimit and u.ERR2354926<=:upperLimit and u.ERR2354927<=:upperLimit and u.ERR2354928<=:upperLimit and u.ERR2354929<=:upperLimit and u.ERR2352761<=:upperLimit and u.ERR2352762<=:upperLimit and u.ERR2352763<=:upperLimit and u.ERR2352764<=:upperLimit and u.ERR2352765<=:upperLimit and u.ERR2352766<=:upperLimit and u.ERR2352767<=:upperLimit and u.ERR2353041<=:upperLimit and u.ERR2353042<=:upperLimit and u.ERR2353043<=:upperLimit and u.ERR2353044<=:upperLimit and u.ERR2353045<=:upperLimit and u.ERR2353046<=:upperLimit and u.ERR2353047<=:upperLimit and u.ERR2353048<=:upperLimit and u.ERR2353049<=:upperLimit "
			+ "ORDER BY ERR315618, ERR2353596, ERR2353597, ERR2353598, ERR2353599, ERR2353600, ERR2353601, ERR2353602, ERR2353910, ERR2353911, ERR2353912, ERR2353913, ERR2353914, ERR2353915, ERR2353916, ERR2353917, ERR2353918, ERR2354429, ERR2354430, ERR2354431, ERR2354432, ERR2354433, ERR2354434, ERR2354435, ERR2354436, ERR2354437, ERR2354716, ERR2354717, ERR2354718, ERR2354719, ERR2354720, ERR2354721, ERR2354722, ERR2354723, ERR2354724, ERR2354921, ERR2354922, ERR2354923, ERR2354924, ERR2354925, ERR2354926, ERR2354927, ERR2354928, ERR2354929, ERR2352761, ERR2352762, ERR2352763, ERR2352764, ERR2352765, ERR2352766, ERR2352767, ERR2353041, ERR2353042, ERR2353043, ERR2353044, ERR2353045, ERR2353046, ERR2353047, ERR2353048, ERR2353049 LIMIT 50")
	public List<Abomasum> getAbomasumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315618) as ERR315618, sum(ERR2353596) as ERR2353596, sum(ERR2353597) as ERR2353597,"
			+ " sum(ERR2353598) as ERR2353598, sum(ERR2353599) as ERR2353599, sum(ERR2353600) as ERR2353600, "
			+ "sum(ERR2353601) as ERR2353601, sum(ERR2353602) as ERR2353602, sum(ERR2353910) as ERR2353910, "
			+ "sum(ERR2353911) as ERR2353911, sum(ERR2353912) as ERR2353912, sum(ERR2353913) as ERR2353913, "
			+ "sum(ERR2353914) as ERR2353914, sum(ERR2353915) as ERR2353915, sum(ERR2353916) as ERR2353916, "
			+ "sum(ERR2353917) as ERR2353917, sum(ERR2353918) as ERR2353918, sum(ERR2354429) as ERR2354429, "
			+ "sum(ERR2354430) as ERR2354430, sum(ERR2354431) as ERR2354431, sum(ERR2354432) as ERR2354432, "
			+ "sum(ERR2354433) as ERR2354433, sum(ERR2354434) as ERR2354434, sum(ERR2354435) as ERR2354435, "
			+ "sum(ERR2354436) as ERR2354436, sum(ERR2354437) as ERR2354437, sum(ERR2354716) as ERR2354716, "
			+ "sum(ERR2354717) as ERR2354717, sum(ERR2354718) as ERR2354718, sum(ERR2354719) as ERR2354719, "
			+ "sum(ERR2354720) as ERR2354720, sum(ERR2354721) as ERR2354721, sum(ERR2354722) as ERR2354722, "
			+ "sum(ERR2354723) as ERR2354723, sum(ERR2354724) as ERR2354724, sum(ERR2354921) as ERR2354921, "
			+ "sum(ERR2354922) as ERR2354922, sum(ERR2354923) as ERR2354923, sum(ERR2354924) as ERR2354924, "
			+ "sum(ERR2354925) as ERR2354925, sum(ERR2354926) as ERR2354926, sum(ERR2354927) as ERR2354927, "
			+ "sum(ERR2354928) as ERR2354928, sum(ERR2354929) as ERR2354929, sum(ERR2352761) as ERR2352761, "
			+ "sum(ERR2352762) as ERR2352762, sum(ERR2352763) as ERR2352763, sum(ERR2352764) as ERR2352764, "
			+ "sum(ERR2352765) as ERR2352765, sum(ERR2352766) as ERR2352766, sum(ERR2352767) as ERR2352767, "
			+ "sum(ERR2353041) as ERR2353041, sum(ERR2353042) as ERR2353042, sum(ERR2353043) as ERR2353043, "
			+ "sum(ERR2353044) as ERR2353044, sum(ERR2353045) as ERR2353045, sum(ERR2353046) as ERR2353046, "
			+ "sum(ERR2353047) as ERR2353047, sum(ERR2353048) as ERR2353048, sum(ERR2353049) as ERR2353049 FROM Abomasum")
	public Map <String, Double> getSum();
}

