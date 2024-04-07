package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Ileum;
import com.buffalo.entity.Intestine;

public interface IleumRepository extends CrudRepository<Ileum, Integer>{

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
