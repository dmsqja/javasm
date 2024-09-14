package ctest;

public class Lv1_1_0910 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }
    public static int solution(String dartResult) {
        int result = 0;
        int previousPoint = 0;
        int currentPoint = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if(c == '1' && dartResult.charAt(i+1) == '0') {
                result += previousPoint;
                previousPoint = currentPoint;
                currentPoint = 10;
                i++;
                continue;
            }
            if(c >= '0' && c <= '9') {
                result += previousPoint;
                previousPoint = currentPoint;
                currentPoint = c - '0';
                continue;
            }

            if(c == 'S') {
                continue;
            } else if (c == 'D') {
                currentPoint *= currentPoint;
                continue;
            } else if (c == 'T') {
                currentPoint *= currentPoint * currentPoint;
                continue;
            }

            if (c == '*'){
                previousPoint *= 2;
                currentPoint *= 2;
            } else if (c == '#') {
                currentPoint *= -1;
            }
        }

        result += previousPoint + currentPoint;

        return result;
    }
}
