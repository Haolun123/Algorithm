public class MaximalSquare {
    /*******
    solution1: n^3
    dp[x][y] := sum(0:x, 0:y)
    dp[x][y] = dp[x-1][y] + dp[x][y-1]
               - dp[x-1][y-1]
               + matrix[x][y]

    sum(x:x+size, y:y+size) = sum(0:x+size, 0:y+size)
                            - sum(0:x-1, 0:y+size)
                            - sum(0:x+size, 0:y-1)
                            + sum(0:x-1, 0:y-1)
     solution2: n^2
     dp[x][y] = 0, if matrix[x][y] == 0
     dp[x][y] = min(dp[x-1][y], dp[x][y-1], dp[x-1][y-1]) + 1, if matrix[x][y] == 1
    *******/
    public int maxSquare (int[][] matrix){
        long startTime = System.currentTimeMillis();
        if (matrix.length == 0 && matrix[0].length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j]
                        + dp[i][j-1] - dp[i-1][j-1];
            }
        }

        int ans = 0;
        for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                for (int k = Math.min(m-i+1, n-j+1); k > 0; k--){
                    int sum = dp[i-1+k][j-1+k]
                            - dp[i-1][j-1+k]
                            - dp[i-1+k][j-1]
                            + dp[i-1][j-1];

                    if (sum == k*k){
                        ans = Math.max(ans, sum);
                        break;
                    }
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("n^3 time elapsed: " + (endTime - startTime) + "ms");

        return ans;
    }

    public int maxSqaure2 (int[][] matrix){
        long startTime = System.currentTimeMillis();
        if (matrix.length == 0 && matrix[0].length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int ans = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = matrix[i][j];
                if(dp[i][j] == 0)
                    continue;

                if(i == 0 || j == 0){
                    //do nothing
                }
                /*
                else if (i == 0){
                    dp[i][j] = dp[i][j-1]+1;
                }
                else if (j == 0){
                    dp[i][j] = dp[i-1][j]+1;
                }
                */
                else{
                    dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
                }

                ans = Math.max(ans, dp[i][j]*dp[i][j]);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("n^2 time elapsed: " + (endTime - startTime) + "ms");

        return ans;
    }
}
