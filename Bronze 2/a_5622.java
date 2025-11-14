import java.io.*;
public class a_5622 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String sen = br.readLine();
        int total_time = 0;
        for (int i = 0; i < sen.length(); i++){
            char word = sen.charAt(i);
            if ((int) word >= 65 && (int) word <= 67) total_time += 3;
            else if ((int) word >= 68 && (int) word <= 70) total_time += 4;
            else if ((int) word >= 71 && (int) word <= 73) total_time += 5;
            else if ((int) word >= 74 && (int) word <= 76) total_time += 6;
            else if ((int) word >= 77 && (int) word <= 79) total_time += 7;
            else if ((int) word >= 80 && (int) word <= 83) total_time += 8;
            else if ((int) word >= 84 && (int) word <= 86) total_time += 9;
            else if ((int) word >= 87 && (int) word <= 90) total_time += 10;
        }
        System.out.println(total_time);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5622().run();
    }
}

/* 한 칸 옆에 있는 숫자를 걸려면 1초씩 추가
 - 숫자 1 : 2초
 - 숫자 2 : 3초
 - 숫자 3 : 4초
 .
 .
 .
 - 숫자 0 : 11초
 */