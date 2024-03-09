package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SampleDescription")
public class SampleDescription {

	@Id
	private String run;
	
	@Column(length=60)
	private String bioProject;
	
	@Column(length=60)
	private String bioSample;
	
	@Column(length=60)
	private String tissue;
	
	//@Column(length=60)
	//private String additional_info;
	
	@Column(length=60)
	private String condition_treatment;
	
//	@Column(length=60)
//	private String source;
	
	@Column(length=60)
	private String sub_species;
	
	@Column(length=60)
	private String breed;
	
	@Column(length=60)
	private String gender;
	
	@Column(length=60)
	private String development_stage;
	
	@Column(length=60)
	private String category;
	
	@Column(length=60)
	private String age;
	
	@Column(length=60)
	private String library_layout;

	public SampleDescription() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SampleDescription(String run, String bioProject, String bioSample, String tissue, String additional_info,
			String condition_treatment, String source, String species, String breed, String gender,
			String development_stage, String library_layout, String category) {
		super();
		this.run = run;
		this.bioProject = bioProject;
		this.bioSample = bioSample;
		this.tissue = tissue;
//		this.additional_info = additional_info;
		this.condition_treatment = condition_treatment;
//		this.source = source;
		this.sub_species = species;
		this.breed = breed;
		this.gender = gender;
		this.development_stage = development_stage;
		this.library_layout = library_layout;
		this.category = category;
	}



	public String getRun() {
		return run;
	}



	public void setRun(String run) {
		this.run = run;
	}



	public String getBioProject() {
		return bioProject;
	}



	public void setBioProject(String bioProject) {
		this.bioProject = bioProject;
	}



	public String getBioSample() {
		return bioSample;
	}



	public void setBioSample(String bioSample) {
		this.bioSample = bioSample;
	}



	public String getTissue() {
		return tissue;
	}



	public void setTissue(String tissue) {
		this.tissue = tissue;
	}


//
//	public String getAdditional_info() {
//		return additional_info;
//	}



//	public void setAdditional_info(String additional_info) {
//		this.additional_info = additional_info;
//	}



	public String getCondition_treatment() {
		return condition_treatment;
	}



	public void setCondition_treatment(String condition_treatment) {
		this.condition_treatment = condition_treatment;
	}



//	public String getSource() {
//		return source;
//	}



//	public void setSource(String source) {
//		this.source = source;
//	}



	public String getSpecies() {
		return sub_species;
	}



	public void setSpecies(String sub_species) {
		this.sub_species = sub_species;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDevelopment_stage() {
		return development_stage;
	}



	public void setDevelopment_stage(String development_stage) {
		this.development_stage = development_stage;
	}

	
	public static String getHeaders() {
		return "run,bioProject,bioSample,tissue,additional_info,condition_treatment,source,species,breed,gender,development_stage";
	}
	
	
	@Override
	  public String toString(){
	        StringBuilder dataBuilder = new StringBuilder();
	        appendFieldValue(dataBuilder, run);
	        appendFieldValue(dataBuilder, bioProject);
	        appendFieldValue(dataBuilder, bioSample);
	        appendFieldValue(dataBuilder, tissue);
//	        appendFieldValue(dataBuilder, additional_info);
	        appendFieldValue(dataBuilder, condition_treatment);
//	        appendFieldValue(dataBuilder, source);
	        appendFieldValue(dataBuilder, sub_species);
	        appendFieldValue(dataBuilder, breed);
	        appendFieldValue(dataBuilder, gender);
	        appendFieldValue(dataBuilder, development_stage);
	        appendFieldValue(dataBuilder, category);
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
