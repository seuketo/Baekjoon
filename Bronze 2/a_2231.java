import java.io.*;
public class a_2231{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String N = br.readLine();
        int d = N.length();
        int start = Math.max(1, Integer.parseInt(N) - (9 * d)); //216 - 27 = 189
        if (start <= 0) start = 1;
        int sum = 0;
        int result = 0;
        for (int i = start; i < Integer.parseInt(N); i++){ //189 ~ 215
            sum = i;
            int value = i;
            while (value > 0){
                sum += value % 10;
                value /= 10;
            }
            if (sum == Integer.parseInt(N)) {
                result = i;
                break;
            } else if (sum != Integer.parseInt(N) && i == Integer.parseInt(N) - 1){
                result = 0;
                break;
            }
        }
        System.out.println(result);
        br.close();

    }
    public static void main(String[] args) throws IOException{
        try{
            new a_2231().run();
        } catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 자연수 N
    - 생성자가 여러 개
    - 분해합을 만족하는 생성자들이 여러 개가 나올 수 있음. 만약 N = 101이라면 91, 100이 만족함.

 - 가능한 생성자 중 가장 작은 수 구하는 문제
    - 생성자로 얻을 수 있는 최대의 수 = M + 9 * d
        - d자리의 N값
        - 한 자리당 얻을 수 있는 최대의 수 = 9
        - N = M + (각 자리의 합) <= M + (9 * d)
        => N <= M + (9 * d)
        => M >= N - (9 * d)

 - 반복해서 처음으로 나오는 N과 동일한 수 = 최소 생성자
    => 최소값 N - (9 * d) 부터 N - 1까지 돌려서 M + 각 자리 합 반복적으로 계산
    => 생성자의 최소값이 음수 이하로 잡히면 안 됨. 결과값으로 자연수를 얻어야 하기 때문에 0과 음수는 취급을 안 함. 음수가 나올 경우 1로 전환.
    => 생성자가 존재하지 않을 경우엔 0을 출력하면 됨. 

 */