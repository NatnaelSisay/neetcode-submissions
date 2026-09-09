class Solution {
    public int[] productExceptSelf(int[] nums) {
        // DOING THE MATHS FUNCTION ON PAPER HELPS

        int len = nums.length;

        int[] lProd = new int[len];
        int[] rProd = new int[len];

        lProd[0] = 1;
        for(int i=1; i < len; i++){
            lProd[i] = lProd[i-1] * nums[i-1];
        }

        rProd[len-1] = 1;
        for(int i=len-2; i >= 0; i--){
            rProd[i] = rProd[i+1] * nums[i+1];
        }

        int[] result = new int[len];
        for(int i=0; i < len; i++){
            result[i] = lProd[i] * rProd[i];
        }

        return result;
    }
}  
