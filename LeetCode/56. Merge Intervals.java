class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int[] s = intervals[0];
        ArrayList<int[]> arr = new ArrayList<>();
        if(intervals.length == 1)
        {
            return intervals;
        }
        else
        {
            
            for(int i=1;i<intervals.length;i++)
            {
                if(intervals[i][0]<=s[1])
                {
                    int min = s[0],max = s[1];
                    min = Math.min(min,intervals[i][0]);
                    max = Math.max(max,intervals[i][1]);
                    s[0] = min;
                    s[1] = max;
                    // arr.add(s);
                }
                else
                {
                    arr.add(s);
                    s = intervals[i];
                }
            }
            arr.add(s);
            int[][] res = arr.toArray(new int[arr.size()][]);
            return res;
        }
    }
}
