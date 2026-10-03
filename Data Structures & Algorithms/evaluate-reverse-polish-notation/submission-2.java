class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        String operations = "+-*/";

        for(String token: tokens){
            if(operations.contains(token)){
                int a = stack.pop();
                int b = stack.pop();
                int result = -1;

                if(token.equals("+")){ 
                    result = a + b;
                } else if(token.equals("-")){ 
                    result = b - a;
                } else if(token.equals("*")){ 
                    result = a * b;
                } else if(token.equals("/")){ 
                    result = b / a;
                }

                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
