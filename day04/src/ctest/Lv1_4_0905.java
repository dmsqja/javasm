package ctest;

public class Lv1_4_0905 {
    public int solution(String s){
        s = s.replace("one","1");
        s = s.replace("two","2");
        s = s.replace("three","3");
        s = s.replace("four","4");
        s = s.replace("five","5");
        s = s.replace("six","6");
        s = s.replace("seven","7");
        s = s.replace("eight","8");
        s = s.replace("nine","9");
        s = s.replace("zero","0");

        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Lv1_4_0905 obj = new Lv1_4_0905();
        System.out.println(obj.solution("one4seveneight"));
    }
}
