package ctest_1008;

public class Lv1_1_1008 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));

    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        // 1. 좌표를 구하기 위해 *은 10, 0은 11, #은 12로 생각한다.
        int left = 10;
        int right = 12;

        // 2. 누르는 횟수만큼 반복.
        for(int i = 0; i < numbers.length; i++){
            // 2-1. 1,4,7은 왼손으로 누르고 왼손의 위치를 갱신한다.
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                left = numbers[i];
                continue;
            // 2-2. 3,6,9는 오른속으로 누르고 오른손의 위치를 갱신한다.
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                right = numbers[i];
                continue;
            // 2-3. 중앙의 번호들은 거리에 따라 누르게 된다.
            } else{
                // 2-3-1. 중앙의 0이면 번호는 11로 생각하며 아니면 해당 번호를 대입한다.
                int x = numbers[i] == 0 ? 11 : numbers[i];
                // 2-3-2. 왼손과 오른손으로부터 중앙의 번호화의 거리를 맨해튼 거리 측정법으로 구한다.
                int l_length = Math.abs((x-1)/3 - (left-1)/3) + Math.abs((x-1)%3 - (left-1)%3);
                int r_length = Math.abs((x-1)/3 - (right-1)/3) + Math.abs((x-1)%3 - (right-1)%3);
                // 2-3-3. 구한 거리가 같은 경우 hand에 따라 갱신해준다.
                if(l_length == r_length){
                    if(hand.equals("right")){
                        answer += "R";
                        right = x;
                    }else{
                        answer += "L";
                        left = x;
                    }
                }
                // 2-3-4. 왼손으로부터의 거리가 짧은 경우는 왼손을, 오른손으로부터의 거리가 짧은 경우는 오른손으로 갱신한다.
                else {
                    if(l_length < r_length){
                        answer += "L";
                        left = x;
                    }else{
                        answer += "R";
                        right = x;
                    }
                }
            }
        }
        return answer;
    }
}
