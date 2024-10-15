import java.util.*;
public class Lv1_3_1014 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo","kiki","eden"}, new String[]{"eden","kiki"}));
        System.out.println(solution(new String[]{"marina","josipa","nikola","vinko","filipa"}, new String[]{"josipa","filipa","marina","nikola"}));
        System.out.println(solution(new String[]{"mislav","stanko","mislav","ana"},new String[]{"stanko","ana","mislav"}));
    }
    public static String solution(String[] participant, String[] completion){
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        if(answer == ""){
            answer = participant[participant.length-1];
        }
        return answer;
    }
}
