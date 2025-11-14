/*
    문제

    당신은 요리하기로 결정했습니다. 음식을 요리하려면 N개의 재료가 필요합니다. 각 재료에 대해 집에 이미 있는 양, 총 필요한 양, 구입해야 하는 경우 재료 비용을 알고 있습니다. 
    따라서 누락된 각 재료의 양을 구입해야 합니다. 음식 조리 비용을 계산하는 것이 문제입니다.

    입력

    첫 번째 줄은 재료의 수인 정수 N으로 구성됩니다.

    다음 N 줄은 당신이 가진 양, 필요한 양, 비용을 나타내는 세 개의 정수 H, B, K로 구성됩니다.

    출력

    재료의 총 비용인 단일 정수를 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_26933 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[i] = Integer.parseInt(st.nextToken());
                System.out.println(arr[i]);
            }
            if (arr[1] - arr[0] > 0) sum += ((arr[1] - arr[0]) * arr[2]);
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_26933().run();
    }
}
