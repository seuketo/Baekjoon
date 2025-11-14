import java.io.*;
public class a_28074 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        char[] arr = br.readLine().toCharArray();
        int[] arr1 = new int[5];
        int count = 0;
        boolean tf = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'M' && arr1[0] == 0){
                arr1[0]++;
                count++;
            }
            else if (arr[i] == 'O' && arr1[1] == 0){
                arr1[1]++;
                count++;
            }
            else if (arr[i] == 'B' && arr1[2] == 0){
                arr1[2]++;
                count++;
            }
            else if (arr[i] == 'I' && arr1[3] == 0){
                arr1[3]++;
                count++;
            }
            else if (arr[i] == 'S' && arr1[4] == 0){
                arr1[4]++;
                count++;
            }
            if (count == 5) {
                tf = true;
                break;
            }
        }
        if (tf == true) System.out.println("YES");
        else System.out.println("NO");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28074().run();
    }
}
