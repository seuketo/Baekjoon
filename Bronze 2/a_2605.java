import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class a_2605 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int index = 0, num = 1;
        int[] arr = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            StringBuilder sb2 = new StringBuilder();
            int token = n - Integer.parseInt(st.nextToken());
            if (token == 0) arr[index] = num;
            else {
                for (int i = token; i < n - 1; i++) arr[i] = arr[i + 1];
                arr[token] = num;
            }
            //check_array(n, arr);
            num++;
            index++;
        }
        for (int a : arr) result.add(a);
        for (int a : result) sb.append(a).append(" ");
        System.out.print(sb);
        br.close();
    }
    /*
    public void check_array(int n, int[] arr){
        boolean blank = false;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0 && blank == false) blank = true;
            else if (arr[i] != 0 && blank == true){
                for (int j = i - 1; j < n - 1; j++) arr[j] = arr[j + 1];
            }
        }
    }
    */
    public static void main(String[] args) throws IOException{
        new a_2605().run();
    }
}

/*
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0, num = 1;
        while (st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) arr[index] = num;
            else {
                if (arr[a] != 0){
                    for (int i = arr.length - 1; i > a; i--){
                        arr[i] = arr[i - 1];
                        if (i == a + 1) arr[i - 1] = num;
                    }
                }
                else arr[a] = num;
            }
            num++;
            index++;
        }
        for (int a : arr) sb.append(a).append(" ");
        System.out.println(sb);
        br.close();
    }
 */

/*
 - 번호만큼 앞에 서는 방식. 0이면 그대로 서있는거고, 1 이상일 경우 (최대 길이 - 1) - 번호 인덱스만큼 
 */