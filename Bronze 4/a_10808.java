import java.io.*;
public class a_10808 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        String sen = br.readLine();
        String[] sen_arr = new String[26];
        int[] int_arr = new int[26];
        int alpha = 97;
        for (int i = 0; i < 26; i++) {
            sen_arr[i] = Character.toString((char) alpha);
            alpha++;
        }
        String[] arr = sen.split("");
        for (int i = 0; i < arr.length; i++) for (int j = 0; j < 26; j++) if (arr[i].equals(sen_arr[j])) int_arr[j]++;
        for (int i = 0; i < 26; i++) sb.append(int_arr[i] + " ");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_10808().run();
    }
}
