import java.io.*;
import java.util.*;

public class a_2609 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int r = 0;
        int i1 = a;
        int i2 = b;
        while (true){
            r = i1 % i2;
            if (r == 0) break;
            i1 = i2;
            i2 = r;
        }
        int max_sub = i2;
        sb.append(max_sub).append("\n");
        int min_mul = (a * b) / max_sub;
        sb.append(min_mul);
        System.out.println(sb);
        br.close();
    }   
    public static void main(String[] args) throws IOException{
        try{
            new a_2609().run();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    } 
}

/*
 * 유클리드 호제법
    - 최대공약수
        => a와 b가 주어질 경우
        1. a = a / b + (a % b)(=r)
        2. b = b / r + (b % r)(=r2)
        3. r = r / r2 + 0
        나머지가 0이 나오는 경우 해당 경우 이전의 나머지가 최대공약수 (해당 예시에선 r이 최대공약수)

        예시를 들면,
        1. 24 = 24 / 18 + 24 % 18
        2. 18 = 18 / 6 + (18 % 6)(=0)
        => 최대공약수는 6

    - 최소공배수
        : (a * b) / 최대공약수
            - 예시를 들면,
              (24 * 18) / 6
              = 432 / 6 = 72
        => 72가 최소공배수.
 */
