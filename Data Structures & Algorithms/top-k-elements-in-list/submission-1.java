class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = getNumbersCount(nums);
        
        List<List<Integer>> array = new ArrayList<>();
        for(int i=0; i <= nums.length+1; i++){
            array.add(new ArrayList<>());
        }

        for(int key: count.keySet()){
            List<Integer> bucket = array.get(count.get(key));
            bucket.add(key);
        }


        int[] result = new int[k];
        int idx = 0;
        for(int i = nums.length; i >= 0; i--){
            if(array.get(i).size() == 0) continue;

            for(Integer val: array.get(i)){
                if(k == 0) return result;
                result[idx++] = val;
                k -= 1;
            }
        }
        
        return result;
    }

    static Map<Integer, Integer> getNumbersCount(int[] nums){
        Map<Integer, Integer> result = new HashMap<>();

        for(int n: nums){
            result.put(n, result.getOrDefault(n, 0) + 1);
        }

        return result;
    }
}
