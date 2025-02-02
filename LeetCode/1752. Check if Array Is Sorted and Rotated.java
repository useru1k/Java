class Solution {
    public boolean check(int[] nums) {
        List<Integer> a1 = new ArrayList<Integer>();
        for(int i:nums)
        a1.add(i);
        List<Integer> a2 = new ArrayList<Integer>(a1);
        Collections.sort(a2);
        
        for(int i=0;i<a1.size();i++)
        {
            if(a1.equals(a2))
            {
                return true;
            }
            Collections.rotate(a1,1);
        }
        return false;
    }
}
