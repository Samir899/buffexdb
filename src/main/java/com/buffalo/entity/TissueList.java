package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TissueList")
public class TissueList {
	
	 @Id
	 @Column(name="id")
	  private int id;
	 
	 @Column(name="tissue")
	 private String tissue;
	 
	 @Column(name="url")
	 private String url;

	public TissueList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TissueList(int id, String tissue, String url) {
		super();
		this.id = id;
		this.tissue = tissue;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTissue() {
		return tissue;
	}

	public void setTissue(String tissue) {
		this.tissue = tissue;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "TissueList [id=" + id + ", tissue=" + tissue + ", url=" + url + "]";
	}
	 
	 
	 

}
