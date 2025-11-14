import java.io.*;

public class a_6840{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a > b){
            if (a > c){
                if (b > c) System.out.println(b);
                else System.out.println(c);
            }
            else System.out.println(a);
        }
        else {
            if (b > c){
                if (a > c) System.out.println(a);
                else System.out.println(c);
            }
            else System.out.println(b);
        }
        br.close();

    }
}