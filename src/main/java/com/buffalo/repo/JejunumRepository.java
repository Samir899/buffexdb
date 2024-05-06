package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Jejunum;

public interface JejunumRepository extends CrudRepository<Jejunum, Integer>{
	
	@Query("SELECT u FROM Jejunum u WHERE u.ERR2353686>=:lowerLimit and u.ERR2353687>=:lowerLimit and u.ERR2353688>=:lowerLimit and u.ERR2353689>=:lowerLimit and u.ERR2353690>=:lowerLimit and u.ERR2353691>=:lowerLimit and u.ERR2353692>=:lowerLimit and u.ERR2354060>=:lowerLimit and u.ERR2354061>=:lowerLimit and u.ERR2354062>=:lowerLimit and u.ERR2354063>=:lowerLimit and u.ERR2354064>=:lowerLimit and u.ERR2354065>=:lowerLimit and u.ERR2354066>=:lowerLimit and u.ERR2354067>=:lowerLimit and u.ERR2354068>=:lowerLimit and u.ERR2354743>=:lowerLimit and u.ERR2354744>=:lowerLimit and u.ERR2354745>=:lowerLimit and u.ERR2354746>=:lowerLimit and u.ERR2354747>=:lowerLimit and u.ERR2354748>=:lowerLimit and u.ERR2354749>=:lowerLimit and u.ERR2354750>=:lowerLimit and u.ERR2354751>=:lowerLimit and u.SRR24057903>=:lowerLimit and u.SRR24057904>=:lowerLimit and u.ERR2352633>=:lowerLimit and u.ERR2352634>=:lowerLimit and u.ERR2352635>=:lowerLimit and u.ERR2352636>=:lowerLimit and u.ERR2352637>=:lowerLimit and u.ERR2352638>=:lowerLimit and u.ERR2352639>=:lowerLimit and u.ERR2352640>=:lowerLimit and u.ERR2352641>=:lowerLimit and u.ERR2352835>=:lowerLimit and u.ERR2352836>=:lowerLimit and u.ERR2352837>=:lowerLimit and u.ERR2352838>=:lowerLimit and u.ERR2352839>=:lowerLimit and u.ERR2352840>=:lowerLimit and u.ERR2352841>=:lowerLimit and u.ERR2353200>=:lowerLimit and u.ERR2353201>=:lowerLimit and u.ERR2353202>=:lowerLimit and u.ERR2353203>=:lowerLimit and u.ERR2353204>=:lowerLimit and u.ERR2353205>=:lowerLimit and u.ERR2353206>=:lowerLimit and u.ERR2353207>=:lowerLimit and u.ERR2353208>=:lowerLimit and u.SRR24057934>=:lowerLimit and "
			+ "u.ERR2353686<=:upperLimit and u.ERR2353687<=:upperLimit and u.ERR2353688<=:upperLimit and u.ERR2353689<=:upperLimit and u.ERR2353690<=:upperLimit and u.ERR2353691<=:upperLimit and u.ERR2353692<=:upperLimit and u.ERR2354060<=:upperLimit and u.ERR2354061<=:upperLimit and u.ERR2354062<=:upperLimit and u.ERR2354063<=:upperLimit and u.ERR2354064<=:upperLimit and u.ERR2354065<=:upperLimit and u.ERR2354066<=:upperLimit and u.ERR2354067<=:upperLimit and u.ERR2354068<=:upperLimit and u.ERR2354743<=:upperLimit and u.ERR2354744<=:upperLimit and u.ERR2354745<=:upperLimit and u.ERR2354746<=:upperLimit and u.ERR2354747<=:upperLimit and u.ERR2354748<=:upperLimit and u.ERR2354749<=:upperLimit and u.ERR2354750<=:upperLimit and u.ERR2354751<=:upperLimit and u.SRR24057903<=:upperLimit and u.SRR24057904<=:upperLimit and u.ERR2352633<=:upperLimit and u.ERR2352634<=:upperLimit and u.ERR2352635<=:upperLimit and u.ERR2352636<=:upperLimit and u.ERR2352637<=:upperLimit and u.ERR2352638<=:upperLimit and u.ERR2352639<=:upperLimit and u.ERR2352640<=:upperLimit and u.ERR2352641<=:upperLimit and u.ERR2352835<=:upperLimit and u.ERR2352836<=:upperLimit and u.ERR2352837<=:upperLimit and u.ERR2352838<=:upperLimit and u.ERR2352839<=:upperLimit and u.ERR2352840<=:upperLimit and u.ERR2352841<=:upperLimit and u.ERR2353200<=:upperLimit and u.ERR2353201<=:upperLimit and u.ERR2353202<=:upperLimit and u.ERR2353203<=:upperLimit and u.ERR2353204<=:upperLimit and u.ERR2353205<=:upperLimit and u.ERR2353206<=:upperLimit and u.ERR2353207<=:upperLimit and u.ERR2353208<=:upperLimit and u.SRR24057934<=:upperLimit "
			+ "ORDER BY ERR2353686, ERR2353687, ERR2353688, ERR2353689, ERR2353690, ERR2353691, ERR2353692, ERR2354060, ERR2354061, ERR2354062, ERR2354063, ERR2354064, ERR2354065, ERR2354066, ERR2354067, ERR2354068, ERR2354743, ERR2354744, ERR2354745, ERR2354746, ERR2354747, ERR2354748, ERR2354749, ERR2354750, ERR2354751, SRR24057903, SRR24057904, ERR2352633, ERR2352634, ERR2352635, ERR2352636, ERR2352637, ERR2352638, ERR2352639, ERR2352640, ERR2352641, ERR2352835, ERR2352836, ERR2352837, ERR2352838, ERR2352839, ERR2352840, ERR2352841, ERR2353200, ERR2353201, ERR2353202, ERR2353203, ERR2353204, ERR2353205, ERR2353206, ERR2353207, ERR2353208, SRR24057934 LIMIT 100")
	public List<Jejunum> getJejunumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
