package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Oocyte;

public interface OocyteRepository extends CrudRepository<Oocyte, Integer>{

	@Query("SELECT u FROM Oocyte u WHERE u.SRR10863202>=:lowerLimit and u.SRR10863203>=:lowerLimit and u.SRR10863204>=:lowerLimit and u.SRR10863205>=:lowerLimit and u.SRR10863206>=:lowerLimit and u.SRR10863207>=:lowerLimit and u.SRR10863208>=:lowerLimit and u.SRR10863209>=:lowerLimit and u.SRR10863220>=:lowerLimit and u.SRR10863221>=:lowerLimit and "
			+ "u.SRR10863202<=:upperLimit and u.SRR10863203<=:upperLimit and u.SRR10863204<=:upperLimit and u.SRR10863205<=:upperLimit and u.SRR10863206<=:upperLimit and u.SRR10863207<=:upperLimit and u.SRR10863208<=:upperLimit and u.SRR10863209<=:upperLimit and u.SRR10863220<=:upperLimit and u.SRR10863221<=:upperLimit "
			+ "ORDER BY SRR10863202, SRR10863203, SRR10863204, SRR10863205, SRR10863206, SRR10863207, SRR10863208, SRR10863209, SRR10863220, SRR10863221 LIMIT 100")
	public List<Oocyte> getOocyteSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(SRR10863202) as SRR10863202, sum(SRR10863203) as SRR10863203, sum(SRR10863204) as SRR10863204, sum(SRR10863205) as SRR10863205, sum(SRR10863206) as SRR10863206, sum(SRR10863207) as SRR10863207, sum(SRR10863208) as SRR10863208, sum(SRR10863209) as SRR10863209, sum(SRR10863220) as SRR10863220, sum(SRR10863221) as SRR10863221 FROM Oocyte")
	public Map <String, Double> getSum();
}
