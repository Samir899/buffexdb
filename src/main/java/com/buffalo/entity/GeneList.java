package com.buffalo.entity;

import java.util.List;

public class GeneList {
	
	private List<String> geneIds;

	
	
	public GeneList(List<String> geneIds) {
		super();
		this.geneIds = geneIds;
	}

	public List<String> getGeneIds() {
		return geneIds;
	}

	public void setGeneIds(List<String> geneIds) {
		this.geneIds = geneIds;
	}
	
	

}
