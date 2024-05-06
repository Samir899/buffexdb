package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Omasum;

public interface OmasumRepository extends CrudRepository<Omasum, Integer>{
	
	@Query("SELECT u FROM Omasum u WHERE u.ERR2353743>=:lowerLimit and u.ERR2353744>=:lowerLimit and u.ERR2353745>=:lowerLimit and u.ERR2353746>=:lowerLimit and u.ERR2353747>=:lowerLimit and u.ERR2353748>=:lowerLimit and u.ERR2353749>=:lowerLimit and u.ERR2354225>=:lowerLimit and u.ERR2354226>=:lowerLimit and u.ERR2354227>=:lowerLimit and u.ERR2354228>=:lowerLimit and u.ERR2354229>=:lowerLimit and u.ERR2354230>=:lowerLimit and u.ERR2354231>=:lowerLimit and u.ERR2354232>=:lowerLimit and u.ERR2354233>=:lowerLimit and u.ERR2354598>=:lowerLimit and u.ERR2354599>=:lowerLimit and u.ERR2354600>=:lowerLimit and u.ERR2354601>=:lowerLimit and u.ERR2354602>=:lowerLimit and u.ERR2354603>=:lowerLimit and u.ERR2354604>=:lowerLimit and u.ERR2354605>=:lowerLimit and u.ERR2354606>=:lowerLimit and u.ERR2354839>=:lowerLimit and u.ERR2354840>=:lowerLimit and u.ERR2354841>=:lowerLimit and u.ERR2354842>=:lowerLimit and u.ERR2354843>=:lowerLimit and u.ERR2354844>=:lowerLimit and u.ERR2354845>=:lowerLimit and u.ERR2354846>=:lowerLimit and u.ERR2354847>=:lowerLimit and u.ERR2352711>=:lowerLimit and u.ERR2352712>=:lowerLimit and u.ERR2352713>=:lowerLimit and u.ERR2352714>=:lowerLimit and u.ERR2352715>=:lowerLimit and u.ERR2352716>=:lowerLimit and u.ERR2352717>=:lowerLimit and u.ERR2352718>=:lowerLimit and u.ERR2352719>=:lowerLimit and u.ERR2352892>=:lowerLimit and u.ERR2352893>=:lowerLimit and u.ERR2352894>=:lowerLimit and u.ERR2352895>=:lowerLimit and u.ERR2352896>=:lowerLimit and u.ERR2352897>=:lowerLimit and u.ERR2352898>=:lowerLimit and u.ERR2353374>=:lowerLimit and u.ERR2353375>=:lowerLimit and u.ERR2353376>=:lowerLimit and u.ERR2353377>=:lowerLimit and u.ERR2353379>=:lowerLimit and u.ERR2353380>=:lowerLimit and u.ERR2353381>=:lowerLimit and u.ERR2353382>=:lowerLimit and "
			+ "u.ERR2353743<=:upperLimit and u.ERR2353744<=:upperLimit and u.ERR2353745<=:upperLimit and u.ERR2353746<=:upperLimit and u.ERR2353747<=:upperLimit and u.ERR2353748<=:upperLimit and u.ERR2353749<=:upperLimit and u.ERR2354225<=:upperLimit and u.ERR2354226<=:upperLimit and u.ERR2354227<=:upperLimit and u.ERR2354228<=:upperLimit and u.ERR2354229<=:upperLimit and u.ERR2354230<=:upperLimit and u.ERR2354231<=:upperLimit and u.ERR2354232<=:upperLimit and u.ERR2354233<=:upperLimit and u.ERR2354598<=:upperLimit and u.ERR2354599<=:upperLimit and u.ERR2354600<=:upperLimit and u.ERR2354601<=:upperLimit and u.ERR2354602<=:upperLimit and u.ERR2354603<=:upperLimit and u.ERR2354604<=:upperLimit and u.ERR2354605<=:upperLimit and u.ERR2354606<=:upperLimit and u.ERR2354839<=:upperLimit and u.ERR2354840<=:upperLimit and u.ERR2354841<=:upperLimit and u.ERR2354842<=:upperLimit and u.ERR2354843<=:upperLimit and u.ERR2354844<=:upperLimit and u.ERR2354845<=:upperLimit and u.ERR2354846<=:upperLimit and u.ERR2354847<=:upperLimit and u.ERR2352711<=:upperLimit and u.ERR2352712<=:upperLimit and u.ERR2352713<=:upperLimit and u.ERR2352714<=:upperLimit and u.ERR2352715<=:upperLimit and u.ERR2352716<=:upperLimit and u.ERR2352717<=:upperLimit and u.ERR2352718<=:upperLimit and u.ERR2352719<=:upperLimit and u.ERR2352892<=:upperLimit and u.ERR2352893<=:upperLimit and u.ERR2352894<=:upperLimit and u.ERR2352895<=:upperLimit and u.ERR2352896<=:upperLimit and u.ERR2352897<=:upperLimit and u.ERR2352898<=:upperLimit and u.ERR2353374<=:upperLimit and u.ERR2353375<=:upperLimit and u.ERR2353376<=:upperLimit and u.ERR2353377<=:upperLimit and u.ERR2353379<=:upperLimit and u.ERR2353380<=:upperLimit and u.ERR2353381<=:upperLimit and u.ERR2353382<=:upperLimit "
			+ "ORDER BY ERR2353743, ERR2353744, ERR2353745, ERR2353746, ERR2353747, ERR2353748, ERR2353749, ERR2354225, ERR2354226, ERR2354227, ERR2354228, ERR2354229, ERR2354230, ERR2354231, ERR2354232, ERR2354233, ERR2354598, ERR2354599, ERR2354600, ERR2354601, ERR2354602, ERR2354603, ERR2354604, ERR2354605, ERR2354606, ERR2354839, ERR2354840, ERR2354841, ERR2354842, ERR2354843, ERR2354844, ERR2354845, ERR2354846, ERR2354847, ERR2352711, ERR2352712, ERR2352713, ERR2352714, ERR2352715, ERR2352716, ERR2352717, ERR2352718, ERR2352719, ERR2352892, ERR2352893, ERR2352894, ERR2352895, ERR2352896, ERR2352897, ERR2352898, ERR2353374, ERR2353375, ERR2353376, ERR2353377, ERR2353379, ERR2353380, ERR2353381, ERR2353382 LIMIT 100")
	public List<Omasum> getOmasumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353743) as ERR2353743, sum(ERR2353744) as ERR2353744, sum(ERR2353745) as ERR2353745, sum(ERR2353746) as ERR2353746, sum(ERR2353747) as ERR2353747, sum(ERR2353748) as ERR2353748, sum(ERR2353749) as ERR2353749, sum(ERR2354225) as ERR2354225, sum(ERR2354226) as ERR2354226, sum(ERR2354227) as ERR2354227, sum(ERR2354228) as ERR2354228, sum(ERR2354229) as ERR2354229, sum(ERR2354230) as ERR2354230, sum(ERR2354231) as ERR2354231, sum(ERR2354232) as ERR2354232, sum(ERR2354233) as ERR2354233, sum(ERR2354598) as ERR2354598, sum(ERR2354599) as ERR2354599, sum(ERR2354600) as ERR2354600, sum(ERR2354601) as ERR2354601, sum(ERR2354602) as ERR2354602, sum(ERR2354603) as ERR2354603, sum(ERR2354604) as ERR2354604, sum(ERR2354605) as ERR2354605, sum(ERR2354606) as ERR2354606, sum(ERR2354839) as ERR2354839, sum(ERR2354840) as ERR2354840, sum(ERR2354841) as ERR2354841, sum(ERR2354842) as ERR2354842, sum(ERR2354843) as ERR2354843, sum(ERR2354844) as ERR2354844, sum(ERR2354845) as ERR2354845, sum(ERR2354846) as ERR2354846, sum(ERR2354847) as ERR2354847, sum(ERR2352711) as ERR2352711, sum(ERR2352712) as ERR2352712, sum(ERR2352713) as ERR2352713, sum(ERR2352714) as ERR2352714, sum(ERR2352715) as ERR2352715, sum(ERR2352716) as ERR2352716, sum(ERR2352717) as ERR2352717, sum(ERR2352718) as ERR2352718, sum(ERR2352719) as ERR2352719, sum(ERR2352892) as ERR2352892, sum(ERR2352893) as ERR2352893, sum(ERR2352894) as ERR2352894, sum(ERR2352895) as ERR2352895, sum(ERR2352896) as ERR2352896, sum(ERR2352897) as ERR2352897, sum(ERR2352898) as ERR2352898, sum(ERR2353374) as ERR2353374, sum(ERR2353375) as ERR2353375, sum(ERR2353376) as ERR2353376, sum(ERR2353377) as ERR2353377, sum(ERR2353379) as ERR2353379, sum(ERR2353380) as ERR2353380, sum(ERR2353381) as ERR2353381, sum(ERR2353382) as ERR2353382 FROM Omasum")
	public Map <String, Double> getSum();
}
