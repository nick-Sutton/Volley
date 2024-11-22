package builder;

public class UnionFind {
    private final int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
    }

    public int find(int x) {
        if (parent[x] != x) {
            return find(parent[x]);
        } else {
            return x;
        }
    }

    public void union(int x, int y) {
        parent[find(y)] = find(x);
    }
}
