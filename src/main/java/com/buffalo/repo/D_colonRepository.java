package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.D_colon;
import com.buffalo.entity.Duodenum;
import com.buffalo.entity.Genes;

public interface D_colonRepository extends CrudRepository<D_colon, Integer>{

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
	
	@Query("SELECT sum(ERR2353624) as ERR2353624, sum(ERR2353625) as ERR2353625, sum(ERR2353626) as ERR2353626, "
			+ "sum(ERR2353627) as ERR2353627, sum(ERR2353629) as ERR2353629, sum(ERR2353630) as ERR2353630, "
			+ "sum(ERR2354456) as ERR2354456, sum(ERR2354457) as ERR2354457, sum(ERR2354458) as ERR2354458, "
			+ "sum(ERR2354459) as ERR2354459, sum(ERR2354460) as ERR2354460, sum(ERR2354461) as ERR2354461, "
			+ "sum(ERR2354462) as ERR2354462, sum(ERR2354463) as ERR2354463, sum(ERR2354464) as ERR2354464, "
			+ "sum(ERR2352789) as ERR2352789, sum(ERR2352790) as ERR2352790, sum(ERR2352791) as ERR2352791, "
			+ "sum(ERR2352792) as ERR2352792, sum(ERR2352793) as ERR2352793, sum(ERR2352794) as ERR2352794, "
			+ "sum(ERR2352795) as ERR2352795, sum(ERR2353141) as ERR2353141, sum(ERR2353142) as ERR2353142, "
			+ "sum(ERR2353143) as ERR2353143, sum(ERR2353144) as ERR2353144, sum(ERR2353145) as ERR2353145, "
			+ "sum(ERR2353146) as ERR2353146, sum(ERR2353147) as ERR2353147, sum(ERR2353148) as ERR2353148, "
			+ "sum(ERR2353149) as ERR2353149 FROM D_colon")
	public Map <String, Double> getSum();
}
