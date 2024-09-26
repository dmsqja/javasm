import java.util.*;

public class Lv2_1_0925 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1,3,2,5,4,5,2,3}));
        System.out.println(solution(4, new int[]{1,3,2,5,4,5,2,3}));
        System.out.println(solution(2, new int[]{1,1,1,1,2,2,2,3}));
    }
    public static int solution (int k, int[] tangerine){

        // 결과를 저장할 변수
        int result = 0;

        // 귤의 크기와 해당 크기의 개수를 저장할 HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // 귤의 크기별로 개수를 세어 HashMap에 저장
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // HashMap의 키(귤의 크기) 리스트 생성
        List<Integer> keyset = new ArrayList<>(map.keySet());

        // 귤의 개수를 기준으로 내림차순 정렬
        keyset.sort((size1, size2) -> map.get(size2) - map.get(size1));

        // 많은 개수의 귤의 크기부터 순서대로 k에서 뺌
        for (Integer size : keyset) {
            k -= map.get(size);
            result++;

            //k가 0 이하가 되면 종료
            if (k <= 0) {
                return result;
            }
        }
        return result;
    }
}
