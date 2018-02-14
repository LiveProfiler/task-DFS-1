package algo.task.graph.task.DFS.n1;

public enum Color {
    NO_COLOR,
    BLUE,
    RED;

    public Color invert() {
        if (this == Color.NO_COLOR){
            return Color.NO_COLOR;
        }
        return (this == Color.BLUE) ? Color.RED : Color.BLUE;
    }
}
