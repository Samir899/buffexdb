package com.buffalo.repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;
import com.buffalo.entity.Genes;
import org.springframework.data.domain.Page;
public interface GeneRepoPagingAndSorting extends PagingAndSortingRepository<Genes, String>{
	
	@Query("SELECT u FROM Genes u WHERE u.geneName = :geneName")
	public Page<Genes> getGeneByGeneName(@Param("geneName") String geneName, Pageable pageable);
	
	@Query("SELECT u FROM Genes u WHERE u.chromosome = :chromosome")
	public Page<Genes> getGeneByChromosome(@Param("chromosome") String chromosome, Pageable pageable);
	
	@Query("SELECT u FROM Genes u WHERE u.strand = :strand")
	public Page<Genes> getGeneByStrand(@Param("strand") String strand, Pageable pageable);
}
