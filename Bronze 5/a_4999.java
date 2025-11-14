import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a_4999 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[2];
        for (int i = 0; i <= 1; i++){
            String[] arr = br.readLine().split("");
            for (int j = 0; j < arr.length; j++){
                if (arr[j].equals("h")) break;
                else count[i] += 1;
            }
        }
        if (count[0] < count[1]) System.out.println("no");
        else System.out.println("go");
        br.close();
    }
}
