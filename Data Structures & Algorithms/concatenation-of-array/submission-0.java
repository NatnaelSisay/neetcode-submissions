class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int i=0; i < ans.length; i++){
            int idx = i % nums.length;
            ans[i] = nums[idx];
        }

        return ans;
    }
}