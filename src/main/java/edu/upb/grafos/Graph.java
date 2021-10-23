/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.grafos;

import java.util.ArrayList;

/**
 *
 * @author vasqu
 */
public class Graph {
    private ArrayList<Vertex>vertices;
    private boolean isWeighted;
    private boolean isDirected;

    
    public Graph(boolean isWeighted, boolean isDirected) {
        this.vertices=new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public boolean isIsDirected() {
        return isDirected;
    }

    public void setIsDirected(boolean isDirected) {
        this.isDirected = isDirected;
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public boolean isIsWeighted() {
        return isWeighted;
    }

    public void setIsWeighted(boolean isWeighted) {
        this.isWeighted = isWeighted;
    }
    public Vertex addVertex(String data){
    
        Vertex newVertex =new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
        
    }
    public void addEdge(Vertex vertex1,Vertex vertex2,Integer weight){
    
        if(!this.isWeighted){
        
            weight=null;
        }
        vertex1.addEdge(vertex2, weight);
        if(!this.isDirected){
        
            vertex2.addEdge(vertex1, weight);
        }
    }
    public void removeEdge(Vertex vertex1,Vertex vertex2){
    
        vertex1.removeEdge(vertex2);
        if(!this.isDirected){
        
            vertex2.removeEdge(vertex2);
        }
    }
    public void removeVertex(Vertex vertex){
    
        this.vertices.remove(vertex);
    }

    public Vertex getVertexByValue(String value){
    
        for(Vertex v:this.vertices){
        
            if(v.getData()==value){
            return v;
            }
        }
        return null;
    }
    public void print(){
    
        for(Vertex v:this.vertices){
        
            v.print(isWeighted);
        }
    }

}
