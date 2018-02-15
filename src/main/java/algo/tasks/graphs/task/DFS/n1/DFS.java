package algo.tasks.graphs.task.DFS.n1;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFS {
    public static Color[] run(List<List<Integer>> adjacencyLists) throws NotBipartiteGraphException {
        Color[] colors = new Color[adjacencyLists.size()];
        Arrays.fill(colors, Color.NO_COLOR);
        Stack<Pair<Integer, Color>> stack = new Stack<>();
        stack.push(new ImmutablePair<>(1, Color.BLUE));
        while (!stack.empty()){
            Pair<Integer, Color> vertex = stack.pop();
            colors[vertex.getKey()] = vertex.getValue();

            for (Integer adjacent: adjacencyLists.get(vertex.getKey())){
                if (colors[adjacent] == Color.NO_COLOR){
                    stack.push(new ImmutablePair<>(adjacent, vertex.getValue().invert()));
                } else if (colors[adjacent] == vertex.getValue()){
                    throw new NotBipartiteGraphException();
                }
            }
        }
        return colors;
    }
}
