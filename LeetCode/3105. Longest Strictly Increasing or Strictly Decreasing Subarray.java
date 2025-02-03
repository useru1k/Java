class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1,max = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1] < nums[i])
            {
                inc++;
                dec = 1;
            }
            else if(nums[i-1] > nums[i])
            {
                dec++;
                inc = 1;
            }
            else
            {
                dec = 1;
                inc = 1;
            }
            max = Math.max(max,(Math.max(inc,dec)));
        }
        return max;
    }
}
