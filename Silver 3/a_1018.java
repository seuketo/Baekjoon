import java.io.*;
import java.util.*;

public class a_1018 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // a_count : B로 시작하는 체스판 배열
        int a_count = 0;
        // b_count : W로 시작하는 체스판 배열
        int b_count = 0;
        for (int i = 1; i <= n; i++){
            char[] arr = (br.readLine()).toCharArray();
            if (i % 2 == 0){
                for (int j = 1; j <= m; j++){
                    if (j % 2 == 0) {
                        // 짝수번째 줄 짝수번째 칸일 때 현재 칸이 B면 b_count++;
                        // 반대의 경우 a_count++;
                        if (arr[j - 1] == 'B'){
                            a_count++;
                        } else b_count++;
                    } else {
                        // 짝수번째 홀수 칸일 경우 현재 칸이 B면 
                        if (arr[j - 1] == 'B'){
                            b_count++;
                        } else a_count++;
                    }
                }
            } else {
                for (int j = 1; j <= m; j++){
                    if (j % 2 == 0) {
                        // 홀수번째 줄 짝수 번째 칸일 때 현재 칸이 B면 b_count++;
                        // 동일한 줄 짝수 번째 칸일 떄 현재 칸이 B면 a_count++;
                        if (arr[j - 1] == 'B'){
                            a_count++;
                        } else b_count++;
                    } else {
                        if (arr[j - 1] == 'B'){
                            a_count++;
                        } else b_count++;
                    }
                }
            }
        }
        System.out.println(Math.min(a_count, b_count));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_1018().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}



/*
import java.io.*;
import java.util.StringTokenizer;
public class a_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        //int m = Integer.parseInt(nm.nextToken());
        String sen = br.readLine();
        for (int i = 0; i < sen.length(); i+=2){
            String part = sen.substring(i, Math.min(i + 2, sen.length()));
            System.out.println(part);
        }
        br.close();
    }
}

// 2차원 배열
// 0,0에서 시작해서 동일한 경우는 + 1, 아닐 경우는 계속 반복
// 여기서 내가 생각할 수 없는 건, 최소한의 연속된 값을 가진 배열 자르기.

 */