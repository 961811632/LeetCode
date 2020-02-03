import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */
public class AT {

  public static int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{1,3,5,6};
    int target = 2;

    System.out.println(searchInsert(nums, target));

  }
}
