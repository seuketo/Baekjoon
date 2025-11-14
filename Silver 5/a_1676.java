import java.io.*;
public class a_1676 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int zero_find = 5;
        int zero = 0;
        while (n / zero_find > 0) {
            if (n / zero_find == 0) break;
            else {
                zero += n / zero_find;
                zero_find *= 5;
            }
        }
        System.out.println(zero);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        try{
            new a_1676().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}


/*
 - 팩토리얼 끝에 붙는 0의 개수
    ex) 10!의 경우
        - / 5 = 2
        - / 25 = 0

        => 2개의 0이 붙음

    ex) 100!의 경우
        - / 5 = 20
        - / 25 = 4
        - / 125 = 0
        => 24개의 0이 붙음
 */