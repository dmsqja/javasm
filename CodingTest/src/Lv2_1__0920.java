public class Lv2_1__0920 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"	));
        System.out.println(solution("for the last week"		));
    }
    public static String solution(String s) {
        String[] words = s.split(" ", -1);  // 공백을 포함하여 단어를 분리
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                // 첫 글자는 대문자로, 나머지는 소문자로 변환
                answer.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
            // 단어 사이에 공백 추가 (마지막 단어 뒤에는 공백 추가하지 않음)
            if (i < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();  // 최종 변환된 문자열 반환
    }
}