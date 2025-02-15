package todo.Array;

public class Q238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = 1;
        b[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            b[i] = b[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
}
