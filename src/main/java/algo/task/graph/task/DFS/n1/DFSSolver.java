package algo.task.graph.task.DFS.n1;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class DFSSolver {

    public String[] solve(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<List<Integer>> adjacencyLists = Arrays
                .stream(args)
                .skip(1)
                .map(s -> Arrays
                        .stream(s.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        return new String[0];
    }

    public Color[] DFS(List<List<Integer>> adjacencyLists){
        Color[] colors = new Color[adjacencyLists.size()];
        Arrays.fill(colors, Color.NO_COLOR);
        Stack<Pair<Integer, Color>> stack = new Stack<>();

        stack.push(new Pair<>(1, Color.BLUE));
        while (!stack.empty()){
            Pair<Integer, Color> vertex = stack.pop();
            colors[vertex.getKey()] = vertex.getValue();

            for (Integer adjacent: adjacencyLists.get(vertex.getKey())){
                if (colors[adjacent] == Color.NO_COLOR){
                    stack.push(new Pair<>(adjacent, vertex.getValue().invert()));
                } else if (colors[adjacent] == vertex.getValue()){
                    throw new Exception();
                }
            }
        }
        return colors;
    }
}
