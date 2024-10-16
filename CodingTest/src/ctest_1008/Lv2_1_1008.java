package ctest_1008;

public class Lv2_1_1008 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        int[][] result = solution(arr1, arr2);

        for (int[] row : result) {
            for (int val : row) {
                System.out.println(val + "");
            }
            System.out.println();
        }
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int cols2 = arr2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i <rows1; i++) {
            for (int j = 0; j <cols2; j++) {
                for (int k = 0; k <cols1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }
}
