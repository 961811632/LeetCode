package todo.Back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q78 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        back(nums, 0);
        return result;
    }

    public void back(int[] nums, int index) {
        result.add(new ArrayList<>(path));
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            back(nums, i + 1);
            path.removeLast();
        }
    }
}
