package ctest;

public class Lv2_2_0912 {
    public static void main(String[] args) {
        System.out.println(solution(8,4,7));
    }
    public static int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
