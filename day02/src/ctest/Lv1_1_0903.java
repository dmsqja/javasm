package ctest;

import java.util.Scanner;

/**
 자연수 n이 매개변수로 주어집니다.
 n을 x로 나눈 나머지가 1이 되도록 하는
 가장 작은 자연수 x를 return 하도록
 solution 함수를 완성해주세요.
 답이 항상 존재함은 증명될 수 있습니다.
 **/

public class Lv1_1_0903 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer += i;
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number n: \n");
        int n = sc.nextInt();
        Lv1_1_0903 sol = new Lv1_1_0903();
        long result = sol.solution(n);
        System.out.println(result);
    }
}
