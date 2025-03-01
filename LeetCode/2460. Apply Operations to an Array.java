class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,j=1;
      // Apply Operation on Array.
        while(j<nums.length)
        {
            if(nums[i] == nums[j])
            {
                nums[i] = nums[i] * 2;
                nums[j] = 0;
                i++;
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
      // Changing Non Zero to Right.
        int l=0,r=0;
        while(r<nums.length)
        {
            if(nums[r]!=0)
            {
                int tem = nums[l];
                nums[l] = nums[r];
                nums[r] = tem;
                l++;
            }
            r++;
        }
        return nums;
    }
}
