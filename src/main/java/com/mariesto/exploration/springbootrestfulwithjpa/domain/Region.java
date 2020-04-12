package com.mariesto.exploration.springbootrestfulwithjpa.domain;

public enum Region {
    CENTRAL_COAST("Central Coast") ,
    SOUTHERN_CALIFORNIA("Southern California"),
    NORTHERN_CALIFORNIA("Northern California"),
    VARIES("Varies");

    private String label;

    Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label){
        for (Region region : Region.values()){
            if(region.label.equalsIgnoreCase(label)){
                return region;
            }
        }
        return null;
    }
}
