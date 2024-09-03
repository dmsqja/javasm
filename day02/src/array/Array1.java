package array;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int a [] = new int[3];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100)+1;
        }
//        System.out.println(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {    //이건 좀 더 조건을 달 수 있는 for 문
            System.out.println(a[i]);
        }

        for(int n:a){   //for 문 돌리면서 다 끄집어내는 코드
            System.out.println(n);
        }



    }
}
