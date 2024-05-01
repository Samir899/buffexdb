package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.A_colon;
import com.buffalo.entity.Blood;
import com.buffalo.entity.Genes;

public interface A_colonRepository extends CrudRepository<A_colon, Integer>{
	
	@Query("SELECT u FROM A_colon u WHERE u.ERR2353631>=:lowerLimit and u.ERR2353632>=:lowerLimit and u.ERR2353633>=:lowerLimit and u.ERR2353634>=:lowerLimit and u.ERR2353635>=:lowerLimit and u.ERR2353636>=:lowerLimit and u.ERR2353637>=:lowerLimit and u.ERR2354010>=:lowerLimit and u.ERR2354011>=:lowerLimit and u.ERR2354012>=:lowerLimit and u.ERR2354013>=:lowerLimit and u.ERR2354014>=:lowerLimit and u.ERR2354015>=:lowerLimit and u.ERR2354016>=:lowerLimit and u.ERR2354017>=:lowerLimit and u.ERR2354018>=:lowerLimit and u.ERR2352796>=:lowerLimit and u.ERR2352797>=:lowerLimit and u.ERR2352798>=:lowerLimit and u.ERR2352799>=:lowerLimit and u.ERR2352800>=:lowerLimit and u.ERR2352801>=:lowerLimit and u.ERR2352802>=:lowerLimit and u.ERR2353150>=:lowerLimit and u.ERR2353151>=:lowerLimit and u.ERR2353152>=:lowerLimit and u.ERR2353153>=:lowerLimit and u.ERR2353154>=:lowerLimit and u.ERR2353155>=:lowerLimit and u.ERR2353156>=:lowerLimit and u.ERR2353157>=:lowerLimit and u.ERR2353158>=:lowerLimit and "
			+ "u.ERR2353631<=:upperLimit and u.ERR2353632<=:upperLimit and u.ERR2353633<=:upperLimit and u.ERR2353634<=:upperLimit and u.ERR2353635<=:upperLimit and u.ERR2353636<=:upperLimit and u.ERR2353637<=:upperLimit and u.ERR2354010<=:upperLimit and u.ERR2354011<=:upperLimit and u.ERR2354012<=:upperLimit and u.ERR2354013<=:upperLimit and u.ERR2354014<=:upperLimit and u.ERR2354015<=:upperLimit and u.ERR2354016<=:upperLimit and u.ERR2354017<=:upperLimit and u.ERR2354018<=:upperLimit and u.ERR2352796<=:upperLimit and u.ERR2352797<=:upperLimit and u.ERR2352798<=:upperLimit and u.ERR2352799<=:upperLimit and u.ERR2352800<=:upperLimit and u.ERR2352801<=:upperLimit and u.ERR2352802<=:upperLimit and u.ERR2353150<=:upperLimit and u.ERR2353151<=:upperLimit and u.ERR2353152<=:upperLimit and u.ERR2353153<=:upperLimit and u.ERR2353154<=:upperLimit and u.ERR2353155<=:upperLimit and u.ERR2353156<=:upperLimit and u.ERR2353157<=:upperLimit and u.ERR2353158<=:upperLimit "
			+ "ORDER BY ERR2353631, ERR2353632, ERR2353633, ERR2353634, ERR2353635, ERR2353636, ERR2353637, ERR2354010, ERR2354011, ERR2354012, ERR2354013, ERR2354014, ERR2354015, ERR2354016, ERR2354017, ERR2354018, ERR2352796, ERR2352797, ERR2352798, ERR2352799, ERR2352800, ERR2352801, ERR2352802, ERR2353150, ERR2353151, ERR2353152, ERR2353153, ERR2353154, ERR2353155, ERR2353156, ERR2353157, ERR2353158 LIMIT 50")
	public List<A_colon> getA_colonSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2352796) as ERR2352796, sum(ERR2352797) as ERR2352797, "
			+ "sum(ERR2352798) as ERR2352798, sum(ERR2352799) as ERR2352799, sum(ERR2352800) as ERR2352800,"
			+ "sum(ERR2352801) as ERR2352801, sum(ERR2352802) as ERR2352802, sum(ERR2353150) as ERR2353150,"
			+ "sum(ERR2353151) as ERR2353151, sum(ERR2353152) as ERR2353152, sum(ERR2353153) as ERR2353153, "
			+ "sum(ERR2353154) as ERR2353154, sum(ERR2353155) as ERR2353155, sum(ERR2353156) as ERR2353156,"
			+ "sum(ERR2353157) as ERR2353157, sum(ERR2353158) as ERR2353158, sum(ERR2353631) as ERR2353631,"
			+ "sum(ERR2353632) as ERR2353632, sum(ERR2353633) as ERR2353633, sum(ERR2353634) as ERR2353634,"
			+ "sum(ERR2353635) as ERR2353635, sum(ERR2353636) as ERR2353636, sum(ERR2353637) as ERR2353637,"
			+ "sum(ERR2354010) as ERR2354010, sum(ERR2354011) as ERR2354011, sum(ERR2354012) as ERR2354012,"
			+ "sum(ERR2354013) as ERR2354013, sum(ERR2354014) as ERR2354014, sum(ERR2354015) as ERR2354015,"
			+ "sum(ERR2354016) as ERR2354016, sum(ERR2354017) as ERR2354017, sum(ERR2354018) as ERR2354018 FROM A_colon")

	public Map <String, Double> getSum();


}
