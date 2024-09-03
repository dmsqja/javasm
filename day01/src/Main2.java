public class Main2 {
    public static void main(String[] args) {
        //float f1 = 10.2; // 실수는 기본이 double 임. 오른쪽이 double 임. 그래서 상당히 큰 숫자는 double 로 표현함.
        float f1 = 10.2F;
        float f2 = 10.2F;
        float f3 = f1 + f2;
        System.out.println(f3);
        // 실수의 연산이 일어나면 결과를 float 에 담을 순 있음.(소수점 이하의 계산 때문이라고 함)

        double d1 = 10.2;
        int a = 10;
        int b = 3;
        int result = a/b; //3
        //double result2 = a/b; //3.0 왜냐 들어가기 전에 데이터 값이 정해지고 들어가기 때문에 3이 들어가야함
        double result3 = a*1.0/b;
        System.out.println(result3);

        System.out.printf("%3.4f",result3);

    }
}
