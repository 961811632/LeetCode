/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */
public class AT {

  private static void swap(int nums[], int a, int b) {
    int c = nums[a];
    nums[a] = nums[b];
    nums[b] = c;
  }

  public static int firstMissingPositive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 1;
    }
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
        swap(nums, i, nums[i] - 1);
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }

  public static void main(String[] args) {
    int[] num = new int[]{3, 4, -1, 1};
    int n = firstMissingPositive(num);
    System.out.println(n);

  }
}
