public class LemonadeChange {
    public static void main(String[] args) {
        Solution solution = new LemonadeChange().new Solution();
        int[] bills_1 = {5, 5, 5, 10, 20}; // true
        int[] bills_2 = {5,5,10}; // true
        int[] bills_3 = {10, 10}; // false
        int[] bills_4 = {5,5,10,10,20}; // false
        System.out.println(solution.lemonadeChange(bills_1));
        System.out.println(solution.lemonadeChange(bills_2));
        System.out.println(solution.lemonadeChange(bills_3));
        System.out.println(solution.lemonadeChange(bills_4));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            // 找零的情况，只有这么几种，所以只需遇到10和20的时候判断前面是否有满足以下情况的零钱
            // 5 --> [] , 10 --> [5] , 20 --> [5,5,5] , [10,5]
            int five_count = 0;
            int ten_count = 0;
            for (int i : bills) {
                if (i == 5) {
                    five_count++;
                } else if (i == 10) { // 收到10元，判断是否有1张5元的找零
                    if (five_count < 1) {
                        return false;
                    }
                    five_count--;
                    ten_count++;
                } else { // 遇到20元，两种找零方式
                    if (ten_count < 1) { // 如果没有10元，判断是否有3张5元
                        if (five_count < 3) {
                            return false;
                        }
                        five_count = five_count - 3;
                    } else { // 有10元，判断是否有一张5元
                        if (five_count < 1) {
                            return false;
                        }
                        ten_count--;
                        five_count--;
                    }
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}