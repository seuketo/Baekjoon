import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_10811 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int[] slicedArr = Arrays.copyOfRange(arr, a - 1, b);
            reverseArr(slicedArr);
            int index = 0;
            for (int j = a - 1; j <= b - 1; j++){ 
                arr[j] = slicedArr[index];
                index++;
            }
        }
        for (int a : arr) sb.append(a + " ");
        System.out.println(sb);
        br.close();
    }
    public void reverseArr(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) throws IOException{
        new a_10811().run();
    }
}

/* 
 - 도현이는 N개의 바구니를 소유.
    - 각각의 바구니에는 1 ~ N까지의 번호 부여.
    - 바구니는 번호순으로 한 줄로 정렬되어있음.
 - 바구니를 M번 역순으로 변경함. 한번의 횟수에 바구니 번호의 범위를 정하고, 해당 범위 안에 속한 바구니를 역순으로 변경함.
    
    // 1번째 줄 : N M
        - N = 바구니 갯수
        - M = 앞으로 공을 넣을 횟수.
    // 2번째 줄 ~ : i j
        - i ~ j = i번 바구니부터 j번 바구니까지 범위 지정 후, 역순으로 변경.
*/
