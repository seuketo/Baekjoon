import java.io.*;
public class a_5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
         for (int i = 0; i < N; i++){
              String sen = br.readLine();
               sb.append(sen.toLowerCase() + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}

// 서브태스크 문제 조건을 어떻게 해야할지 모르겠음. 어떤 문제는 서브태스크 문제의 조건을 포함시켜야 하지만, 거의 대부분의 문제가 서브태스크의 조건을 코드로 작성하지 않음.