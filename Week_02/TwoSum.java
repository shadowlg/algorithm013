import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] results = solution.twoSum(nums, 9);
        for (int k : results) {
            System.out.println(k);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int source = target - nums[i];
                if (map.containsKey(source)) {
                    return new int[]{map.get(source), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}