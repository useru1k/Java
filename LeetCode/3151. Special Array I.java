class Solution {
    public boolean isArraySpecial(int[] a) {
        for(int i=1;i<a.length;i++)
        {
            if(a[i] % 2 == a[i-1] % 2)
            {
                return false;
            }
        }
        return true;
    }
}
