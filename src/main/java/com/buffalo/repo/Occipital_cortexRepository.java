package com.buffalo.repo;

import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Occipital_cortex;

public interface Occipital_cortexRepository extends CrudRepository<Occipital_cortex, Integer>{

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
	
	@Query("SELECT sum(ERR2354202) as ERR2354202, sum(ERR2354203) as ERR2354203, sum(ERR2354204) as ERR2354204, "
			+ "sum(ERR2354205) as ERR2354205, sum(ERR2354206) as ERR2354206, sum(ERR2354207) as ERR2354207, "
			+ "sum(ERR2354208) as ERR2354208, sum(ERR2354209) as ERR2354209, sum(ERR2354210) as ERR2354210, "
			+ "sum(ERR2354211) as ERR2354211, sum(ERR2354212) as ERR2354212, sum(ERR2354213) as ERR2354213, "
			+ "sum(ERR2354214) as ERR2354214, sum(ERR2354215) as ERR2354215, sum(ERR2354216) as ERR2354216, "
			+ "sum(ERR2354217) as ERR2354217, sum(ERR2354218) as ERR2354218, sum(ERR2354219) as ERR2354219, "
			+ "sum(ERR2354220) as ERR2354220, sum(ERR2354221) as ERR2354221, sum(ERR2354222) as ERR2354222, "
			+ "sum(ERR2354223) as ERR2354223, sum(ERR2354224) as ERR2354224, sum(ERR2353351) as ERR2353351, "
			+ "sum(ERR2353352) as ERR2353352, sum(ERR2353353) as ERR2353353, sum(ERR2353354) as ERR2353354, "
			+ "sum(ERR2353355) as ERR2353355, sum(ERR2353356) as ERR2353356, sum(ERR2353357) as ERR2353357, "
			+ "sum(ERR2353358) as ERR2353358, sum(ERR2353359) as ERR2353359, sum(ERR2353360) as ERR2353360, "
			+ "sum(ERR2353361) as ERR2353361, sum(ERR2353362) as ERR2353362, sum(ERR2353363) as ERR2353363, "
			+ "sum(ERR2353364) as ERR2353364, sum(ERR2353365) as ERR2353365, sum(ERR2353366) as ERR2353366, "
			+ "sum(ERR2353367) as ERR2353367, sum(ERR2353368) as ERR2353368, sum(ERR2353369) as ERR2353369, "
			+ "sum(ERR2353370) as ERR2353370, sum(ERR2353371) as ERR2353371, sum(ERR2353372) as ERR2353372, "
			+ "sum(ERR2353373) as ERR2353373 FROM Occipital_cortex")
	
	public Map <String, Double> getSum();
}
