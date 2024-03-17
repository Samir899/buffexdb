package com.buffalo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.entity.Genes;
import com.buffalo.entity.TissueList;
import com.buffalo.service.TissueListService;

@RestController
@RequestMapping("/tissue_list/api") 
public class TissueListAPI {

	@Autowired
    private TissueListService service;
  
    public TissueListAPI(TissueListService productService) 
    { 
        this.service = productService; 
    }
    
    @GetMapping("/tissue_list")  
    public List<TissueList> getAllTissue() 
    { 
    	return service.listAllTissues();
    }
}
