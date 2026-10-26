// longest common substring (prints string)
public class LongestCommonSubstring {
    public static void main(String[] args) {
        String a = "ABCDGH", b = "ACDGHR";
        int m = a.length(), n = b.length(), ans = 0;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }

        System.out.println("Length: " + ans);
    }
}
