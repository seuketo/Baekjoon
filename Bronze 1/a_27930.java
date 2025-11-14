import java.io.*;
public class a_27930 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String sen = br.readLine();

        String yonsei = "YONSEI";
        String korea = "KOREA";

        int yindex = 0, kindex = 0;
        boolean ky = false;
        for (char c : sen.toCharArray()){
            if (c == 'K') ky = true;
            if (yindex < yonsei.length() && c == yonsei.charAt(yindex)) yindex++;
            if (kindex < korea.length() && c == korea.charAt(kindex)) kindex++;
            if (yindex == yonsei.length()){
                System.out.println(yonsei);
                break;
            } else if (kindex == korea.length()){
                System.out.println(korea);
                break;
            }
        }
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_27930().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}
