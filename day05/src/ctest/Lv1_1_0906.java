package ctest;

public class Lv1_1_0906 {
    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int sum = arr1[i] | arr2[i];

            String binary = String.format("%" + n + "s", Integer.toBinaryString(sum));

            answer[i] = binary.replace('1', '#').replace('0', ' ');
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv1_1_0906 solution = new Lv1_1_0906();
    }

}
