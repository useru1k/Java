class Solution {
    public int[] runningSum(int[] nums) {
        int j = 1;
        while(j<nums.length)
        {
            nums[j] = nums[j-1] + nums[j];
            j++;
        }
        return nums;
    }
}
