package com.buffalo.dto;

import java.util.List;
import java.util.Set;

public class TissueRequest {
    private List<String> tissues;
    private List<String> specificities;

    // Getters and Setters
    public List<String> getTissues() {
        return tissues;
    }

    public void setTissues(List<String> tissues) {
        this.tissues = tissues;
    }

    public List<String> getSpecificities() {
        return specificities;
    }

    public void setSpecificities(List<String> specificities) {
        this.specificities = specificities;
    }
}

