package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Lung_parenchyma_A;

public interface Lung_parenchyma_ARepository extends CrudRepository<Lung_parenchyma_A, Integer>{

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
	
	@Query("SELECT sum(ERR2352688) as ERR2352688, sum(ERR2352689) as ERR2352689, sum(ERR2352690) as ERR2352690, "
			+ "sum(ERR2352691) as ERR2352691, sum(ERR2352692) as ERR2352692, sum(ERR2352693) as ERR2352693, "
			+ "sum(ERR2352694) as ERR2352694, sum(ERR2352695) as ERR2352695, sum(ERR2352696) as ERR2352696, "
			+ "sum(ERR2352697) as ERR2352697, sum(ERR2352698) as ERR2352698, sum(ERR2352699) as ERR2352699, "
			+ "sum(ERR2352700) as ERR2352700, sum(ERR2352701) as ERR2352701, sum(ERR2352702) as ERR2352702, "
			+ "sum(ERR2352703) as ERR2352703, sum(ERR2352704) as ERR2352704, sum(ERR2352705) as ERR2352705, "
			+ "sum(ERR2352706) as ERR2352706, sum(ERR2352707) as ERR2352707, sum(ERR2352708) as ERR2352708, "
			+ "sum(ERR2352709) as ERR2352709, sum(ERR2352710) as ERR2352710, sum(ERR2352876) as ERR2352876, "
			+ "sum(ERR2352877) as ERR2352877, sum(ERR2352878) as ERR2352878, sum(ERR2352879) as ERR2352879, "
			+ "sum(ERR2352880) as ERR2352880, sum(ERR2352881) as ERR2352881, sum(ERR2352882) as ERR2352882, "
			+ "sum(ERR2352883) as ERR2352883, sum(ERR2352884) as ERR2352884, sum(ERR2353287) as ERR2353287, "
			+ "sum(ERR2353288) as ERR2353288, sum(ERR2353289) as ERR2353289, sum(ERR2353290) as ERR2353290, "
			+ "sum(ERR2353291) as ERR2353291, sum(ERR2353292) as ERR2353292, sum(ERR2353293) as ERR2353293, "
			+ "sum(ERR2353294) as ERR2353294, sum(ERR2353295) as ERR2353295, sum(ERR2353296) as ERR2353296, "
			+ "sum(ERR2353297) as ERR2353297, sum(ERR2353298) as ERR2353298, sum(ERR2353299) as ERR2353299, "
			+ "sum(ERR2353300) as ERR2353300, sum(ERR2353301) as ERR2353301, sum(ERR2353302) as ERR2353302, "
			+ "sum(ERR2353303) as ERR2353303, sum(ERR2353304) as ERR2353304, sum(ERR2353305) as ERR2353305, "
			+ "sum(ERR2353306) as ERR2353306, sum(ERR2353307) as ERR2353307, sum(ERR2353308) as ERR2353308, "
			+ "sum(ERR2353309) as ERR2353309, sum(ERR2353727) as ERR2353727, sum(ERR2353728) as ERR2353728, "
			+ "sum(ERR2353729) as ERR2353729, sum(ERR2353730) as ERR2353730, sum(ERR2353731) as ERR2353731, "
			+ "sum(ERR2353732) as ERR2353732, sum(ERR2353733) as ERR2353733, sum(ERR2353734) as ERR2353734, "
			+ "sum(ERR2353735) as ERR2353735, sum(ERR2354147) as ERR2354147, sum(ERR2354148) as ERR2354148, "
			+ "sum(ERR2354149) as ERR2354149, sum(ERR2354150) as ERR2354150, sum(ERR2354151) as ERR2354151, "
			+ "sum(ERR2354152) as ERR2354152, sum(ERR2354153) as ERR2354153, sum(ERR2354154) as ERR2354154, "
			+ "sum(ERR2354155) as ERR2354155, sum(ERR2354156) as ERR2354156, sum(ERR2354157) as ERR2354157, "
			+ "sum(ERR2354158) as ERR2354158, sum(ERR2354159) as ERR2354159, sum(ERR2354160) as ERR2354160, "
			+ "sum(ERR2354161) as ERR2354161, sum(ERR2354162) as ERR2354162, sum(ERR2354163) as ERR2354163, "
			+ "sum(ERR2354164) as ERR2354164, sum(ERR2354165) as ERR2354165, sum(ERR2354166) as ERR2354166, "
			+ "sum(ERR2354167) as ERR2354167, sum(ERR2354168) as ERR2354168, sum(ERR2354169) as ERR2354169, "
			+ "sum(ERR2354543) as ERR2354543, sum(ERR2354544) as ERR2354544, sum(ERR2354545) as ERR2354545, "
			+ "sum(ERR2354546) as ERR2354546, sum(ERR2354547) as ERR2354547, sum(ERR2354548) as ERR2354548, "
			+ "sum (ERR2354549) as ERR2354549, sum(ERR2354550) as ERR2354550, sum(ERR2354551) as ERR2354551, "
			+ "sum(ERR2354552) as ERR2354552, sum(ERR2354553) as ERR2354553, sum(ERR2354554) as ERR2354554, "
			+ "sum(ERR2354555) as ERR2354555 FROM Lung_parenchyma_A")
	public Map <String, Double> getSum();
}
