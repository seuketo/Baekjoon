/*import java.io.*;
public class a_2547 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            br.readLine();
            int sum = 0;
            int a = Integer.parseInt(br.readLine());
            for (int k = 0; k < a; k++) sum += Integer.parseInt(br.readLine());
            if ((a != 0 && sum % a == 0) || a == 0) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2547().run();
    }
}*/
/*
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class a_2547{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "");
            for (int j = 0; j < n; j++) sumInteger.parseInt(st.nextToken());
            
        }
    }
    public static void main(String[] args) throws IOException{
        new a_2547().run();
    }
}*/

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_2547{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        br.readLine();
        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            String[] arr1 = new String[n];
            //int[] arr2 = new int[n];
            for (int j = 0; j < n; j++){
                arr1[j] = br.readLine();
                //arr2[j] = arr1[j].length();
            }
            /*
            Arrays.sort(arr2);
            String len = Integer.toString(arr2[n - 1]);
            
            int[] arr = new int[len.length() + 1];
            */
            for (int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(arr1[j], "");
                int index = n - 1;
                while (st.hasMoreTokens()){
                    arr[index] += Integer.parseInt(st.nextToken());
                    if (arr[index] >= 10) {
                        arr[index - 1]++;
                        arr[index] %= 10;
                    }
                    index--;
                }
            }
            BigInteger bi = new BigInteger(arr.toString());
            sb.append(bi.subtract(BigInteger.valueOf(n)) + "\n");
            br.readLine();
        }
        System.out.print(sb);
        br.close();
    }

    public static void main(String[] args) throws IOException{
        new a_2547().run();
    }
}
