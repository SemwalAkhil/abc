
public class NQueens {
    static int n = 4;
    static int[] col = new int[n];

    static boolean safe(int r, int c) {
        for (int i = 0; i < r; i++)
            if (col[i] == c || Math.abs(col[i] - c) == Math.abs(i - r))
                return false;
        return true;
    }

    static boolean solve(int r) {
        if (r == n)
            return true;

        for (int c = 0; c < n; c++) {
            if (safe(r, c)) {
                col[r] = c;
                if (solve(r + 1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (solve(0)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(col[i] == j ? "Q " : ". ");
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}
