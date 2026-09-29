class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String detail: details){
            String ageString = detail.substring(11,13);
            Integer age = Integer.valueOf(ageString);
            if(age > 60) {
                count += 1;
            }
        }

        return count;
    }
}