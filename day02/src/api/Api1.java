package api;

import java.util.Random;
import java.util.Scanner;

public class Api1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = 0;
        try{
            number = sc.nextInt();
        }catch (Exception e){
            System.out.println("Invalid number.. Try again.");
            sc.close();
            return; //break 는 for 문 while 문에만 쓰임. return 은 진행을 막아주는 역할도 함
        }
        //예외 상황에 대한 가장 기본적인 형식임. 이거 좀 중요할 듯 오후에 한번 알아보자

        Random rand = new Random();
        int num = rand.nextInt(number) + 1; // 0 ~ 9 / 뒤에 1을 더하게 되면 0 ~ 10 까지가 됨
        System.out.println(num);
        sc.close(); //스캐너를 System 으로 열어뒀으면 꼭 닫아야 함. 안그러면 os가 계속 실행되는 줄 알고있음


    }
}
