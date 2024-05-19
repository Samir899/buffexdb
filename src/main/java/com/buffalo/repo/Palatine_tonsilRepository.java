package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Palatine_tonsil;

public interface Palatine_tonsilRepository extends CrudRepository<Palatine_tonsil, Integer>{
	
	@Query("SELECT u FROM Palatine_tonsil u WHERE u.ERR2353587>=:lowerLimit and u.ERR2353588>=:lowerLimit and u.ERR2353589>=:lowerLimit and u.ERR2353590>=:lowerLimit and u.ERR2353591>=:lowerLimit and u.ERR2353592>=:lowerLimit and u.ERR2353593>=:lowerLimit and u.ERR2353594>=:lowerLimit and u.ERR2353595>=:lowerLimit and u.ERR2353861>=:lowerLimit and u.ERR2353862>=:lowerLimit and u.ERR2353863>=:lowerLimit and u.ERR2353864>=:lowerLimit and u.ERR2353865>=:lowerLimit and u.ERR2353866>=:lowerLimit and u.ERR2353867>=:lowerLimit and u.ERR2353868>=:lowerLimit and u.ERR2353869>=:lowerLimit and u.ERR2353870>=:lowerLimit and u.ERR2353871>=:lowerLimit and u.ERR2353872>=:lowerLimit and u.ERR2353873>=:lowerLimit and u.ERR2353874>=:lowerLimit and u.ERR2353875>=:lowerLimit and u.ERR2353876>=:lowerLimit and u.ERR2353010>=:lowerLimit and u.ERR2353011>=:lowerLimit and u.ERR2353012>=:lowerLimit and u.ERR2353013>=:lowerLimit and u.ERR2353014>=:lowerLimit and u.ERR2353015>=:lowerLimit and u.ERR2353016>=:lowerLimit and "
			+ "u.ERR2353587<=:upperLimit and u.ERR2353588<=:upperLimit and u.ERR2353589<=:upperLimit and u.ERR2353590<=:upperLimit and u.ERR2353591<=:upperLimit and u.ERR2353592<=:upperLimit and u.ERR2353593<=:upperLimit and u.ERR2353594<=:upperLimit and u.ERR2353595<=:upperLimit and u.ERR2353861<=:upperLimit and u.ERR2353862<=:upperLimit and u.ERR2353863<=:upperLimit and u.ERR2353864<=:upperLimit and u.ERR2353865<=:upperLimit and u.ERR2353866<=:upperLimit and u.ERR2353867<=:upperLimit and u.ERR2353868<=:upperLimit and u.ERR2353869<=:upperLimit and u.ERR2353870<=:upperLimit and u.ERR2353871<=:upperLimit and u.ERR2353872<=:upperLimit and u.ERR2353873<=:upperLimit and u.ERR2353874<=:upperLimit and u.ERR2353875<=:upperLimit and u.ERR2353876<=:upperLimit and u.ERR2353010<=:upperLimit and u.ERR2353011<=:upperLimit and u.ERR2353012<=:upperLimit and u.ERR2353013<=:upperLimit and u.ERR2353014<=:upperLimit and u.ERR2353015<=:upperLimit and u.ERR2353016<=:upperLimit "
			+ "ORDER BY ERR2353587, ERR2353588, ERR2353589, ERR2353590, ERR2353591, ERR2353592, ERR2353593, ERR2353594, ERR2353595, ERR2353861, ERR2353862, ERR2353863, ERR2353864, ERR2353865, ERR2353866, ERR2353867, ERR2353868, ERR2353869, ERR2353870, ERR2353871, ERR2353872, ERR2353873, ERR2353874, ERR2353875, ERR2353876, ERR2353010, ERR2353011, ERR2353012, ERR2353013, ERR2353014, ERR2353015, ERR2353016 LIMIT 100")
	public List<Palatine_tonsil> getPalatine_tonsilSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353587) as ERR2353587, sum(ERR2353588) as ERR2353588, sum(ERR2353589) as ERR2353589, sum(ERR2353590) as ERR2353590, sum(ERR2353591) as ERR2353591, sum(ERR2353592) as ERR2353592, sum(ERR2353593) as ERR2353593, sum(ERR2353594) as ERR2353594, sum(ERR2353595) as ERR2353595, sum(ERR2353861) as ERR2353861, sum(ERR2353862) as ERR2353862, sum(ERR2353863) as ERR2353863, sum(ERR2353864) as ERR2353864, sum(ERR2353865) as ERR2353865, sum(ERR2353866) as ERR2353866, sum(ERR2353867) as ERR2353867, sum(ERR2353868) as ERR2353868, sum(ERR2353869) as ERR2353869, sum(ERR2353870) as ERR2353870, sum(ERR2353871) as ERR2353871, sum(ERR2353872) as ERR2353872, sum(ERR2353873) as ERR2353873, sum(ERR2353874) as ERR2353874, sum(ERR2353875) as ERR2353875, sum(ERR2353876) as ERR2353876, sum(ERR2353010) as ERR2353010, sum(ERR2353011) as ERR2353011, sum(ERR2353012) as ERR2353012, sum(ERR2353013) as ERR2353013, sum(ERR2353014) as ERR2353014, sum(ERR2353015) as ERR2353015, sum(ERR2353016) as ERR2353016 FROM Palatine_tonsil")
	public Map <String, Double> getSum();
}
