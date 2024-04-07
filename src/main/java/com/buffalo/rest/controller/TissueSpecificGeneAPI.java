package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.buffalo.entity.GeneList;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Tissue_specific_genes;
import com.buffalo.service.GeneService;
import com.buffalo.service.TissueSpecificGeneService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;

@RestController
@RequestMapping("/tissue-specific-gene/api") 
public class TissueSpecificGeneAPI { 
  
	@Autowired
    private TissueSpecificGeneService service;
  
    public TissueSpecificGeneAPI(TissueSpecificGeneService productService) 
    { 
        this.service = productService; 
    }
    
    @GetMapping("/tissue-specific-genes")  
    public List<Tissue_specific_genes> getAll() 
    { 
    	return service.listAll();
    }
    @GetMapping("/tissue-specific-genes/stats/{sp}")  
    public Long getStats(@PathVariable(name = "sp")String sp) 
    { 
    	return service.getStats(sp);
    }
    @GetMapping("/tissue-specific-genes/{geneId}")  
    public List<Tissue_specific_genes> getGeneByGeneId(@PathVariable(name = "geneId")String geneId) 
    { 
    	return service.getByGeneId(geneId);
    }
    @GetMapping("/tissue-specific-genes/distinct-specificity")  
    public List<String> getDistictSpecificity() 
    { 
    	return service.getDistinctSpecificity();
    }
    @GetMapping("/tissue-specific-genes/distinct-tissue-name")  
    public List<String> getDistictTissueName() 
    { 
    	return service.getDistinctTissueName();
    }
    
    @GetMapping("/tissue-specific-genes/filter/tissueName")  
    public List<Tissue_specific_genes> getByTissueName(@RequestParam String tissueName) 

    { 
    	System.out.println(tissueName + " " );
    	return service.getByTissueName(tissueName);
    }
    
    @GetMapping("/tissue-specific-genes/filter/tissueSpecificity")  
    public List<Tissue_specific_genes> getBySpecificity( @RequestParam String tissueSpecificity) 

    { 
    	System.out.println(tissueSpecificity);
    	return service.getByTissueSpecificity(tissueSpecificity);
    }
    @GetMapping("/tissue-specific-genes/filter")  
    public List<Tissue_specific_genes> getByTissueNameAndSpecificity(@RequestParam String tissueName, @RequestParam String tissueSpecificity) 

    { 
    	return service.getByTissueNameAndSpecificity(tissueName, tissueSpecificity);
    }
//    @GetMapping("/genes/{geneId}")  
//    public Genes getGeneByGeneId(@PathVariable(name = "geneId")String geneId) 
//    { 
//    	return geneService.getGeneById(geneId);
//    }
//    
//    @GetMapping("/genes/query")  
//    public List<Genes> getAllProducts(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
//    { 
//    	System.out.println("SearchText: " + searchText);
//    	System.out.println("searchParam: " + searchParam);
//    	
//        return geneService.listByQueryAPI(searchText, searchParam);
//    }
//    
//    @GetMapping("/genes/query/geneIds")  
//    public List<String> getAllGeneIds(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
//    { 
//    	System.out.println("SearchText: " + searchText);
//    	System.out.println("searchParam: " + searchParam);
//    	
//        return geneService.listGeneIdsByQuery(searchText, searchParam);
//    }
//    
//    @GetMapping("/genes/geneId/all")  
//    public List<String> getAllGeneId() 
//    { 
//    	
//        return geneService.getAllGeneId();
//    }
//    
//	public void writeToCSV(List<Genes> genesList, String header, String filename) throws IOException {
//        PrintWriter writer = new PrintWriter(filename);
//        writer.println(header);
//
//        for (Genes gene : genesList) {
//            writer.println(gene.toString());
//        }
//        writer.close();
//    }
//	
//    @PostMapping("/genes/download/geneIds")
//    public ResponseEntity<ByteArrayResource> getAllGeneIds(GeneList data) {
//    	System.out.println(data.getGeneIds().size());
//    	List<Genes> genesList = geneService.getGenesWithGeneIds(data.getGeneIds());
//    	System.out.println(genesList.size());
//    	String filename = System.getProperty("user.dir") + "\\" +"csv\\genes.csv";
//		
//		try {
//			this.writeToCSV(genesList, Genes.getHeaders(), filename);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		File file = new File(filename);
//	      Path path = Paths.get(file.getAbsolutePath());
//	      ByteArrayResource resource = null;
//		try {
//			resource = new ByteArrayResource
//			        (Files.readAllBytes(path));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ResponseEntity<ByteArrayResource> obj = ResponseEntity.ok().headers(Utilities.headers("genes"+".csv"))
//	            .contentLength(file.length())
//	            .contentType(MediaType.parseMediaType
//	                  ("application/octet-stream")).body(resource);
//		//file.delete();
//	    return obj;
//    }
}