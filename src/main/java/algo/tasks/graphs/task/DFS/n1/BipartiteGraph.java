package algo.tasks.graphs.task.DFS.n1;

import java.util.ArrayList;
import java.util.List;

public class BipartiteGraph {
    private List<Integer> firstPart;
    private List<Integer> secondPart;

    public BipartiteGraph(Color[] paintedGraph){
        firstPart = new ArrayList<>();
        secondPart = new ArrayList<>();
        for (int vertex = 0; vertex < paintedGraph.length; vertex++){
            if (paintedGraph[vertex] == Color.BLUE){
                firstPart.add(vertex + 1);
            } else if (paintedGraph[vertex] == Color.RED){
                secondPart.add(vertex + 1);
            }
        }
        if (firstPart.get(0) > secondPart.get(0)){
            List<Integer> tmp = firstPart;
            firstPart = secondPart;
            secondPart = tmp;
        }
    }

    public List<Integer> getFirstPart() {
        return firstPart;
    }

    public List<Integer> getSecondPart() {
        return secondPart;
    }
}
