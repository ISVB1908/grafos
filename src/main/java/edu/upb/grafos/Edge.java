/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.grafos;

/**
 *
 * @author vasqu
 */
class Edge {
    Vertex start;
    Vertex end;
    Integer weight;
    
    public Edge(Vertex startV,Vertex endV,Integer inputWeight){
    
        this.start=startV;
        this.end=endV;
        this.weight=inputWeight;
    }
    public Vertex getStart(){
    
        return this.start;
    }
    public Vertex getEnd(){
    
        return this.end;
    }
    public Integer getWeight(){
    return this.weight;
    }
    
}
