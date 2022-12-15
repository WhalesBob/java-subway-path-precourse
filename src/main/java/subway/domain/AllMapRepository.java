package subway.domain;

import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.WeightedMultigraph;

public class AllMapRepository {
    private static final WeightedMultigraph<String, DefaultDirectedGraph> distanceGraph = new WeightedMultigraph<>(DefaultDirectedGraph.class);
    private static final WeightedMultigraph<String, DefaultDirectedGraph> timeGraph = new WeightedMultigraph<>(DefaultDirectedGraph.class);

    public static void addOnDistanceGraph(String leftStation, String rightStation, int distance){
        if(!distanceGraph.containsVertex(leftStation)){
            distanceGraph.addVertex(leftStation);
        }
        if(!distanceGraph.containsVertex(rightStation)){
            distanceGraph.addVertex(rightStation);
        }
        distanceGraph.setEdgeWeight(distanceGraph.addEdge(leftStation,rightStation),distance);
    }

    public static void addOnTimeGraph(String leftStation, String rightStation, int time){
        if(!timeGraph.containsVertex(leftStation)){
            distanceGraph.addVertex(leftStation);
        }
        if(!timeGraph.containsVertex(rightStation)){
            distanceGraph.addVertex(rightStation);
        }
        timeGraph.setEdgeWeight(timeGraph.addEdge(leftStation,rightStation),time);
    }
}
