package ctest;

import java.util.*;

public class Lv2_1_0912 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
        System.out.println(solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }

    static HashMap<String, Integer> wants = new HashMap<>();
    static HashMap<String, Integer> cur = new HashMap<>();
    static List<String> keys;
    public static int solution(String[] want, int[] number, String[] discount) {

        int answer = 0;

        for(int i = 0; i < want.length; i++){
            wants.put(want[i], number[i]);
        }
        keys = new ArrayList<>(wants.keySet());

        for(int i = 0; i < 10; i++){
            cur.put(discount[i], cur.getOrDefault(discount[i], 0) + 1);
        }

        if(validation()) answer++;

        for(int i = 10; i < discount.length; i++) {
            cur.put(discount[i - 10], cur.get(discount[i - 10]) - 1);
            cur.put(discount[i], cur.getOrDefault(discount[i], 0) + 1);
            if(validation()) answer++;
        }

        return answer;
    }
    public static boolean validation() {
        for(String key : keys){
            if(cur.getOrDefault(key, 0) < wants.get(key)) return false;
        }
        return true;
    }
}
