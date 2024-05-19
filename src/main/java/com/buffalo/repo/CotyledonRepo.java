package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Cotyledon;


public interface CotyledonRepo extends CrudRepository<Cotyledon, Integer>{
	@Query("SELECT u FROM Cotyledon u WHERE u.SRR4119663>=:lowerLimit and u.SRR4119663<=:upperLimit "
			+ "ORDER BY SRR4119663 LIMIT 100")
	public List<Cotyledon> getCotyledonSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

//	@Query("SELECT u FROM Cotyledon u WHERE u.geneId = :geneId")
//	public Cotyledon getCotyledonByGeneId(@Param("geneId") String geneId);
	
//	@Query("SELECT u FROM Cotyledon u WHERE u.SRR4119663 = :SRR")
//	public List<Cotyledon> getCotyledonBySRR(@Param("SRR") String SRR);
//	
//	@Query("SELECT sum(SRR4119663) FROM Cotyledon")
//	public Double getSum();

	@Query("SELECT sum(SRR4119663) as SRR4119663 FROM Cotyledon")
	public Map <String, Double> getSum();
}
