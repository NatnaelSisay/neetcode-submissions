class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = getNumbersCount(nums);

        // sort the numbers based on the count from large to small;
        nums = Arrays.stream(nums).boxed()
                    .distinct()
                    .sorted((a, b) -> Integer.compare(count.get(b), count.get(a)))
                    .mapToInt(Integer::intValue)
                    .toArray();

        // return the top k;
        int[] result = new int[k];
        for(int i=0; i < k; i++){
            result[i] = nums[i];
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
