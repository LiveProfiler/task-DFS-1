package algo.tasks.graphs.task.DFS.n1;


import algo.tasks.graphs.commons.TaskSolver;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solver implements TaskSolver {

    @Override
    public String[] solve(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<List<Integer>> adjacencyLists = Arrays
                .stream(args)
                .skip(1)
                .map(s -> Arrays
                        .stream(s.split(" "))
                        .map(x -> Integer.parseInt(x) - 1)
                        .filter(x -> x >= 0)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        try {
            BipartiteGraph graph = new BipartiteGraph(DFS.run(adjacencyLists));
            return new String[] {
                    "Y",
                    graph.getFirstPart().stream().map(Object::toString).collect(Collectors.joining(" ")),
                    "0",
                    graph.getSecondPart().stream().map(Object::toString).collect(Collectors.joining(" ")),
            };
        } catch (NotBipartiteGraphException e) {
            return new String[] {"N"};
        }
    }
}
