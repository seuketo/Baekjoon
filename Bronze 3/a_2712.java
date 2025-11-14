import java.io.*;
import java.math.RoundingMode;
import java.util.StringTokenizer;
import java.math.BigDecimal;
public class a_2712 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double value = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();
            BigDecimal bd;
            if (unit.equals("kg")) {
                bd = new BigDecimal(value * 2.2046);
                unit = "lb";
            }
            else if (unit.equals("l")) {
                bd = new BigDecimal(value * 0.2642);
                unit = "g";
            }
            else if (unit.equals("lb")) {
                bd = new BigDecimal(value * 0.4536);
                unit = "kg";
            }
            else {
                bd = new BigDecimal(value * 3.7854);
                unit = "l";
            }
            bd = bd.setScale(4, RoundingMode.HALF_UP);
            sb.append(bd + " " + unit + "\n");
            // sb.append(String.format("%.4f", bd));
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2712().run();
    }
}
