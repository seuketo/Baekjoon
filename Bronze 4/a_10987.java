import java.io.*;
public class a_10987 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String[] arr = (br.readLine()).split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) count++;
        System.out.print(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_10987().run();
    }
}
