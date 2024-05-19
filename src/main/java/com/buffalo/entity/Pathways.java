package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pathways")
public class Pathways {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(length = 20)
     private String gene_symbol;
	 
	 @Column(length = 20)
     private String coding_label;
	 
	 @Column(length = 20)
     private String no_of_EC;
	 
	 @Column(length = 20)
     private String no_of_KO;
	 
	 @Column(length = 20)
     private String no_of_pathways;
	 
//	 @Column(length = 600)
//     private String pathways;
	 
	 @Column(length = 600)
     private String pathway_id;
	 
	 @Column(length = 200)
     private String uniprot_proteins;
	 
	 @Column(length = 200)
     private String enzyme_code;
	 
	 @Column(length = 200)
     private String kegg_ortholog;
	 
	 @Column(length = 200)
     private String gene_name;
	 
	 @Column(length = 300)
     private String panther_family;
	 
	 @Column(length = 300)
     private String panther_protein_class;
	 

	public Pathways() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pathways(int id, String geneId, String gene_symbol, String no_of_EC, String no_of_KO, String no_of_pathways,
			String pathway_id, String uniprot_proteins, String enzyme_code, String kegg_ortholog,
			String gene_name, String panther_family, String panther_protein_class, String coding_label) {
		super();
		this.id = id;
		this.geneId = geneId;
		this.gene_symbol = gene_symbol;
		this.coding_label = coding_label;
		this.no_of_EC = no_of_EC;
		this.no_of_KO = no_of_KO;
		this.no_of_pathways = no_of_pathways;
//		this.pathways = pathways;
		this.pathway_id = pathway_id;
		this.uniprot_proteins = uniprot_proteins;
		this.enzyme_code = enzyme_code;
		this.kegg_ortholog = kegg_ortholog;
		this.gene_name = gene_name;
		this.panther_family = panther_family;
		this.panther_protein_class = panther_protein_class;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneId() {
		return geneId;
	}

	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}

	public String getGene_symbol() {
		return gene_symbol;
	}

	public void setGene_symbol(String gene_symbol) {
		this.gene_symbol = gene_symbol;
	}

	public String getCoding_label() {
		return coding_label;
	}

	public void setCoding_label(String coding_label) {
		this.coding_label = coding_label;
	}
	
	public String getNo_of_EC() {
		return no_of_EC;
	}

	public void setNo_of_EC(String no_of_EC) {
		this.no_of_EC = no_of_EC;
	}

	public String getNo_of_KO() {
		return no_of_KO;
	}

	public void setNo_of_KO(String no_of_KO) {
		this.no_of_KO = no_of_KO;
	}

	public String getNo_of_pathways() {
		return no_of_pathways;
	}

	public void setNo_of_pathways(String no_of_pathways) {
		this.no_of_pathways = no_of_pathways;
	}

//	public String getPathways() {
//		return pathways;
//	}
//
//	public void setPathways(String pathways) {
//		this.pathways = pathways;
//	}

	public String getPathway_id() {
		return pathway_id;
	}

	public void setPathway_id(String pathway_id) {
		this.pathway_id = pathway_id;
	}

	public String getUniprot_proteins() {
		return uniprot_proteins;
	}

	public void setUniprot_proteins(String uniprot_proteins) {
		this.uniprot_proteins = uniprot_proteins;
	}

	public String getEnzyme_code() {
		return enzyme_code;
	}

	public void setEnzyme_code(String enzyme_code) {
		this.enzyme_code = enzyme_code;
	}

	public String getKegg_ortholog() {
		return kegg_ortholog;
	}

	public void setKegg_ortholog(String kegg_ortholog) {
		this.kegg_ortholog = kegg_ortholog;
	}

	public String getGene_name() {
		return gene_name;
	}

	public void setGene_name(String gene_name) {
		this.gene_name = gene_name;
	}

	public String getPanther_family() {
		return panther_family;
	}

	public void setPanther_family(String panther_family) {
		this.panther_family = panther_family;
	}

	public String getPanther_protein_class() {
		return panther_protein_class;
	}

	public void setPanther_protein_class(String panther_protein_class) {
		this.panther_protein_class = panther_protein_class;
	}

	@Override
	public String toString() {
		return "Pathways [id=" + id + ", geneId=" + geneId + ", coding_label=" + coding_label + ", gene_symbol=" + gene_symbol + ", no_of_EC=" + no_of_EC
				+ ", no_of_KO=" + no_of_KO + ", no_of_pathways=" + no_of_pathways + ", pathway_id=" + pathway_id + ", uniprot_proteins=" + uniprot_proteins + ", enzyme_code="
				+ enzyme_code + ", kegg_ortholog=" + kegg_ortholog + ", gene_name=" + gene_name + ", panther_family="
				+ panther_family + ", panther_protein_class=" + panther_protein_class + "]";
	}
	 
	 
}
