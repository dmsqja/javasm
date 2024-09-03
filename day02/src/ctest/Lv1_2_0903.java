package ctest;

import java.util.Scanner;

/**
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서
    return 하는 solution 함수를 만들어 주세요.
    예를 들어 N = 123이면 1 + 2 + 3 = 6을
    return 하면 됩니다.
 **/

public class Lv1_2_0903 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            System.out.printf("answer : %d \n", n%10);
            n /= 10;
            System.out.printf("n : %d \n", n);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number n : \n");
        int n = sc.nextInt();
        Lv1_2_0903 sol = new Lv1_2_0903();
        int result = sol.solution(n);
        System.out.println(result);
    }
}
