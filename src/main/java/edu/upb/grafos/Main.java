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
public class Main {
    public static void main(String[] args) {
    Graph miGrafo = new Graph (true, false) ;
    miGrafo . addVertex ( "Bogota") ;
    miGrafo . addVertex ( "Bucaramanga") ;
    miGrafo . addVertex ( "Medellin") ;

    
    Vertex bog = miGrafo.getVertexByValue ("Bogota") ;
    Vertex buc = miGrafo.getVertexByValue ("Bogota") ;
    Vertex med = miGrafo.getVertexByValue ("Medellin") ;

    miGrafo . addEdge (bog, buc, 397) ;
    miGrafo . addEdge (bog, med, 416) ;
    miGrafo . addEdge (med, buc, 392) ;

    miGrafo.print();

    }
}
