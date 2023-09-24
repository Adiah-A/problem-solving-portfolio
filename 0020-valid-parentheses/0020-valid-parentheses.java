class Solution {
    public boolean isValid(String s) {
        /*We can have a stack that that pushes oopening brackets and pops them 
        off once a corresponding losing bracket is found
        For popping off,  we need to make sure anything we find a closing bracket, we try matching it to what is at teh top of the stack
        if they do not match, then we return false. The order is not correct.
        
        
        Declare a stack
        enter a for loop taht goes for each character in s.toCharArray
        if teh curr character is any of {, (, or [, we push it to teh stack
        else if it is } and teh stack is not empty and peeking the stack reveals this {, we pop from teh stack
        else if it is ) and teh stack is not empty and peeking the stack reveals this (, we pop from teh stack
        else if it is ] and teh stack is not empty and peeking the stack reveals this [, we pop from teh stack
        else return false

        at the end, return true i fthe stack is empty
        */

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else{
                return false;
            }
        }

        return (stack.isEmpty())? true : false;
        
    }
}