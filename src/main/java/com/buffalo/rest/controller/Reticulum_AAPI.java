package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.GeneList;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Reticulum_A;
import com.buffalo.service.BrainService;
import com.buffalo.service.GeneService;
import com.buffalo.service.Liver_BService;
import com.buffalo.service.Reticulum_AService;
import com.buffalo.service.Reticulum_BService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;

@RestController
@RequestMapping("/reticulum_A/api") 
public class Reticulum_AAPI { 
  
	@Autowired
    private Reticulum_AService reticulum_AService;
	
	@Autowired
    private Reticulum_BService reticulum_BService;
  
    public Reticulum_AAPI(Reticulum_AService reticulum_AService, Reticulum_BService reticulum_BService) 
    { 
        this.reticulum_AService = reticulum_AService; 
        this.reticulum_BService = reticulum_BService;
    }
    
    @GetMapping("/reticulum_As")  
    public List<Reticulum_A> getAllReticulum_A() 
    { 
    	return reticulum_AService.listAllReticulum_A();
    }
    
    @GetMapping("/reticulum_As/sum")  
    public Map<String, Double> getSum() 
    {
    	Map<String, Double> map_reticulum_a = reticulum_AService.getFPKMSum();
    	Map<String, Double> map_reticulum_b = reticulum_BService.getFPKMSum();
    	Map<String, Double> map = new HashMap<>();
    	map.putAll(map_reticulum_a);
    	map.putAll(map_reticulum_b);
    	return map;
    }
    
    @GetMapping("/reticulum_As/sorted")  
    public List<Reticulum_A> getReticulum_ASorted(@RequestParam("lowerLimit") double lowerLimit, @RequestParam("upperLimit") double upperLimit) 
    { 
    	return reticulum_AService.getReticulum_ASorted(lowerLimit, upperLimit);
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