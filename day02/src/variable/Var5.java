package variable;

public class Var5 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        if (s1 == s2) { //이건 주소가 같은지 확인 여부
            System.out.println("s1 equals s2");
        }else {
            System.out.println("s1 not equals s2");
        }

        if (s1.equals(s4)) {    //이건 값이 같은지 확인 여부
            System.out.println("s1 equals s4");
        }else {
            System.out.println("s1 not equals s4");
        }
    }
}
