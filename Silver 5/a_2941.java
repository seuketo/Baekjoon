import java.io.*;
public class a_2941 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String sen = br.readLine();
        char[] arr = sen.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1 || i + 1 >= arr.length || i + 2 >= arr.length) count++;
            else{
                if (arr[i] == 'c'){
                    if (arr[i + 1] == '=' || arr[i + 1] == '-') i++;
                }
                else if (arr[i] == 'd'){
                    if (arr[i + 1] == 'z' && arr[i + 2] == '=') i += 2;
                    else if (arr[i + 1] == '-') i++;
                }
                else if (arr[i] == 'l' || arr[i] == 'n'){
                    if (arr[i + 1] == 'j') i++;
                }
                else if (arr[i] == 's' || arr[i] == 'z'){
                    if (arr[i + 1] == '=') i++;
                }
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2941().run();
    }
}
