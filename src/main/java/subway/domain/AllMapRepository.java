package subway.domain;

import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.WeightedMultigraph;

public class AllMapRepository {
    private static final WeightedMultigraph<String, DefaultDirectedGraph> distanceGraph = new WeightedMultigraph<>(DefaultDirectedGraph.class);
    private static final WeightedMultigraph<String, DefaultDirectedGraph> timeGraph = new WeightedMultigraph<>(DefaultDirectedGraph.class);
    
}
