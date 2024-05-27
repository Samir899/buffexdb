package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Mean_tissue_fpkm;
import com.buffalo.repo.Mean_tissue_fpkmRepository;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class Mean_tissue_fpkmService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private Mean_tissue_fpkmRepository mean_tissue_fpkmRepo;
	
//	@Autowired
//	private GeneRepoPagingAndSorting geneRepoPaging;
	
//	public List<Mean_tissue_fpkm> save(Genes gene) {
//		boolean isExistingGene = isExistingGene(gene.getGeneId());
//		
//		if(isExistingGene) {
//			return null;
//		}
//		return geneRepo.save(gene);
//	}
	
	public List<Mean_tissue_fpkm> getMeanByGeneId(String geneId){
		return (List<Mean_tissue_fpkm>) mean_tissue_fpkmRepo.getMeanByGeneId(geneId);
	}
//	public List<Pathways> getByCodingLabel(String codingLabel){
//		return (List<Pathways>) pathwaysRepo.getPathwayByCodingLabel(codingLabel);
//	}
//	public List<Pathways> getByGeneSymbol(String geneSymbol){
//		return (List<Pathways>) pathwaysRepo.getPathwayByGeneSymbol(geneSymbol);
//	}
//	public List<String> getAllGeneSymbols(){
//		return (List<String>) pathwaysRepo.getAllGeneSymbols();
//	}
	

}
