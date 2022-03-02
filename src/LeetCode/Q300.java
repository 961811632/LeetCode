package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-14 9:44
 */
public class Q300 {

  public int lengthOfLIS(int[] nums) {
    int len = nums.length;
    if (len <= 0) {
      return 0;
    }
    int[] dp = new int[len];
    dp[0] = 1;
    int max = 1;
    for (int i = 0; i < len; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
      if (dp[i] > max) {
        max = dp[i];
      }
    }
    return max;
  }
}
