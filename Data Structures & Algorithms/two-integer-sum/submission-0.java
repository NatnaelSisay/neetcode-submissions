class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }

            map.put(num, i);
        }

        return result;
    }
}
