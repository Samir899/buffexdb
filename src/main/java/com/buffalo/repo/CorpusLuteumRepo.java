package com.buffalo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.CorpusLuteum;
import com.buffalo.entity.Cotyledon;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Tissues;

public interface CorpusLuteumRepo extends CrudRepository<CorpusLuteum, Integer>{

//	@Query("SELECT u FROM Cotyledon u WHERE u.geneId = :geneId")
//	public Cotyledon getCotyledonByGeneId(@Param("geneId") String geneId);
	
	@Query("SELECT u FROM CorpusLuteum u WHERE u.ERR315632 = :ERR")
	public List<CorpusLuteum> getCorpusLuteumByERR(@Param("ERR") String ERR);

	@Query("SELECT sum(ERR315632) FROM CorpusLuteum")
	public Double getCorpusLuteumSum();
}
