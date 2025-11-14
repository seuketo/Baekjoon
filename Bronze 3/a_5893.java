import java.io.*;
import java.util.ArrayList;
public class a_5893 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String[] arr = (br.readLine()).split("");
        ArrayList<Integer> arr2 = new ArrayList<>();
        int sum = 0;
        for (int i = arr.length - 1; i > 0; i--){
            System.out.println(arr[i]);
            for (int j = 0; j < arr.length; j++) sum += Integer.parseInt(arr[i]) * Math.pow(2, j);
        }
        sum *= 17;
        System.out.println(sum);
        while (true){
            if (sum == 1){
                arr2.add(1);
                break;
            }
            arr2.add(sum % 2);
            sum /= 2;
        }
        arr2.reversed();
        System.out.println(sum);
        br.close();
         
    }
    public static void main(String[] args) throws IOException{
        new a_5893().run();
    }
}