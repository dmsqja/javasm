public class Lv1_1_0919 {
    public static void main(String[] args) {
        System.out.println(solution("34:33","13:00","00:55","02:55",new String[]{"next","prev"}));
        System.out.println(solution("10:55","00:05","00:15","06:55",new String[]{"prev","next","next"}));
        System.out.println(solution("07:22","04:05","00:15","04:07",new String[]{"next"}));
    }
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int total_len = 0;
        int iPos = 0, iOpStart = 0, iOpEnd;

        total_len = Integer.parseInt(video_len.split(":")[0]) * 60 +
                    Integer.parseInt(video_len.split(":")[1]);
        iPos = Integer.parseInt(pos.split(":")[0]) * 60 +
                Integer.parseInt(pos.split(":")[1]);
        iOpStart = Integer.parseInt(op_start.split(":")[0]) * 60 +
                    Integer.parseInt(op_start.split(":")[1]);
        iOpEnd = Integer.parseInt(op_end.split(":")[0]) * 60 +
                    Integer.parseInt(op_end.split(":")[1]);

        if(iPos >= iOpStart && iPos <= iOpEnd) {
            iPos = iOpEnd;
        }

        for (int i = 0; i < commands.length; i++) {
            if(commands[i].equals("next")) {
                iPos += 10;
                if(total_len - iPos < 10){
                    iPos = total_len;
                }
            }
            if(commands[i].equals("prev")) {
                iPos -= 10;
                if(iPos < 10){
                    iPos = 0;
                }
            }
            if(iPos >= iOpStart && iPos <= iOpEnd) {
                iPos = iOpEnd;
            }
        }
        answer = String.format("%02d:%02d", iPos / 60, iPos % 60);

        return answer;
    }
}
