package ctest;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1_1_0902 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number n..?");
        int n = sc.nextInt();
        System.out.println("Input Number x..?");
        int x = sc.nextInt();
        Lv1_1_0902 sol = new Lv1_1_0902();
        long[] result = sol.solution(x, n);
        System.out.println(Arrays.toString(result));
    }
}
