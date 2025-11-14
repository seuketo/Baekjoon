import java.io.*;
public class a_15873 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String[] arr = (br.readLine()).split("");
        if (arr.length == 3){
            if ((arr[0] + arr[1]).equals("10")) System.out.println(10 + Integer.parseInt(arr[2]));
            else if ((arr[1] + arr[2]).equals("10")) System.out.println(10 + Integer.parseInt(arr[0]));
            
        } 
        else if (arr.length == 4) System.out.println(20);
        else System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_15873().run();
    }
}
