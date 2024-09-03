package variable;

import java.sql.Array;
import java.util.Arrays;

public class Var6 {
    public static void main(String[] args) {
        String str = "jmlee@tonesol.com";

        // 1. 전체 스트링 길이 출력
        int length = str.length();
        System.out.println(length);

        // 2. 메일의 아이디 만 출력 - jmlee
        String id = str.substring(0,str.indexOf("@"));
        System.out.println(id);

        // 3. 메일의 도메인 만 출력 - tonesol
        String domain = str.substring(str.indexOf("@")+1, str.indexOf("."));
        System.out.println(domain);

        // 4. 도메인 주소를 (tonesol.com) char array로 만들어 각 char 출력
        String domain2 = str.substring(str.indexOf("@")+1,str.length());
        System.out.println(domain2);
        char c[] = domain2.toCharArray();
        System.out.println(Arrays.toString(c));


    }
}
