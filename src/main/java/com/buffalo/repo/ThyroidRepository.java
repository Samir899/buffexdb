package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Thyroid;

public interface ThyroidRepository extends CrudRepository<Thyroid, Integer>{
	
	@Query("SELECT u FROM Thyroid u WHERE u.ERR2353555>=:lowerLimit and u.ERR2353556>=:lowerLimit and u.ERR2353557>=:lowerLimit and u.ERR2353558>=:lowerLimit and u.ERR2353559>=:lowerLimit and u.ERR2353560>=:lowerLimit and u.ERR2353561>=:lowerLimit and u.ERR2353562>=:lowerLimit and u.ERR2353563>=:lowerLimit and u.ERR2353845>=:lowerLimit and u.ERR2353846>=:lowerLimit and u.ERR2353847>=:lowerLimit and u.ERR2353848>=:lowerLimit and u.ERR2353849>=:lowerLimit and u.ERR2353850>=:lowerLimit and u.ERR2353851>=:lowerLimit and u.ERR2354397>=:lowerLimit and u.ERR2354398>=:lowerLimit and u.ERR2354399>=:lowerLimit and u.ERR2354400>=:lowerLimit and u.ERR2354401>=:lowerLimit and u.ERR2354402>=:lowerLimit and u.ERR2354403>=:lowerLimit and u.ERR2354404>=:lowerLimit and u.ERR2354405>=:lowerLimit and u.ERR2354707>=:lowerLimit and u.ERR2354708>=:lowerLimit and u.ERR2354709>=:lowerLimit and u.ERR2354710>=:lowerLimit and u.ERR2354711>=:lowerLimit and u.ERR2354712>=:lowerLimit and u.ERR2354713>=:lowerLimit and u.ERR2354714>=:lowerLimit and u.ERR2354715>=:lowerLimit and u.ERR2352994>=:lowerLimit and u.ERR2352995>=:lowerLimit and u.ERR2352996>=:lowerLimit and u.ERR2352997>=:lowerLimit and u.ERR2352998>=:lowerLimit and u.ERR2352999>=:lowerLimit and u.ERR2353000>=:lowerLimit and "
			+ "u.ERR2353555<=:upperLimit and u.ERR2353556<=:upperLimit and u.ERR2353557<=:upperLimit and u.ERR2353558<=:upperLimit and u.ERR2353559<=:upperLimit and u.ERR2353560<=:upperLimit and u.ERR2353561<=:upperLimit and u.ERR2353562<=:upperLimit and u.ERR2353563<=:upperLimit and u.ERR2353845<=:upperLimit and u.ERR2353846<=:upperLimit and u.ERR2353847<=:upperLimit and u.ERR2353848<=:upperLimit and u.ERR2353849<=:upperLimit and u.ERR2353850<=:upperLimit and u.ERR2353851<=:upperLimit and u.ERR2354397<=:upperLimit and u.ERR2354398<=:upperLimit and u.ERR2354399<=:upperLimit and u.ERR2354400<=:upperLimit and u.ERR2354401<=:upperLimit and u.ERR2354402<=:upperLimit and u.ERR2354403<=:upperLimit and u.ERR2354404<=:upperLimit and u.ERR2354405<=:upperLimit and u.ERR2354707<=:upperLimit and u.ERR2354708<=:upperLimit and u.ERR2354709<=:upperLimit and u.ERR2354710<=:upperLimit and u.ERR2354711<=:upperLimit and u.ERR2354712<=:upperLimit and u.ERR2354713<=:upperLimit and u.ERR2354714<=:upperLimit and u.ERR2354715<=:upperLimit and u.ERR2352994<=:upperLimit and u.ERR2352995<=:upperLimit and u.ERR2352996<=:upperLimit and u.ERR2352997<=:upperLimit and u.ERR2352998<=:upperLimit and u.ERR2352999<=:upperLimit and u.ERR2353000<=:upperLimit "
			+ "ORDER BY ERR2353555, ERR2353556, ERR2353557, ERR2353558, ERR2353559, ERR2353560, ERR2353561, ERR2353562, ERR2353563, ERR2353845, ERR2353846, ERR2353847, ERR2353848, ERR2353849, ERR2353850, ERR2353851, ERR2354397, ERR2354398, ERR2354399, ERR2354400, ERR2354401, ERR2354402, ERR2354403, ERR2354404, ERR2354405, ERR2354707, ERR2354708, ERR2354709, ERR2354710, ERR2354711, ERR2354712, ERR2354713, ERR2354714, ERR2354715, ERR2352994, ERR2352995, ERR2352996, ERR2352997, ERR2352998, ERR2352999, ERR2353000 LIMIT 100")
	public List<Thyroid> getThyroidSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
		

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

		@Query("SELECT sum(ERR2353555) as ERR2353555, sum(ERR2353556) as ERR2353556, sum(ERR2353557) as ERR2353557, sum(ERR2353558) as ERR2353558, sum(ERR2353559) as ERR2353559, sum(ERR2353560) as ERR2353560, sum(ERR2353561) as ERR2353561, sum(ERR2353562) as ERR2353562, sum(ERR2353563) as ERR2353563, sum(ERR2353845) as ERR2353845, sum(ERR2353846) as ERR2353846, sum(ERR2353847) as ERR2353847, sum(ERR2353848) as ERR2353848, sum(ERR2353849) as ERR2353849, sum(ERR2353850) as ERR2353850, sum(ERR2353851) as ERR2353851, sum(ERR2354397) as ERR2354397, sum(ERR2354398) as ERR2354398, sum(ERR2354399) as ERR2354399, sum(ERR2354400) as ERR2354400, sum(ERR2354401) as ERR2354401, sum(ERR2354402) as ERR2354402, sum(ERR2354403) as ERR2354403, sum(ERR2354404) as ERR2354404, sum(ERR2354405) as ERR2354405, sum(ERR2354707) as ERR2354707, sum(ERR2354708) as ERR2354708, sum(ERR2354709) as ERR2354709, sum(ERR2354710) as ERR2354710, sum(ERR2354711) as ERR2354711, sum(ERR2354712) as ERR2354712, sum(ERR2354713) as ERR2354713, sum(ERR2354714) as ERR2354714, sum(ERR2354715) as ERR2354715, sum(ERR2352994) as ERR2352994, sum(ERR2352995) as ERR2352995, sum(ERR2352996) as ERR2352996, sum(ERR2352997) as ERR2352997, sum(ERR2352998) as ERR2352998, sum(ERR2352999) as ERR2352999, sum(ERR2353000) as ERR2353000 FROM Thyroid")
		public Map <String, Double> getSum();
}
