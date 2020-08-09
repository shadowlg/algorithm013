import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            // 1. 是否相等
            if (s.length() != t.length()) {
                return false;
            }
            // 2.每个字母出现次数
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}