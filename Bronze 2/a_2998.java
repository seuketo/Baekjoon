import java.io.*;
public class a_2998 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String num = br.readLine();
        int len = 0;
        if (num.length() % 3 != 0) {len = (num.length() / 3 + 1) * 3;}
        else len = num.length();
        len -= num.length();
        for (int i = 0; i < len; i++) num = "0" + num;
        for (int i = 0; i < num.length(); i += 3) sb.append(change(num.substring(i, i + 3)));
        System.out.println(sb.toString());
        br.close();
    }
    public int change(String num){
        int re = 0;
        switch (num){
            case "000":
                re = 0;
                break;
            case "001":
                re = 1;
                break;
            case "010":
                re = 2;
                break;
            case "011":
                re = 3;
                break;
            case "100":
                re = 4;
                break;
            case "101":
                re = 5;
                break;
            case "110":
                re = 6;
                break;
            case "111":
                re = 7;
                break;
            default:
                re = 0;
                break;
        }
        return re;
    }
    public static void main(String[] args){
        try{
            new a_2998().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}

