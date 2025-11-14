import java.io.*;
import java.util.StringTokenizer;
public class a_2783 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Integer.parseInt(st.nextToken());
        double y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        double minx = (1000 / y) * x;
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            double xi = Integer.parseInt(st.nextToken());
            double yi = Integer.parseInt(st.nextToken());
            if (minx > (1000 / yi) * xi) minx = (1000 / yi) * xi;
        }
        System.out.println(String.format("%.2f", minx));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2783().run();
    }
}

/*
삼각 김밥 Yg = X원
1000g 구매
 */