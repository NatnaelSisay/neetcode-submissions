class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // nums needs to be sorted, to signify unque values
        Arrays.sort(nums);
        Set<String> unique = new HashSet<>();

        int len = nums.length;
        for(int i=0; i < len; i++){
            int target = -nums[i];
            List<List<Integer>> twoSumResult = getTwoSum(nums, i+1, target);
            if(twoSumResult.size() != 0){
                for(List<Integer> pair: twoSumResult){
                    pair.add(nums[i]);
                    pair.sort((a, b) -> a - b);
                    String key = pair.toString();
                    if(unique.add(key)){
                        result.add(pair);
                    }
                    
                }
                
            }
        }

        return result;
    }

    public List<List<Integer>> getTwoSum(int[] nums, int start, int target){
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();
        for(int i=start; i < len; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result.add(new ArrayList<>(List.of(nums[i], diff)));
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
