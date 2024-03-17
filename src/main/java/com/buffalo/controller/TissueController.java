package com.buffalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.buffalo.entity.TissueList;
import com.buffalo.service.TissueListService;
import com.buffalo.service.TissueService;

@Controller
public class TissueController {

	@Autowired
	private TissueListService service;
	
	
	@GetMapping("/database/tissue")
	public String databasePage(Model model) {
		List<TissueList> listTissues = service.listAllTissues();
		model.addAttribute("listTissues", listTissues);	
		return "database-tissues";
	}
	

	
}
