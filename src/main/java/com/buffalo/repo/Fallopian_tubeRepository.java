package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Fallopian_tube;
import com.buffalo.entity.Genes;

public interface Fallopian_tubeRepository extends CrudRepository<Fallopian_tube, Integer>{
	
	@Query("SELECT u FROM Fallopian_tube u WHERE u.ERR2354465>=:lowerLimit and u.ERR2354466>=:lowerLimit and u.ERR2354467>=:lowerLimit and u.ERR2354468>=:lowerLimit and u.ERR2354469>=:lowerLimit and u.ERR2354470>=:lowerLimit and u.ERR2354471>=:lowerLimit and u.ERR2354472>=:lowerLimit and u.ERR2354473>=:lowerLimit and u.ERR2352810>=:lowerLimit and u.ERR2352811>=:lowerLimit and u.ERR2352812>=:lowerLimit and u.ERR2352813>=:lowerLimit and u.ERR2352814>=:lowerLimit and u.ERR2352815>=:lowerLimit and u.ERR2352816>=:lowerLimit and u.ERR2353168>=:lowerLimit and u.ERR2353169>=:lowerLimit and u.ERR2353170>=:lowerLimit and u.ERR2353171>=:lowerLimit and u.ERR2353172>=:lowerLimit and u.ERR2353173>=:lowerLimit and u.ERR2353174>=:lowerLimit and u.ERR2353175>=:lowerLimit and u.ERR2353176>=:lowerLimit and "
			+ "u.ERR2354465<=:upperLimit and u.ERR2354466<=:upperLimit and u.ERR2354467<=:upperLimit and u.ERR2354468<=:upperLimit and u.ERR2354469<=:upperLimit and u.ERR2354470<=:upperLimit and u.ERR2354471<=:upperLimit and u.ERR2354472<=:upperLimit and u.ERR2354473<=:upperLimit and u.ERR2352810<=:upperLimit and u.ERR2352811<=:upperLimit and u.ERR2352812<=:upperLimit and u.ERR2352813<=:upperLimit and u.ERR2352814<=:upperLimit and u.ERR2352815<=:upperLimit and u.ERR2352816<=:upperLimit and u.ERR2353168<=:upperLimit and u.ERR2353169<=:upperLimit and u.ERR2353170<=:upperLimit and u.ERR2353171<=:upperLimit and u.ERR2353172<=:upperLimit and u.ERR2353173<=:upperLimit and u.ERR2353174<=:upperLimit and u.ERR2353175<=:upperLimit and u.ERR2353176<=:upperLimit "
			+ "ORDER BY ERR2354465, ERR2354466, ERR2354467, ERR2354468, ERR2354469, ERR2354470, ERR2354471, ERR2354472, ERR2354473, ERR2352810, ERR2352811, ERR2352812, ERR2352813, ERR2352814, ERR2352815, ERR2352816, ERR2353168, ERR2353169, ERR2353170, ERR2353171, ERR2353172, ERR2353173, ERR2353174, ERR2353175, ERR2353176 LIMIT 100")
	public List<Fallopian_tube> getFallopian_tubeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2354465) as ERR2354465, sum(ERR2354466) as ERR2354466, sum(ERR2354467) as ERR2354467, "
			+ "sum(ERR2354468) as ERR2354468, sum(ERR2354469) as ERR2354469, sum(ERR2354470) as ERR2354470, "
			+ "sum(ERR2354471) as ERR2354471, sum(ERR2354472) as ERR2354472, sum(ERR2354473) as ERR2354473, "
			+ "sum(ERR2352810) as ERR2352810, sum(ERR2352811) as ERR2352811, sum(ERR2352812) as ERR2352812, "
			+ "sum(ERR2352813) as ERR2352813, sum(ERR2352814) as ERR2352814, sum(ERR2352815) as ERR2352815, "
			+ "sum(ERR2352816) as ERR2352816, sum(ERR2353168) as ERR2353168, sum(ERR2353169) as ERR2353169, "
			+ "sum(ERR2353170) as ERR2353170, sum(ERR2353171) as ERR2353171, sum(ERR2353172) as ERR2353172, "
			+ "sum(ERR2353173) as ERR2353173, sum(ERR2353174) as ERR2353174, sum(ERR2353175) as ERR2353175, "
			+ "sum(ERR2353176) as ERR2353176 FROM Fallopian_tube")
	public Map <String, Double> getSum();

}

