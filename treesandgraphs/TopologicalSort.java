package treesandgraphs;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;


public class TopologicalSort<T> {

    public static void main(String[] args){
        Graph<Integer> graph= new Graph<>(true);

        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 8);
        graph.addEdge(8, 11);

        TopologicalSort<Integer> sort = new TopologicalSort<Integer>();
        Deque<Vertex<Integer>> result = sort.topologicalSort(graph);
        while(!result.isEmpty()){
            System.out.println(result.poll());
        }
    }

    public Deque<Vertex<T>> topologicalSort(Graph<T> graph){
        Deque<Vertex<T>> stack = new ArrayDeque<>();
    }
}
