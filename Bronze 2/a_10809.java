import java.io.*;
public class a_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = (br.readLine()).toCharArray();
        int[] arr2 = new int[26];
        for (int i = 0; i < arr2.length; i++) arr2[i] = -1;
        for (int i = 0; i < arr.length; i++) if (arr2[arr[i] - 'a'] == -1) arr2[arr[i] - 'a'] = i;
        for (int i : arr2) System.out.print(i + " ");
        br.close();
    }
}