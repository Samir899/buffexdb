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
import com.buffalo.entity.Ileum;
import com.buffalo.entity.Intestine;

public interface IleumRepository extends CrudRepository<Ileum, Integer>{
	
	@Query("SELECT u FROM Ileum u WHERE u.ERR2353677>=:lowerLimit and u.ERR2353678>=:lowerLimit and u.ERR2353679>=:lowerLimit and u.ERR2353680>=:lowerLimit and u.ERR2353681>=:lowerLimit and u.ERR2353682>=:lowerLimit and u.ERR2353683>=:lowerLimit and u.ERR2353684>=:lowerLimit and u.ERR2353685>=:lowerLimit and u.ERR2354037>=:lowerLimit and u.ERR2354038>=:lowerLimit and u.ERR2354039>=:lowerLimit and u.ERR2354040>=:lowerLimit and u.ERR2354041>=:lowerLimit and u.ERR2354042>=:lowerLimit and u.ERR2354043>=:lowerLimit and u.ERR2354044>=:lowerLimit and u.ERR2354045>=:lowerLimit and u.ERR2354046>=:lowerLimit and u.ERR2354047>=:lowerLimit and u.ERR2354048>=:lowerLimit and u.ERR2354049>=:lowerLimit and u.ERR2354050>=:lowerLimit and u.ERR2354051>=:lowerLimit and u.ERR2354052>=:lowerLimit and u.ERR2354053>=:lowerLimit and u.ERR2354054>=:lowerLimit and u.ERR2354055>=:lowerLimit and u.ERR2354056>=:lowerLimit and u.ERR2354057>=:lowerLimit and u.ERR2354058>=:lowerLimit and u.ERR2354059>=:lowerLimit and u.ERR2354474>=:lowerLimit and u.ERR2354475>=:lowerLimit and u.ERR2354476>=:lowerLimit and u.ERR2354477>=:lowerLimit and u.ERR2354478>=:lowerLimit and u.ERR2354479>=:lowerLimit and u.ERR2354480>=:lowerLimit and u.ERR2354481>=:lowerLimit and u.ERR2354482>=:lowerLimit and u.ERR2354483>=:lowerLimit and u.ERR2354484>=:lowerLimit and u.ERR2354485>=:lowerLimit and u.ERR2354486>=:lowerLimit and u.ERR2354487>=:lowerLimit and u.ERR2354488>=:lowerLimit and u.ERR2354489>=:lowerLimit and u.ERR2354490>=:lowerLimit and u.ERR2354491>=:lowerLimit and u.ERR2354492>=:lowerLimit and u.ERR2354493>=:lowerLimit and u.ERR2354494>=:lowerLimit and u.ERR2354495>=:lowerLimit and u.ERR2354496>=:lowerLimit and u.ERR2352826>=:lowerLimit and u.ERR2352827>=:lowerLimit and u.ERR2352828>=:lowerLimit and u.ERR2352829>=:lowerLimit and u.ERR2352830>=:lowerLimit and u.ERR2352831>=:lowerLimit and u.ERR2352832>=:lowerLimit and u.ERR2352833>=:lowerLimit and u.ERR2352834>=:lowerLimit and u.ERR2353177>=:lowerLimit and u.ERR2353178>=:lowerLimit and u.ERR2353179>=:lowerLimit and u.ERR2353180>=:lowerLimit and u.ERR2353181>=:lowerLimit and u.ERR2353182>=:lowerLimit and u.ERR2353183>=:lowerLimit and u.ERR2353184>=:lowerLimit and u.ERR2353185>=:lowerLimit and u.ERR2353186>=:lowerLimit and u.ERR2353187>=:lowerLimit and u.ERR2353188>=:lowerLimit and u.ERR2353189>=:lowerLimit and u.ERR2353190>=:lowerLimit and u.ERR2353191>=:lowerLimit and u.ERR2353192>=:lowerLimit and u.ERR2353193>=:lowerLimit and u.ERR2353194>=:lowerLimit and u.ERR2353195>=:lowerLimit and u.ERR2353196>=:lowerLimit and u.ERR2353197>=:lowerLimit and u.ERR2353198>=:lowerLimit and u.ERR2353199>=:lowerLimit and "
			+ "u.ERR2353677<=:upperLimit and u.ERR2353678<=:upperLimit and u.ERR2353679<=:upperLimit and u.ERR2353680<=:upperLimit and u.ERR2353681<=:upperLimit and u.ERR2353682<=:upperLimit and u.ERR2353683<=:upperLimit and u.ERR2353684<=:upperLimit and u.ERR2353685<=:upperLimit and u.ERR2354037<=:upperLimit and u.ERR2354038<=:upperLimit and u.ERR2354039<=:upperLimit and u.ERR2354040<=:upperLimit and u.ERR2354041<=:upperLimit and u.ERR2354042<=:upperLimit and u.ERR2354043<=:upperLimit and u.ERR2354044<=:upperLimit and u.ERR2354045<=:upperLimit and u.ERR2354046<=:upperLimit and u.ERR2354047<=:upperLimit and u.ERR2354048<=:upperLimit and u.ERR2354049<=:upperLimit and u.ERR2354050<=:upperLimit and u.ERR2354051<=:upperLimit and u.ERR2354052<=:upperLimit and u.ERR2354053<=:upperLimit and u.ERR2354054<=:upperLimit and u.ERR2354055<=:upperLimit and u.ERR2354056<=:upperLimit and u.ERR2354057<=:upperLimit and u.ERR2354058<=:upperLimit and u.ERR2354059<=:upperLimit and u.ERR2354474<=:upperLimit and u.ERR2354475<=:upperLimit and u.ERR2354476<=:upperLimit and u.ERR2354477<=:upperLimit and u.ERR2354478<=:upperLimit and u.ERR2354479<=:upperLimit and u.ERR2354480<=:upperLimit and u.ERR2354481<=:upperLimit and u.ERR2354482<=:upperLimit and u.ERR2354483<=:upperLimit and u.ERR2354484<=:upperLimit and u.ERR2354485<=:upperLimit and u.ERR2354486<=:upperLimit and u.ERR2354487<=:upperLimit and u.ERR2354488<=:upperLimit and u.ERR2354489<=:upperLimit and u.ERR2354490<=:upperLimit and u.ERR2354491<=:upperLimit and u.ERR2354492<=:upperLimit and u.ERR2354493<=:upperLimit and u.ERR2354494<=:upperLimit and u.ERR2354495<=:upperLimit and u.ERR2354496<=:upperLimit and u.ERR2352826<=:upperLimit and u.ERR2352827<=:upperLimit and u.ERR2352828<=:upperLimit and u.ERR2352829<=:upperLimit and u.ERR2352830<=:upperLimit and u.ERR2352831<=:upperLimit and u.ERR2352832<=:upperLimit and u.ERR2352833<=:upperLimit and u.ERR2352834<=:upperLimit and u.ERR2353177<=:upperLimit and u.ERR2353178<=:upperLimit and u.ERR2353179<=:upperLimit and u.ERR2353180<=:upperLimit and u.ERR2353181<=:upperLimit and u.ERR2353182<=:upperLimit and u.ERR2353183<=:upperLimit and u.ERR2353184<=:upperLimit and u.ERR2353185<=:upperLimit and u.ERR2353186<=:upperLimit and u.ERR2353187<=:upperLimit and u.ERR2353188<=:upperLimit and u.ERR2353189<=:upperLimit and u.ERR2353190<=:upperLimit and u.ERR2353191<=:upperLimit and u.ERR2353192<=:upperLimit and u.ERR2353193<=:upperLimit and u.ERR2353194<=:upperLimit and u.ERR2353195<=:upperLimit and u.ERR2353196<=:upperLimit and u.ERR2353197<=:upperLimit and u.ERR2353198<=:upperLimit and u.ERR2353199<=:upperLimit "
			+ "ORDER BY ERR2353677, ERR2353678, ERR2353679, ERR2353680, ERR2353681, ERR2353682, ERR2353683, ERR2353684, ERR2353685, ERR2354037, ERR2354038, ERR2354039, ERR2354040, ERR2354041, ERR2354042, ERR2354043, ERR2354044, ERR2354045, ERR2354046, ERR2354047, ERR2354048, ERR2354049, ERR2354050, ERR2354051, ERR2354052, ERR2354053, ERR2354054, ERR2354055, ERR2354056, ERR2354057, ERR2354058, ERR2354059, ERR2354474, ERR2354475, ERR2354476, ERR2354477, ERR2354478, ERR2354479, ERR2354480, ERR2354481, ERR2354482, ERR2354483, ERR2354484, ERR2354485, ERR2354486, ERR2354487, ERR2354488, ERR2354489, ERR2354490, ERR2354491, ERR2354492, ERR2354493, ERR2354494, ERR2354495, ERR2354496, ERR2352826, ERR2352827, ERR2352828, ERR2352829, ERR2352830, ERR2352831, ERR2352832, ERR2352833, ERR2352834, ERR2353177, ERR2353178, ERR2353179, ERR2353180, ERR2353181, ERR2353182, ERR2353183, ERR2353184, ERR2353185, ERR2353186, ERR2353187, ERR2353188, ERR2353189, ERR2353190, ERR2353191, ERR2353192, ERR2353193, ERR2353194, ERR2353195, ERR2353196, ERR2353197, ERR2353198, ERR2353199 LIMIT 100")
	public List<Ileum> getIleumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353677) as ERR2353677, sum(ERR2353678) as ERR2353678, sum(ERR2353679) as ERR2353679, "
			+ "sum(ERR2353680) as ERR2353680, sum(ERR2353681) as ERR2353681, sum(ERR2353682) as ERR2353682, "
			+ "sum(ERR2353683) as ERR2353683, sum(ERR2353684) as ERR2353684, sum(ERR2353685) as ERR2353685, "
			+ "sum(ERR2354037) as ERR2354037, sum(ERR2354038) as ERR2354038, sum(ERR2354039) as ERR2354039, "
			+ "sum(ERR2354040) as ERR2354040, sum(ERR2354041) as ERR2354041, sum(ERR2354042) as ERR2354042, "
			+ "sum(ERR2354043) as ERR2354043, sum(ERR2354044) as ERR2354044, sum(ERR2354045) as ERR2354045, "
			+ "sum(ERR2354046) as ERR2354046, sum(ERR2354047) as ERR2354047, sum(ERR2354048) as ERR2354048, "
			+ "sum(ERR2354049) as ERR2354049, sum(ERR2354050) as ERR2354050, sum(ERR2354051) as ERR2354051, "
			+ "sum(ERR2354052) as ERR2354052, sum(ERR2354053) as ERR2354053, sum(ERR2354054) as ERR2354054, "
			+ "sum(ERR2354055) as ERR2354055, sum(ERR2354056) as ERR2354056, sum(ERR2354057) as ERR2354057, "
			+ "sum(ERR2354058) as ERR2354058, sum(ERR2354059) as ERR2354059, sum(ERR2354474) as ERR2354474, "
			+ "sum(ERR2354475) as ERR2354475, sum(ERR2354476) as ERR2354476, sum(ERR2354477) as ERR2354477, "
			+ "sum(ERR2354478) as ERR2354478, sum(ERR2354479) as ERR2354479, sum(ERR2354480) as ERR2354480, "
			+ "sum(ERR2354481) as ERR2354481, sum(ERR2354482) as ERR2354482, sum(ERR2354483) as ERR2354483, "
			+ "sum(ERR2354484) as ERR2354484, sum(ERR2354485) as ERR2354485, sum(ERR2354486) as ERR2354486, "
			+ "sum(ERR2354487) as ERR2354487, sum(ERR2354488) as ERR2354488, sum(ERR2354489) as ERR2354489, "
			+ "sum(ERR2354490) as ERR2354490, sum(ERR2354491) as ERR2354491, sum(ERR2354492) as ERR2354492, "
			+ "sum(ERR2354493) as ERR2354493, sum(ERR2354494) as ERR2354494, sum(ERR2354495) as ERR2354495, "
			+ "sum(ERR2354496) as ERR2354496, sum(ERR2352826) as ERR2352826, sum(ERR2352827) as ERR2352827, "
			+ "sum(ERR2352828) as ERR2352828, sum(ERR2352829) as ERR2352829, sum(ERR2352830) as ERR2352830, "
			+ "sum(ERR2352831) as ERR2352831, sum(ERR2352832) as ERR2352832, sum(ERR2352833) as ERR2352833, "
			+ "sum(ERR2352834) as ERR2352834, sum(ERR2353177) as ERR2353177, sum(ERR2353178) as ERR2353178, "
			+ "sum(ERR2353179) as ERR2353179, sum(ERR2353180) as ERR2353180, sum(ERR2353181) as ERR2353181, "
			+ "sum(ERR2353182) as ERR2353182, sum(ERR2353183) as ERR2353183, sum(ERR2353184) as ERR2353184, "
			+ "sum(ERR2353185) as ERR2353185, sum(ERR2353186) as ERR2353186, sum(ERR2353187) as ERR2353187, "
			+ "sum(ERR2353188) as ERR2353188, sum(ERR2353189) as ERR2353189, sum(ERR2353190) as ERR2353190, "
			+ "sum(ERR2353191) as ERR2353191, sum(ERR2353192) as ERR2353192, sum(ERR2353193) as ERR2353193, "
			+ "sum(ERR2353194) as ERR2353194, sum(ERR2353195) as ERR2353195, sum(ERR2353196) as ERR2353196, "
			+ "sum(ERR2353197) as ERR2353197, sum(ERR2353198) as ERR2353198, sum(ERR2353199) as ERR2353199 FROM Ileum")
	public Map <String, Double> getSum();
}
