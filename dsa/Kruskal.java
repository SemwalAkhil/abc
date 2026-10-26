
import java.util.Arrays;

public class Kruskal {
    public static void main(String[] args) {
        int[][] e = {
            {0, 1, 2}, {0, 3, 6}, {1, 2, 3},
            {1, 3, 8}, {1, 4, 5}, {2, 4, 7}, {3, 4, 9}
        };

        Arrays.sort(e, (a, b) -> a[2] - b[2]);

        int[] p = {0, 1, 2, 3, 4};
        int cost = 0, count = 0;

        for (int[] edge : e) {
            int u = edge[0], v = edge[1], w = edge[2];
            int a = u, b = v;

            while (p[a] != a) a = p[a];
            while (p[b] != b) b = p[b];

            if (a != b) {
                p[a] = b;
                cost += w;
                count++;
                System.out.println(u + " - " + v + " : " + w);
                if (count == 4) break;
            }
        }

        System.out.println("Total cost: " + cost);
    }
}
