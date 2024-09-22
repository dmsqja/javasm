public class Lv1_2_0919 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
    public static String solution(String phone_number) {

        // StringBuilder 객체를 생성하여 결과 문자열을 만들기 위해 사용
        StringBuilder sb = new StringBuilder();

        // 전화번호의 각 문자에 대해 반복
        for (int i = 0; i < phone_number.length(); i++) {

            // 마지막 4자리가 아닌 경우 '*'를 추가
            if (i < phone_number.length() - 4) {
                sb.append("*");
            } else {
                sb.append(phone_number.charAt(i));
            }
        }

        // StringBuilder를 문자열로 변환하여 반환
        return sb.toString();
    }
}