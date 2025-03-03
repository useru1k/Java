class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i = 0;
        int res[] = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ae = new ArrayList<>();
        while(i<nums.length)
        {
            if(nums[i] < pivot)
            al.add(nums[i]);
            else if(nums[i] > pivot)
            ar.add(nums[i]);
            else
            ae.add(nums[i]);
            i++;
        }
        al.addAll(ae);
        al.addAll(ar);
        for(int m=0;m<nums.length;m++)
        res[m] = al.get(m);

        return res;
    }
}
