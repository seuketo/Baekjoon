import java.io.*;
public class a_4583 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String sen;
        String result = "";
        while (!(sen = br.readLine()).equals("#")){
            char[] arr = sen.toCharArray();
            char pivot = 0;
            for (char a : arr){
                if (a != 'b' || a != 'd' || a != 'p' || a != 'q' || a != 'i' || a != 'o' || a != 'v' || a != 'w' || a != 'x') {
                    result = "INVALID";
                    break;
                }
            }
            if (result.equals("INVALID")) break;
            else{
                for (int i = 0; arr.length - (1 + i) < arr.length; i++){
                    if (arr[i] == 'b') pivot = 'd';
                    else if (arr[i] == 'd') pivot = 'b';
                    else if (arr[i] == 'p') pivot = 'q';
                    else if (arr[i] == 'q') pivot = 'p';
                    arr[i] = arr[arr.length - (1 + i)];
                    arr[arr.length - (1 + i)] = pivot;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new a_4583().run();
    }
}
