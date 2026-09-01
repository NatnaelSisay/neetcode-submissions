class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];

        for(char c: s.toCharArray()){
            counter[c - 'a'] += 1;
        }

        for(char c: t.toCharArray()){
            counter[c - 'a'] -= 1;
        }

        for(int n: counter){
            if(n != 0) return false;
        }

        return true;
    }
}
