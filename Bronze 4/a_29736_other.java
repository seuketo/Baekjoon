package Bronze_4;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class a_29736 {
    StringTokenizer st;
    public void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int left = Math.max(a, k - x);  // 해당 코드의 경우 a와 k - x를 비교했을 때 더 큰 값을 결과로 반환. 예시로 a = 40, k - x = 60일 경우 k - x를 반환.
        int right = Math.min(b, k + x); // 위의 설명과 반대로 더 작은 값을 반환함.

        int cnt = (left > right) ? 0 : right - left + 1;
        if (cnt == 0) System.out.println("IMPOSSIBLE");
        else System.out.println(cnt);
        br.close();


    }
    public static void main(String[] args) throws IOException{
        try{
            new a_29736().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
