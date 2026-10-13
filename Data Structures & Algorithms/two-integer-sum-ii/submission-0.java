class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;

        int lp = 0;
        int rp = len - 1;

        while(lp != rp){
            int ln = numbers[lp];
            int rn = numbers[rp];

            int sum = ln + rn;

            if(sum == target){
                return new int[] {lp+1, rp+1};
            } else if(sum > target){
                rp -= 1;
            } else {
                lp += 1;
            }
        }

        return new int[2];
    }
}
