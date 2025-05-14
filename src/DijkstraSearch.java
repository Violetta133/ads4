import java.util.*;

class DijkstraSearch<T> {
    public Map<Vertex<T>, Double> dijkstra(WeightedGraph<T> graph, Vertex<T> start) {
        Map<Vertex<T>, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<T>> pq = new PriorityQueue<>(Comparator.comparingDouble(distances::get));

        for (Vertex<T> v : graph.getVertices()) {
            distances.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex<T> current = pq.poll();
            for (Edge<T> edge : graph.getEdgesFrom(current)) {
                Vertex<T> neighbor = edge.getDestination();
                double newDist = distances.get(current) + edge.getWeight();
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(neighbor);
                }
            }
        }

        return distances;
    }
}