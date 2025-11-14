import java.io.*;
import java.util.*;
public class a_2775{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            int k = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) arr[j] = j + 1;
            arr = sumN(arr, k);
            sb.append(arr[n - 1] + "\n");
        }
        System.out.println(sb.toString());
        br.close();
    }

    public void showarr(int[] Array){
        for (int i = 0; i < Array.length; i++) System.out.print(Array[i] + " ");
    }

    public int[] sumN(int[] arr, int k){
        int[] change = arr;
        for (int i = 0; i < k; i++){
            for (int j = 0; j < arr.length; j++){
                // 1번째 숫자는 1로 고정
                if (j == 0) {
                    change[j] = arr[j];
                    continue;
                }
                // 그 외의 경우
                change[j] += change[j - 1];
            }
        }
        return change;
    }

    public static void main(String[] args){
        try{
            new a_2775().run();
        } catch(IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}


/*
 * a층의 b호에 살고 싶다면 자신의 아래(a-1)층의 1~b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
    => 아래층에 살고 있는 모든 사람들의 합이 해당 호수에 들어가야 함.
 * 비어있는 집은 없음, 0층부터 존재하며 0층 i호엔 i명이 살고 있다.
    => 0층 1호는 1명, 2호는 2명 ...
    if) i == 3이라면 0층에는 총 6명이 생활, 1층의 각 호수에는 0층의 합인 6명씩 살고 있고, 
        2층의 각 호수에는 1층의 합인 18명이 생활.

 Q. k층의 n호에는 몇 명의 사람들이 살고 있는지?
    => 0층부터 스택을 쌓아 올라가야 함. 0층의 합만 알면 (층의 총 호수 * 해당 층 한 호수당 생활 인원)
 */
