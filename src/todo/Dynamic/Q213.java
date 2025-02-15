package todo.Dynamic;

public class Q213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp1 = new int[n], dp2 = new int[n];   // dp1不抢n-1,dp2不抢0
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[1], nums[0]);
        dp2[1] = nums[1];
        for (int i = 2; i < n; ++i) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + nums[i]);
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i]);
        }
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
