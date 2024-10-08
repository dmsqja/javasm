package ctest;

import java.util.*;

public class Lv1_1_0911 {
    public static void main(String[] args) {
        System.out.println(solution( new int[]{1,3,2,5,4},9));
        System.out.println(solution( new int[]{2,2,3,3},10));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}