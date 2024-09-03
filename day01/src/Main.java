//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int a = 3000000000; 이것도 안댐
        int a = 300000000;
        //byte b1 = 200; 이거 안댐
        byte b1 = 100;
        byte b2 = (byte)200;
        System.out.println(b2); //-56

        byte num1 = 100;
        byte num2 = 100;
        //byte num3 = num1 + num2;
        //byte num3 = (byte) (num1 + num2);
        int num3 = num1 + num2;
        System.out.println(num3);

        //long num4 = 3000000000; //정수는 기본적으로 int 형식이라 오른쪽부터 걸림.
        long num4 = 3000000000L; //L을 써야댐
        long num5 = 1500000000L + 1500000000L;
        System.out.println(num5);

        int i1 = 1500000000;
        int i2 = 1500000000;
        //long result = i1 + i2;
        long result = i1*1L + i2*2L;
        System.out.println(result);
    }
}