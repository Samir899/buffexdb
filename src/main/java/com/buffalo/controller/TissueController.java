package com.buffalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.buffalo.entity.Tissues;
import com.buffalo.service.TissueService;

@Controller
public class TissueController {

	@Autowired
	private TissueService service;
	
	
	@GetMapping("/database/tissue")
	public String databasePage(Model model) {
		List<Tissues> listTissues = service.listAllTissue();
		model.addAttribute("listTissues", listTissues);	
		return "database-tissues";
	}
	

	
}
