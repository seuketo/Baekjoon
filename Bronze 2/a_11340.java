/*
문제
바구니 짜기 입문 수업의 기말고사를 앞둔 당신은 수업 평균 최소 90점을 맞기 위해 기말고사에서 받아야 하는 최소 점수를 알려고 합니다. 
가중 평균은 점수와 가중치를 모두 반영합니다. 이 수업은 네 가지로 성적이 결정되는데, 프로젝트 15%, 에세이 20%, 중간고사 25%, 기말고사 40%가 반영됩니다. 
프로젝트, 에세이, 중간고사 점수가 주어질 때 수업 평균 최소 90점을 받기 위한 최소 기말고사 성적을 계산해 출력합시다. 기말고사 점수는 0점부터 100점까지 가능합니다. 
최소 90점을 받는 것이 불가능할 경우 프로그램은 그에 상응하는 메시지를 출력해야 합니다.

입력
여러 개의 테스트 케이스가 주어집니다. 입력은 테스트 케이스의 수를 나타내는 하나의 정수로 시작됩니다. 이후 프로젝트 점수, 에세이 점수, 중간고사 점수를 각각 나타내는 세 정수 리스트가 여러 개 주어집니다.

출력
각 테스트 케이스에 대해 수업 평균 최소 90점을 만족하는 기말고사의 최소 점수를 출력하거나, 90점을 획득하는 것이 불가능할 경우 단어 "impossible"을 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_11340 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            double d = (90 - ((a * 0.15) + (b * 0.2) + (c * 0.25))) / 0.4;
            if (d > 100) sb.append("impossible\n");
            else sb.append(Math.round(d) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_11340().run()
    }
}

/*
 - 총 100%로 최소 90점은 받아야 함.
    - 프로젝트  15%
    - 에세이    20%
    - 중간고사  25%
    - 기말고사  40%

 - 기말고사 점수를 제외한 나머지 3개의 점수가 입력되고, 해당 점수와 비율을 바탕으로 받아야 하는 기말고사 점수를 계산하여 출력.
    - 90점을 획득할 수 없으면 impossible을 출력.

*/
