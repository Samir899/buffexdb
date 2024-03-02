package com.buffalo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.buffalo.entity.SampleDescription;
import com.buffalo.entity.Genes;
import com.buffalo.service.GeneService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;
import java.io.File;
import org.springframework.core.io.ByteArrayResource;
@Controller
public class GenesController {

	@Autowired
	private GeneService geneService;
	
	
	@GetMapping("/database/genes")
	public String databasePage(Model model) {
		List<String> listDB = null;
		try {
			listDB = ListingTables.getAllTables();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listDB);
		model.addAttribute("listDB", listDB);
		
		
		
		return "database-genes";
	}
	
	@GetMapping("/database/GENES/downloads")
	public ResponseEntity<ByteArrayResource> download(Model model) {
		List<String> listDB = null;
		try {
			listDB = ListingTables.getAllTables();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listDB);
		model.addAttribute("listDB", listDB);
		
		
		List<Genes>genesList = geneService.listAllGenes();
		String database = "GENES";
		String filename = System.getProperty("user.dir") + "\\" +"csv\\genes.csv";
		
		try {
			this.writeToCSV(genesList, Genes.getHeaders(), filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(filename);
	      Path path = Paths.get(file.getAbsolutePath());
	      ByteArrayResource resource = null;
		try {
			resource = new ByteArrayResource
			        (Files.readAllBytes(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResponseEntity<ByteArrayResource> obj = ResponseEntity.ok().headers(Utilities.headers(database+".csv"))
	            .contentLength(file.length())
	            .contentType(MediaType.parseMediaType
	                  ("application/octet-stream")).body(resource);
		
		file.delete();
	    return obj;
	}
	
	public void writeToCSV(List<Genes> genesList, String header, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(filename);
        writer.println(header);

        for (Genes gene : genesList) {
            writer.println(gene.toString());
        }
        writer.close();
    }
	
//	@RequestMapping("/database/GENES/{pageNum}/{checkAll}")
//	public String listByPage(@PathVariable(name = "pageNum")int pageNum,@PathVariable(name = "checkAll")boolean checkAll, RedirectAttributes redirectAttributes, Model model) {
//		System.out.println("pageNum:"+pageNum);
//		System.out.println("checkAll: "+ checkAll);
//		List<String> listDB = null;
//		try {
//			listDB = ListingTables.getAllTables();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String currentDatabase = "GENES";
//		model.addAttribute("listDB", listDB);
//		Page<Genes> page = geneService.listByPage(pageNum);
//		long startCount = (pageNum - 1) * geneService.GENE_PER_PAGE + 1;
//		long endCount = startCount + geneService.GENE_PER_PAGE - 1;
//		if(endCount > page.getTotalElements()) endCount = page.getTotalElements();
//		List<Genes> listGenes = page.getContent();
//		model.addAttribute("currentPage", pageNum);
//		model.addAttribute("nextPage", pageNum+1);
//		model.addAttribute("previousPage", pageNum-1);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalItems", page.getTotalElements());
//		model.addAttribute("startCount", startCount);
//		model.addAttribute("endCount", endCount);
//		model.addAttribute("listData", listGenes);
//		model.addAttribute("database", currentDatabase);
//		model.addAttribute("checkAll", checkAll);
//		return "database";
//
//	}
//	@RequestMapping("/database/GENES/query/{pageNum}/{checkAll}")
//	public RedirectView listQueryPage(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam, @RequestParam("database") String database, @PathVariable(name = "pageNum")int pageNum,@PathVariable(name = "checkAll")boolean checkAll, RedirectAttributes redirectAttributes, Model model) {
//		System.out.println("Text to be searched: " + searchText);
//		String url="";
//		if(searchText.equals("+"))
//				url = "/buffex/database/GENES/fetch/" + pageNum + "/" + checkAll + "?searchText=" + "%2B" + "&searchParam=" +searchParam;
//		else
//			url = "/buffex/database/GENES/fetch/" + pageNum + "/" + checkAll + "?searchText=" + searchText + "&searchParam=" +searchParam;
//		return new RedirectView(url);
//		
//
//	}
	
//	@RequestMapping("/database/{database}/fetch/{pageNum}/{checkAll}")
//	public String showDatabasedOnQuery(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam, @PathVariable(name = "database")String database, @PathVariable(name = "pageNum")int pageNum,@PathVariable(name = "checkAll")boolean checkAll, RedirectAttributes redirectAttributes, Model model) {
//		System.out.println("SearchText: " + searchText);
//		List<String> listDB = null;
//		try {
//			listDB = ListingTables.getAllTables();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String currentDatabase = "GENES";
//		model.addAttribute("listDB", listDB);
//		Page<Genes> page = geneService.listByQuery(pageNum, searchText, searchParam);
//		long startCount = (pageNum - 1) * geneService.GENE_PER_PAGE + 1;
//		long endCount = startCount + geneService.GENE_PER_PAGE - 1;
//		
//		List<Genes> listGenes = new ArrayList<Genes>();
//		if(page!=null) {
//			System.out.println("Page is not null");
//			if(endCount > page.getTotalElements()) 
//				endCount = page.getTotalElements();
//			listGenes = page.getContent();
//			model.addAttribute("totalPages", page.getTotalPages());
//			model.addAttribute("totalItems", page.getTotalElements());
//		}
//		else {
//			model.addAttribute("totalPages", 0);
//			model.addAttribute("totalItems", 0);
//		}
//		model.addAttribute("currentPage", pageNum);
//		model.addAttribute("nextPage", pageNum+1);
//		model.addAttribute("previousPage", pageNum-1);
//		model.addAttribute("startCount", startCount);
//		model.addAttribute("endCount", endCount);
//		model.addAttribute("listData", listGenes);
//		model.addAttribute("database", currentDatabase);
//		model.addAttribute("checkAll", checkAll);
//		model.addAttribute("searchText", searchText);
//		model.addAttribute("searchParam", searchParam);
//		System.out.println("searchParam" + searchParam);
//		System.out.println("searchText " + searchText);
//		return "database-query";
//	}
	

	
}
