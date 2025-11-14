import java.io.*;
public class a_30087 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        String[] arr = {"Algorithm", "DataAnalysis", "ArtificialIntelligence", "CyberSecurity", "Network", "Startup", "TestStrategy"};
        String[] arr_num = {"204", "207", "302", "B101", "303", "501", "105"};
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String sen = br.readLine();
            for (int j = 0; j < arr_num.length; j++){
                if (sen.equals(arr[j])){
                    sb.append(arr_num[j] + "\n");
                    continue;
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_30087().run();
    }
}
