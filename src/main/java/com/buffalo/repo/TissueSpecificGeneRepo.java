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
	
	@Query("SELECT count(tissue_specificity) FROM Tissue_specific_genes u WHERE u.tissue_specificity = :ts")
	public Long getStats(@Param("ts") String ts);
	
	@Query("SELECT distinct tissue_specificity FROM Tissue_specific_genes")
	public List<String> getDistinctSpecificity();
	
	@Query("SELECT distinct tissue_name FROM Tissue_specific_genes")
	public List<String> getDistinctTissueName();
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_name = :tissue_name")
	public List<Tissue_specific_genes> getByTissueName(@Param("tissue_name") String tissue_name);
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_specificity = :specificity")
	public List<Tissue_specific_genes> getByTissueSpecificity(@Param("specificity") String specificity);
	
	@Query("SELECT u FROM Tissue_specific_genes u WHERE u.tissue_name = :tissue_name and u.tissue_specificity = :tissue_specificity")
	public List<Tissue_specific_genes> getByTissueNameAndSpecificity(@Param("tissue_name") String tissue_name, @Param("tissue_specificity") String specificity);

	@Query("SELECT u FROM Tissue_specific_genes u where u.tissue_name in ?1 and u.tissue_specificity in ?2 order by u.tissue_name")
	public List<Tissue_specific_genes> getByTissueNameAndSpecificity(List<String> tissues, List<String> specificities);


}
