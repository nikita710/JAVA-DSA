package com.java.dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public void addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex1) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
        }
    }

    public void removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
        }
    }

    public void removeVertex(String vertex) {
        if (adjList.get(vertex) != null) {
            for (String temp : adjList.get(vertex)) {
                adjList.get(temp).remove(vertex);
            }
            adjList.remove(vertex);
        }
    }


}
