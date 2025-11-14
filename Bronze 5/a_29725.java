// switch를 사용하는 편이 더 좋을거 같음.
import java.io.*;
public class a_29725 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int sum = 0;
        String[] arr;
        for (int i = 0; i < 8; i++){
            arr = (br.readLine()).split("");
            sum += calcul(arr);
        }
        System.out.println(sum);
        br.close();
    }
    public int calcul(String[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(".")) continue;
            else if (arr[i].equals("K") || arr[i].equals("P") || arr[i].equals("N") || arr[i].equals("B") || arr[i].equals("R") || arr[i].equals("Q")){
                if (arr[i].equals("K")) sum += 0;
                else if (arr[i].equals("P")) sum += 1;
                else if (arr[i].equals("N")) sum += 3;
                else if (arr[i].equals("B")) sum += 3;
                else if (arr[i].equals("R")) sum += 5;
                else sum += 9;
            }
            else{
                if (arr[i].equals("k")) sum -= 0;
                else if (arr[i].equals("p")) sum -= 1;
                else if (arr[i].equals("n")) sum -= 3;
                else if (arr[i].equals("b")) sum -= 3;
                else if (arr[i].equals("r")) sum -= 5;
                else sum -= 9;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        new a_29725().run();        
    }
}
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0;

        for(int i = 0; i < 8; i++) {
            String line = br.readLine();
            for(int j = 0; j < 8; j++) {
                char piece = line.charAt(j);
                switch(piece) {
                    case 'P': score += 1; break;
                    case 'N': case 'B': score += 3; break;
                    case 'R': score += 5; break;
                    case 'Q': score += 9; break;
                    case 'p': score -= 1; break;
                    case 'n': case 'b': score -= 3; break;
                    case 'r': score -= 5; break;
                    case 'q': score -= 9; break;
                }
            }
        }

        bw.write(String.valueOf(score));
        br.close();
        bw.flush();
        bw.close();
    }
}
 */