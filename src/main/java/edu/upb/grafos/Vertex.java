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
class Vertex {
    String data;
    ArrayList<Edge> edges;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public Vertex(String data) {
        this.data = data;
        this.edges=new ArrayList<Edge>();
        
    }
    public void addEdge(Vertex endVertex, Integer weight){
    this.edges.add(new Edge(this, endVertex,weight));
    }
    public void removeEdge(Vertex endVertex){
    this.edges.removeIf(edge ->edge.getEnd().equals(endVertex));
    }
    public void print(boolean confirm){
    
        if(confirm==true){
        
            System.out.println(data);
        }else{
        
            System.out.println("no data");
        }
        
    }



}
