package ctest;

public class Lv1_2_0909 {
    public int solution(int number, int limit, int power) {
        int temp = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) { // 제곱근까지만 확인
                if (i % j == 0) {
                    cnt++; // j는 약수
                    if (j != i / j) {
                        cnt++; // i/j도 약수 (중복 방지)
                    }
                }
            }
            if (cnt > limit){
                temp += power;
            }else {
                temp += cnt;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        Lv1_2_0909 sol = new Lv1_2_0909();
        System.out.println(sol.solution(number, limit, power));
    }
}
