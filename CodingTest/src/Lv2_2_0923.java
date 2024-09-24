public class Lv2_2_0923 {
    public static void main(String[] args) {
        System.out.println(new int[]{10,2});
        System.out.println(new int[]{8,1});
        System.out.println(new int[]{24,24});
    }
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];  // 정답 배열

        int area = brown + yellow; // 전체 공간

        // 가로 세로 공간은 최소 3칸이상
        int start = 3;
        int end = area/3;

        for (int w = start; w <= end; w++) {
            for (int h = start; h <=end ; h++) {
                if((w*h == area) && ((w-2)*(h-2) == yellow) && w>=h){
                    answer[0] = w;
                    answer[1] = h;
                    return answer;
                }
            }
        }
        return answer;
    }
}
