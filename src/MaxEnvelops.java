import java.util.Arrays;
import java.util.Comparator;

public class MaxEnvelops{

    public int maxEnvelop(int[][] envelopes){
        if(envelopes == null || envelopes.length == 0
                || envelopes[0] == null || envelopes[0].length != 2)
            return 0;

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });

        int res = 1;
        int dp[] = new int[envelopes.length];
        Arrays.fill(dp, 1);

        for(int i = 0; i < envelopes.length; i++){
            for (int j = 0; j < i; j++){
                if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1])
                    dp[i] = Math.max(dp[j]+1, dp[i]);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
