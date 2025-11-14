import java.io.*;
import java.util.*;
public class a_9506 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int num;
        while ((num = Integer.parseInt(br.readLine())) != -1){
            int sum = 0;
            List<Integer> arr = new ArrayList<>();
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    arr.add(i);
                    if (i != num / i) arr.add(num / i);
                }
            }
            Collections.sort(arr);
            for (int i = 0; i < arr.size() - 1; i++) sum += arr.get(i);
            if (sum == num){
                sb.append(num + " = ");
                for (int i = 0; i < arr.size() - 1; i++){
                    if (i == arr.size() - 2) sb.append(arr.get(i)).append("\n");
                    else sb.append(arr.get(i) + " + ");
                }
            } else sb.append(num + " is NOT perfect.\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_9506().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}

/*
 * n = 자신을 제외한 모든 약수들의 합 = 완전수
    ex) 6 = 1 + 2 + 3 (not 6)
 Q) n이 완전수인지 아닌지 판단하는 코드 작성
-------------------------------------------------------
 입력 :
    -1을 입력하기 전까지 한줄마다 n을 입력.
    ex) 6
        12
        28
        -1

 출력 : 
    if) n이 완전수
        n = (n이 아닌 약수들의 합)을 식으로 나타내어 표현
        ex) 6 = 1 + 2 + 3
    else)
        n is NOT perfect 출력
        ex) 12 is NOT perfect
 */
/*
    System.out.println(arr);
    System.out.println(num + "'s sum : " + sum);
 */