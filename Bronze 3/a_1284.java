import java.io.*;
public class a_1284 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String n;
        while (!((n = br.readLine()).equals("0"))){
            int sum = 1;
            String[] arr = n.split("");
            for (int i = 0; i < arr.length; i++){
                if (Integer.parseInt(arr[i]) == 1) sum += 2;
                else if (Integer.parseInt(arr[i]) == 0) sum += 4;
                else sum += 3;
                sum++;
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1284().run();
    }
}

/* 14264KB, 116ms, 924B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

------------------------------------------------------------------------------- => 이 부분이 되게 인상 깊음. Integer.parseInt()를 쓰지 않고 따로 하나 만들어서 사용하는 게 더 시간적으로 효율적인 건지는 모르겠음.
    public static int parse(String s) {
      return Integer.parseInt(s);
    }
------------------------------------------------------------------------------- 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = parse(br.readLine());
            int l = 1;

            if(n == 0) {
                break;
            }

            while (n > 0) {
                int a = n % 10;
                n /= 10;

                if(a == 1) {
                    l += 3;
                } else if (a == 0) {
                    l += 5;
                } else {
                    l += 4;
                }
            }

            sb.append(l).append("\n");
        }

        System.out.print(sb);
    }

}
 */
