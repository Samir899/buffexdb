package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Mammary_gland;
import com.buffalo.repo.Mammary_glandRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Mammary_glandService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private Mammary_glandRepository mammary_glandRepo;
	
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
	
	public List<Mammary_gland> listAllMammary_gland(){
		return (List<Mammary_gland>) mammary_glandRepo.findAll();
	}
	
	public Map<String, Double> getFPKMSum() {
		return mammary_glandRepo.getSum();
	}
	
	public List<Mammary_gland> getMammary_glandSorted(double lowerLimit, double upperLimit){
		return (List<Mammary_gland>) mammary_glandRepo.getMammary_glandSorted(lowerLimit, upperLimit);

	}
//	public Genes getGeneById(String geneId){
//		return geneRepo.getGeneByGeneId(geneId);
//	}
//	public Page<Genes> listByPage(int pageNum){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.findAll(pageable);
//	}
//	
//	public Page<Genes> listByQuery(int pageNum,String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return geneRepoPaging.getGeneByGeneName(searchText, pageable);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepoPaging.getGeneByChromosome(searchText, pageable);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepoPaging.getGeneByStrand(searchText, pageable);
//			
//		}
//			
//		return null;
//	}
//	
//	public List<Genes> listByQueryAPI(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return geneRepo.getGeneByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepo.getGeneByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepo.getGeneByStrand(searchText);
//		}
//		return null;
//	}
//	public List<String> listGeneIdsByQuery(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return geneRepo.getGeneIdByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepo.getGeneIdByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepo.getGeneIdByStrand(searchText);
//		}
//		return null;
//	}
//	
//	public List<String> getAllGeneId(){
//		
//		return geneRepo.getAllGeneId();
//	}
//	
//	public List<Genes> getGenesWithGeneIds(List<String> geneIds){
//		
//		return geneRepo.getGenesByGeneList(geneIds);
//	}
//	
//	public Page<Genes> listByChromosome(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	public Page<Genes> listByPageWithQuery(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	
//	public Iterable<Genes> saveAll(List<Genes> gene) {
//		
//		gene.forEach((element)->{
//			if(isExistingGene(element.getGeneId())) {
//				gene.remove(element);
//			}
//		});
//		return geneRepo.saveAll(gene);
//	}
//	
//public boolean isExistingGene(String geneId) {
//		
//		Genes geneByGeneId = geneRepo.getGeneByGeneId(geneId);
//		
//		if(geneByGeneId != null) return true;
//		return false;
//	}
}
