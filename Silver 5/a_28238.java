/*
 - 코드가 정확히 어떤 부분이 틀렸었는지를 추리해보면 다음과 같다.
    ---> 최대값이 0일 경우에 임의로 순열을 지정해서 출력하도록 설계하지 않았다는 거.
 - 근데 의문이 드는건, 내가 이 부분을 분명 지정했었는데도 57%에서 틀렸었다는 거다.
    - 정확하게 이 부분에서 틀렸습니다를 4번이나 받은건지는 잘 모르겠다.
- 통과 후 코드의 효율은 극악임을 확인했다.
    - 이 문제에서 효율을 어떻게 챙긴건지는 미지수.
    - 다중 반복문이 많았기 때문에 효율이 떨어졌다고 생각하지만, 이 문제에서 다중 반복문을 사용하지 않으면 비교 자체가 불가하다고 생각함.
        - 
 */

import java.io.*;
import java.util.StringTokenizer;
public class a_28238{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            while (st.hasMoreTokens() == true) sb.append(st.nextToken());
            arr[i] = sb.toString();
        }
        int max = 0;
        int[] index = new int[2];
        for (int i = 0; i < 4; i++){
            for (int k = i + 1; k <= 4; k++){
                int sum = 0;
                for (int j = 0; j < n; j++)
                    if (arr[j].charAt(i) == '1' && arr[j].charAt(k) == '1') sum++;
                if (sum > max){
                    max = sum;
                    index[0] = i;
                    index[1] = k;
                }
            }
        }
        sb = new StringBuilder();
        sb.append(max + "\n");
        if (max == 0) sb.append("1 1 0 0 0");
        else{
            for (int i = 0; i < 5; i++){
                if (i == index[0] || i == index[1]) sb.append(1);
                else sb.append(0);
                if (i != 4) sb.append(" ");
            }
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_28238().run();
    }
}
/*
import java.io.*;
import java.util.StringTokenizer;
public class a_28238 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[4];
        int[] result = new int[5];
        if (n == 0) System.out.println("0 0 0 1 1");
        else{
            while (n --> 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int current = Integer.parseInt(st.nextToken());
                for (int i = 0; i < 4; i++) {
                    int after = Integer.parseInt(st.nextToken());
                    if (current == 1 && after == 1) count[i]++;
                    current = after;
                }
            }
            int max = 0, index = -1;
            for (int j = 0; j < 4; j++){
                if (count[j] > max) {
                    max = count[j];
                    index = j;
                }
            }
            if (index >= 0) {result[index]++; result[index + 1]++;}
            System.out.println(max);
            for (int a : result) System.out.print(a + " ");
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_28238().run();
    }
}
*/
