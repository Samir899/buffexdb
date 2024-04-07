package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.A_colon;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Tissue_specific_genes;

public interface TissueSpecificGeneRepo extends CrudRepository<Tissue_specific_genes, Integer>{

	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.geneId = :geneId")
	public List<Tissue_specific_genes> getByGeneId(@Param("geneId") String geneId);
	
	@Query("SELECT count(tissue_specifity) FROM Tissue_specific_genes u WHERE u.tissue_specifity = :ts")
	public Long getStats(@Param("ts") String ts);
	
	@Query("SELECT distinct tissue_specifity FROM Tissue_specific_genes")
	public List<String> getDistinctSpecificity();
	
	@Query("SELECT distinct tissue_name FROM Tissue_specific_genes")
	public List<String> getDistinctTissueName();
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_name = :tissue_name")
	public List<Tissue_specific_genes> getByTissueName(@Param("tissue_name") String tissue_name);
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_specifity = :specificity")
	public List<Tissue_specific_genes> getByTissueSpecificity(@Param("specificity") String specificity);
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_name = :tissue_name and u.tissue_specifity = :specificity")
	public List<Tissue_specific_genes> getByTissueNameAndSpecificity(@Param("tissue_name") String tissue_name, @Param("specificity") String specificity);
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



}
