package com.bardi;

public class Router {
    private Boolean isSourceNode = false;
    private int weight = 0;

    public Router(Boolean isSourceNode, int weight) {
        this.isSourceNode = isSourceNode;
        this.weight = weight;
    }

    public Boolean getIsSourceNode() {
        return isSourceNode;
    }

    

    
    
    
}