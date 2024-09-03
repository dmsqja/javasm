package variable;

public class Var4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int result = a + b; //기본 타입 / 여기까지는 스택에 값이 들어감
        System.out.println(result);

        String str = "Hello";   //참조 타입 / 하지만 여기는 "Hello"에 대한 주소값이 스택에 들어감
        System.out.println(str);    //통상적으로 자바에서는 뒤에 .toString() 이 생략된거임.
                                    // 그래서 주소값을 출력하는 게 아니라 주소가 가지고 있는 메모리 영역의 Hello 를 출력하는 거임
        String str2 = new String("Hello");  //여기 Hello 는 새롭게 만든 Hello 이기 때문에 주소값이 달라짐
        System.out.println(str2);

        String str3 = "Hello";  //기존에 있던 "Hello"가 있는지 찾고, 있으면 그 주소값을 넣음 : 따라서 스택에선 str1 과 str3 의 주소값은 같음
        System.out.println(str3);

        String str4 = new String("Hello");  //여기도 마찬가지로 또 다시 새롭게 만든 Hello 이기에 주소값이 str2 와 다름
        System.out.println(str4);
    }
}
