package ctest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lv1_2_0906 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if(arr.size() < k){
                arr.add(score[i]);
            }else {
                int min = arr.get(0);
                if(score[i] > min){
                    arr.remove(0);
                    arr.add(score[i]);
                }
            }
            Collections.sort(arr);
            answer[i] = arr.get(0);

        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        System.out.println("Enter score length");
        int n = scanner.nextInt();

        int[] score = new int[n];
        System.out.println("Enter score: ");
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }

        Lv1_2_0906 lv1 = new Lv1_2_0906();
        int[] result = lv1.solution(k, score);

        System.out.println("Result:");
        for (int r : result) {
            System.out.println(r);
        }

        scanner.close();
    }
}
