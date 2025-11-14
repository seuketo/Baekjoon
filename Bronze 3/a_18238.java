/*
import java.io.*;
public class a_18238 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        char[] arr = (br.readLine()).toCharArray();
        int[] alpha = new int[25];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            int a = (int) arr[i] - 65;

        }

    }    
    public static void main(String[] args) throws IOException{
        new a_18238().run();
    }
}
*/
        /*
        char cur = 'A';
        int total = 0;
        int[] dif = new int[2];
        for (char a : arr){
            dif[0] = Math.abs((int) a - (int) cur);
            dif[1] = calcto(a, cur);
            if (dif[0] >= dif[1]) total += dif[1];
            else total += dif[0];
        }
        System.out.println(total);
        br.close();
        */
    /*
    public int calcto(char a, char cur){
        
    }
    */
/*
    public int calcdif(char a, char cur){
        int total = 0;
        if ((a == 'A' && cur == 'Z') || (a == 'Z' && cur == 'A')) return 1;
        else if ((a == 'A' && cur == 'A') || (a == 'Z' && cur == 'Z')) return 0;
        int[] arr = new int[2];
        arr[0] = (int) Math.abs('A' - a);
        arr[1] = (int) Math.abs('Z' - a);
        System.out.println("arr : " + arr[0] + ", " + arr[1]);
        int[] cur_d = new int[2];
        cur_d[0] = (int) Math.abs('A' - cur);
        cur_d[1] = (int) Math.abs('Z' - cur);
        System.out.println("cur_d : " + cur_d[0] + ", " + cur_d[1]);
        if (arr[0] > arr[1]){
            if (cur_d[0] >= cur_d[1]) total = (int) Math.abs(arr[1] - cur_d[1]);
            else if (cur_d[0] < cur_d[1]) total = (int) Math.abs(arr[1] - (int) 'Z') + (int) Math.abs((int) 'A' - cur_d[0]) + 1;
        }
        else if (arr[0] < arr[1]) {
            if (cur_d[0] >= cur_d[1]) total = (int) Math.abs(cur_d[1] - (int) 'Z') + (int) Math.abs((int) 'A' - arr[0]) + 1;
            else if (cur_d[0] < cur_d[1]) total = (int) Math.abs(arr[0] - cur_d[1]);
        } else{
            if ((int) Math.abs(arr[0] - cur_d[0]) >= (int) Math.abs(arr[0] - cur_d[1])) total = (int) Math.abs(arr[0] - cur_d[1]);
            else total = (int) Math.abs(arr[0] - cur_d[0]);
        }
        System.out.println(total);
        return total;
    }
    */

/*
 - 초기 상태 : A
    - 왼쪽 또는 오른쪽으로 돌릴 수 있음. 한 칸 당 시간 1 소요
    - 출력에는 시간 소요 x
 */

import java.io.*;
public class a_18238 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String str = br.readLine();
        char[] chars = str.toCharArray();
        int pointer = 0;
        int time = 0;
        while (true) {
            // 다음 문자 출력
            char nextChar = chars[pointer];
            System.out.println(nextChar);
            // 원판 회전
            time += Math.abs(pointer - (pointer + 1) % chars.length);
            pointer += (pointer + 1) % chars.length - pointer;

            // 종료 조건
            if (pointer == 0 && nextChar == chars[0]) break;
        }
        System.out.println(time);
        br.close();
    }

    public static void main(String[] args) throws IOException{
        new a_18238().run();
    }
}