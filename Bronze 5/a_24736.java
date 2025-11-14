/*
문제

프로 미식 축구의 득점 방법은 총 다섯 개입니다:

1. 터치 다운 - 6점

2. 필드 골 - 3점

3. 상대의 자책골 - 2점

4. 터치다운 이후

    a. 1점 (필드 골 또는 상대의 자책골) - 흔히 "엑스트라 포인트"라고 합니다.

    b. 2점 (터치 다운) - 흔히 "투 포인트 컨버전"이라고 합니다.

(자세한 내용은 https://operations.nfl.com/the-rules/nfl-video-rulebook/scoring-plays/를 참고합시다.)

두 팀의 박스 스코어가 주어졌을 때, 각 팀의 점수를 구해봅시다.

입력

각각 터치 다운, 필드 골, 상대 자책 골, 엑스트라 포인트, 투 포인트 컨버전의 수를 나타내는 공백으로 나누어진 다섯 정수 T, F, S, P, C가 각각 한 줄씩 총 두 줄에 입력됩니다. 
(0 <= T <= 10, 0 <= F <= 10, 0 <= S <= 10, 0 <= P + C <= T). 첫 줄은 원정 팀의 박스 스코어를, 둘째 줄은 홈 팀의 박스 스코어를 의미합니다.

출력

원정 팀의 점수와 홈 팀의 점수를 나타내는 두 정수를 공백을 두고 한 줄에 출력합니다.  
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_24736 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
    for (int i = 0; i < 2; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int j = 0; j < 10; j += 2){
            switch (j){
                case 0 : 
                    sum += Integer.parseInt(st.nextToken()) * 6;
                    break;
                case 2 : 
                    sum += Integer.parseInt(st.nextToken()) * 3;
                    break;
                case 4 : 
                    sum += Integer.parseInt(st.nextToken()) * 2;
                    break;
                case 6 : 
                    sum += Integer.parseInt(st.nextToken()) * 1;
                    break;
                case 8 : 
                    sum += Integer.parseInt(st.nextToken())  * 2;
                    break;
                default : 
                    break;
            }
        }
        sb.append(sum + " ");
    }
    System.out.println(sb);
    br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_24736().run();
    }
}

/* 79247867, 16020KB, 124ms, 885B
//배열 인덱스를 바탕으로 배열 요소끼리 곱하는 방식. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[2][5];

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] point = {6, 3, 2, 1, 2};
        int[] sum = new int[2];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum[i] += point[j]*arr[i][j]; 
            }
        }

        System.out.println(sum[0] + " " + sum[1]);
    }
}
 */