class Solution {
    public boolean canJump(int[] nums) {

        // Author : Bluecapture : Yuvan
        int n = nums.length;

        if(nums[0] == 0 && n == 1)
        return true; 

        if(nums[0] == 0) // If First Element is 0 means cant futher jump
        return false;

        if(n < 2)
        return true;

        int maxReach = nums[0];
        int step = nums[0];

        for(int i=0;i<n;i++)
        {
            if(i == n-1)
            return true;

            maxReach = Math.max(maxReach, i + nums[i]); // Cal the max Reach up to drain step then it can directly jump
            step--; 

            if(step == 0)
            {
                if(i >= maxReach) // If some element is 0 can not futher jump can happen
                return false;
                step = maxReach - i;
            }
        }
        return false;
    }
}
