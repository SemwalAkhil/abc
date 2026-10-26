
public class FloydWarshall {
    public static void main(String[] args) {
        int inf = 99999;
        int[][] d = {
            {0, 5, inf, 10},
            {inf, 0, 3, inf},
            {inf, inf, 0, 1},
            {inf, inf, inf, 0}
        };
        int n = d.length;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (d[i][k] != inf && d[k][j] != inf)
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((d[i][j] == inf ? "INF" : d[i][j]) + " ");
            System.out.println();
        }
    }
}
