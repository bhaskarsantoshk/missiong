package missiong.random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSImplementation {

    static File file = new File("C:\\Users\\KH2254\\IdeaProjects\\MissionG\\src\\missiong\\random\\graphInput.txt");
    static Scanner stdin;

    static {
        try {
            stdin = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int numberOfVertices = stdin.nextInt();
    static int numberOfEdges = stdin.nextInt();
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<ArrayList<Integer>> graph = constructGraph();
        bfs(graph, numberOfVertices, numberOfEdges );
    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph, int numberOfVertices, int numberOfEdges) {
        boolean visited[] = new boolean[numberOfVertices+1];
        Queue<Integer> level = new LinkedList<>();
        level.add(1);
        visited[1] = true;
        int current_size = 0;
        int current_level = 0;
        //BFS
        while (!level.isEmpty()){
            System.out.println("Level :" + current_level);
            current_size = level.size();

            while (current_size > 0 ){
                current_size --;
                int x = level.poll();
                System.out.println(x);

                for (int j=0; j<graph.get(x).size(); j++){
                    if(!visited[graph.get(x).get(j)]){
                        visited[graph.get(x).get(j)] = true;
                        level.add(graph.get(x).get(j));
                    }
                }
            }
            current_level++;
        }


    }

    private static ArrayList<ArrayList<Integer>> constructGraph() throws FileNotFoundException {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0; i<numberOfVertices+1 ; i++){
            graph.add(new ArrayList<Integer>());
        }

        for (int i=0;i<numberOfEdges;i++){
            int source = stdin.nextInt();
            int destination = stdin.nextInt();
            graph.get(source).add(destination);
        }
        return graph;
    }


    public BFSImplementation() throws FileNotFoundException {

    }
}
