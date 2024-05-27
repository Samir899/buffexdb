package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Granulosa_cell;
import com.buffalo.entity.Mean_tissue_fpkm;
import com.buffalo.entity.Pathways;

public interface Mean_tissue_fpkmRepository extends CrudRepository<Mean_tissue_fpkm, Integer>{

	@Query("SELECT u FROM Mean_tissue_fpkm u WHERE u.geneId = :gene_id")
	public List<Mean_tissue_fpkm> getMeanByGeneId(@Param("gene_id") String gene_id);
//	
//	@Query("SELECT u FROM Pathways u WHERE u.gene_symbol = :gene_symbol")
//	public List<Pathways> getPathwayByGeneSymbol(@Param("gene_symbol") String gene_symbol);
//	
//	@Query("SELECT gene_symbol FROM Pathways")
//	public List<String> getAllGeneSymbols();
	
	
}
