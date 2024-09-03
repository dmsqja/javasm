package ctest;

import java.util.Scanner;

public class Lv1_3_0902 {
    public long solution(long n) {
        long answer = -1;
        for (int i = 1; i < n; i++) {
            if (n == i*i) {
                answer = (i+1) * (i+1);
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number n..?");
        int n = sc.nextInt();
        Lv1_3_0902 sol = new Lv1_3_0902();
        long result = sol.solution(n);
        System.out.println(result);
    }
}
