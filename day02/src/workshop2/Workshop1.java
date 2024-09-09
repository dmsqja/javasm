package workshop2;

import java.util.Random;

public class Workshop1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max = 0;
        int min = 10;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10)+1;
            for (int j = 0; j < i; j++) {
                if(a[j] == a[i]) {
                    i--;
                }
            }
            if (a[i] > max) {
                max = a[i];
            }else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
