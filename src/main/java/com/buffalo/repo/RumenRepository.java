package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Rumen;

public interface RumenRepository extends CrudRepository<Rumen, Integer>{
	
	@Query("SELECT u FROM Rumen u WHERE u.ERR2353501>=:lowerLimit and u.ERR2353502>=:lowerLimit and u.ERR2353503>=:lowerLimit and u.ERR2353504>=:lowerLimit and u.ERR2353505>=:lowerLimit and u.ERR2353506>=:lowerLimit and u.ERR2353507>=:lowerLimit and u.ERR2353508>=:lowerLimit and u.ERR2353509>=:lowerLimit and u.ERR2353808>=:lowerLimit and u.ERR2353809>=:lowerLimit and u.ERR2353810>=:lowerLimit and u.ERR2353811>=:lowerLimit and u.ERR2353812>=:lowerLimit and u.ERR2353813>=:lowerLimit and u.ERR2353814>=:lowerLimit and u.ERR2354320>=:lowerLimit and u.ERR2354321>=:lowerLimit and u.ERR2354322>=:lowerLimit and u.ERR2354323>=:lowerLimit and u.ERR2354324>=:lowerLimit and u.ERR2354325>=:lowerLimit and u.ERR2354326>=:lowerLimit and u.ERR2354327>=:lowerLimit and u.ERR2354328>=:lowerLimit and u.ERR2354689>=:lowerLimit and u.ERR2354690>=:lowerLimit and u.ERR2354691>=:lowerLimit and u.ERR2354692>=:lowerLimit and u.ERR2354693>=:lowerLimit and u.ERR2354694>=:lowerLimit and u.ERR2354695>=:lowerLimit and u.ERR2354696>=:lowerLimit and u.ERR2354697>=:lowerLimit and u.ERR2355049>=:lowerLimit and u.ERR2355050>=:lowerLimit and u.ERR2355051>=:lowerLimit and u.ERR2355052>=:lowerLimit and u.ERR2355053>=:lowerLimit and u.ERR2355054>=:lowerLimit and u.ERR2355055>=:lowerLimit and u.ERR2355056>=:lowerLimit and u.ERR2355057>=:lowerLimit and u.ERR2352966>=:lowerLimit and u.ERR2352967>=:lowerLimit and u.ERR2352968>=:lowerLimit and u.ERR2352969>=:lowerLimit and u.ERR2352970>=:lowerLimit and u.ERR2352971>=:lowerLimit and u.ERR2352972>=:lowerLimit and u.SRR24057894>=:lowerLimit and u.SRR24057895>=:lowerLimit and u.SRR24057896>=:lowerLimit and u.SRR24057898>=:lowerLimit and "
			+ "u.ERR2353501<=:upperLimit and u.ERR2353502<=:upperLimit and u.ERR2353503<=:upperLimit and u.ERR2353504<=:upperLimit and u.ERR2353505<=:upperLimit and u.ERR2353506<=:upperLimit and u.ERR2353507<=:upperLimit and u.ERR2353508<=:upperLimit and u.ERR2353509<=:upperLimit and u.ERR2353808<=:upperLimit and u.ERR2353809<=:upperLimit and u.ERR2353810<=:upperLimit and u.ERR2353811<=:upperLimit and u.ERR2353812<=:upperLimit and u.ERR2353813<=:upperLimit and u.ERR2353814<=:upperLimit and u.ERR2354320<=:upperLimit and u.ERR2354321<=:upperLimit and u.ERR2354322<=:upperLimit and u.ERR2354323<=:upperLimit and u.ERR2354324<=:upperLimit and u.ERR2354325<=:upperLimit and u.ERR2354326<=:upperLimit and u.ERR2354327<=:upperLimit and u.ERR2354328<=:upperLimit and u.ERR2354689<=:upperLimit and u.ERR2354690<=:upperLimit and u.ERR2354691<=:upperLimit and u.ERR2354692<=:upperLimit and u.ERR2354693<=:upperLimit and u.ERR2354694<=:upperLimit and u.ERR2354695<=:upperLimit and u.ERR2354696<=:upperLimit and u.ERR2354697<=:upperLimit and u.ERR2355049<=:upperLimit and u.ERR2355050<=:upperLimit and u.ERR2355051<=:upperLimit and u.ERR2355052<=:upperLimit and u.ERR2355053<=:upperLimit and u.ERR2355054<=:upperLimit and u.ERR2355055<=:upperLimit and u.ERR2355056<=:upperLimit and u.ERR2355057<=:upperLimit and u.ERR2352966<=:upperLimit and u.ERR2352967<=:upperLimit and u.ERR2352968<=:upperLimit and u.ERR2352969<=:upperLimit and u.ERR2352970<=:upperLimit and u.ERR2352971<=:upperLimit and u.ERR2352972<=:upperLimit and u.SRR24057894<=:upperLimit and u.SRR24057895<=:upperLimit and u.SRR24057896<=:upperLimit and u.SRR24057898<=:upperLimit "
			+ "ORDER BY ERR2353501, ERR2353502, ERR2353503, ERR2353504, ERR2353505, ERR2353506, ERR2353507, ERR2353508, ERR2353509, ERR2353808, ERR2353809, ERR2353810, ERR2353811, ERR2353812, ERR2353813, ERR2353814, ERR2354320, ERR2354321, ERR2354322, ERR2354323, ERR2354324, ERR2354325, ERR2354326, ERR2354327, ERR2354328, ERR2354689, ERR2354690, ERR2354691, ERR2354692, ERR2354693, ERR2354694, ERR2354695, ERR2354696, ERR2354697, ERR2355049, ERR2355050, ERR2355051, ERR2355052, ERR2355053, ERR2355054, ERR2355055, ERR2355056, ERR2355057, ERR2352966, ERR2352967, ERR2352968, ERR2352969, ERR2352970, ERR2352971, ERR2352972, SRR24057894, SRR24057895, SRR24057896, SRR24057898 LIMIT 100")
	public List<Rumen> getRumenSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2352966) as ERR2352966, sum(ERR2352967) as ERR2352967, sum(ERR2352968) as ERR2352968, "
			+ "sum(ERR2352969) as ERR2352969, sum(ERR2352970) as ERR2352970, sum(ERR2352971) as ERR2352971, "
			+ "sum(ERR2352972) as ERR2352972, sum(ERR2353501) as ERR2353501, sum(ERR2353502) as ERR2353502, "
			+ "sum(ERR2353503) as ERR2353503, sum(ERR2353504) as ERR2353504, sum(ERR2353505) as ERR2353505, "
			+ "sum(ERR2353506) as ERR2353506, sum(ERR2353507) as ERR2353507, sum(ERR2353508) as ERR2353508, "
			+ "sum(ERR2353509) as ERR2353509, sum(ERR2353808) as ERR2353808, sum(ERR2353809) as ERR2353809, "
			+ "sum(ERR2353810) as ERR2353810, sum(ERR2353811) as ERR2353811, sum(ERR2353812) as ERR2353812, "
			+ "sum(ERR2353813) as ERR2353813, sum(ERR2353814) as ERR2353814, sum(ERR2354320) as ERR2354320, "
			+ "sum(ERR2354321) as ERR2354321, sum(ERR2354322) as ERR2354322, sum(ERR2354323) as ERR2354323, "
			+ "sum(ERR2354324) as ERR2354324, sum(ERR2354325) as ERR2354325, sum(ERR2354326) as ERR2354326, "
			+ "sum(ERR2354327) as ERR2354327, sum(ERR2354328) as ERR2354328, sum(ERR2354689) as ERR2354689, "
			+ "sum(ERR2354690) as ERR2354690, sum(ERR2354691) as ERR2354691, sum(ERR2354692) as ERR2354692, "
			+ "sum(ERR2354693) as ERR2354693, sum(ERR2354694) as ERR2354694, sum(ERR2354695) as ERR2354695, "
			+ "sum(ERR2354696) as ERR2354696, sum(ERR2354697) as ERR2354697, sum(ERR2355049) as ERR2355049, "
			+ "sum(ERR2355050) as ERR2355050, sum(ERR2355051) as ERR2355051, sum(ERR2355052) as ERR2355052, "
			+ "sum(ERR2355053) as ERR2355053, sum(ERR2355054) as ERR2355054, sum(ERR2355055) as ERR2355055, "
			+ "sum(ERR2355056) as ERR2355056, sum(ERR2355057) as ERR2355057, sum(SRR24057894) as SRR24057894, "
			+ "sum(SRR24057895) as SRR24057895, sum(SRR24057896) as SRR24057896, sum(SRR24057898) as SRR24057898 FROM Rumen")
	public Map <String, Double> getSum();
}
