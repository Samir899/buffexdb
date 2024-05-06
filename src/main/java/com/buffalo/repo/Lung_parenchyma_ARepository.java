package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Lung_parenchyma_A;

public interface Lung_parenchyma_ARepository extends CrudRepository<Lung_parenchyma_A, Integer>{
	
	@Query("SELECT u FROM Lung_parenchyma_A u WHERE u.ERR2352688>=:lowerLimit and u.ERR2352689>=:lowerLimit and u.ERR2352690>=:lowerLimit and u.ERR2352691>=:lowerLimit and u.ERR2352692>=:lowerLimit and u.ERR2352693>=:lowerLimit and u.ERR2352694>=:lowerLimit and u.ERR2352695>=:lowerLimit and u.ERR2352696>=:lowerLimit and u.ERR2352697>=:lowerLimit and u.ERR2352698>=:lowerLimit and u.ERR2352699>=:lowerLimit and u.ERR2352700>=:lowerLimit and u.ERR2352701>=:lowerLimit and u.ERR2352702>=:lowerLimit and u.ERR2352703>=:lowerLimit and u.ERR2352704>=:lowerLimit and u.ERR2352705>=:lowerLimit and u.ERR2352706>=:lowerLimit and u.ERR2352707>=:lowerLimit and u.ERR2352708>=:lowerLimit and u.ERR2352709>=:lowerLimit and u.ERR2352710>=:lowerLimit and u.ERR2352876>=:lowerLimit and u.ERR2352877>=:lowerLimit and u.ERR2352878>=:lowerLimit and u.ERR2352879>=:lowerLimit and u.ERR2352880>=:lowerLimit and u.ERR2352881>=:lowerLimit and u.ERR2352882>=:lowerLimit and u.ERR2352883>=:lowerLimit and u.ERR2352884>=:lowerLimit and u.ERR2353287>=:lowerLimit and u.ERR2353288>=:lowerLimit and u.ERR2353289>=:lowerLimit and u.ERR2353290>=:lowerLimit and u.ERR2353291>=:lowerLimit and u.ERR2353292>=:lowerLimit and u.ERR2353293>=:lowerLimit and u.ERR2353294>=:lowerLimit and u.ERR2353295>=:lowerLimit and u.ERR2353296>=:lowerLimit and u.ERR2353297>=:lowerLimit and u.ERR2353298>=:lowerLimit and u.ERR2353299>=:lowerLimit and u.ERR2353300>=:lowerLimit and u.ERR2353301>=:lowerLimit and u.ERR2353302>=:lowerLimit and u.ERR2353303>=:lowerLimit and u.ERR2353304>=:lowerLimit and u.ERR2353305>=:lowerLimit and u.ERR2353306>=:lowerLimit and u.ERR2353307>=:lowerLimit and u.ERR2353308>=:lowerLimit and u.ERR2353309>=:lowerLimit and u.ERR2353727>=:lowerLimit and u.ERR2353728>=:lowerLimit and u.ERR2353729>=:lowerLimit and u.ERR2353730>=:lowerLimit and u.ERR2353731>=:lowerLimit and u.ERR2353732>=:lowerLimit and u.ERR2353733>=:lowerLimit and u.ERR2353734>=:lowerLimit and u.ERR2353735>=:lowerLimit and u.ERR2354147>=:lowerLimit and u.ERR2354148>=:lowerLimit and u.ERR2354149>=:lowerLimit and u.ERR2354150>=:lowerLimit and u.ERR2354151>=:lowerLimit and u.ERR2354152>=:lowerLimit and u.ERR2354153>=:lowerLimit and u.ERR2354154>=:lowerLimit and u.ERR2354155>=:lowerLimit and u.ERR2354156>=:lowerLimit and u.ERR2354157>=:lowerLimit and u.ERR2354158>=:lowerLimit and u.ERR2354159>=:lowerLimit and u.ERR2354160>=:lowerLimit and u.ERR2354161>=:lowerLimit and u.ERR2354162>=:lowerLimit and u.ERR2354163>=:lowerLimit and u.ERR2354164>=:lowerLimit and u.ERR2354165>=:lowerLimit and u.ERR2354166>=:lowerLimit and u.ERR2354167>=:lowerLimit and u.ERR2354168>=:lowerLimit and u.ERR2354169>=:lowerLimit and u.ERR2354543>=:lowerLimit and u.ERR2354544>=:lowerLimit and u.ERR2354545>=:lowerLimit and u.ERR2354546>=:lowerLimit and u.ERR2354547>=:lowerLimit and u.ERR2354548>=:lowerLimit and u.ERR2354549>=:lowerLimit and u.ERR2354550>=:lowerLimit and u.ERR2354551>=:lowerLimit and u.ERR2354552>=:lowerLimit and u.ERR2354553>=:lowerLimit and u.ERR2354554>=:lowerLimit and u.ERR2354555>=:lowerLimit and "
			+ "u.ERR2352688<=:upperLimit and u.ERR2352689<=:upperLimit and u.ERR2352690<=:upperLimit and u.ERR2352691<=:upperLimit and u.ERR2352692<=:upperLimit and u.ERR2352693<=:upperLimit and u.ERR2352694<=:upperLimit and u.ERR2352695<=:upperLimit and u.ERR2352696<=:upperLimit and u.ERR2352697<=:upperLimit and u.ERR2352698<=:upperLimit and u.ERR2352699<=:upperLimit and u.ERR2352700<=:upperLimit and u.ERR2352701<=:upperLimit and u.ERR2352702<=:upperLimit and u.ERR2352703<=:upperLimit and u.ERR2352704<=:upperLimit and u.ERR2352705<=:upperLimit and u.ERR2352706<=:upperLimit and u.ERR2352707<=:upperLimit and u.ERR2352708<=:upperLimit and u.ERR2352709<=:upperLimit and u.ERR2352710<=:upperLimit and u.ERR2352876<=:upperLimit and u.ERR2352877<=:upperLimit and u.ERR2352878<=:upperLimit and u.ERR2352879<=:upperLimit and u.ERR2352880<=:upperLimit and u.ERR2352881<=:upperLimit and u.ERR2352882<=:upperLimit and u.ERR2352883<=:upperLimit and u.ERR2352884<=:upperLimit and u.ERR2353287<=:upperLimit and u.ERR2353288<=:upperLimit and u.ERR2353289<=:upperLimit and u.ERR2353290<=:upperLimit and u.ERR2353291<=:upperLimit and u.ERR2353292<=:upperLimit and u.ERR2353293<=:upperLimit and u.ERR2353294<=:upperLimit and u.ERR2353295<=:upperLimit and u.ERR2353296<=:upperLimit and u.ERR2353297<=:upperLimit and u.ERR2353298<=:upperLimit and u.ERR2353299<=:upperLimit and u.ERR2353300<=:upperLimit and u.ERR2353301<=:upperLimit and u.ERR2353302<=:upperLimit and u.ERR2353303<=:upperLimit and u.ERR2353304<=:upperLimit and u.ERR2353305<=:upperLimit and u.ERR2353306<=:upperLimit and u.ERR2353307<=:upperLimit and u.ERR2353308<=:upperLimit and u.ERR2353309<=:upperLimit and u.ERR2353727<=:upperLimit and u.ERR2353728<=:upperLimit and u.ERR2353729<=:upperLimit and u.ERR2353730<=:upperLimit and u.ERR2353731<=:upperLimit and u.ERR2353732<=:upperLimit and u.ERR2353733<=:upperLimit and u.ERR2353734<=:upperLimit and u.ERR2353735<=:upperLimit and u.ERR2354147<=:upperLimit and u.ERR2354148<=:upperLimit and u.ERR2354149<=:upperLimit and u.ERR2354150<=:upperLimit and u.ERR2354151<=:upperLimit and u.ERR2354152<=:upperLimit and u.ERR2354153<=:upperLimit and u.ERR2354154<=:upperLimit and u.ERR2354155<=:upperLimit and u.ERR2354156<=:upperLimit and u.ERR2354157<=:upperLimit and u.ERR2354158<=:upperLimit and u.ERR2354159<=:upperLimit and u.ERR2354160<=:upperLimit and u.ERR2354161<=:upperLimit and u.ERR2354162<=:upperLimit and u.ERR2354163<=:upperLimit and u.ERR2354164<=:upperLimit and u.ERR2354165<=:upperLimit and u.ERR2354166<=:upperLimit and u.ERR2354167<=:upperLimit and u.ERR2354168<=:upperLimit and u.ERR2354169<=:upperLimit and u.ERR2354543<=:upperLimit and u.ERR2354544<=:upperLimit and u.ERR2354545<=:upperLimit and u.ERR2354546<=:upperLimit and u.ERR2354547<=:upperLimit and u.ERR2354548<=:upperLimit and u.ERR2354549<=:upperLimit and u.ERR2354550<=:upperLimit and u.ERR2354551<=:upperLimit and u.ERR2354552<=:upperLimit and u.ERR2354553<=:upperLimit and u.ERR2354554<=:upperLimit and u.ERR2354555<=:upperLimit "
			+ "ORDER BY ERR2352688, ERR2352689, ERR2352690, ERR2352691, ERR2352692, ERR2352693, ERR2352694, ERR2352695, ERR2352696, ERR2352697, ERR2352698, ERR2352699, ERR2352700, ERR2352701, ERR2352702, ERR2352703, ERR2352704, ERR2352705, ERR2352706, ERR2352707, ERR2352708, ERR2352709, ERR2352710, ERR2352876, ERR2352877, ERR2352878, ERR2352879, ERR2352880, ERR2352881, ERR2352882, ERR2352883, ERR2352884, ERR2353287, ERR2353288, ERR2353289, ERR2353290, ERR2353291, ERR2353292, ERR2353293, ERR2353294, ERR2353295, ERR2353296, ERR2353297, ERR2353298, ERR2353299, ERR2353300, ERR2353301, ERR2353302, ERR2353303, ERR2353304, ERR2353305, ERR2353306, ERR2353307, ERR2353308, ERR2353309, ERR2353727, ERR2353728, ERR2353729, ERR2353730, ERR2353731, ERR2353732, ERR2353733, ERR2353734, ERR2353735, ERR2354147, ERR2354148, ERR2354149, ERR2354150, ERR2354151, ERR2354152, ERR2354153, ERR2354154, ERR2354155, ERR2354156, ERR2354157, ERR2354158, ERR2354159, ERR2354160, ERR2354161, ERR2354162, ERR2354163, ERR2354164, ERR2354165, ERR2354166, ERR2354167, ERR2354168, ERR2354169, ERR2354543, ERR2354544, ERR2354545, ERR2354546, ERR2354547, ERR2354548, ERR2354549, ERR2354550, ERR2354551, ERR2354552, ERR2354553, ERR2354554, ERR2354555 LIMIT 100")
	public List<Lung_parenchyma_A> getLung_parenchyma_ASorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
