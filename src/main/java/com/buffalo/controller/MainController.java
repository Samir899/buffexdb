package com.buffalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.buffalo.entity.SampleDescription;
import com.buffalo.entity.TissueList;
import com.buffalo.entity.Genes;
import com.buffalo.service.SampleDescriptionService;
import com.buffalo.service.TissueListService;
import com.buffalo.service.GeneService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.FileUploadUtil;
import com.buffalo.utilities.Utilities;

import org.springframework.util.StringUtils;
@Controller
public class MainController {

	@Autowired
	private GeneService geneService;
	
	@Autowired
	private SampleDescriptionService buffaloSampleDesService;
	
	@Autowired
	private TissueListService service;
	
	@GetMapping("")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		
		return "about";
	}
	@GetMapping("/database")
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
		
		
		
		return "database-home";
	}
	
	@RequestMapping("/database/view")
	public RedirectView databaseView(RedirectAttributes redirectAttributes, @RequestParam("database") String database, Model model) {
		return new RedirectView(database+"/1"+"/false");
	}
	
	@GetMapping("/downloads")
	public String downloadsPage(Model model) {
		
		List<TissueList> listTissues = service.listAllTissues();
		model.addAttribute("listTissues", listTissues);	
		return "database-download";
	}
	
	
	@PostMapping("/database/downloads")
	public RedirectView databaseDownloads(RedirectAttributes redirectAttributes, @RequestParam("database") String database, Model model) {
		
		return new RedirectView("/buffex/database/"+database+"/downloads");
	}
	
	@GetMapping("import")
	public String importPage(Model model) {
		List<String> listDB = null;
		try {
			listDB = ListingTables.getAllTables();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listDB);
		model.addAttribute("listDB", listDB);
		return "import";
	}
	@PostMapping("import/data")
	public String importData(RedirectAttributes redirectAttributes,  @RequestParam("csvfile") MultipartFile multipartFile, @RequestParam("database") String database) throws Exception{
		
		if(!multipartFile.isEmpty()) {
			
			//Save file
			String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
			String uploadDir = "csv/";
			FileUploadUtil.cleanDir(uploadDir);
			FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
			
			//covert to list
			List<Genes> genes = Utilities.csvToArrayList(uploadDir,fileName, database);
			System.out.println(genes);
			
			//save to db
			switch(database) {
			case "GENES": geneService.saveAll(genes);
			break;
			default: System.out.println("Database not found");
			}
			
		}
		else{
			System.out.println("FileNotFound");
		}
		redirectAttributes.addFlashAttribute("message", "The user has been saved successfully.");
		return "index";
	}
}
