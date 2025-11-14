import java.io.*;
public class a_20499 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String[] arr = (br.readLine()).split("/");
        int k = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int a = Integer.parseInt(arr[2]);
        System.out.println((k + a) < d || d == 0 ? "hasu" : "gosu");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_20499().run();
    }
}
