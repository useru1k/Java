// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/

class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0;

        int min_op = 0;
        for(int i=1;i<nums.length;i++) {
            int first = nums[i-1];
            int second = nums[i];
            if(first < second) {
                continue;
            }
            int diff = Math.abs(first - second)+1;
            if(diff == 0) {
                nums[i] = nums[i] + 1;
                min_op++;
            }
            else {
                nums[i] = nums[i] + diff;
                min_op += diff;
            }
        }
        return min_op;
    }
}
