package com.ctci.treesandgraphs;
import java.util.*;

class Graph{
    class Edge{
        int v,w;
        public Edge(int v, int w){
            this.v=v;
            this.w=w;
        }

        @Override
        public String toString(){
            return "("+v+","+w+")";
        }
    }
    List<Edge> G[];

    public Graph(int n){
        G= new LinkedList[n];

        for(int i=0;i<G.length;i++){
            G[i]= new LinkedList<Edge>();
        }
    }

    @Override
    public String toString(){
        String result="";
        for(int i=0;i<G.length;i++){
           result+=i+"=>"+G[i]+"\n";
        }
        return result;
    }

    void addEdge(int u,int v, int w){
        G[u].add(0,new Edge(v,w));
    }
}

public class GraphExample {
    public static void main(String[] args){
        Graph g= new Graph(10);
        System.out.println(g);
    }
}
