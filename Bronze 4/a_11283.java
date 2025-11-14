import java.io.*;
public class a_11283 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        String word = br.readLine();
        char word_c = word.charAt(0);
        char word_r = '가';
        System.out.println((int) word_r);
        System.out.println(word);
        System.out.println(word_c);
        System.out.println(word_c - 'ㄱ');
        sb.append(word_c - 44031);
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_11283().run();
    }
}
