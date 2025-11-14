import java.io.*;
import java.lang.Math;
public class a_14935 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String[] arr = (br.readLine()).split("");
        String af = Long.toString(Long.parseLong(arr[0]) * arr.length);
        long bf = Long.parseLong(af);
        while (bf <= Math.pow(10, 100)){
            arr = af.split("");
            af = Long.toString(Long.parseLong(arr[0]) * arr.length);
            bf = Long.parseLong(af);
            if (Long.parseLong(af) == bf){
                System.out.println("FA");
                break;
            }
        }
        if (bf > Math.pow(10, 100)) System.out.println("NFA");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_14935().run();
    }
}

/* 모든 수가 FA로 된다는 것. 근데 이게 맞는거 같음. 14064kb, 116ms
import java.io.IOException;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 말장난같은 문제
        // 모든 수는 FA다.

        System.out.println("FA");


    }
}
 */
