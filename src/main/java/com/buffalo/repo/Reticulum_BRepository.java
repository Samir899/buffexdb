package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Reticulum_B;

public interface Reticulum_BRepository extends CrudRepository<Reticulum_B, Integer>{

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
	
	@Query("SELECT sum(ERR2354682) as ERR2354682, sum(ERR2354683) as ERR2354683, sum(ERR2354684) as ERR2354684, "
			+ "sum(ERR2354685) as ERR2354685, sum(ERR2354686) as ERR2354686, sum(ERR2354687) as ERR2354687, "
			+ "sum(ERR2354688) as ERR2354688, sum(ERR2354889) as ERR2354889, sum(ERR2354890) as ERR2354890, "
			+ "sum(ERR2354891) as ERR2354891, sum(ERR2354892) as ERR2354892, sum(ERR2354893) as ERR2354893, "
			+ "sum(ERR2354894) as ERR2354894, sum(ERR2354895) as ERR2354895, sum(ERR2354896) as ERR2354896, "
			+ "sum(ERR2354897) as ERR2354897, sum(ERR2354898) as ERR2354898, sum(ERR2354899) as ERR2354899, "
			+ "sum(ERR2354900) as ERR2354900, sum(ERR2354901) as ERR2354901, sum(ERR2354902) as ERR2354902, "
			+ "sum(ERR2354903) as ERR2354903, sum(ERR2354904) as ERR2354904, sum(ERR2354905) as ERR2354905, "
			+ "sum(ERR2354906) as ERR2354906, sum(ERR2354907) as ERR2354907, sum(ERR2354908) as ERR2354908, "
			+ "sum(ERR2354909) as ERR2354909, sum(ERR2354910) as ERR2354910, sum(ERR2354911) as ERR2354911, "
			+ "sum(ERR2355026) as ERR2355026, sum(ERR2355027) as ERR2355027, sum(ERR2355028) as ERR2355028, "
			+ "sum(ERR2355029) as ERR2355029, sum(ERR2355030) as ERR2355030, sum(ERR2355031) as ERR2355031, "
			+ "sum(ERR2355032) as ERR2355032, sum(ERR2355033) as ERR2355033, sum(ERR2355034) as ERR2355034, "
			+ "sum(ERR2355035) as ERR2355035, sum(ERR2355036) as ERR2355036, sum(ERR2355037) as ERR2355037, "
			+ "sum(ERR2355038) as ERR2355038, sum(ERR2355039) as ERR2355039, sum(ERR2355040) as ERR2355040, "
			+ "sum(ERR2355041) as ERR2355041, sum(ERR2355042) as ERR2355042, sum(ERR2355043) as ERR2355043, "
			+ "sum(ERR2355044) as ERR2355044, sum(ERR2355045) as ERR2355045, sum(ERR2355046) as ERR2355046, "
			+ "sum(ERR2355047) as ERR2355047, sum(ERR2355048) as ERR2355048 FROM Reticulum_B")
	public Map <String, Double> getSum();
}
