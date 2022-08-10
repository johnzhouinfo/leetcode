package maximunSubarray;

/**
 * @author: Lingjue
 * @date: 2022/8/10
 * @Description:
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        return maxSumArray(nums, 0, size - 1);
    }

    public int maxSumArray(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        for (int i = left; i < right; i++) {
            int leftSum = maxSumArray(arr, left, i);
            int rightSum = maxSumArray(arr, i + 1, right);
            int crossSum = 0;
            for (int j = i; j >= left; j--) {
                crossSum += arr[j];
                if (crossSum > leftSum) {
                    leftSum = crossSum;
                }
            }
            for (int j = i + 1; j <= right; j++) {
                crossSum += arr[j];
                if (crossSum > rightSum) {
                    rightSum = crossSum;
                }
            }
            return Math.max(leftSum, rightSum);
        }
        return 0;
    }



}
