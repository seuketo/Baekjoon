import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class a_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a > b){
            if (b < c){
                if (a < c) System.out.printf("%d %d %d\n", b, a, c);
                else System.out.printf("%d %d %d\n", b, c, a);
            }
            else System.out.printf("%d %d %d\n", c, b, a);
        } else{
            if (a < c){
                if (b < c) System.out.printf("%d %d %d\n", a, b, c);
                else System.out.printf("%d %d %d\n", a, c, b);
            }
            else System.out.printf("%d %d %d\n", c, a, b);
        }
        br.close();
    }
}
