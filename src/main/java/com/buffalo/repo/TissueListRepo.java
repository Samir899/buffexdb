package com.buffalo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.TissueList;
import com.buffalo.entity.Tissues;

public interface TissueListRepo extends CrudRepository<TissueList, Integer>{

	@Query("SELECT u FROM TissueList u ORDER BY u.tissue")
	public List<TissueList> getTissueList();

}
