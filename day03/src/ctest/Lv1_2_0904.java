package ctest;

import java.util.Arrays;

public class Lv1_2_0904 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length * (number.length-1); i++) {

        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 3, 0, 2, -5};
        Lv1_2_0904 l = new Lv1_2_0904();
        int result = l.solution(arr);
        System.out.println(result);

    }
}
