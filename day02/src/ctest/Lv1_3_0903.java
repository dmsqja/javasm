package ctest;

import java.util.Scanner;

public class Lv1_3_0903 {
    public int solution(int num) {
        int cnt = 0;
        while (num != 1){
            if (cnt > 500) {
                return -1;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1){
                num *= 3;
                num++;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num : \n");
        int num = sc.nextInt();
        Lv1_3_0903 sol = new Lv1_3_0903();
        int result = sol.solution(num);
        System.out.println(result);
    }
}
