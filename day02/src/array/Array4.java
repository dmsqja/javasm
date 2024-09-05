package array;

public class Array4 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = {1,2,3,4,5};
        int c[] = new int[]{1,2,3,4,5};


        /* ------------------------------------------------------------- */

        int d[][] = new int[2][2];
        int e[][] = new int[2][];
        e[0] = new int[10];
        e[1] = new int[5];

        System.out.println(d.length);       //2개
        System.out.println(d[0].length);    //10개
        System.out.println(d[1].length);    //5개

        int f[][] = {{1,2,3},{4,5,6}};
        int g[][] = new int[][]{{1,2,3},{4,5,6}};
        int h[][];  //초기화가 안된 상태.null임
//        h = {{1,2,3},{4,5,6}}; 그래서 이건 안됨.
    }
}
