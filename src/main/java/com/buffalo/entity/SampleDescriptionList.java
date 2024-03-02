package com.buffalo.entity;

import java.util.List;

public class SampleDescriptionList {
	
	private List<String> runIds;

	
	
	public SampleDescriptionList(List<String> runIds) {
		super();
		this.runIds = runIds;
	}

	public List<String> getRunIds() {
		return runIds;
	}

	public void setRunIds(List<String> geneIds) {
		this.runIds = geneIds;
	}
	
	

}
