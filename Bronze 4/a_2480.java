import java.io.*;
import java.util.StringTokenizer;

public class a_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen = br.readLine();
        StringTokenizer st = new StringTokenizer(sen);
        int count = 0;
        int max = 0;
        int same = 0;
        while (st.hasMoreTokens() != false){
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == b && a == c){
                count += 3;
                same = a;
            } else if ((a == b && a != c) || (b == c && a != b)){
                count += 2;
                same = b;
            } else if ((a != b && a == c) || (a != b && b == c)){
                count += 2;
                same = c;
            }
            if (a > b){
                if (a <= c) max = c;
                else max = a;
            } else if (a <= b){
                if (b <= c) max = c;
                else max = b;
            }
        }
        if (count == 3) System.out.println(10000 + (same * 1000));
        else if (count == 2) System.out.println(1000 + (same * 100));
        else System.out.println(max * 100);
        br.close();

    }
}
