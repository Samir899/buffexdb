package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Granulosa_cell;
import com.buffalo.entity.Pathways;

public interface PathwaysRepository extends CrudRepository<Pathways, Integer>{

	@Query("SELECT u FROM Pathways u WHERE u.coding_label = :coding_label")
	public List<Pathways> getPathwayByCodingLabel(@Param("coding_label") String coding_label);
	
	@Query("SELECT u FROM Pathways u WHERE u.gene_symbol = :gene_symbol")
	public List<Pathways> getPathwayByGeneSymbol(@Param("gene_symbol") String gene_symbol);
	
	@Query("SELECT gene_symbol FROM Pathways")
	public List<String> getAllGeneSymbols();
	
	
	
}
