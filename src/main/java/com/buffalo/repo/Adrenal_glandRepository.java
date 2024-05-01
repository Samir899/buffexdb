package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Adrenal_gland;
import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;

public interface Adrenal_glandRepository extends CrudRepository<Adrenal_gland, Integer>{
	
	@Query("SELECT u FROM Adrenal_gland u WHERE u.ERR2353603>=:lowerLimit and u.ERR2353604>=:lowerLimit and u.ERR2353605>=:lowerLimit and u.ERR2353606>=:lowerLimit and u.ERR2353607>=:lowerLimit and u.ERR2353608>=:lowerLimit and u.ERR2353609>=:lowerLimit and u.ERR2353919>=:lowerLimit and u.ERR2353920>=:lowerLimit and u.ERR2353921>=:lowerLimit and u.ERR2353922>=:lowerLimit and u.ERR2353923>=:lowerLimit and u.ERR2353924>=:lowerLimit and u.ERR2353925>=:lowerLimit and u.ERR2353926>=:lowerLimit and u.ERR2353927>=:lowerLimit and u.ERR2354438>=:lowerLimit and u.ERR2354439>=:lowerLimit and u.ERR2354440>=:lowerLimit and u.ERR2354441>=:lowerLimit and u.ERR2354442>=:lowerLimit and u.ERR2354443>=:lowerLimit and u.ERR2354444>=:lowerLimit and u.ERR2354445>=:lowerLimit and u.ERR2354446>=:lowerLimit and u.ERR2354725>=:lowerLimit and u.ERR2354726>=:lowerLimit and u.ERR2354727>=:lowerLimit and u.ERR2354728>=:lowerLimit and u.ERR2354729>=:lowerLimit and u.ERR2354730>=:lowerLimit and u.ERR2354731>=:lowerLimit and u.ERR2354732>=:lowerLimit and u.ERR2354733>=:lowerLimit and u.ERR2352768>=:lowerLimit and u.ERR2352769>=:lowerLimit and u.ERR2352770>=:lowerLimit and u.ERR2352771>=:lowerLimit and u.ERR2352772>=:lowerLimit and u.ERR2352773>=:lowerLimit and u.ERR2352774>=:lowerLimit and u.ERR2353050>=:lowerLimit and u.ERR2353051>=:lowerLimit and u.ERR2353052>=:lowerLimit and u.ERR2353053>=:lowerLimit and u.ERR2353054>=:lowerLimit and u.ERR2353055>=:lowerLimit and u.ERR2353056>=:lowerLimit and u.ERR2353058>=:lowerLimit and u.SRR24057897>=:lowerLimit and u.SRR24057908>=:lowerLimit and u.SRR24057919>=:lowerLimit and u.SRR24057930>=:lowerLimit and "
			+ "u.ERR2353606<=:upperLimit and u.ERR2353607<=:upperLimit and u.ERR2353608<=:upperLimit and u.ERR2353609<=:upperLimit and u.ERR2353919<=:upperLimit and u.ERR2353920<=:upperLimit and u.ERR2353921<=:upperLimit and u.ERR2353922<=:upperLimit and u.ERR2353923<=:upperLimit and u.ERR2353924<=:upperLimit and u.ERR2353925<=:upperLimit and u.ERR2353926<=:upperLimit and u.ERR2353927<=:upperLimit and u.ERR2354438<=:upperLimit and u.ERR2354439<=:upperLimit and u.ERR2354440<=:upperLimit and u.ERR2354441<=:upperLimit and u.ERR2354442<=:upperLimit and u.ERR2354443<=:upperLimit and u.ERR2354444<=:upperLimit and u.ERR2354445<=:upperLimit and u.ERR2354446<=:upperLimit and u.ERR2354725<=:upperLimit and u.ERR2354726<=:upperLimit and u.ERR2354727<=:upperLimit and u.ERR2354728<=:upperLimit and u.ERR2354729<=:upperLimit and u.ERR2354730<=:upperLimit and u.ERR2354731<=:upperLimit and u.ERR2354732<=:upperLimit and u.ERR2354733<=:upperLimit and u.ERR2352768<=:upperLimit and u.ERR2352769<=:upperLimit and u.ERR2352770<=:upperLimit and u.ERR2352771<=:upperLimit and u.ERR2352772<=:upperLimit and u.ERR2352773<=:upperLimit and u.ERR2352774<=:upperLimit and u.ERR2353050<=:upperLimit and u.ERR2353051<=:upperLimit and u.ERR2353052<=:upperLimit and u.ERR2353053<=:upperLimit and u.ERR2353054<=:upperLimit and u.ERR2353055<=:upperLimit and u.ERR2353056<=:upperLimit and u.ERR2353058<=:upperLimit and u.SRR24057897<=:upperLimit and u.SRR24057908<=:upperLimit and u.SRR24057919<=:upperLimit and u.SRR24057930<=:upperLimit "
			+ "ORDER BY ERR2353603, ERR2353604, ERR2353605, ERR2353606, ERR2353607, ERR2353608, ERR2353609, ERR2353919, ERR2353920, ERR2353921, ERR2353922, ERR2353923, ERR2353924, ERR2353925, ERR2353926, ERR2353927, ERR2354438, ERR2354439, ERR2354440, ERR2354441, ERR2354442, ERR2354443, ERR2354444, ERR2354445, ERR2354446, ERR2354725, ERR2354726, ERR2354727, ERR2354728, ERR2354729, ERR2354730, ERR2354731, ERR2354732, ERR2354733, ERR2352768, ERR2352769, ERR2352770, ERR2352771, ERR2352772, ERR2352773, ERR2352774, ERR2353050, ERR2353051, ERR2353052, ERR2353053, ERR2353054, ERR2353055, ERR2353056, ERR2353058, SRR24057897, SRR24057908, SRR24057919, SRR24057930 LIMIT 50")
	public List<Adrenal_gland> getAdrenal_glandSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353603) as ERR2353603, sum(ERR2353604) as ERR2353604, sum(ERR2353605) as ERR2353605, "
			+ "sum(ERR2353606) as ERR2353606, sum(ERR2353607) as ERR2353607, sum(ERR2353608) as ERR2353608, "
			+ "sum(ERR2353609) as ERR2353609, sum(ERR2353919) as ERR2353919, sum(ERR2353920) as ERR2353920, "
			+ "sum(ERR2353921) as ERR2353921, sum(ERR2353922) as ERR2353922, sum(ERR2353923) as ERR2353923, "
			+ "sum(ERR2353924) as ERR2353924, sum(ERR2353925) as ERR2353925, sum(ERR2353926) as ERR2353926, "
			+ "sum(ERR2353927) as ERR2353927, sum(ERR2354438) as ERR2354438, sum(ERR2354439) as ERR2354439, "
			+ "sum(ERR2354440) as ERR2354440, sum(ERR2354441) as ERR2354441, sum(ERR2354442) as ERR2354442, "
			+ "sum(ERR2354443) as ERR2354443, sum(ERR2354444) as ERR2354444, sum(ERR2354445) as ERR2354445, "
			+ "sum(ERR2354446) as ERR2354446, sum(ERR2354725) as ERR2354725, sum(ERR2354726) as ERR2354726, "
			+ "sum(ERR2354727) as ERR2354727, sum(ERR2354728) as ERR2354728, sum(ERR2354729) as ERR2354729, "
			+ "sum(ERR2354730) as ERR2354730, sum(ERR2354731) as ERR2354731, sum(ERR2354732) as ERR2354732, "
			+ "sum(ERR2354733) as ERR2354733, sum(ERR2352768) as ERR2352768, sum(ERR2352769) as ERR2352769, "
			+ "sum(ERR2352770) as ERR2352770, sum(ERR2352771) as ERR2352771, sum(ERR2352772) as ERR2352772, "
			+ "sum(ERR2352773) as ERR2352773, sum(ERR2352774) as ERR2352774, sum(ERR2353050) as ERR2353050, "
			+ "sum(ERR2353051) as ERR2353051, sum(ERR2353052) as ERR2353052, sum(ERR2353053) as ERR2353053, "
			+ "sum(ERR2353054) as ERR2353054, sum(ERR2353055) as ERR2353055, sum(ERR2353056) as ERR2353056, "
			+ "sum(ERR2353058) as ERR2353058, sum(SRR24057897) as SRR24057897, sum(SRR24057908) as SRR24057908, "
			+ "sum(SRR24057919) as SRR24057919, sum(SRR24057930) as SRR24057930 FROM Adrenal_gland")
	public Map <String, Double> getSum();
}
