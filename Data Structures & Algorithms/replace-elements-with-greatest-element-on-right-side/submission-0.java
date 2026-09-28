class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if(len == 0) return new int[0];

        int[] answer = new int[len];
        answer[len-1] = -1;

        for(int i=len-2; i >= 0; i--){
            answer[i] = Math.max(arr[i+1], answer[i+1]);
        }
        
        return answer;
    }
}