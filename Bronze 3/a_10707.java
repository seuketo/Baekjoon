import java.io.*;
public class a_10707 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(br.readLine());
        int x = arr[0] * arr[4];
        int y = 0;
        if (arr[4] <= arr[2]) y = arr[1];
        else y = arr[1] + (arr[3] * (arr[4] - arr[2]));
        if (x >= y) System.out.println(y);
        else System.out.println(x);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10707().run();
    }
}

/*
 - 한달간 P리터 사용.
 - X사 : 무조건 A엔/1리터
 - Y사 : 
        - C리터 이하 : B엔
        - C리터 초과 : B엔 + D엔/1리터
 */