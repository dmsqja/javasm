package ctest;

import java.util.Scanner;

public class Lv1_2_0902 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number n..?");
        int n = sc.nextInt();
        Lv1_2_0902 sol = new Lv1_2_0902();
        int result = sol.solution(n);
        System.out.println(result);
    }
}
