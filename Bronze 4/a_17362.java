import java.io.*;
public class a_17362 {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int finger = 1;
        int num = 1;
        for (int i = 1; i <= n; i++){
            if (i != 1) finger += num;
            if (finger == 5) num = -1;
            else if (finger == 1) num = 1; 
        }
        System.out.println(finger);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_17362().run();
    }
}

