import java.io.*;
public class a_4458 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            sb.append(Character.toUpperCase(sen.charAt(0)) + sen.substring(1)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_4458().run();
    }
}

/* 79210984, 14020KB, 100ms, 574B
    // 이 코드 나랑 비슷한데 코드 시간 차이가 너무 나서 의문. toString() 하나 차이가 100ms 정도는 아닐 것으로 추정.
    import java.io.*;
    public class Main {
        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<N; i++) {
                String sentence = br.readLine();
                sb.append(Character.toUpperCase(sentence.charAt(0))).append(sentence.substring(1)).append("\n");
            }

            System.out.println(sb.toString());
            br.close();
        }
}
 */