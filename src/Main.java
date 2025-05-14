import java.util.*;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> A = new Vertex<>("A");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        Vertex<String> D = new Vertex<>("D");
        Vertex<String> E = new Vertex<>("E");

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);

        graph.addEdge(A, B, 2);
        graph.addEdge(A, C, 4);
        graph.addEdge(B, C, 1);
        graph.addEdge(B, D, 7);
        graph.addEdge(C, E, 3);
        graph.addEdge(D, E, 1);

        // BFS
        System.out.println("BFS Traversal starting from A:");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        bfs.bfs(graph, A);

        // Dijkstra
        System.out.println("\n\nDijkstra's shortest paths from A:");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        Map<Vertex<String>, Double> distances = dijkstra.dijkstra(graph, A);
        for (Map.Entry<Vertex<String>, Double> entry : distances.entrySet()) {
            System.out.println("Distance to " + entry.getKey() + ": " + entry.getValue());
        }
    }
}