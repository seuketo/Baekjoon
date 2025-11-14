import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class a_1268 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        // 반의 학생 수 n
        int n = Integer.parseInt(br.readLine());
        // 1번부터 5번 학생까지 1학년 ~ 5학년까지 속했던 반 입력 받음.
        String[] arr = new String[5];
        // 학생마다 얼마나 많이 겹치는지 확인
        int[] arr2 = new int[5];
        // 세로로 비교하기 위해서 index 사용.
        int index = 0;
        // 값 입력
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        // n값만큼 반복? (5까지만 하면 되지 않나..)
        for (int j = 0; j < 5; j++){
            // al에다가 반복문 한번 돌릴 때마다 어디 값이 겹치는지 인덱스를 뽑아서 입력함. 
            ArrayList<Integer> al = new ArrayList<>();
            // 2번 이상 겹치는 수가 있으면 
            for (int a = 0; a < 9; a++){
                int count = 0;
                for (int i = 0; i < 5; i++){
                    System.out.println(Integer.parseInt(arr[i].substring(index, index + 1)));
                    if (Integer.parseInt(arr[i].substring(index, index + 1)) == a) {
                        count++;
                        al.add(i);
                    }
                }
                if (count >= 2){
                    for (int num : al) arr2[num]++;
                }
            }
            index += 2;
        }
        Arrays.sort(arr2);
        int count = 0;
        for (int a : arr2){
            if (a == arr2[4]) count++;
        }
        if (count >= 2) System.out.println(arr2[4 - count]);
        System.out.println(arr2[4]);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1268().run();
    }
}
