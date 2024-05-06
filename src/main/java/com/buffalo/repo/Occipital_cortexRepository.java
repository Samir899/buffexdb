package com.buffalo.repo;

import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Occipital_cortex;

public interface Occipital_cortexRepository extends CrudRepository<Occipital_cortex, Integer>{
	
	@Query("SELECT u FROM Occipital_cortex u WHERE u.ERR2354202>=:lowerLimit and u.ERR2354203>=:lowerLimit and u.ERR2354204>=:lowerLimit and u.ERR2354205>=:lowerLimit and u.ERR2354206>=:lowerLimit and u.ERR2354207>=:lowerLimit and u.ERR2354208>=:lowerLimit and u.ERR2354209>=:lowerLimit and u.ERR2354210>=:lowerLimit and u.ERR2354211>=:lowerLimit and u.ERR2354212>=:lowerLimit and u.ERR2354213>=:lowerLimit and u.ERR2354214>=:lowerLimit and u.ERR2354215>=:lowerLimit and u.ERR2354216>=:lowerLimit and u.ERR2354217>=:lowerLimit and u.ERR2354218>=:lowerLimit and u.ERR2354219>=:lowerLimit and u.ERR2354220>=:lowerLimit and u.ERR2354221>=:lowerLimit and u.ERR2354222>=:lowerLimit and u.ERR2354223>=:lowerLimit and u.ERR2354224>=:lowerLimit and u.ERR2353351>=:lowerLimit and u.ERR2353352>=:lowerLimit and u.ERR2353353>=:lowerLimit and u.ERR2353354>=:lowerLimit and u.ERR2353355>=:lowerLimit and u.ERR2353356>=:lowerLimit and u.ERR2353357>=:lowerLimit and u.ERR2353358>=:lowerLimit and u.ERR2353359>=:lowerLimit and u.ERR2353360>=:lowerLimit and u.ERR2353361>=:lowerLimit and u.ERR2353362>=:lowerLimit and u.ERR2353363>=:lowerLimit and u.ERR2353364>=:lowerLimit and u.ERR2353365>=:lowerLimit and u.ERR2353366>=:lowerLimit and u.ERR2353367>=:lowerLimit and u.ERR2353368>=:lowerLimit and u.ERR2353369>=:lowerLimit and u.ERR2353370>=:lowerLimit and u.ERR2353371>=:lowerLimit and u.ERR2353372>=:lowerLimit and u.ERR2353373>=:lowerLimit and "
			+ "u.ERR2354202<=:upperLimit and u.ERR2354203<=:upperLimit and u.ERR2354204<=:upperLimit and u.ERR2354205<=:upperLimit and u.ERR2354206<=:upperLimit and u.ERR2354207<=:upperLimit and u.ERR2354208<=:upperLimit and u.ERR2354209<=:upperLimit and u.ERR2354210<=:upperLimit and u.ERR2354211<=:upperLimit and u.ERR2354212<=:upperLimit and u.ERR2354213<=:upperLimit and u.ERR2354214<=:upperLimit and u.ERR2354215<=:upperLimit and u.ERR2354216<=:upperLimit and u.ERR2354217<=:upperLimit and u.ERR2354218<=:upperLimit and u.ERR2354219<=:upperLimit and u.ERR2354220<=:upperLimit and u.ERR2354221<=:upperLimit and u.ERR2354222<=:upperLimit and u.ERR2354223<=:upperLimit and u.ERR2354224<=:upperLimit and u.ERR2353351<=:upperLimit and u.ERR2353352<=:upperLimit and u.ERR2353353<=:upperLimit and u.ERR2353354<=:upperLimit and u.ERR2353355<=:upperLimit and u.ERR2353356<=:upperLimit and u.ERR2353357<=:upperLimit and u.ERR2353358<=:upperLimit and u.ERR2353359<=:upperLimit and u.ERR2353360<=:upperLimit and u.ERR2353361<=:upperLimit and u.ERR2353362<=:upperLimit and u.ERR2353363<=:upperLimit and u.ERR2353364<=:upperLimit and u.ERR2353365<=:upperLimit and u.ERR2353366<=:upperLimit and u.ERR2353367<=:upperLimit and u.ERR2353368<=:upperLimit and u.ERR2353369<=:upperLimit and u.ERR2353370<=:upperLimit and u.ERR2353371<=:upperLimit and u.ERR2353372<=:upperLimit and u.ERR2353373<=:upperLimit "
			+ "ORDER BY ERR2354202, ERR2354203, ERR2354204, ERR2354205, ERR2354206, ERR2354207, ERR2354208, ERR2354209, ERR2354210, ERR2354211, ERR2354212, ERR2354213, ERR2354214, ERR2354215, ERR2354216, ERR2354217, ERR2354218, ERR2354219, ERR2354220, ERR2354221, ERR2354222, ERR2354223, ERR2354224, ERR2353351, ERR2353352, ERR2353353, ERR2353354, ERR2353355, ERR2353356, ERR2353357, ERR2353358, ERR2353359, ERR2353360, ERR2353361, ERR2353362, ERR2353363, ERR2353364, ERR2353365, ERR2353366, ERR2353367, ERR2353368, ERR2353369, ERR2353370, ERR2353371, ERR2353372, ERR2353373 LIMIT 100")
	public List<Occipital_cortex> getOccipital_cortexSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
