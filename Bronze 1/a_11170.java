import java.io.*;
import java.util.StringTokenizer;
public class a_11170{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int a = 0; a < t; a++){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            for (int b = n; b <= m; b++){
                if (b % Math.pow(10, Integer.toString(b).length()) == 0) count += Integer.toString(b).length();
                else{
                    char[] arr = Integer.toString(b).toCharArray();
                    for (char c : arr) if (c - '0' == 0) count++;
                }
            }
            sb.append(count + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_11170().run();
    }
}

/* 79990185, 15044KB, 216ms, 1065B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());
            int M = Integer.parseInt(token.nextToken());

            int count = 0;
            for(int num = N ; num <= M ; num++){
                count += zeroCnt(num);
            }
            System.out.println(count);

        }
    }

    public static int zeroCnt(int num){
        if(num == 0) return 1;

        int cnt = 0;

        while (num > 0){
            if(num % 10 == 0){
                cnt++;
            }
            num/=10;
        }
        return cnt;
    }
}
 */

/*
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_11170 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        while (t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = n; i <= m; i++){
                int[] digit = (Integer.toString(i)).chars().map(c -> c - '0').toArray();
                System.out.println(digit[0] + ", " + digit[1]);
                count += Arrays.stream(digit).filter(j -> j == 0).count();
                System.out.println(count);
            }
            sb.append(count + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_11170().run();
    }
}
*/
/*
        int t = Integer.parseInt(br.readLine());
        while (t -->= 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            int count = 0;
            int digit = 0;
            for (int i = n; i <= m; i += 0){
            }
            System.out.println(count);
            sb.append(count + "\n");
        }
        System.out.print(sb);
        br.close();
 */