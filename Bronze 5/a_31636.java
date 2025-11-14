/*
문제
길이 N의 문자열 S가 주어진다. S의 각 문자는 o 또는 x 중 하나이다.
S에 o가 3개 연속되어 있는 부분이 있으면 Yes를, 그렇지 않으면 No를 한 줄로 출력하라.
단, o가 3개 연속되어 있는 곳 옆에 o가 있어도 Yes로 한다.

입력
입력은 다음과 같은 형식으로 주어진다.
N
S

출력
S에 o가 3개 연속된 부분이 있으면 Yes를, 그렇지 않으면 No를 출력하라.

제한
1 ≦ N ≦ 100 000．.
S는 길이 N의 문자열이다.
S의 각 문자는 o 또는 x 중 하나이다.
N은 정수이다.

서브태스크
번호 배점 제한
1   40  N=5.
2   60  추가적인 제약은 없다.
 */
import java.io.*;
public class a_31636 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        String[] arr = (br.readLine()).split("");
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i].equals("o")) count++;
            else count = 0;
            if (count == 3) break;
        }
        if (count == 3) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31636().run();
    }
}
