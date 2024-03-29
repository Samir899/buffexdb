package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Caecum;
import com.buffalo.entity.Genes;

public interface CaecumRepository extends CrudRepository<Caecum, Integer>{

//	@Query("SELECT u FROM Genes u WHERE u.geneId = :geneId")
//	public Genes getGeneByGeneId(@Param("geneId") String geneId);
//	
//	@Query("SELECT u FROM Genes u WHERE u.geneName = :geneName")
//	public List<Genes> getGeneByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.geneName = :geneName")
//	public List<String> getGeneIdByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT u FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<Genes> getGeneByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<String> getGeneIdByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT u FROM Genes u WHERE u.strand = :strand")
//	public List<Genes> getGeneByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.strand = :strand")
//	public List<String> getGeneIdByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes")
//	public List<String> getAllGeneId();
//	
//	@Query(value = "Select u from Genes u where u.geneId In :geneIds")
//	public List<Genes> getGenesByGeneList(List<String> geneIds);

	@Query("SELECT sum(ERR2353610) as ERR2353610, sum(ERR2353611) as ERR2353611, sum(ERR2353612) as ERR2353612, "
			+ "sum(ERR2353613) as ERR2353613, sum(ERR2353614) as ERR2353614, sum(ERR2353615) as ERR2353615, "
			+ "sum(ERR2353616) as ERR2353616, sum(ERR2353992) as ERR2353992, sum(ERR2353993) as ERR2353993, "
			+ "sum(ERR2353994) as ERR2353994, sum(ERR2353995) as ERR2353995, sum(ERR2353996) as ERR2353996, "
			+ "sum(ERR2353997) as ERR2353997, sum(ERR2353998) as ERR2353998, sum(ERR2353999) as ERR2353999, "
			+ "sum(ERR2354000) as ERR2354000, sum(ERR2352775) as ERR2352775, sum(ERR2352776) as ERR2352776, "
			+ "sum(ERR2352777) as ERR2352777, sum(ERR2352778) as ERR2352778, sum(ERR2352779) as ERR2352779, "
			+ "sum(ERR2352780) as ERR2352780, sum(ERR2352781) as ERR2352781, sum(ERR2353123) as ERR2353123, "
			+ "sum(ERR2353124) as ERR2353124, sum(ERR2353125) as ERR2353125, sum(ERR2353126) as ERR2353126, "
			+ "sum(ERR2353127) as ERR2353127, sum(ERR2353128) as ERR2353128, sum(ERR2353129) as ERR2353129, "
			+ "sum(ERR2353130) as ERR2353130, sum(ERR2353131) as ERR2353131 FROM Caecum")
	public Map <String, Double> getSum();
}

