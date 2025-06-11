class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int max_odd = Integer.MIN_VALUE;
        int max_eve = Integer.MAX_VALUE;
        int max_result = 0;
        for(Map.Entry<Character,Integer> en : map.entrySet()) {
            int num = en.getValue();
            if(num % 2 == 0){
                if(max_eve > num) {
                    max_eve = num;
                }
            }
            else {
                if(max_odd < num) {
                    max_odd = num;
                }
            }
            // int diff = max_odd - max_eve;
            // max_result = Math.max(max_result,diff);
        }
        return max_odd - max_eve;
    }
}
