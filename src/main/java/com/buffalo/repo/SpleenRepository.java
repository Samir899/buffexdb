package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Spleen;

public interface SpleenRepository extends CrudRepository<Spleen, Integer>{
	
	@Query("SELECT u FROM Spleen u WHERE u.ERR315641>=:lowerLimit and u.ERR2353537>=:lowerLimit and u.ERR2353538>=:lowerLimit and u.ERR2353539>=:lowerLimit and u.ERR2353540>=:lowerLimit and u.ERR2353541>=:lowerLimit and u.ERR2353542>=:lowerLimit and u.ERR2353543>=:lowerLimit and u.ERR2353544>=:lowerLimit and u.ERR2353545>=:lowerLimit and u.ERR2353829>=:lowerLimit and u.ERR2353830>=:lowerLimit and u.ERR2353831>=:lowerLimit and u.ERR2353832>=:lowerLimit and u.ERR2353833>=:lowerLimit and u.ERR2353834>=:lowerLimit and u.ERR2353835>=:lowerLimit and u.ERR2354356>=:lowerLimit and u.ERR2354357>=:lowerLimit and u.ERR2354358>=:lowerLimit and u.ERR2354359>=:lowerLimit and u.ERR2354360>=:lowerLimit and u.ERR2354361>=:lowerLimit and u.ERR2354362>=:lowerLimit and u.ERR2354363>=:lowerLimit and u.ERR2354364>=:lowerLimit and u.SRR24057899>=:lowerLimit and u.SRR24057900>=:lowerLimit and u.SRR24057901>=:lowerLimit and u.SRR24057902>=:lowerLimit and u.ERR2352987>=:lowerLimit and u.ERR2352988>=:lowerLimit and u.ERR2352989>=:lowerLimit and u.ERR2352990>=:lowerLimit and u.ERR2352991>=:lowerLimit and u.ERR2352992>=:lowerLimit and u.ERR2352993>=:lowerLimit and u.SRR15721750>=:lowerLimit and "
			+ "u.ERR315641<=:upperLimit and u.ERR2353537<=:upperLimit and u.ERR2353538<=:upperLimit and u.ERR2353539<=:upperLimit and u.ERR2353540<=:upperLimit and u.ERR2353541<=:upperLimit and u.ERR2353542<=:upperLimit and u.ERR2353543<=:upperLimit and u.ERR2353544<=:upperLimit and u.ERR2353545<=:upperLimit and u.ERR2353829<=:upperLimit and u.ERR2353830<=:upperLimit and u.ERR2353831<=:upperLimit and u.ERR2353832<=:upperLimit and u.ERR2353833<=:upperLimit and u.ERR2353834<=:upperLimit and u.ERR2353835<=:upperLimit and u.ERR2354356<=:upperLimit and u.ERR2354357<=:upperLimit and u.ERR2354358<=:upperLimit and u.ERR2354359<=:upperLimit and u.ERR2354360<=:upperLimit and u.ERR2354361<=:upperLimit and u.ERR2354362<=:upperLimit and u.ERR2354363<=:upperLimit and u.ERR2354364<=:upperLimit and u.SRR24057899<=:upperLimit and u.SRR24057900<=:upperLimit and u.SRR24057901<=:upperLimit and u.SRR24057902<=:upperLimit and u.ERR2352987<=:upperLimit and u.ERR2352988<=:upperLimit and u.ERR2352989<=:upperLimit and u.ERR2352990<=:upperLimit and u.ERR2352991<=:upperLimit and u.ERR2352992<=:upperLimit and u.ERR2352993<=:upperLimit and u.SRR15721750<=:upperLimit "
			+ "ORDER BY ERR315641, ERR2353537, ERR2353538, ERR2353539, ERR2353540, ERR2353541, ERR2353542, ERR2353543, ERR2353544, ERR2353545, ERR2353829, ERR2353830, ERR2353831, ERR2353832, ERR2353833, ERR2353834, ERR2353835, ERR2354356, ERR2354357, ERR2354358, ERR2354359, ERR2354360, ERR2354361, ERR2354362, ERR2354363, ERR2354364, SRR24057899, SRR24057900, SRR24057901, SRR24057902, ERR2352987, ERR2352988, ERR2352989, ERR2352990, ERR2352991, ERR2352992, ERR2352993, SRR15721750 LIMIT 100")
	public List<Spleen> getSpleenSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315641) as ERR315641, sum(ERR2353537) as ERR2353537, sum(ERR2353538) as ERR2353538, sum(ERR2353539) as ERR2353539, sum(ERR2353540) as ERR2353540, sum(ERR2353541) as ERR2353541, sum(ERR2353542) as ERR2353542, sum(ERR2353543) as ERR2353543, sum(ERR2353544) as ERR2353544, sum(ERR2353545) as ERR2353545, sum(ERR2353829) as ERR2353829, sum(ERR2353830) as ERR2353830, sum(ERR2353831) as ERR2353831, sum(ERR2353832) as ERR2353832, sum(ERR2353833) as ERR2353833, sum(ERR2353834) as ERR2353834, sum(ERR2353835) as ERR2353835, sum(ERR2354356) as ERR2354356, sum(ERR2354357) as ERR2354357, sum(ERR2354358) as ERR2354358, sum(ERR2354359) as ERR2354359, sum(ERR2354360) as ERR2354360, sum(ERR2354361) as ERR2354361, sum(ERR2354362) as ERR2354362, sum(ERR2354363) as ERR2354363, sum(ERR2354364) as ERR2354364, sum(SRR24057899) as SRR24057899, sum(SRR24057900) as SRR24057900, sum(SRR24057901) as SRR24057901, sum(SRR24057902) as SRR24057902, sum(ERR2352987) as ERR2352987, sum(ERR2352988) as ERR2352988, sum(ERR2352989) as ERR2352989, sum(ERR2352990) as ERR2352990, sum(ERR2352991) as ERR2352991, sum(ERR2352992) as ERR2352992, sum(ERR2352993) as ERR2352993, sum(SRR15721750) as SRR15721750 FROM Spleen")
	public Map <String, Double> getSum();
}
