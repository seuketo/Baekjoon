import java.io.*;
public class a_15894 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 0; i < n; i++){
            if (n == 1) {
                sum = 4;
                break;
            } else if (i == n - 1) sum += 4 + i;
            else sum += 3;
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_15894().run();
    }
}


// 그림으로 보지 말고 결과와 n값을 기준으로 보면 4 * n을 출력하면 되는 문제임. 그대로 4 * n을 출력하면 이 코드보다 훨씬 효율적임.