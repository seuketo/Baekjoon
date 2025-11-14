import java.io.*;
public class a_2857 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        for (int i = 0; i < 5; i++) {
            char[] arr = (br.readLine()).toCharArray();
            int count = 0;
            for (char a : arr){
                if (count == 0 && a == 'F') count++;
                else if (count == 1 && a == 'B') count++;
                else if (count == 2 && a == 'I') sb.append((i + 1) + " ");
                else count = 0;
            }
        }
        if (sb.length() == 0) System.out.println("HE GOT AWAY!");                       // StringBuilder에 isEmpty() 함수가 존재하지 않음. (해당 이유로 인해 컴파일 오류를 2번이나 받음.) length로 내용이 존재하는지 확인.
        else System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2857().run();
    }
}
