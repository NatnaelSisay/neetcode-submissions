class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        String openings = "({[";
        Map<Character, Character> pair = new HashMap<>();
        
        pair.put('}', '{');
        pair.put(')', '(');
        pair.put(']', '[');

        for(char c: s.toCharArray()){
            if(openings.indexOf(c) != -1){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                if(stack.pop() != pair.get(c)) return false;
            }
        }

        return stack.isEmpty();
    }
}
