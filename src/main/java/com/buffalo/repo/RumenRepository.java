package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.buffalo.entity.Rumen;

public interface RumenRepository extends CrudRepository<Rumen, Integer>{

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
