import java.io.*;
public class a_2444 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count = n - 1;
        int star = 1;
        boolean reverse = false;
        for (int i = 0; i < (n * 2) - 1; i++){
            if (star != (n * 2) - 1 && reverse == false){
                sb.append(" ".repeat(count)).append("*".repeat(star)).append("\n");
                star += 2;
                count--;
            } else if (star == (n * 2) - 1){
                reverse = true;
                sb.append(" ".repeat(count)).append("*".repeat(star)).append("\n");
                star -= 2;
                count++;
            } else{
                sb.append(" ".repeat(count)).append("*".repeat(star)).append("\n");
                star -= 2;
                count++;
            }
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2444().run();
    }
}
