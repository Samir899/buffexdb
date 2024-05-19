package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Granulosa_cell;

public interface Granulosa_cellRepository extends CrudRepository<Granulosa_cell, Integer>{
	
	@Query("SELECT u FROM Granulosa_cell u WHERE u.SRR10863210>=:lowerLimit and u.SRR10863211>=:lowerLimit and u.SRR10863212>=:lowerLimit and u.SRR10863213>=:lowerLimit and u.SRR10863214>=:lowerLimit and u.SRR10863215>=:lowerLimit and u.SRR10863216>=:lowerLimit and u.SRR10863217>=:lowerLimit and u.SRR10863218>=:lowerLimit and u.SRR10863219>=:lowerLimit and "
			+ "u.SRR10863210<=:upperLimit and u.SRR10863211<=:upperLimit and u.SRR10863212<=:upperLimit and u.SRR10863213<=:upperLimit and u.SRR10863214<=:upperLimit and u.SRR10863215<=:upperLimit and u.SRR10863216<=:upperLimit and u.SRR10863217<=:upperLimit and u.SRR10863218<=:upperLimit and u.SRR10863219<=:upperLimit "
			+ "ORDER BY SRR10863210, SRR10863211, SRR10863212, SRR10863213, SRR10863214, SRR10863215, SRR10863216, SRR10863217, SRR10863218, SRR10863219 LIMIT 100")
	public List<Granulosa_cell> getGranulosa_cellSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR10863210) as SRR10863210, sum(SRR10863211) as SRR10863211, sum(SRR10863212) as SRR10863212, "
			+ "sum(SRR10863213) as SRR10863213, sum(SRR10863214) as SRR10863214, sum(SRR10863215) as SRR10863215, "
			+ "sum(SRR10863216) as SRR10863216, sum(SRR10863217) as SRR10863217, sum(SRR10863218) as SRR10863218, "
			+ "sum(SRR10863219) as SRR10863219 FROM Granulosa_cell")
	public Map <String, Double> getSum();
}
