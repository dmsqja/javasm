package ctest;

import java.util.Arrays;

public class Lv1_1_0904 {
    public int[] solution(int []arr) {
        int[] temp = new int[arr.length];
        int cnt = 0;

        // 첫 번째 원소는 중복될 수 없으므로 바로 추가
        temp[cnt++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                temp[cnt++] = arr[i];
            }else{
                temp[cnt] = arr[i];
            }
        }
        // 결과 배열을 cnt 크기만큼 복사하여 반환
        int[] answer = Arrays.copyOf(temp, cnt);
        return answer;
    }
    public static void main(String[] args) {
        int []arr = {1,1,3,3,0,1,1};
        Lv1_1_0904 sol = new Lv1_1_0904();
        int []result = sol.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
