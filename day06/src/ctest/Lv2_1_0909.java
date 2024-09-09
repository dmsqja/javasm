package ctest;


import java.util.Stack;
public class Lv2_1_0909 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }

            if(stack.peek() == '(' && c == ')'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
