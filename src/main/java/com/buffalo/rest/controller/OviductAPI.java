package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.buffalo.entity.Oviduct;
import com.buffalo.service.OviductService;

@RestController
@RequestMapping("/oviduct/api") 
public class OviductAPI { 
  
	@Autowired
    private OviductService oviductService;
  
    public OviductAPI(OviductService productService) 
    { 
        this.oviductService = productService; 
    }
    
    @GetMapping("/oviducts")  
    public List<Oviduct> getAllOviduct() 
    { 
    	return oviductService.listAllOviduct();
    }
    
    @GetMapping("/oviducts/sum")  
    public Map<String, Double> getSum() 
    {
    	return oviductService.getFPKMSum();
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