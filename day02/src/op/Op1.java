package op;

public class Op1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a++ > 0 || b++ < 0){ // | 이건 하나짜리라 결국 양쪽 다 변하게 됨 / || 이건 두개짜리 or 인데 앞에서 충족하면 뒤에건 실행 안함
            System.out.println("ok");
        }else {
            System.out.println("fail");
        }
        System.out.printf("%d, %d \n", a, b);
    }
}
