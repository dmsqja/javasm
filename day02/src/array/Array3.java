package array;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];  //빨간색 줄은 초기화가 안됐다는 소리임. 그래서 크기가 몇인지 넣어줘야함 ex. 5행 5열
        Random rand = new Random();
        //1~100 까지의 랜덤한 숫자를 각 인덱스에 넣고
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(100)+1;
            }
        }
        //예쁘게 출력 하시오
        for(int n[]:a){
            for(int num:n){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
