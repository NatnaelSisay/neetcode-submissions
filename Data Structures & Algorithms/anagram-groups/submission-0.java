class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            // get anagram key
            String key = getAnagramKey(str);
            if(map.containsKey(key)){
                map.get(key).add(str);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);
                map.put(key, values);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(String key: map.keySet()){
            result.add(map.get(key));
        }

        return result;
    }

    static String getAnagramKey(String str){
        int[] count = new int[26];
        
        for(char c: str.toCharArray()){
            count[c - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int n: count){
            sb.append(Integer.toString(n) + "-");
        }

        return sb.toString();
    }
}
