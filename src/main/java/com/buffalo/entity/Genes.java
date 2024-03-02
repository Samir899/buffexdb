package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Genes")
public class Genes {
	
//	@Id
//	@Column(name="id")
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
	
//	@Column(length = 60, nullable = false, unique = true)
	@Id
	private String geneId;
	
	@Column(length = 60)
	private String geneName;
	
	@Column(length = 60)
	private String locus;
	
	@Column(length = 60)
	private String strand;
	
	@Column(length = 60)
	private String chromosome;
	


	public Genes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genes(String geneId, String geneName, String locus, String strand, String chromosome) {
		super();

		this.geneId = geneId;
		this.geneName = geneName;
		this.locus = locus;
		this.strand = strand;
		this.chromosome = chromosome;
	}


	public String getGeneId() {
		return geneId;
	}


	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}

	public String getGeneName() {
		return geneName;
	}

	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}

	public String getLocus() {
		return locus;
	}

	public void setLocus(String locus) {
		this.locus = locus;
	}

	public String getStrand() {
		return strand;
	}

	public void setStrand(String strand) {
		this.strand = strand;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public static String getHeaders() {
		return "geneId,geneName,locus,strand,chromosome";
	}
	
	
	@Override
	  public String toString(){
	        StringBuilder dataBuilder = new StringBuilder();
	        appendFieldValue(dataBuilder, geneId);
	        appendFieldValue(dataBuilder, geneName);
	        appendFieldValue(dataBuilder, locus);
	        appendFieldValue(dataBuilder, strand);
	        appendFieldValue(dataBuilder, chromosome);

	        return dataBuilder.toString();
	    }

	    private void appendFieldValue(StringBuilder dataBuilder, String fieldValue) {
	        if(fieldValue != null) {
	            dataBuilder.append(fieldValue).append(",");
	        } else {
	            dataBuilder.append("").append(",");
	        }
	    }
	

}
