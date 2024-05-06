package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Rectum;

public interface RectumRepository extends CrudRepository<Rectum, Integer>{

	@Query("SELECT u FROM Rectum u WHERE u.ERR2353469>=:lowerLimit and u.ERR2353470>=:lowerLimit and u.ERR2353471>=:lowerLimit and u.ERR2353472>=:lowerLimit and u.ERR2353473>=:lowerLimit and u.ERR2353474>=:lowerLimit and u.ERR2353475>=:lowerLimit and u.ERR2353476>=:lowerLimit and u.ERR2353477>=:lowerLimit and u.ERR2353792>=:lowerLimit and u.ERR2353793>=:lowerLimit and u.ERR2353794>=:lowerLimit and u.ERR2353795>=:lowerLimit and u.ERR2353796>=:lowerLimit and u.ERR2353797>=:lowerLimit and u.ERR2353798>=:lowerLimit and u.ERR2354288>=:lowerLimit and u.ERR2354289>=:lowerLimit and u.ERR2354290>=:lowerLimit and u.ERR2354291>=:lowerLimit and u.ERR2354292>=:lowerLimit and u.ERR2354293>=:lowerLimit and u.ERR2354294>=:lowerLimit and u.ERR2354295>=:lowerLimit and u.ERR2354296>=:lowerLimit and u.ERR2354657>=:lowerLimit and u.ERR2354658>=:lowerLimit and u.ERR2354659>=:lowerLimit and u.ERR2354660>=:lowerLimit and u.ERR2354661>=:lowerLimit and u.ERR2354662>=:lowerLimit and u.ERR2354663>=:lowerLimit and u.ERR2354664>=:lowerLimit and u.ERR2354665>=:lowerLimit and u.ERR2354880>=:lowerLimit and u.ERR2354881>=:lowerLimit and u.ERR2354882>=:lowerLimit and u.ERR2354883>=:lowerLimit and u.ERR2354884>=:lowerLimit and u.ERR2354885>=:lowerLimit and u.ERR2354886>=:lowerLimit and u.ERR2354887>=:lowerLimit and u.ERR2354888>=:lowerLimit and u.ERR2355017>=:lowerLimit and u.ERR2355018>=:lowerLimit and u.ERR2355019>=:lowerLimit and u.ERR2355020>=:lowerLimit and u.ERR2355021>=:lowerLimit and u.ERR2355022>=:lowerLimit and u.ERR2355023>=:lowerLimit and u.ERR2355024>=:lowerLimit and u.ERR2355025>=:lowerLimit and u.ERR2352950>=:lowerLimit and u.ERR2352951>=:lowerLimit and u.ERR2352952>=:lowerLimit and u.ERR2352953>=:lowerLimit and u.ERR2352954>=:lowerLimit and u.ERR2352955>=:lowerLimit and u.ERR2352956>=:lowerLimit and "
			+ "u.ERR2353469<=:upperLimit and u.ERR2353470<=:upperLimit and u.ERR2353471<=:upperLimit and u.ERR2353472<=:upperLimit and u.ERR2353473<=:upperLimit and u.ERR2353474<=:upperLimit and u.ERR2353475<=:upperLimit and u.ERR2353476<=:upperLimit and u.ERR2353477<=:upperLimit and u.ERR2353792<=:upperLimit and u.ERR2353793<=:upperLimit and u.ERR2353794<=:upperLimit and u.ERR2353795<=:upperLimit and u.ERR2353796<=:upperLimit and u.ERR2353797<=:upperLimit and u.ERR2353798<=:upperLimit and u.ERR2354288<=:upperLimit and u.ERR2354289<=:upperLimit and u.ERR2354290<=:upperLimit and u.ERR2354291<=:upperLimit and u.ERR2354292<=:upperLimit and u.ERR2354293<=:upperLimit and u.ERR2354294<=:upperLimit and u.ERR2354295<=:upperLimit and u.ERR2354296<=:upperLimit and u.ERR2354657<=:upperLimit and u.ERR2354658<=:upperLimit and u.ERR2354659<=:upperLimit and u.ERR2354660<=:upperLimit and u.ERR2354661<=:upperLimit and u.ERR2354662<=:upperLimit and u.ERR2354663<=:upperLimit and u.ERR2354664<=:upperLimit and u.ERR2354665<=:upperLimit and u.ERR2354880<=:upperLimit and u.ERR2354881<=:upperLimit and u.ERR2354882<=:upperLimit and u.ERR2354883<=:upperLimit and u.ERR2354884<=:upperLimit and u.ERR2354885<=:upperLimit and u.ERR2354886<=:upperLimit and u.ERR2354887<=:upperLimit and u.ERR2354888<=:upperLimit and u.ERR2355017<=:upperLimit and u.ERR2355018<=:upperLimit and u.ERR2355019<=:upperLimit and u.ERR2355020<=:upperLimit and u.ERR2355021<=:upperLimit and u.ERR2355022<=:upperLimit and u.ERR2355023<=:upperLimit and u.ERR2355024<=:upperLimit and u.ERR2355025<=:upperLimit and u.ERR2352950<=:upperLimit and u.ERR2352951<=:upperLimit and u.ERR2352952<=:upperLimit and u.ERR2352953<=:upperLimit and u.ERR2352954<=:upperLimit and u.ERR2352955<=:upperLimit and u.ERR2352956<=:upperLimit "
			+ "ORDER BY ERR2353469, ERR2353470, ERR2353471, ERR2353472, ERR2353473, ERR2353474, ERR2353475, ERR2353476, ERR2353477, ERR2353792, ERR2353793, ERR2353794, ERR2353795, ERR2353796, ERR2353797, ERR2353798, ERR2354288, ERR2354289, ERR2354290, ERR2354291, ERR2354292, ERR2354293, ERR2354294, ERR2354295, ERR2354296, ERR2354657, ERR2354658, ERR2354659, ERR2354660, ERR2354661, ERR2354662, ERR2354663, ERR2354664, ERR2354665, ERR2354880, ERR2354881, ERR2354882, ERR2354883, ERR2354884, ERR2354885, ERR2354886, ERR2354887, ERR2354888, ERR2355017, ERR2355018, ERR2355019, ERR2355020, ERR2355021, ERR2355022, ERR2355023, ERR2355024, ERR2355025, ERR2352950, ERR2352951, ERR2352952, ERR2352953, ERR2352954, ERR2352955, ERR2352956 LIMIT 100")
	public List<Rectum> getRectumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
	
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
	
