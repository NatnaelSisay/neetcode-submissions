
class Solution {
    String DELIMETER = "<======>";

    public String encode(List<String> strs) {
       StringBuilder  sb = new StringBuilder();
       for(String str: strs){
        sb.append(str).append(DELIMETER);
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        if(str.isEmpty()) {
            return result;
        }

        String[] values = str.split(DELIMETER, -1);

        for(int i=0; i < values.length - 1; i++){
            result.add(values[i]);
        }

        return result;
    }
}
