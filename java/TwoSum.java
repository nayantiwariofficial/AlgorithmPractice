import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] sol = new int[2];
        if (nums == null || nums.length < 2) {
            return sol;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                sol[0] = map.get(diff);
                sol[1] = i;
                return sol;
            } else {
                map.put(nums[i], i);
            }
        }
        return sol;
    }

    //Demo Test Case
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;

        int[] sol = twoSum(nums,target);
        for (int aSol : sol) {
            System.out.println(aSol);
        }

        Map<Integer, Integer> map = new HashMap<>();

    }
}