import java.io.*;
import java.util.StringTokenizer;
public class a_31432 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = st.nextToken();
        

    }
    public static void main(String[] args){
        try{
            new a_31432().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}

/*
 * 열 가지의 숫자 중 일부는 금지.
 * 금지된 숫자를 제외한 N가지의 숫자만으로 소수가 아닌 수(a)를 만들어야 함.
 * 중복 사용 O, 0 < a && a < 10^12
 * 

 - 입력
    - 1번째 줄 : N
    - 2번째 줄 : N개의 숫자가 공백을 사이에 두고 나열

 - 출력
    - 1번째 줄 : 소수가 아닌 수가 존재하면 YES, 안 하면 NO
    - (if : 1번째 줄이 YES) 2번째 줄 : 수를 출력 (수를 출력할 때 앞에 0을 출력해서는 안 됨, 여러 개 존재하면 그 중 아무거나 출력)
 */
