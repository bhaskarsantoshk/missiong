package leetcode;
import java.util.Stack;

public class P20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c= s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if( c == ')' ){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if( c == ']' ){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if( c == '}' ){
                if(!stack.isEmpty() && stack.peek() == '{' ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
            return false;
        }
        public static void main(String args[]){
            P20ValidParentheses obj= new P20ValidParentheses();
            System.out.println(obj.isValid("(())"));
        }
}
