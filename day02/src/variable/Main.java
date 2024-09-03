package variable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "Java";
        int num = 100;
        double num2 = 10.25555;
        System.out.printf("%s 이고 %d 이고 %10.3f \n",str,num,num2);
        System.out.printf("OK \n");
        System.out.printf("%d \n",num); //2진수
        System.out.printf("%o \n",num); //8진수
        System.out.printf("%x \n",num); //16진수 진수에 대한 변환이 자유로워야 한다(이거 한번 알아보기)
    }
}