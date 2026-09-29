class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String detail: details){
            count += Integer.valueOf(detail.substring(11,13)) > 60 ? 1 : 0;
        }

        return count;
    }
}