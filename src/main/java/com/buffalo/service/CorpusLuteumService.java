package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffalo.entity.CorpusLuteum;
import com.buffalo.repo.CorpusLuteumRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CorpusLuteumService {
	
	public final int SAMPLE_PER_PAGE = 10;
	
	@Autowired
	private CorpusLuteumRepo repo;
	
	
	public List<CorpusLuteum> listAllCorpusLuteum(){
		return (List<CorpusLuteum>) repo.findAll();
	}
	
//	public List<CorpusLuteum> getCorpusLuteumByERR(String err) {	
//		 return repo.getCorpusLuteumByERR(err);	
//		}	


	public  Map <String, Double> getSum() {	
		 return repo.getSum();
		}
}
