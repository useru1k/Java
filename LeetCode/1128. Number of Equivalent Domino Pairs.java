class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;

        for(int[] d : dominoes) {
            int a = Math.min(d[0],d[1]); /* Finding the minimum */
            int b = Math.max(d[0],d[1]); /* Finding the maximum */
            int key = (a * 10) + b; /* Make this as a round var to esay to manipulate */

            count += hmap.getOrDefault(key, 0); /* It return the how may time i see domino */
            hmap.put(key,hmap.getOrDefault(key, 0) + 1);
        }
        return count;
    }
}
