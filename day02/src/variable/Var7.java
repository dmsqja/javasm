package variable;

public class Var7 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello");    //원래 스트링을 한번 만들면 변경이 불가하지만,

        System.out.println(sb);
        sb.append("World"); //이 새기는 가능함
        System.out.println(sb);
    }
}
