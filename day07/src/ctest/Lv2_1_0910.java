package ctest;

import java.util.Stack;

public class Lv2_1_0910 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"	));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"	));
        System.out.println(solution("}}}"	));
    }
    public static int solution(String s) {
        int result = 0;

        // 문자열의 크기 == 회전 횟수
        for (int i = 0; i < s.length(); i++) {
            // i를 기준으로 substring 하기
            String rotatedStr = s.substring(i) + s.substring(0,i);
            Stack<Character> stack = new Stack<>();

            // 문자 한개씩 가져오기
            for (char c : rotatedStr.toCharArray()) {

                // stack이 비어있으면 추가하고 continue
                if (stack.isEmpty()) {
                    stack.push(c);
                    continue;
                }

                // ) } ] 값이 들어왔을 때 stack 제일 위에있는 요소가 매칭이 되면 삭제하기
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                    continue;
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }

                // 매칭이 되지 않거나 { [ ( 가 들어오면 stack에 넣기
                stack.push(c);
            }

            // 전부 돌았을 때 stack의 크기가 0(모두 매칭되어 삭제됐을 때)일 때 result + 1하기
            if (stack.size() == 0) {
                result += 1;
            }
        }

        return result;
    }
}
