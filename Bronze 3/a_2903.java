import java.io.*;
public class a_2903 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count = 2;
        for (int i = 0; i < n; i++) count += count - 1;
        System.out.println((int) Math.pow(count, 2));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2903().run();
    }
}

/*
    초기 : 4개      2^2
    |
    1번 : 9개       3^2 (2 + (2 - 1)) ^ 2
    |
    2번 : 25개      5^2 (3 + (3 - 1)) ^ 2
    |
    3번 : 81개      9^2 (5 + (5 - 1)) ^ 2
    |
    4번 : 289개     17^2(9 + (9 - 1)) ^ 2
    |
    5번 : 1089개    33^2(17 + (17 - 1)) ^ 2
 */