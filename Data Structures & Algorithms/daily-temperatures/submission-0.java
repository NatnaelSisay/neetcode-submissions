class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];

        for(int i=0; i < len; i++){
            int n = temperatures[i];
            
            for(int j=i+1; j < len; j++){
                int m = temperatures[j];
                if(n < m) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }
}
