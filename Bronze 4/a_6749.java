/*
문제

세 아이가 사는 가족이 있습니다. 셋의 나이는 등차수열을 이룹니다: 둘째 아이와 막내의 나이 차이는 첫째 아이와 둘째 아이의 나이 차이와 같습니다. 

예를 들어 세 아이의 나이는 5, 10, 15가 될 수 있는데, 인접한 둘의 나이 차이가 항상 5이기 때문입니다.

막내와 둘째 아이의 나이가 주어질 때, 첫째 아이의 나이는 얼마일까요?

입력

입력은 두 정수로, 각각 다른 줄에 주어집니다. 첫째 줄 Y는 가장 어린 아이의 나이이며 (0 <= Y <= 50), 둘째 줄 M은 둘째 아이의 나이입니다 (Y <= M <= 50).

출력

출력은 첫째 아이의 나이가 되어야 합니다.
*/
/*
import java.util.Scanner;
public class a_6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(m + (m - y));
        sc.close();
    }
}
*/

import java.io.*;
public class a_6749{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        System.out.println(m + (m - y));
        br.close();
    }
}

