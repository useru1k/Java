class Solution {
    // public static boolean isPrime(int n)
    // {
    // if( n < 2 )
    // return false;
    // for(int i=2;i<n;i++)
    // {
    // if(n%i==0)
    // return false;
    // }
    // return true;
    // }
    public int[] closestPrimes(int left, int right) {
        boolean[] sieve = new boolean[right + 1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= right; j += i) {
                    sieve[j] = false;
                }
            }
        }

        int nums1 = -1, nums2 = -1;
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (sieve[i]) {
                primeList.add(i);
            }
        }
        if (primeList.size() == 1)
            return new int[] { -1, -1 };
        else {
            int min = right - left + 1;
            for (int i = 1; i < primeList.size(); i++) {
                int sum = primeList.get(i) - primeList.get(i - 1);
                if (min > sum) {
                    min = sum;
                    nums2 = primeList.get(i - 1);
                    nums1 = primeList.get(i);
                }
            }
        }
        return new int[] { nums2, nums1 };
    }
}
