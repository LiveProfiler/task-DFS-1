package algo.tasks.graphs.task.DFS.n1;

import algo.tasks.graphs.commons.TaskSolver;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class taskTest {
    private TaskSolver solver = new Solver();
    private List<Pair<String[], String[]>> testsAndAnswers;

    private Pair<String[], String[]> test_1 = new ImmutablePair<>(
            new String[]{
                    "4",
                    "2 3 0",
                    "1 3 0",
                    "1 2 4 0",
                    "3 0"
            },
            new String[]{
                    "N"

            });

    private Pair<String[], String[]> test_2 = new ImmutablePair<>(
            new String[] {
                    "3",
                    "2 0",
                    "1 3 0",
                    "2 0"
            },
            new String[] {
                    "Y",
                    "1 3",
                    "0",
                    "2"
            });

    private Pair<String[], String[]> test_3 = new ImmutablePair<>(
            new String[] {
                    "4",
                    "2 4 0",
                    "1 3 0",
                    "4 2 0",
                    "3 1 0"
            },
            new String[] {
                    "Y",
                    "1 3",
                    "0",
                    "2 4",
            });

    private Pair<String[], String[]> test_4 = new ImmutablePair<>(
            new String[] {
                    "5",
                    "2 0",
                    "1 3 4 0",
                    "2 4 0",
                    "2 3 5 0",
                    "4 0"
            },
            new String[] {
                    "N"
            }
    );

    private Pair<String[], String[]> test_5 = new ImmutablePair<>(
            new String[] {
                    "5",
                    "2 4 0",
                    "1 3 0",
                    "2 4 0",
                    "3 5 0",
                    "4 0"
            },
            new String[] {
                    "Y",
                    "1 3 5",
                    "0",
                    "2 4"
            }
    );

    private Pair<String[], String[]> test_6 = new ImmutablePair<>(
            new String[] {
                    "4",
                    "2 0",
                    "1 3 4 0",
                    "2 0",
                    "2 0"
            },
            new String[] {
                    "Y",
                    "1 3 4",
                    "0",
                    "2"
            }
    );

    @Before
    public void setUp(){
        testsAndAnswers = new ArrayList<>();
        testsAndAnswers.add(test_1);
        testsAndAnswers.add(test_2);
        testsAndAnswers.add(test_3);
        testsAndAnswers.add(test_4);
        testsAndAnswers.add(test_5);
        testsAndAnswers.add(test_6);
    }


    @Test
    public void sampleTest(){
        for (Pair<String[], String[]> sample: testsAndAnswers) {
            assertArrayEquals(sample.getRight(), solver.solve(sample.getLeft()));
        }
        System.out.println("Test passed " + testsAndAnswers.size());
    }


}
