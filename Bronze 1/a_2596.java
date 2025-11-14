import java.io.*;
public class a_2596 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        String sen = br.readLine(), result = "";
        for (int i = 0; i < n * 6; i += 6){
            String word = sen.substring(i, i + 6);
            char input = 0;
            switch (word){
                case "000000" :
                    input = 'A';
                    break;
                case "001111" :
                    input = 'B';
                    break;
                case "010011" :
                    input = 'C';
                    break;
                case "011100" : 
                    input = 'D';
                    break;
                case "1000110" : 
                    input = 'E';
                    break;
                case "101001" : 
                    input = 'F';
                    break;
                case "110101" : 
                    input = 'G';
                    break;
                case "111010" : 
                    input = 'H';
                    break;
                default :
                    input = '1';
                    break;
            }
            if (input == '1') {
                result = "1";
                break;
            } else sb.append(Character.toString(input));
        }
        if (result.equals("1")) System.out.println()
    }
    public static void main(String[] args) throws IOException{
        new a_2596().run();
    }
}
