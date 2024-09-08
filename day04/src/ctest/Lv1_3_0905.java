package ctest;

public class Lv1_3_0905 {
    public String solution(String s){
        int h = s.length()/2;
        if (s.length() % 2 == 0){
            return s.substring(h-1,h+1);
        }else { return s.substring(h,h+1);}

    }

    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(new Lv1_3_0905().solution(s));
    }
}
