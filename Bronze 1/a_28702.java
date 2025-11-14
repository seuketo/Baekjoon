import java.io.*;
public class a_28702 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String[] arr = new String[3];
        int num = 0, index = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
            if (!(arr[i].equals("Fizz") || arr[i].equals("Buzz") || arr[i].equals("FizzBuzz"))) {
                index = i;
                num = Integer.parseInt(arr[index]);
            } else continue;
        }
        num += 3 - index;
        if (num % 15 == 0) System.out.println("FizzBuzz");
        else if (num % 5 == 0) System.out.println("Buzz");
        else if (num % 3 == 0) System.out.println("Fizz");
        else System.out.println(num);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_28702().run();
    }
}

/*
 - Fizz     = 3의 배수
 - Buzz     = 5의 배수
 - FizzBuzz = 15의 배수
 */