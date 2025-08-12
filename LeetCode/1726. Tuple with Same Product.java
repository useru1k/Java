class Solution {
    public int tupleSameProduct(int[] nums) {
        
        // We must want a 4 element so permutatuion combine of 4 
        // If one product can find measn we can obtains 8 permutations
        // 2 * 2 * 2 = 8.

        HashMap<Integer,Integer> product = new HashMap<>();
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int pro = nums[i] * nums[j];
                // If already the pair happen means we can make 8 pairs
                if(product.containsKey(pro)) {
                    count += product.get(pro) * 8;
                }
                product.put(pro,product.getOrDefault(pro,0)+1);
            }
        }
        return count;
    }
}
