class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max  = 0;
        int i = 0 , j = 0;
        while(j<nums.length)
        {
            if(nums[j] == 0)
            {
                i=j+1;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
