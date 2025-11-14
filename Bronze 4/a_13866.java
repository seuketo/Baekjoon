// 정렬하면 안 됨. 정렬했다가 실패 판정 받았음.
// 조건 자체가 오름차순이라는 전제로 짜여진거로 보임. (0 <= A <= B <= C <= D <= 10^4)
import java.io.*;
import java.util.StringTokenizer;
public class a_13866 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
        sb.append((int) Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2])));
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_13866().run();
    }
}
