class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int j = nums.length - 1, i = 0;
        int right = j;
        while(i<=j)
        {
            if(Math.abs(nums[i]) < Math.abs(nums[j]))
            {
                ans[right--] = nums[j] * nums[j];
                j--;
            }
            else
            {
                ans[right--] = nums[i] * nums[i];
                i++;
            }
        } 
        return ans;
    }
}
