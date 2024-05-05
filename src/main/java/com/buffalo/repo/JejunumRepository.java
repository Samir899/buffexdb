package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Jejunum;

public interface JejunumRepository extends CrudRepository<Jejunum, Integer>{

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
	
	@Query("SELECT sum(ERR2353686) as ERR2353686, sum(ERR2353687) as ERR2353687, sum(ERR2353688) as ERR2353688, "
			+ "sum(ERR2353689) as ERR2353689, sum(ERR2353690) as ERR2353690, sum(ERR2353691) as ERR2353691, "
			+ "sum(ERR2353692) as ERR2353692, sum(ERR2354060) as ERR2354060, sum(ERR2354061) as ERR2354061, "
			+ "sum(ERR2354062) as ERR2354062, sum(ERR2354063) as ERR2354063, sum(ERR2354064) as ERR2354064, "
			+ "sum(ERR2354065) as ERR2354065, sum(ERR2354066) as ERR2354066, sum(ERR2354067) as ERR2354067, "
			+ "sum(ERR2354068) as ERR2354068, sum(ERR2354743) as ERR2354743, sum(ERR2354744) as ERR2354744, "
			+ "sum(ERR2354745) as ERR2354745, sum(ERR2354746) as ERR2354746, sum(ERR2354747) as ERR2354747, "
			+ "sum(ERR2354748) as ERR2354748, sum(ERR2354749) as ERR2354749, sum(ERR2354750) as ERR2354750, "
			+ "sum(ERR2354751) as ERR2354751, sum(SRR24057903) as SRR24057903, sum(SRR24057904) as SRR24057904, "
			+ "sum(ERR2352633) as ERR2352633, sum(ERR2352634) as ERR2352634, sum(ERR2352635) as ERR2352635, "
			+ "sum(ERR2352636) as ERR2352636, sum(ERR2352637) as ERR2352637, sum(ERR2352638) as ERR2352638, "
			+ "sum(ERR2352639) as ERR2352639, sum(ERR2352640) as ERR2352640, sum(ERR2352641) as ERR2352641, "
			+ "sum(ERR2352835) as ERR2352835, sum(ERR2352836) as ERR2352836, sum(ERR2352837) as ERR2352837, "
			+ "sum(ERR2352838) as ERR2352838, sum(ERR2352839) as ERR2352839, sum(ERR2352840) as ERR2352840, "
			+ "sum(ERR2352841) as ERR2352841, sum(ERR2353200) as ERR2353200, sum(ERR2353201) as ERR2353201, "
			+ "sum(ERR2353202) as ERR2353202, sum(ERR2353203) as ERR2353203, sum(ERR2353204) as ERR2353204, "
			+ "sum(ERR2353205) as ERR2353205, sum(ERR2353206) as ERR2353206, sum(ERR2353207) as ERR2353207, "
			+ "sum(ERR2353208) as ERR2353208, sum(SRR24057934) as SRR24057934 FROM Jejunum")
	public Map <String, Double> getSum();
}
