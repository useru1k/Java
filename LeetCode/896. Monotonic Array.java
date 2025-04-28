class Solution {
    public boolean monoinc(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] < nums[i-1])
            return false;
        }
        return true;
    }
    public boolean monodec(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > nums[i-1])
            return false;
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {
        if(monoinc(nums) || monodec(nums))
        return true;
        
        return false;
    }
}
