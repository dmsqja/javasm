package ctest;

import java.awt.*;
import java.util.ArrayList;

public class Lv2_1_0911 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    public int solution(int n) {
        int answer = 0;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for(int i = 0; i < n; i++) {
            fibonacci.add((fibonacci.get(i) + fibonacci.get(i+1)) % 1234567);
        }
        answer = fibonacci.get(n);
        return answer;
    }
}
