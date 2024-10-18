package ctest_1015;

public class Lv1_2_1015 {
    public static void main(String[] args) {
        System.out.println(solution("2022.05.19",
                            new String[]{"A 6", "B 12", "C 3"},
                            new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}
                            ));
    }

    public static int[] solution(String today, String[] terms, String[] privacies){
        int[] answer = {};

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            System.out.println(privacyInfo);
        }
        return answer;
    }
}
