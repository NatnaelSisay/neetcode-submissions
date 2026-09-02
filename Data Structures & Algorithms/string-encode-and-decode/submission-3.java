
class Solution {
    // Using a distinct delimiter string
    String DELIMETER = "<======>";

    public String encode(List<String> strs) {
        // If the list is empty, this returns an absolute empty string ""
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(DELIMETER);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        
        // Fix for strs = []: An absolute empty string means the original list was empty
        if (str.isEmpty()) {
            return result; 
        }
        
        // Pass -1 to preserve empty strings during the split
        String[] values = str.split(DELIMETER, -1);
        
        // Loop up to length - 1 to ignore the trailing empty space caused by the final delimiter
        for (int i = 0; i < values.length - 1; i++) {
            result.add(values[i]);
        }

        return result;
    }
}
