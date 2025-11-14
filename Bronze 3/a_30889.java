import java.io.*;
import java.util.*;
public class a_30889 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        Set<String> arr = new LinkedHashSet<>();
        int ascii = 65;                                                        //Wk8m0IB5fP7Rv90
        for (int i = 0; i < n; i++) arr.add(br.readLine());
        for (int i = 0; i < 10; i++){
            String sen = ".".repeat(20);
            String ascii_str = Character.toString((char) ascii);
            for (String word : arr){
                if (word.contains(ascii_str)){
                    int seat = Integer.parseInt(word.substring(1, word.length()));
                    sen = sen.substring(0, seat - 1) + "o" + sen.substring(seat, sen.length());
                }
            }
            sb.append(sen).append("\n");
            ascii++;
        }
        System.out.println(sb.toString());
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_30889().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}
