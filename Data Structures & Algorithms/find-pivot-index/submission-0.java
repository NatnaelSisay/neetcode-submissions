class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = getLeftSum(nums);
        int[] rightSum = getRightSum(nums);
        
        for(int i=0; i < leftSum.length; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
    }

    int[] getLeftSum(int[] nums){
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        for(int i=1; i < nums.length; i++){
            if(i == 1){
                leftSum[i] = nums[i-1];
            } else {
                leftSum[i] = nums[i-1] + leftSum[i-1];
            }
        }
        return leftSum;
    }

    int[] getRightSum(int[] nums){
        int len = nums.length;

        int[] rightSum = new int[len];
        
        rightSum[len-1] = 0;
        for(int i=len-2; i >= 0; i--){
            if(i == len-2){
                rightSum[i] = nums[i+1];
            } else {
                rightSum[i] = nums[i+1] + rightSum[i+1];
            }
        }

        return rightSum;
    }
}