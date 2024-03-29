package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Adrenal_gland;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;

public interface Adrenal_glandRepository extends CrudRepository<Adrenal_gland, Integer>{

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
