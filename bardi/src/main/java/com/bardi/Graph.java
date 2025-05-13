package com.bardi;

import java.util.ArrayList;

public class Graph {
    
    private int amountOfRouters;
    private ArrayList<Router> routers = new ArrayList<>();

    public Graph(int amountOfRouters) {
        this.amountOfRouters = amountOfRouters;
    }

    public int checkAmountOfSourceNodes(ArrayList<Router> routers) {
        int amountOfSourceNodes = 0;
        for (int i = 0; i < routers.size(); i++) {
            if (routers.get(i).getIsSourceNode()) {
                amountOfSourceNodes++;
            }
        }
        return amountOfSourceNodes;
    }

    public int getAmountOfRouters() {
        return amountOfRouters;
    }

    public ArrayList<Router> getRouters() {
        return routers;
    }

    
}
