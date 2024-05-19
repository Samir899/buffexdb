package com.buffalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.buffalo.service.PathwaysService;

@Controller
public class PathwaysController {

	@Autowired
	private PathwaysService service;
	
	@GetMapping("/database/pathways")
	public String homePage() {
		
		return "database-pathways";
	}
}
