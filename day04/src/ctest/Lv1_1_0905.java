package ctest;

public class Lv1_1_0905 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 0; i < count; i++) {
            answer += price * (i + 1);
        }

        return answer>money ? answer-money : 0;
    }
    public static void main(String[] args) {
        int p = 3;
        int m = 20;
        int c = 4;
        Lv1_1_0905 sol = new Lv1_1_0905();
        int result = (int) sol.solution(p,m,c);
        System.out.println(result);


    }
}
