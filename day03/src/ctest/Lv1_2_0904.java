package ctest;

import java.util.Arrays;

public class Lv1_2_0904 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,1,2,3};
        Lv1_2_0904 l = new Lv1_2_0904();
        int result = l.solution(arr);
        System.out.println(result);

    }
}
