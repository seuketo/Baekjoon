import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class a_10988 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        char[] arr = br.readLine().toCharArray();
        boolean tf = true;
        ArrayList<Character> list = new ArrayList<>();
        for (char a : arr) list.add(a);
        Collections.reverse(list);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == list.get(i)) continue;
            else{
                tf = false;
                break;
            }
        }
        if (tf == true) System.out.print(1);
        else System.out.print(0);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10988().run();
    }
}
