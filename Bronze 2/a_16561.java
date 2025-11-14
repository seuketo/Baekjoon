package Bronze_2;
import java.io.*;
public class a_16561 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int a = 3; a <= n; a += 3) {
            for (int b = 3; b <= n; b += 3) {
                int c = n - a - b;
                if (c >= 3 && c % 3 == 0) count++;
            }
        }
        System.out.print(count);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_16561().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 소인수분해? 하여튼 약수를 구해서 경우의 수를 전부 께산하는 문제인듯 하다.
 - 9를 자연수 3개로 분리하려면 3 1 3? 이지 않나? 근데 이걸 감안했을 때
    133, 313, 331 이렇게 3개가 정답 아닌가?

 */