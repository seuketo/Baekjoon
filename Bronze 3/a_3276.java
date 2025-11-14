/*
    문제

    데이브는 N개의 독특한 돌을 모았습니다. 그는 돌을 열의 수와 행의 수의 합이 최소가 되도록 열과 행으로 정리하려 합니다. 데이브가 그 값을 찾을 수 있도록 프로그램을 작성합시다.

    입력

    입력의 유일한 줄에 정리되어야 하는 돌의 수를 나타내는 자연수 N(1 <= N <= 100)이 주어집니다. 정리는 전혀 일반적이지 않아도 됩니다 - 열의 몇몇 칸은 비어있을 수도 있습니다.

    출력

    유일한 줄에 열의 수와 행의 수를 하나의 공백으로 나누어 출력합니다.

    참고: 정답은 유일하지 않을 수도 있습니다.
 */
import java.io.*;
import java.util.*;
public class a_3276 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(1); AL.add(n);
        int min = n;
        for (int i = 2; i < n; i++){
            for (int j = 1; j <= n; j++){
                if ((i * (j - 1) < n && i * j >= n) && min >= i + j){
                    AL.clear(); AL.add(i); AL.add(j);
                    min = i + j;
                    break;
                } else if (i * j == n && min >= i + j){
                    AL.clear(); AL.add(i); AL.add(j);
                    min = i + j;
                    break;
                } else continue;
            }
        }
        Collections.sort(AL);
        System.out.println(AL.get(0) + " " + AL.get(1));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_3276().run();
    }
}

/*  78112166, 15992KB, 144ms, 643B
    // 이 코드가 효율은 더 좋지만, 결과를 정렬된 상태로 출력을 하는 것이 아니라서 조금 애매함.
    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int min = 100;
            int x = 0;
            int y = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i + j < min&&i*j>=n) {
                        x = i;
                        y = j;
                        min=i+j;
                    }
                }
            }
            System.out.println(x + " " + y);
        }


}
 */