package com.buffalo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.SampleDescription;
import com.buffalo.entity.Cotyledon;
import com.buffalo.entity.Genes;
import com.buffalo.repo.BuffaloSampleDesRepoPagingAndSorting;
import com.buffalo.repo.CotyledonRepo;
import com.buffalo.repo.SampleDescriptionRepository;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CotyledonService {
	
	public final int SAMPLE_PER_PAGE = 10;
	
	@Autowired
	private CotyledonRepo repo;
	
	
	public List<Cotyledon> listAllCotyledon(){
		return (List<Cotyledon>) repo.findAll();
	}
	

//	public Cotyledon getCotyledonByGeneId(String geneId) {	
//	 return repo.getCotyledonByGeneId(geneId);	
//	}
	public List<Cotyledon> getCotyledonBySRR(String srr) {	
		 return repo.getCotyledonBySRR(srr);	
		}	

}
