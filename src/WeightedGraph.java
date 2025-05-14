import java.util.*;

class WeightedGraph<T> {
    private List<Vertex<T>> vertices = new ArrayList<>();
    private List<Edge<T>> edges = new ArrayList<>();

    public void addVertex(Vertex<T> v) {
        vertices.add(v);
    }

    public void addEdge(Vertex<T> src, Vertex<T> dest, double weight) {
        edges.add(new Edge<>(src, dest, weight));
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    public List<Vertex<T>> getNeighbors(Vertex<T> v) {
        List<Vertex<T>> neighbors = new ArrayList<>();
        for (Edge<T> e : edges) {
            if (e.getSource().equals(v)) {
                neighbors.add(e.getDestination());
            }
        }
        return neighbors;
    }

    public List<Edge<T>> getEdgesFrom(Vertex<T> v) {
        List<Edge<T>> outEdges = new ArrayList<>();
        for (Edge<T> e : edges) {
            if (e.getSource().equals(v)) {
                outEdges.add(e);
            }
        }
        return outEdges;
    }
}
