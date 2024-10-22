package com.buffalo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.dto.TissueRequest;
import com.buffalo.entity.Tissue_specific_genes;
import com.buffalo.repo.TissueSpecificGeneRepo;

@RestController
public class TissueSpecificGeneRestController {

	@Autowired
	private TissueSpecificGeneRepo repo;
	
	@PostMapping("/api/tissue_specific_gene")
	public List<Tissue_specific_genes> getTissueSpecificGenes(@RequestBody TissueRequest request) {
		
		List<String> tissues = request.getTissues().size()!=0?request.getTissues():repo.getDistinctTissueName();
	    List<String> specificities = request.getSpecificities().size()!=0?request.getSpecificities():repo.getDistinctSpecificity();
		List<Tissue_specific_genes> list = repo.getByTissueNameAndSpecificity(tissues, specificities);
		return list;
	}
}
