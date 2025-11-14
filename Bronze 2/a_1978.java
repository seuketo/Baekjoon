import java.util.*;
import java.io.*;

public class a_1978{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public static boolean[] sieve(int n){
        // return값 생성. run() 메소드에서 isPrime 배열을 선언했기 때문.
        boolean[] isPrime = new boolean[n + 1];

        // isPrime 배열 모든 요소값을 true로 설정.
        for (int i = 0; i < n + 1; i++) isPrime[i] = true;

        // n이 1개만 존재할 경우, 2개만 존재할 경우를 생각해서 if문 포함. 0과 1 제외.
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        // 루트 n값까지 돌려서 isPrime 배열 속 i번째 값이 true면 조건문 진입. 2부터 시작함.
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i < limit; i++){
            // 2의 경우 true이기 떄문에 진입, 2의 배수 모두 제외.
            // 이후 조건문에 진입하는 값이 true라면 그 수의 모든 배수는 제외됨.
            if (isPrime[i]){
                for (int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        boolean[] isPrime = sieve(1000);

        int count = 0;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if (isPrime[num]){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_1978().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}


/*
 - 1 제외
 - 짝수 제외
 - 남은 홀수 중 가장 작은 수는 소수, 해당 수의 배수는 모두 제외
 - 다음으로 작은 수는 소수, 또한 배수 제외
 - 루트(갯수) 까지 반복해서 지워지지 않은 모든 수는 소수
 */