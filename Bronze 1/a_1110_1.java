// 1310B, 148ms, 16064KB
import java.io.*;

public class a_1110_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String sen;
        int count = 0;
        if (N < 10 && 0 <= N) sen = "0" + N;
        else sen = Integer.toString(N);
        String[] arr = sen.split("");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        String[] num_arr = (Integer.toString(a + b)).split("");
        String cycle;
        if (a + b < 10) cycle = Integer.toString(b) + num_arr[0];
        else cycle = Integer.toString(b) + num_arr[1];
        count++;
        if (Integer.parseInt(cycle) != N){ 
            arr = cycle.split("");
            while (true){
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
                num_arr = (Integer.toString(a + b)).split("");
                if (a + b < 10) cycle = Integer.toString(b) + num_arr[0];
                else cycle = Integer.toString(b) + num_arr[1];
                count++;
                if (Integer.parseInt(cycle) == N) break;
                arr = cycle.split("");
            }
        }
        System.out.println(count);
        br.close();
    }
}

/* 더 효율이 좋은 코드_ 579B, 124ms, 14216KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int origin = Integer.parseInt(br.readLine());
    int num = origin;
    int cycle = 0;

    while (true) {
      int front = num / 10;
      int back = num % 10;

      num = back * 10 + (front + back) % 10;

      cycle++;

      if (num == origin) {
        break;
      }
    }

    System.out.println(cycle);
  }

}
*/