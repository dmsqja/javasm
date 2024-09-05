package ctest;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1_1_0904 {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                answer[cnt++] = arr[i-1];
            }else{
                answer[cnt] = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int []arr = {1,1,3,3,0,1,1};
        Lv1_1_0904 sol = new Lv1_1_0904();
        int []result = sol.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
