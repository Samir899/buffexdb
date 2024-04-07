package com.buffalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.buffalo.entity.Tissue_specific_genes;
import com.buffalo.service.SampleDescriptionService;
import com.buffalo.service.TissueListService;
import com.buffalo.service.TissueSpecificGeneService;
import com.buffalo.tables.ListingTables;

@Controller
public class TissueSpecificGeneController {

	@Autowired
	private TissueSpecificGeneService service;
	
	@GetMapping("/database/tissue_specific_genes")
	public String tissueSpecificGenePage(Model model) {
		List<Tissue_specific_genes> list = service.listAll();
		model.addAttribute("list", list);
		List<String> tissue_names = service.getDistinctTissueName();
		model.addAttribute("tissue_list", tissue_names);
		List<String> tissue_specificity = service.getDistinctSpecificity();
		model.addAttribute("tissue_sp", tissue_specificity);
		return "database-tissue-specific-gene";
	}
	
	
}
