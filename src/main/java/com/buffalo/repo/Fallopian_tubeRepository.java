package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Fallopian_tube;
import com.buffalo.entity.Genes;

public interface Fallopian_tubeRepository extends CrudRepository<Fallopian_tube, Integer>{

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
	
	@Query("SELECT sum(ERR2354465) as ERR2354465, sum(ERR2354466) as ERR2354466, sum(ERR2354467) as ERR2354467, "
			+ "sum(ERR2354468) as ERR2354468, sum(ERR2354469) as ERR2354469, sum(ERR2354470) as ERR2354470, "
			+ "sum(ERR2354471) as ERR2354471, sum(ERR2354472) as ERR2354472, sum(ERR2354473) as ERR2354473, "
			+ "sum(ERR2352810) as ERR2352810, sum(ERR2352811) as ERR2352811, sum(ERR2352812) as ERR2352812, "
			+ "sum(ERR2352813) as ERR2352813, sum(ERR2352814) as ERR2352814, sum(ERR2352815) as ERR2352815, "
			+ "sum(ERR2352816) as ERR2352816, sum(ERR2353168) as ERR2353168, sum(ERR2353169) as ERR2353169, "
			+ "sum(ERR2353170) as ERR2353170, sum(ERR2353171) as ERR2353171, sum(ERR2353172) as ERR2353172, "
			+ "sum(ERR2353173) as ERR2353173, sum(ERR2353174) as ERR2353174, sum(ERR2353175) as ERR2353175, "
			+ "sum(ERR2353176) as ERR2353176 FROM Fallopian_tube")
	public Map <String, Double> getSum();

}

