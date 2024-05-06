package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Saliva_sec_gland;

public interface Saliva_sec_glandRepository extends CrudRepository<Saliva_sec_gland, Integer>{
	
	@Query("SELECT u FROM Saliva_sec_gland u WHERE u.ERR2353519>=:lowerLimit and u.ERR2353520>=:lowerLimit and u.ERR2353521>=:lowerLimit and u.ERR2353522>=:lowerLimit and u.ERR2353523>=:lowerLimit and u.ERR2353524>=:lowerLimit and u.ERR2353525>=:lowerLimit and u.ERR2353526>=:lowerLimit and u.ERR2353527>=:lowerLimit and u.ERR2353822>=:lowerLimit and u.ERR2353823>=:lowerLimit and u.ERR2353824>=:lowerLimit and u.ERR2353825>=:lowerLimit and u.ERR2353826>=:lowerLimit and u.ERR2353827>=:lowerLimit and u.ERR2353828>=:lowerLimit and u.ERR2354338>=:lowerLimit and u.ERR2354339>=:lowerLimit and u.ERR2354340>=:lowerLimit and u.ERR2354341>=:lowerLimit and u.ERR2354342>=:lowerLimit and u.ERR2354343>=:lowerLimit and u.ERR2354344>=:lowerLimit and u.ERR2354345>=:lowerLimit and u.ERR2354346>=:lowerLimit and u.ERR2355058>=:lowerLimit and u.ERR2355059>=:lowerLimit and u.ERR2355060>=:lowerLimit and u.ERR2355061>=:lowerLimit and u.ERR2355062>=:lowerLimit and u.ERR2355063>=:lowerLimit and u.ERR2355064>=:lowerLimit and u.ERR2355065>=:lowerLimit and u.ERR2355066>=:lowerLimit and u.ERR2352729>=:lowerLimit and u.ERR2352730>=:lowerLimit and u.ERR2352731>=:lowerLimit and u.ERR2352732>=:lowerLimit and u.ERR2352733>=:lowerLimit and u.ERR2352734>=:lowerLimit and u.ERR2352735>=:lowerLimit and u.ERR2352736>=:lowerLimit and u.ERR2352737>=:lowerLimit and u.ERR2352980>=:lowerLimit and u.ERR2352981>=:lowerLimit and u.ERR2352982>=:lowerLimit and u.ERR2352983>=:lowerLimit and u.ERR2352984>=:lowerLimit and u.ERR2352985>=:lowerLimit and u.ERR2352986>=:lowerLimit and "
			+ "u.ERR2353519<=:upperLimit and u.ERR2353520<=:upperLimit and u.ERR2353521<=:upperLimit and u.ERR2353522<=:upperLimit and u.ERR2353523<=:upperLimit and u.ERR2353524<=:upperLimit and u.ERR2353525<=:upperLimit and u.ERR2353526<=:upperLimit and u.ERR2353527<=:upperLimit and u.ERR2353822<=:upperLimit and u.ERR2353823<=:upperLimit and u.ERR2353824<=:upperLimit and u.ERR2353825<=:upperLimit and u.ERR2353826<=:upperLimit and u.ERR2353827<=:upperLimit and u.ERR2353828<=:upperLimit and u.ERR2354338<=:upperLimit and u.ERR2354339<=:upperLimit and u.ERR2354340<=:upperLimit and u.ERR2354341<=:upperLimit and u.ERR2354342<=:upperLimit and u.ERR2354343<=:upperLimit and u.ERR2354344<=:upperLimit and u.ERR2354345<=:upperLimit and u.ERR2354346<=:upperLimit and u.ERR2355058<=:upperLimit and u.ERR2355059<=:upperLimit and u.ERR2355060<=:upperLimit and u.ERR2355061<=:upperLimit and u.ERR2355062<=:upperLimit and u.ERR2355063<=:upperLimit and u.ERR2355064<=:upperLimit and u.ERR2355065<=:upperLimit and u.ERR2355066<=:upperLimit and u.ERR2352729<=:upperLimit and u.ERR2352730<=:upperLimit and u.ERR2352731<=:upperLimit and u.ERR2352732<=:upperLimit and u.ERR2352733<=:upperLimit and u.ERR2352734<=:upperLimit and u.ERR2352735<=:upperLimit and u.ERR2352736<=:upperLimit and u.ERR2352737<=:upperLimit and u.ERR2352980<=:upperLimit and u.ERR2352981<=:upperLimit and u.ERR2352982<=:upperLimit and u.ERR2352983<=:upperLimit and u.ERR2352984<=:upperLimit and u.ERR2352985<=:upperLimit and u.ERR2352986<=:upperLimit "
			+ "ORDER BY ERR2353519, ERR2353520, ERR2353521, ERR2353522, ERR2353523, ERR2353524, ERR2353525, ERR2353526, ERR2353527, ERR2353822, ERR2353823, ERR2353824, ERR2353825, ERR2353826, ERR2353827, ERR2353828, ERR2354338, ERR2354339, ERR2354340, ERR2354341, ERR2354342, ERR2354343, ERR2354344, ERR2354345, ERR2354346, ERR2355058, ERR2355059, ERR2355060, ERR2355061, ERR2355062, ERR2355063, ERR2355064, ERR2355065, ERR2355066, ERR2352729, ERR2352730, ERR2352731, ERR2352732, ERR2352733, ERR2352734, ERR2352735, ERR2352736, ERR2352737, ERR2352980, ERR2352981, ERR2352982, ERR2352983, ERR2352984, ERR2352985, ERR2352986 LIMIT 100")
	public List<Saliva_sec_gland> getSaliva_sec_glandSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353519) as ERR2353519, sum(ERR2353520) as ERR2353520, sum(ERR2353521) as ERR2353521, sum(ERR2353522) as ERR2353522, sum(ERR2353523) as ERR2353523, sum(ERR2353524) as ERR2353524, sum(ERR2353525) as ERR2353525, sum(ERR2353526) as ERR2353526, sum(ERR2353527) as ERR2353527, sum(ERR2353822) as ERR2353822, sum(ERR2353823) as ERR2353823, sum(ERR2353824) as ERR2353824, sum(ERR2353825) as ERR2353825, sum(ERR2353826) as ERR2353826, sum(ERR2353827) as ERR2353827, sum(ERR2353828) as ERR2353828, sum(ERR2354338) as ERR2354338, sum(ERR2354339) as ERR2354339, sum(ERR2354340) as ERR2354340, sum(ERR2354341) as ERR2354341, sum(ERR2354342) as ERR2354342, sum(ERR2354343) as ERR2354343, sum(ERR2354344) as ERR2354344, sum(ERR2354345) as ERR2354345, sum(ERR2354346) as ERR2354346, sum(ERR2355058) as ERR2355058, sum(ERR2355059) as ERR2355059, sum(ERR2355060) as ERR2355060, sum(ERR2355061) as ERR2355061, sum(ERR2355062) as ERR2355062, sum(ERR2355063) as ERR2355063, sum(ERR2355064) as ERR2355064, sum(ERR2355065) as ERR2355065, sum(ERR2355066) as ERR2355066, sum(ERR2352729) as ERR2352729, sum(ERR2352730) as ERR2352730, sum(ERR2352731) as ERR2352731, sum(ERR2352732) as ERR2352732, sum(ERR2352733) as ERR2352733, sum(ERR2352734) as ERR2352734, sum(ERR2352735) as ERR2352735, sum(ERR2352736) as ERR2352736, sum(ERR2352737) as ERR2352737, sum(ERR2352980) as ERR2352980, sum(ERR2352981) as ERR2352981, sum(ERR2352982) as ERR2352982, sum(ERR2352983) as ERR2352983, sum(ERR2352984) as ERR2352984, sum(ERR2352985) as ERR2352985, sum(ERR2352986) as ERR2352986 FROM Saliva_sec_gland")
	public Map <String, Double> getSum();
}
