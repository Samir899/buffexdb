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
import com.buffalo.entity.PB_lymphocyte;

public interface PB_lymphocyteRepository extends CrudRepository<PB_lymphocyte, Integer>{
	
	@Query("SELECT u FROM PB_lymphocyte u WHERE u.SRR7589954>=:lowerLimit and u.SRR7589955>=:lowerLimit and u.SRR7589956>=:lowerLimit and u.SRR7589957>=:lowerLimit and u.SRR7589958>=:lowerLimit and u.SRR7589959>=:lowerLimit and u.SRR7589960>=:lowerLimit and u.SRR7589961>=:lowerLimit and u.SRR7589962>=:lowerLimit and u.SRR7589963>=:lowerLimit and u.SRR7589964>=:lowerLimit and u.SRR7589965>=:lowerLimit and u.SRR7589966>=:lowerLimit and u.SRR7589967>=:lowerLimit and u.SRR7589968>=:lowerLimit and u.SRR7589969>=:lowerLimit and u.SRR7589970>=:lowerLimit and u.SRR7589971>=:lowerLimit and "
			+ "u.SRR7589954<=:upperLimit and u.SRR7589955<=:upperLimit and u.SRR7589956<=:upperLimit and u.SRR7589957<=:upperLimit and u.SRR7589958<=:upperLimit and u.SRR7589959<=:upperLimit and u.SRR7589960<=:upperLimit and u.SRR7589961<=:upperLimit and u.SRR7589962<=:upperLimit and u.SRR7589963<=:upperLimit and u.SRR7589964<=:upperLimit and u.SRR7589965<=:upperLimit and u.SRR7589966<=:upperLimit and u.SRR7589967<=:upperLimit and u.SRR7589968<=:upperLimit and u.SRR7589969<=:upperLimit and u.SRR7589970<=:upperLimit and u.SRR7589971<=:upperLimit "
			+ "ORDER BY SRR7589954, SRR7589955, SRR7589956, SRR7589957, SRR7589958, SRR7589959, SRR7589960, SRR7589961, SRR7589962, SRR7589963, SRR7589964, SRR7589965, SRR7589966, SRR7589967, SRR7589968, SRR7589969, SRR7589970, SRR7589971 LIMIT 100")
	public List<PB_lymphocyte> getPB_lymphocyteSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR7589954) as SRR7589954, sum(SRR7589955) as SRR7589955, sum(SRR7589956) as SRR7589956, sum(SRR7589957) as SRR7589957, sum(SRR7589958) as SRR7589958, sum(SRR7589959) as SRR7589959, sum(SRR7589960) as SRR7589960, sum(SRR7589961) as SRR7589961, sum(SRR7589962) as SRR7589962, sum(SRR7589963) as SRR7589963, sum(SRR7589964) as SRR7589964, sum(SRR7589965) as SRR7589965, sum(SRR7589966) as SRR7589966, sum(SRR7589967) as SRR7589967, sum(SRR7589968) as SRR7589968, sum(SRR7589969) as SRR7589969, sum(SRR7589970) as SRR7589970, sum(SRR7589971) as SRR7589971 FROM PB_lymphocyte")
	public Map <String, Double> getSum();
}
