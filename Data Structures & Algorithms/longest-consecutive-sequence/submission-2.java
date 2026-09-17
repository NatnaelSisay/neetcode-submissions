class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for(int n: nums) uniq.add(n);
        
        int longest = 0;

        for(int n: nums){
            int prev = n - 1;
            int len = 0;

            if(!uniq.contains(prev)){
                int next = n + len;
                while(uniq.contains(next)){
                    len++;
                    next = n + len;
                }

                longest = longest > len ? longest : len;
            }
        }

        return longest;
    }
}
