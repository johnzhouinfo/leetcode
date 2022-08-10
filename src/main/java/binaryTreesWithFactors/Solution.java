package binaryTreesWithFactors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Lingjue
 * @date: 2022/8/9
 * @Description:
 */
public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1000000007;
        int size = arr.length;
        Arrays.sort(arr);
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0 ; i < arr.length; i++) {
            index.put(arr[i], i);
        }
        long [] dp = new long[size];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            int factor = arr[i];
            for (int j = 0; j < i ; j++) {
                if (factor % arr[j] == 0) {
                    int right = factor / arr[j];
                    if (index.containsKey(right)){
                        dp[i] = (dp[i]+dp[j]*dp[index.get(right)])%MOD;
                    }
                }
            }
        }
        long answer = 0;
        for (long val : dp) answer += val;
        return (int)(answer % MOD);

    }

}
