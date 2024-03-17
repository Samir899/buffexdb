package com.buffalo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Genes;
import com.buffalo.entity.TissueList;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;
import com.buffalo.repo.TissueListRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TissueListService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private TissueListRepo repo;
	
	public List<TissueList> listAllTissues(){
		return (List<TissueList>) repo.findAll();
	}
	
}
