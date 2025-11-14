import java.io.*;
import java.util.StringTokenizer;
public class a_21965{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int before = Integer.parseInt(st.nextToken());
        boolean tf = true, updown = true, result = true;
        while (st.hasMoreTokens() == true){
            int num = Integer.parseInt(st.nextToken());
            if (n == 1) break;
            else{
                if (tf != updown){
                    result = false;
                    break;
                }
                else if (num > before && updown == false) {
                    result = false;
                    break;
                }
                else if (num > before && updown == true) tf = true;
                else if (num == before) {
                    result = false;
                    break;
                }
                else if (num < before && updown == true){
                    tf = false;
                    updown = false;
                }
            }
            before = num;
        }
        if (result == true) System.out.println("YES");
        else System.out.println("NO");
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_21965().run();
    }
}
/*
import java.io.*;
import java.util.StringTokenizer;
public class a_21965 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    String current = "flat";
    int before = 0;
    for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
    for (int i = 0; i < n; i++){
        if (i == 0) {
            before = arr[i];
            continue;
        }
        else if (before < arr[i]) 
            current = "up";
        else if (before == arr[i]) {
            current = "no";            
            break;
        }
        else if (current.equals("down") && before > arr[i]);
        else if (before > arr[i]){
            if (current.equals("up")) {
                current = "down";
                break;
            }
            else if (current.equals("flat")) current = "down";
            else {
                current = "no";
                break;
            }
        }
        before = arr[i];
    }
    if (current.equals("down") || current.equals("up")) System.out.println("YES");
    else System.out.println("NO");
    br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_21965().run();
    }
}
*/

