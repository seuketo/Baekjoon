import java.io.*;
public class a_17256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = (br.readLine()).split(" ");
        String[] arr2 = (br.readLine()).split(" ");
        int cx = Integer.parseInt(arr2[0]) - Integer.parseInt(arr[2]);
        int cy = Integer.parseInt(arr2[1]) / Integer.parseInt(arr[1]);
        int cz = Integer.parseInt(arr2[2]) - Integer.parseInt(arr[0]);
        System.out.print(cx + " " + cy + " " + cz);
        br.close();
    }
}

// az + bx = cx => bx = cx - az
// ay * by = cy => by = cy / ay
// ax + bz = cz => bz = cz - ax