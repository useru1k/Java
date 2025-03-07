class Solution {
    public void backTrack(int n,List<List<Integer>> total,List<Integer> combination,int k,int last)
    {
        if(combination.size() == k)
        {
            total.add(new ArrayList<>(combination));
            return;
        }

        for(int i=n;i<=last;i++)
        {
        combination.add(i);
        backTrack(i+1,total,combination,k,last);
        combination.remove(combination.size() - 1);

        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> total = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backTrack(1,total,combination,k,n);
        return total;
    }
}
