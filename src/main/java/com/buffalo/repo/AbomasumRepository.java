package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Abomasum;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;

public interface AbomasumRepository extends CrudRepository<Abomasum, Integer>{

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

