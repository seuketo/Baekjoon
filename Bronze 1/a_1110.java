import java.io.*;
import java.util.StringTokenizer;

public class a_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());                                                    // 26
        String sen;
        int count = 0;
        if (N < 10 && 0 <= N) sen = "0" + N;                                                        // 한자리
        else sen = Integer.toString(N);                                                             // 두자리
        StringTokenizer st = new StringTokenizer(sen);                                              // 2 6
        int a = Integer.parseInt(st.nextToken());                                                   // 2
        int b = Integer.parseInt(st.nextToken());                                                   // 6
        String f_cycle = Integer.toString(b) + Integer.toString(a + b);                             // "6" + "8"
        count++;
        st = new StringTokenizer(f_cycle);  // 6 8
        while (N != Integer.parseInt((Integer.toString(b) + Integer.toString(a + b)))){         // 원래 수가 돌아오지 않는 동안 계속 반복
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            String cycle = Integer.toString(b) + Integer.toString(a + b);
            count++;
            st = new StringTokenizer(cycle);
        }
        System.out.println(count);
        br.close();
    }
}

