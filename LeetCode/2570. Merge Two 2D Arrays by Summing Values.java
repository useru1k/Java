class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = nums1.length, right = nums2.length;
        int p1 = 0,p2 = 0;

        List<int[]> result = new ArrayList<>();
        while(p1<left && p2 <right)
        {
            if(nums1[p1][0] == nums2[p2][0])
            {
                result.add(new int[]{nums1[p1][0],(nums1[p1][1]+nums2[p2][1])});
                p1++;
                p2++;
            }
            else if(nums1[p1][0] < nums2[p2][0])
            {
                result.add(nums1[p1]);
                p1++;
            }
            else
            {
                result.add(nums2[p2]);
                p2++;
            }
        }
            while(p1<left)
            {
                result.add(nums1[p1]);
                p1++;
            }
            while(p2<right)
            {
                result.add(nums2[p2]);
                p2++;
            }

        int res[][] = new int[result.size()][2];
        for(int i=0;i<result.size();i++)
        res[i] = result.get(i);

        return res;
    }
}
