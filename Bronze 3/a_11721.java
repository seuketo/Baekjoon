import java.io.*;
public class a_11721 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        char[] arr = (br.readLine()).toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length; i++){
            if (count == 10){
                count = 1;
                sb.append(arr[i] + "\n");
            } else {
                count++;
                sb.append(arr[i]);
            }
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_11721().run();
    }
}

/* 14244KB, 124ms, 521B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int length = input.length();
        for(int i=0; i<length; i++){
            System.out.print(input.charAt(i));
                                                    // ex) i가 9일 경우 => 0 ~ 9까지 출력하고 newline 출력 후 계속.
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
 */
