// 해결 X
import java.io.*;
import java.util.StringTokenizer;
public class a_17944 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        int value = 1, count = 0;
        for (int i = 1; i <= t; i++){
            if (count == n * 2) value = -1;
            else if (count == 1) value = 1;
            count += value;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_17944().run();
    }
}


/*
 - 1 ~ 2N개 사이로 유지
 - 반시계방향으로 돌아가고, 
 */

 /*
         int count = 0;
        int value = 1; // 
        boolean tf = true; // 부호 변경
        if (t / (n * 2) == 0) count += t;
        else {
            for (int i = 1; i <= t; i++){
                int index = 0;
                if (i == 1) {
                    if (tf == true) value = 1;
                    else value = -1;
                }
                else if (count <= n * 2 && count >= 1 && i != 1){
                    if (i % (n * 2) == 0 || (count == 1 && value == 0)) {
                        System.out.println("--- change ---");
                        tf = !tf;}
                    if (value != 0 && (count == n * 2 || count == 1)) {
                        index = 1;
                        value = 0;}
                    if (tf == true && value == 0) {
                        index = 2;
                        value = 1;}
                    else if (tf == false && value == 0) {
                        index = 3;
                        value = -1;}
                }
                count += value;
                System.out.println();
                System.out.println("value : " + value + ", index : " + index + " => " + i + " : " + tf + ", " + count);
            }
        }
        //if ((t / (n * 2)) % 2 != 0) count += n * 2 - (t % (n * 2)); 
        //else count += t % (n * 2);
        
        System.out.println(count);
        br.close();
*/