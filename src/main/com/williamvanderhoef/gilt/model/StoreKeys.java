package com.williamvanderhoef.gilt.model;

public enum StoreKeys {

    WOMEN("women"),
    MEN("men"),
    KIDS("kids"),
    HOME("home");
    
    private String value;
    
    private StoreKeys(String value)
    {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
