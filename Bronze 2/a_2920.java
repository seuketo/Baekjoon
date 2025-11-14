import java.io.*;
public class a_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen = br.readLine();
        if (sen.equals("1 2 3 4 5 6 7 8")) System.out.println("ascending");
        else if (sen.equals("8 7 6 5 4 3 2 1")) System.out.println("descending");
        else System.out.println("mixed");
        br.close();
    }
}
/*
1. int[] 생성, 값을 하나 하나 입력 받을 수 있게 반복문과 nextInt() 사용.
2. 반복문을 하나 생성해서 만약 int[i+1] == int[i] + 1이면 ascending, int[i+1] == int[i] - 1이면 descending, 그 외에는 mixed
*/ 