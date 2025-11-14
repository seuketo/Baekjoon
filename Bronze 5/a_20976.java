/*
문제

세 정수 A, B, C가 주어집니다. 이중 두 번째로 큰 수를 출력합시다.

입력

아래의 형식으로 표준 입력이 주어집니다.

A B C

출력

A, B, C 중 두 번째로 큰 수를 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class a_20976 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        System.out.println(arr[1]);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_20976().run();
    }
}

/*
        if (arr[0] >= arr[1]){
            if (arr[0] <= arr[2]) sb.append(arr[0]);
            else{
                if (arr[1] >= arr[2]) sb.append(arr[1]);
                else sb.append(arr[2]);
            }
        } else{
            if (arr[1] <= arr[2]) sb.append(arr[1]);
            else{
                if (arr[0] >= arr[2]) sb.append(arr[0]);
                else sb.append(arr[2]);
            }
        }
 */