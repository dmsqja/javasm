package ctest;

public class Lv1_3_0904 {
    public int[] solution(int[] array, int[][] commands) {
        int[] temp = new int[commands.length];
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];

            int length = j - i + 1;

            int[] subArray = new int[length];

            for (int m = 0; m < length; m++) {
                subArray[m] = array[i - 1 + m];
            }

            for (int l = 0; l < subArray.length; l++) {
                for (int m = l + 1; m < subArray.length; m++) {
                    if (subArray[l] > subArray[m]) {
                        int tmp = subArray[m];
                        subArray[m] = subArray[l];
                        subArray[l] = tmp;
                    }
                }
            }
            temp[n] = subArray[k - 1];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        Lv1_3_0904 l = new Lv1_3_0904();
        int result = l.solution(arr);
        System.out.println(result);
    }

    private int solution(int[] arr) {
        return 0;
    }
}
