import java.util.HashMap;

public class TwoSum1 {
    public TwoSum1() {
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int a = 0; a < nums.length; a++) {
            if (map.containsKey(target - nums[a])) {
                result[0] = map.get(target - nums[a]);
                result[1] = a;
                break;
            } else {
                map.put(nums[a], a);
            }
        }
        return result;
    }
}
