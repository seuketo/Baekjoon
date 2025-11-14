import java.io.*;
import java.util.ArrayList;
import java.math.BigInteger;
public class a_4150 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        if (n <= 2) System.out.println(1);
        else {
            ArrayList<BigInteger> first = new ArrayList<>();
            ArrayList<BigInteger> second = new ArrayList<>();
            BigInteger sum = new BigInteger("0");
            for (int i = 3; i < n; i++){
                int max_len = 0;
                if (i == 3){
                    first.add("1"); 
                    second.add("1");
                } else{
                    first = second;
                    second = sum;
                }
                for (int j = 999; j >= 0; j++){
                    if (first[j] + second[j] >= 10){
                        sum[j - 1]++;
                        sum[j] = first[j] + second[j] - 10;
                    } else sum[j] = first[j] + second[j];
                }

            }
        }
    }
    public static void main(String[] args) throws IOException{
        new a_4150().run();
    }
}


/*
    int n = Integer.parseInt(br.readLine());
        if (n <= 2) System.out.println(1);
        else{
            long[] arr = new long[2];
            arr[0] = 1; arr[1] = 1;
            System.out.println(Fibonacci(arr, n - 3));
        }
        br.close();
    }
    public long Fibonacci(long[] arr, int n){        
        if (n == 0) return arr[1];
        else{
            long sum = arr[0] + arr[1];
            System.out.println("n : " + (100 - n) + ", sum : " + sum);
            arr[0] = arr[1];
            arr[1] = sum;
            return Fibonacci(arr, n - 1);
        }    
 */