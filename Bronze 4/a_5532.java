import java.io.*;
public class a_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int[] arr1 = new int[2];
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 2; i++){
            if (arr[i] % arr[i + 2] > 0) arr1[i - 1] = (arr[i] / arr[i + 2]) + 1;
            else arr1[i - 1] = (arr[i] / arr[i + 2]);
        }
        if (arr1[0] > arr1[1]) sb.append(arr[0] - arr1[0]);
        else sb.append(arr[0] - arr1[1]);
        System.out.print(sb);
        br.close();
    }
}


// 오류 : 확인 안 됨.

/*
방학 : 2 <= L <= 40
국어 총 : 1 <= A <= 1000
수학 총 : 1 <= B <= 1000
하루 국어 : 1 <= C <= 100
하루 수학 : 1 <= D <= 100
*/