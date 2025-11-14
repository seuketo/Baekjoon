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
