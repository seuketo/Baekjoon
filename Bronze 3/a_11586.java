import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class a_11586 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        int k = Integer.parseInt(br.readLine());

        if (k == 1) for (int i = 0; i < n; i++) sb.append(arr[i] + "\n");
        else if (k == 2) 
            for (int i = 0; i < n; i++){
                List<String> arr2 = Arrays.asList(arr[i].split(""));
                Collections.reverse(arr2);
                String sen = "";
                for (String a : arr2) sen += a; 
                sb.append(sen + "\n");
            }
        else for (int i = 0; i < n; i++) sb.append(arr[n - (i + 1)] + "\n");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_11586().run();
    }
}

/*
 - 거울은 정사각형 모양.
 - 거울의 심리상태에 따라 좌/우 또는 상/하로 반전시켜 비춤.
 - 심리상태는 1에서 3까지의 자연수, 숫자가 클수록 더 화가 난 상태.
    - 1 : 모습 그대로 표현
    - 2 : 좌/우 반전
    - 3 : 상/하 반전

 => 거울의 크기 n (2 <= n <= 100)
 => n개의 줄에 걸쳐 각 줄마다 n개의 문자 표현.
 => 마지막 줄에 심리상태 k가 주어짐.
 */