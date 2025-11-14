import java.io.*;
//import java.util.StringTokenizer;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Collections;
public class a_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = (br.readLine()).split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String token : arr){
            int num = Integer.parseInt(token);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(min + " " + max);
        br.close();
    }
}
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /*
        long N = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long max = 0;
        long min = 0;
        for (long i = 0; i < N - 1; i++){
            if (i == 0){
                max = Long.parseLong(st.nextToken());
                min = max;
            }
            long sen = Long.parseLong(st.nextToken());
            if (max < sen) max = sen;
            else if (min > sen) min = sen;
        }
        bw.write(min + " " + max);
        bw.flush();
*/