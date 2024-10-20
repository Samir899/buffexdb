package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Granulosa_cell;
import com.buffalo.entity.Pathways;
import com.buffalo.repo.BrainRepository;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;
import com.buffalo.repo.Granulosa_cellRepository;
import com.buffalo.repo.PathwaysRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PathwaysService {
	
	public final int GENE_PER_PAGE = 50;
	
	@Autowired
	private PathwaysRepository pathwaysRepo;
	
//	@Autowired
//	private GeneRepoPagingAndSorting geneRepoPaging;
	
//	public Genes save(Genes gene) {
//		boolean isExistingGene = isExistingGene(gene.getGeneId());
//		
//		if(isExistingGene) {
//			return null;
//		}
//		return geneRepo.save(gene);
//	}
	
	public List<Pathways> listAllPathways(){
		return (List<Pathways>) pathwaysRepo.findAll();
	}
	public List<Pathways> getByCodingLabel(String codingLabel){
		return (List<Pathways>) pathwaysRepo.getPathwayByCodingLabel(codingLabel);
	}
	public List<Pathways> getByGeneSymbol(String geneSymbol){
		return (List<Pathways>) pathwaysRepo.getPathwayByGeneSymbol(geneSymbol);
	}
	public List<String> getAllGeneSymbols(){
		return (List<String>) pathwaysRepo.getAllGeneSymbols();
	}
	

}
