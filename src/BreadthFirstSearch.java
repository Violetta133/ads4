import java.util.*;

class BreadthFirstSearch<T> {
    public void bfs(WeightedGraph<T> graph, Vertex<T> start) {
        Set<Vertex<T>> visited = new HashSet<>();
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            System.out.print(current + " ");
            for (Vertex<T> neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
