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
import com.buffalo.entity.Pituitary;

public interface PituitaryRepository extends CrudRepository<Pituitary, Integer>{

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
	
	@Query("SELECT sum (ERR2352922) as ERR2352922,	sum (ERR2352923) as ERR2352923, sum (ERR2352924) as ERR2352924, sum (ERR2352925) as ERR2352925, sum (ERR2352926) as ERR2352926, sum (ERR2352927) as ERR2352927,"
			+ "sum (ERR2352928) as ERR2352928, sum (ERR2353764) as ERR2353764, sum (ERR2353765) as ERR2353765, sum (ERR2353766) as ERR2353766, sum (ERR2353767) as ERR2353767, sum (ERR2353768) as ERR2353768,"
			+ "sum (ERR2353769) as ERR2353769, sum (ERR2353770) as ERR2353770, sum (SRR24057909) as SRR24057909, sum (SRR24057910) as SRR24057910, sum (SRR24057911) as SRR24057911, sum (SRR24057912) as SRR24057912 FROM Pituitary")
	public Map <String, Double> getSum();
}
