import java.util.Stack;

public class Lv2_1_0923 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        // 문자열의 각 문자를 순차적으로 확인
        for(char c : s.toCharArray()) {
            // 스택이 비어있지 않고, 현재 문자와 스택의 마지막 문자가 같으면 제거
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                // 같지 않으면 스택에 추가
                stack.push(c);
            }
        }
        //스택이 비어있으면 문자열이 모두 짝지어 제거된 상태
        return stack.isEmpty() ? 1 : 0;
    }
}
