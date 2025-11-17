import java.io.*;
import java.util.*;
import java.math.*;
public class a_18110 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        if (n == 0 ) System.out.println(0);
        else{
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
            Arrays.sort(arr);
            BigDecimal avgcut = BigDecimal.valueOf(n * 0.15);
            BigDecimal avgbd = avgcut.setScale( 0, RoundingMode.HALF_UP);
            int sum = 0;
            for (int i = avgbd.intValue(); i < n - avgbd.intValue(); i++){
                sum += arr[i];
            }
            BigDecimal sumbd = BigDecimal.valueOf(sum);
            BigDecimal dividedb = BigDecimal.valueOf(n - (2 * avgbd.intValue()));
            BigDecimal result = sumbd.divide(dividedb, 0, RoundingMode.HALF_UP);
            System.out.println(result.intValue());
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_18110().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

