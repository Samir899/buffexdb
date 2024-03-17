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
	
	@Column(length = 60)
	private String transcriptlength;
	
	@Column(length = 60)
	private String peptide_length;
	
	@Column(length = 60)
	private String coding_probability;
	
	@Column(length = 60)
	private String coding_label;
	
	@Column(length = 60)
	private String num_of_pathway;
	
	@Column(length = 60)
	private String num_of_ET;
	
	@Column(length = 60)
	private String num_of_EC;
	
	@Column(length = 60)
	private String num_of_KO;
	
	@Column(length = 500)
	private String pathways;
	
	@Column(length = 200)
	private String pathway_id;
	
	@Column(length = 60)
	private String Uniprot_proteins;
	
	@Column(length = 60)
	private String enzyme_code;
	
	@Column(length = 60)
	private String KEGG_ortholog;

	public String getPeptide_length() {
		return peptide_length;
	}

	public void setPeptide_length(String peptide_length) {
		this.peptide_length = peptide_length;
	}

	public String getCoding_probability() {
		return coding_probability;
	}

	public void setCoding_probability(String coding_probability) {
		this.coding_probability = coding_probability;
	}

	public String getCoding_label() {
		return coding_label;
	}

	public void setCoding_label(String coding_label) {
		this.coding_label = coding_label;
	}

	public String getNum_of_pathway() {
		return num_of_pathway;
	}

	public void setNum_of_pathway(String num_of_pathway) {
		this.num_of_pathway = num_of_pathway;
	}

	public String getNum_of_ET() {
		return num_of_ET;
	}

	public void setNum_of_ET(String num_of_ET) {
		this.num_of_ET = num_of_ET;
	}

	public String getNum_of_EC() {
		return num_of_EC;
	}

	public void setNum_of_EC(String num_of_EC) {
		this.num_of_EC = num_of_EC;
	}

	public String getNum_of_KO() {
		return num_of_KO;
	}

	public void setNum_of_KO(String num_of_KO) {
		this.num_of_KO = num_of_KO;
	}

	public String getPathways() {
		return pathways;
	}

	public void setPathways(String pathways) {
		this.pathways = pathways;
	}

	public String getPathway_id() {
		return pathway_id;
	}

	public void setPathway_id(String pathway_id) {
		this.pathway_id = pathway_id;
	}

	public String getUniprot_proteins() {
		return Uniprot_proteins;
	}

	public void setUniprot_proteins(String uniprot_proteins) {
		Uniprot_proteins = uniprot_proteins;
	}

	public String getEnzyme_code() {
		return enzyme_code;
	}

	public void setEnzyme_code(String enzyme_code) {
		this.enzyme_code = enzyme_code;
	}

	public String getKEGG_ortholog() {
		return KEGG_ortholog;
	}

	public void setKEGG_ortholog(String kEGG_ortholog) {
		KEGG_ortholog = kEGG_ortholog;
	}

	public String getTranscriptlength() {
		return transcriptlength;
	}

	public void setTranscriptlength(String transcriptlength) {
		this.transcriptlength = transcriptlength;
	}

	public Genes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genes(String geneId, String geneName, String locus, String strand, String chromosome, String transcriptlength, String peptide_length, String coding_probability, String coding_label, String num_of_pathway, String num_of_ET, String num_of_EC, String num_of_KO, String pathways, String pathway_id, String Uniprot_proteins, String enzyme_code, String KEGG_ortholog) {
		super();

		this.geneId = geneId;
		this.geneName = geneName;
		this.locus = locus;
		this.strand = strand;
		this.chromosome = chromosome;
		this.transcriptlength = transcriptlength;
		this.peptide_length = peptide_length;
		this.coding_probability = coding_probability;
		this.coding_label = coding_label;
		this.num_of_pathway = num_of_pathway;
		this.num_of_ET = num_of_ET;
		this.num_of_EC = num_of_EC;
		this.num_of_KO = num_of_KO;
		this.pathways = pathways;
		this.pathway_id = pathway_id;
		this.Uniprot_proteins = Uniprot_proteins;
		this.enzyme_code = enzyme_code;
		this.KEGG_ortholog = KEGG_ortholog;
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
