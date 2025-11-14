import java.io.*;
public class a_2057 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        long start = System.currentTimeMillis();
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[20];
        System.out.println(factorial(n));
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
        br.close();
    }

    public long factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
    public static void main(String[] args) throws IOException{
        new a_2057().run();
    }
}
