import java.io.*;
import java.util.*;
public class a_2863{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        sb.append(br.readLine()).append(" ").append(br.readLine());
        st = new StringTokenizer(sb.toString());
        int[] list = new int[4];
        int change = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 2) change = Integer.parseInt(st.nextToken());
            else if (i == 3) {
                list[2] = Integer.parseInt(st.nextToken());
                list[i] = change;
            } 
            else list[i] = Integer.parseInt(st.nextToken());
        }
        int value = 0;                                                          // 표값
        int spin_value = 0;
        boolean active = false;
        for (int i = 0; i < 4; i++) {
            System.out.print(list[i] + " ");
            if (i == 3) System.out.println();
        }
        for (int i = 0; i < 4; i++){
            int max = (list[0] / list[3]) + (list[1] / list[2]);
            if (value < max) {
                value = max;
                if (spin_value > i && i != 0) spin_value = i;
                System.out.println(i + " : max - " + max + ", spin_value - " + spin_value);
            }
            spin(list);
        }
        System.out.println(spin_value);
        br.close();
    }
    public void spin(int[] list){
        int last = list[0];
        list[0] = list[1];
        list[1] = list[2];
        list[2] = list[3];
        list[3] = last;
    }
    public static void main(String[] args) {
        try{
            new a_2863().run();
        } catch (IOException e){
            System.err.println("오류 : " + e.getMessage());
        }
    }
}

/*
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class a_2863 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int[] arr = new int[4];
        int max = 0;
        for (int i = 0; i < 3; i += 2){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i + 1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 4; i++){
            int sum = (arr[0] / arr[3]) + (arr[1] / arr[2]);
            if (max < sum) {
                max = sum;
            }
            goone(arr);
        }
        System.out.println(max);
        br.close();
    }
    public void goone(int[] arr){
        int index = arr[3];
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = arr[0];
        arr[0] = index;
    }
    public static void main(String[] args) throws IOException{
        new a_2863().run();
    }
}
*/