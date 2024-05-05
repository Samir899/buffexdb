package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Liver_B;

public interface Liver_BRepository extends CrudRepository<Liver_B, Integer>{

	@Query("SELECT u FROM Liver_B u WHERE u.ERR2354534 >= :lowerLimit and u.ERR2354535 >= :lowerLimit and u.ERR2354536 >= :lowerLimit and u.ERR2354537 >= :lowerLimit and u.ERR2354538 >= :lowerLimit and u.ERR2354539 >= :lowerLimit"
			+ " and u.ERR2354540 >= :lowerLimit and u.ERR2354541 >= :lowerLimit and u.ERR2354542 >= :lowerLimit and u.ERR2354784 >= :lowerLimit and u.ERR2354785 >= :lowerLimit and u.ERR2354786 >= :lowerLimit and u.ERR2354787 >= :lowerLimit"
			+ " and u.ERR2354788 >= :lowerLimit and u.ERR2354789 >= :lowerLimit and u.ERR2354790 >= :lowerLimit and u.ERR2354791 >= :lowerLimit and u.ERR2354792 >= :lowerLimit and u.ERR2354793 >= :lowerLimit and u.ERR2354794 >= :lowerLimit"
			+ " and u.ERR2354795 >= :lowerLimit and u.ERR2354796 >= :lowerLimit and u.ERR2354797 >= :lowerLimit and u.ERR2354798 >= :lowerLimit and u.ERR2354799 >= :lowerLimit and u.ERR2354800 >= :lowerLimit and u.ERR2354801 >= :lowerLimit"
			+ " and u.ERR2354802 >= :lowerLimit and u.ERR2354803 >= :lowerLimit and u.ERR2354804 >= :lowerLimit and u.ERR2354805 >= :lowerLimit and u.ERR2354806 >= :lowerLimit and u.ERR2354962 >= :lowerLimit and u.ERR2354963 >= :lowerLimit"
			+ " and u.ERR2354964 >= :lowerLimit and u.ERR2354965 >= :lowerLimit and u.ERR2354966 >= :lowerLimit and u.ERR2354967 >= :lowerLimit and u.ERR2354968 >= :lowerLimit and u.ERR2354969 >= :lowerLimit and u.ERR2354970 >= :lowerLimit"
			+ " and u.ERR2354971 >= :lowerLimit and u.ERR2354972 >= :lowerLimit and u.ERR2354973 >= :lowerLimit and u.ERR2354974 >= :lowerLimit and u.ERR2354975 >= :lowerLimit and u.ERR2354976 >= :lowerLimit and u.ERR2354977 >= :lowerLimit"
			+ " and u.ERR2354978 >= :lowerLimit and u.ERR2354979 >= :lowerLimit and u.ERR2354980 >= :lowerLimit and u.ERR2354981 >= :lowerLimit and u.ERR2354982 >= :lowerLimit and u.ERR2354983 >= :lowerLimit and u.ERR2354984 >= :lowerLimit"
			+ " and u.ERR315642 >= :lowerLimit and u.SRR15721758 >= :lowerLimit and u.SRR24057929 >= :lowerLimit and u.SRR24057931 >= :lowerLimit and u.SRR24057932 >= :lowerLimit and u.SRR24057933 >= :lowerLimit and u.SRR4181744 >= :lowerLimit"
			+ " and u.SRR4181754 >= :lowerLimit and u.SRR4181757 >= :lowerLimit and u.SRR4181761 >= :lowerLimit and u.SRR4181765 >= :lowerLimit and u.SRR4181770 >= :lowerLimit and u.SRR4181774 >= :lowerLimit and u.SRR4183457 >= :lowerLimit"
			+ " and u.SRR4183458 >= :lowerLimit and u.SRR4183461 >= :lowerLimit and u.SRR4183463 >= :lowerLimit and u.SRR4183466 >= :lowerLimit and u.SRR4183467 >= :lowerLimit and u.SRR4183491 >= :lowerLimit and u.SRR4184632 >= :lowerLimit"
			+ " and u.SRR4184633 >= :lowerLimit and u.SRR4184634 >= :lowerLimit and u.SRR4195884 >= :lowerLimit and u.SRR4212918 >= :lowerLimit and u.ERR2354534 <= :upperLimit and u.ERR2354535 <= :upperLimit and u.ERR2354536 <= :upperLimit"
			+ " and u.ERR2354537 <= :upperLimit and u.ERR2354538 <= :upperLimit and u.ERR2354539 <= :upperLimit and u.ERR2354540 <= :upperLimit and u.ERR2354541 <= :upperLimit and u.ERR2354542 <= :upperLimit and u.ERR2354784 <= :upperLimit"
			+ " and u.ERR2354785 <= :upperLimit and u.ERR2354786 <= :upperLimit and u.ERR2354787 <= :upperLimit and u.ERR2354788 <= :upperLimit and u.ERR2354789 <= :upperLimit and u.ERR2354790 <= :upperLimit and u.ERR2354791 <= :upperLimit"
			+ " and u.ERR2354792 <= :upperLimit and u.ERR2354793 <= :upperLimit and u.ERR2354794 <= :upperLimit and u.ERR2354795 <= :upperLimit and u.ERR2354796 <= :upperLimit and u.ERR2354797 <= :upperLimit and u.ERR2354798 <= :upperLimit"
			+ " and u.ERR2354799 <= :upperLimit and u.ERR2354800 <= :upperLimit and u.ERR2354801 <= :upperLimit and u.ERR2354802 <= :upperLimit and u.ERR2354803 <= :upperLimit and u.ERR2354804 <= :upperLimit and u.ERR2354805 <= :upperLimit"
			+ " and u.ERR2354806 <= :upperLimit and u.ERR2354962 <= :upperLimit and u.ERR2354963 <= :upperLimit and u.ERR2354964 <= :upperLimit and u.ERR2354965 <= :upperLimit and u.ERR2354966 <= :upperLimit and u.ERR2354967 <= :upperLimit"
			+ " and u.ERR2354968 <= :upperLimit and u.ERR2354969 <= :upperLimit and u.ERR2354970 <= :upperLimit and u.ERR2354971 <= :upperLimit and u.ERR2354972 <= :upperLimit and u.ERR2354973 <= :upperLimit and u.ERR2354974 <= :upperLimit"
			+ " and u.ERR2354975 <= :upperLimit and u.ERR2354976 <= :upperLimit and u.ERR2354977 <= :upperLimit and u.ERR2354978 <= :upperLimit and u.ERR2354979 <= :upperLimit and u.ERR2354980 <= :upperLimit and u.ERR2354981 <= :upperLimit"
			+ " and u.ERR2354982 <= :upperLimit and u.ERR2354983 <= :upperLimit and u.ERR2354984 <= :upperLimit and u.ERR315642 <= :upperLimit and u.SRR15721758 <= :upperLimit and u.SRR24057929 <= :upperLimit and u.SRR24057931 <= :upperLimit"
			+ " and u.SRR24057932 <= :upperLimit and u.SRR24057933 <= :upperLimit and u.SRR4181744 <= :upperLimit and u.SRR4181754 <= :upperLimit and u.SRR4181757 <= :upperLimit and u.SRR4181761 <= :upperLimit and u.SRR4181765 <= :upperLimit"
			+ " and u.SRR4181770 <= :upperLimit and u.SRR4181774 <= :upperLimit and u.SRR4183457 <= :upperLimit and u.SRR4183458 <= :upperLimit and u.SRR4183461 <= :upperLimit and u.SRR4183463 <= :upperLimit and u.SRR4183466 <= :upperLimit"
			+ " and u.SRR4183467 <= :upperLimit and u.SRR4183491 <= :upperLimit and u.SRR4184632 <= :upperLimit and u.SRR4184633 <= :upperLimit and u.SRR4184634 <= :upperLimit and u.SRR4195884 <= :upperLimit and u.SRR4212918 <= :upperLimit"
			+ " ORDER BY ERR2354534, ERR2354535, ERR2354536, ERR2354537, ERR2354538, ERR2354539, ERR2354540, ERR2354541, ERR2354542, ERR2354784, ERR2354785, ERR2354786, ERR2354787, ERR2354788, ERR2354789, ERR2354790, ERR2354791, ERR2354792, ERR2354793, ERR2354794, ERR2354795, ERR2354796, ERR2354797, ERR2354798, ERR2354799, ERR2354800, ERR2354801, ERR2354802, ERR2354803, ERR2354804, ERR2354805, ERR2354806, ERR2354962, ERR2354963, ERR2354964, ERR2354965, ERR2354966, ERR2354967, ERR2354968, ERR2354969, ERR2354970, ERR2354971, ERR2354972, ERR2354973, ERR2354974, ERR2354975, ERR2354976, ERR2354977, ERR2354978, ERR2354979, ERR2354980, ERR2354981, ERR2354982, ERR2354983, ERR2354984, ERR315642, SRR15721758, SRR24057929, SRR24057931, SRR24057932, SRR24057933, SRR4181744, SRR4181754, SRR4181757, SRR4181761, SRR4181765, SRR4181770, SRR4181774, SRR4183457, SRR4183458, SRR4183461, SRR4183463, SRR4183466, SRR4183467, SRR4183491, SRR4184632, SRR4184633, SRR4184634, SRR4195884, SRR4212918 LIMIT 50")
	public List<Liver_B> getLiver_BSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(ERR2354534) as ERR2354534, sum(ERR2354535) as ERR2354535, sum(ERR2354536) as ERR2354536, sum(ERR2354537) as ERR2354537, sum(ERR2354538) as ERR2354538, sum(ERR2354539) as ERR2354539, sum(ERR2354540) as ERR2354540, sum(ERR2354541) as ERR2354541, sum(ERR2354542) as ERR2354542, sum(ERR2354784) as ERR2354784, sum(ERR2354785) as ERR2354785, sum(ERR2354786) as ERR2354786, sum(ERR2354787) as ERR2354787, "
			+ "sum(ERR2354788) as ERR2354788, sum(ERR2354789) as ERR2354789, sum(ERR2354790) as ERR2354790, sum(ERR2354791) as ERR2354791, sum(ERR2354792) as ERR2354792, sum(ERR2354793) as ERR2354793, sum(ERR2354794) as ERR2354794, sum(ERR2354795) as ERR2354795, sum(ERR2354796) as ERR2354796, sum(ERR2354797) as ERR2354797, sum(ERR2354798) as ERR2354798, sum(ERR2354799) as ERR2354799, sum(ERR2354800) as ERR2354800, sum(ERR2354801)"
			+ " as ERR2354801, sum(ERR2354802) as ERR2354802, sum(ERR2354803) as ERR2354803, sum(ERR2354804) as ERR2354804, sum(ERR2354805) as ERR2354805, sum(ERR2354806) as ERR2354806, sum(ERR2354962) as ERR2354962, sum(ERR2354963) as ERR2354963, sum(ERR2354964) as ERR2354964, sum(ERR2354965) as ERR2354965, sum(ERR2354966) as ERR2354966, sum(ERR2354967) as ERR2354967, sum(ERR2354968) as ERR2354968, sum(ERR2354969) as ERR2354969,"
			+ " sum(ERR2354970) as ERR2354970, sum(ERR2354971) as ERR2354971, sum(ERR2354972) as ERR2354972, sum(ERR2354973) as ERR2354973, sum(ERR2354974) as ERR2354974, sum(ERR2354975) as ERR2354975, sum(ERR2354976) as ERR2354976, sum(ERR2354977) as ERR2354977, sum(ERR2354978) as ERR2354978, sum(ERR2354979) as ERR2354979, sum(ERR2354980) as ERR2354980, sum(ERR2354981) as ERR2354981, sum(ERR2354982) as ERR2354982, sum(ERR2354983) as ERR2354983,"
			+ " sum(ERR2354984) as ERR2354984, sum(ERR315642) as ERR315642, sum(SRR15721758) as SRR15721758, sum(SRR24057929) as SRR24057929, sum(SRR24057931) as SRR24057931, sum(SRR24057932) as SRR24057932, sum(SRR24057933) as SRR24057933, sum(SRR4181744) as SRR4181744, sum(SRR4181754) as SRR4181754, sum(SRR4181757) as SRR4181757, sum(SRR4181761) as SRR4181761, sum(SRR4181765) as SRR4181765, sum(SRR4181770) as SRR4181770, sum(SRR4181774) as SRR4181774,"
			+ " sum(SRR4183457) as SRR4183457, sum(SRR4183458) as SRR4183458, sum(SRR4183461) as SRR4183461, sum(SRR4183463) as SRR4183463, sum(SRR4183466) as SRR4183466, sum(SRR4183467) as SRR4183467, sum(SRR4183491) as SRR4183491, sum(SRR4184632) as SRR4184632, sum(SRR4184633) as SRR4184633, sum(SRR4184634) as SRR4184634, sum(SRR4195884) as SRR4195884, sum(SRR4212918) as SRR4212918 FROM Liver_B")
	public Map <String, Double> getSum();
}
