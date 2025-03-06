class Solution {
    public void rotate(int[] nums, int k) {
        // Juggles's Algorithm 
        k = k % nums.length;
        int i = 0 , j = nums.length - 1;
        while(i<j)
        {
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
            i++;
            j--;
        }
        i = 0;
        j = k - 1;
        while(i<j)
        {
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
            i++;
            j--;
        }
        i = k;
        j = nums.length - 1;
        while(i<j)
        {
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
            i++;
            j--;
        }
    }
}
