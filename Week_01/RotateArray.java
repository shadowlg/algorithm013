public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            int temp, previous;
            for (int i = 0; i < k; i++) {
                previous = nums[nums.length - 1];
                for (int j = 0; j < nums.length; j++) {
                    temp = nums[j];
                    nums[j] = previous;
                    previous = temp;
                    System.out.println(previous);
                }
            }
            for (int value : nums) {
                System.out.println(value);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}