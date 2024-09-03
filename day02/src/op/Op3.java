package op;

public class Op3 {
    public static void main(String[] args) {
        String s1 = null;
        int a = 10;
        int b = 20;
//        if(a > b){
//            s1 = "big";
//        }else {
//            s1 = "small";
//        }
        // 위에 친구를 삼항 연산자로 해보기
        s1 = (a>b) ? "big" : "small";

        System.out.println(s1);
    }
}
