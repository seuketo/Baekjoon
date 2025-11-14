import java.io.*;
public class a_3053 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int r = Integer.parseInt(br.readLine());
        System.out.printf("%.6f\n%.6f", Math.PI * Math.pow(r, 2), 2 * Math.pow(r, 2));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_3053().run();
    }
}

/*
 - 유클리드 기하학에서 원의 넓이 : pi * r²
 - 택시 기하학에서 원의 넓이 : 2 * r²
 */