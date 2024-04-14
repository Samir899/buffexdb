package com.buffalo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Cotyledon;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Tissues;

public interface CotyledonRepo extends CrudRepository<Cotyledon, Integer>{

//	@Query("SELECT u FROM Cotyledon u WHERE u.geneId = :geneId")
//	public Cotyledon getCotyledonByGeneId(@Param("geneId") String geneId);
	
	@Query("SELECT u FROM Cotyledon u WHERE u.SRR4119663 = :SRR")
	public List<Cotyledon> getCotyledonBySRR(@Param("SRR") String SRR);
	
	@Query("SELECT sum(SRR4119663) FROM Cotyledon")
	public Double getSum();

}
