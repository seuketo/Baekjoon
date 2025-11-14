import java.io.*;
import java.util.StringTokenizer;
public class a_1598{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++){
            if (i == 0){
                int num = ((a / 4) * 4) + 1;
                if (num + 3 >= a && a > num) arr[0] = (num + 3) / 4;
                switch (a % 4){
                    case 0:
                        arr[1] = 4;
                        break;
                    case 1:
                        arr[1] = 1;
                        break;
                    case 2:
                        arr[1] = 2;
                        break;
                    case 3:
                        arr[1] = 3;
                        break;
                    default:
                        arr[1] = 0;
                        break;
                }
            } else{
                int num = ((b / 4) * 4) + 1;
                if (num + 3 >= b && b > num) arr[0] -= (num + 3) / 4;
                switch (b % 4){
                    case 0:
                        arr[1] -= 4;
                        break;
                    case 1:
                        arr[1] -= 1;
                        break;
                    case 2:
                        arr[1] -= 2;
                        break;
                    case 3:
                        arr[1] -= 3;
                        break;
                    default:
                        arr[1] = 0;
                        break;
                }
            }
        }
        System.out.println(Math.abs(arr[0]) + Math.abs(arr[1]));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1598().run();
    }
}