	@Query("SELECT sum(ERR2353469) as ERR2353469, sum(ERR2353470) as ERR2353470, sum(ERR2353471) as ERR2353471, sum(ERR2353472) as ERR2353472, sum(ERR2353473) as ERR2353473, sum(ERR2353474) as ERR2353474, sum(ERR2353475) as ERR2353475, sum(ERR2353476) as ERR2353476, sum(ERR2353477) as ERR2353477, sum(ERR2353792) as ERR2353792, sum(ERR2353793) as ERR2353793, sum(ERR2353794) as ERR2353794, sum(ERR2353795) as ERR2353795, sum(ERR2353796) as ERR2353796, sum(ERR2353797) as ERR2353797, sum(ERR2353798) as ERR2353798, sum(ERR2354288) as ERR2354288, sum(ERR2354289) as ERR2354289, sum(ERR2354290) as ERR2354290, sum(ERR2354291) as ERR2354291, sum(ERR2354292) as ERR2354292, sum(ERR2354293) as ERR2354293, sum(ERR2354294) as ERR2354294, sum(ERR2354295) as ERR2354295, sum(ERR2354296) as ERR2354296, sum(ERR2354657) as ERR2354657, sum(ERR2354658) as ERR2354658, sum(ERR2354659) as ERR2354659, sum(ERR2354660) as ERR2354660, sum(ERR2354661) as ERR2354661, sum(ERR2354662) as ERR2354662, sum(ERR2354663) as ERR2354663, sum(ERR2354664) as ERR2354664, sum(ERR2354665) as ERR2354665, sum(ERR2354880) as ERR2354880, sum(ERR2354881) as ERR2354881, sum(ERR2354882) as ERR2354882, sum(ERR2354883) as ERR2354883, sum(ERR2354884) as ERR2354884, sum(ERR2354885) as ERR2354885, sum(ERR2354886) as ERR2354886, sum(ERR2354887) as ERR2354887, sum(ERR2354888) as ERR2354888, sum(ERR2355017) as ERR2355017, sum(ERR2355018) as ERR2355018, sum(ERR2355019) as ERR2355019, sum(ERR2355020) as ERR2355020, sum(ERR2355021) as ERR2355021, sum(ERR2355022) as ERR2355022, sum(ERR2355023) as ERR2355023, sum(ERR2355024) as ERR2355024, sum(ERR2355025) as ERR2355025, sum(ERR2352950) as ERR2352950, sum(ERR2352951) as ERR2352951, sum(ERR2352952) as ERR2352952, sum(ERR2352953) as ERR2352953, sum(ERR2352954) as ERR2352954, sum(ERR2352955) as ERR2352955, sum(ERR2352956) as ERR2352956 FROM Rectum")
	public Map <String, Double> getSum();
}
