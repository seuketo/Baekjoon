import java.io.*;
import java.util.StringTokenizer;
public class a_30032 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++){
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < arr.length; j++) sb.append(change(Character.toString(arr[j]), d));
            if (i != n - 1) sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
    public String change(String sen, int d){
        String re = "";
        if (d == 1){
            switch (sen){
                case "d":
                    re = "q";
                    break;
                case "b":
                    re = "p";
                    break;
                case "q":
                    re = "d";
                    break;
                case "p":
                    re = "b";
                    break;
            }
        } else{
            switch (sen){
                case "d":
                    re = "b";
                    break;
                case "b":
                    re = "d";
                    break;
                case "q":
                    re = "p";
                    break;
                case "p":
                    re = "q";
                    break;
            }
        }
        return re;
    }
    public static void main(String[] args) throws IOException{
        new a_30032().run();
    }
}
