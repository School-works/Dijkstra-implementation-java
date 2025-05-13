package com.bardi;

import java.util.Random;

public class System {
    Graph graph = new Graph(5);
    
    public void generateGraph() {
    Random rn = new Random();
    int answer = rn.nextInt(5) + 1;

        for (int i = 0 ; i < graph.getAmountOfRouters() ; i++) {
            Router router = new Router(false, answer);
            graph.getRouters().add(i, router);
            graph.checkAmountOfSourceNodes(graph.getRouters()); 
        }
    }
}