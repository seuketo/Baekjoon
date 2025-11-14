import java.io.*;
public class a_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        String mult = Integer.toString(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
        String[] list = mult.split("");
        int i = 0;
        for (i = 0; i < list.length; i++) arr[Integer.parseInt(list[i])]++;
        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
        br.close();
    }
}
