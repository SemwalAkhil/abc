
public class Prims {
    public static void main(String[] args) {
        int inf = 99999;
        int[][] g = {
            {0, 2, inf, 6, inf},
            {2, 0, 3, 8, 5},
            {inf, 3, 0, inf, 7},
            {6, 8, inf, 0, 9},
            {inf, 5, 7, 9, 0}
        };

        int n = g.length, cost = 0;
        boolean[] vis = new boolean[n];
        vis[0] = true;

        for (int k = 1; k < n; k++) {
            int min = inf, u = -1, v = -1;

            for (int i = 0; i < n; i++) {
                if (vis[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!vis[j] && g[i][j] < min) {
                            min = g[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            vis[v] = true;
            cost += min;
            System.out.println(u + " - " + v + " : " + min);
        }

        System.out.println("Total cost: " + cost);
    }
}
