import java.io.*;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class a_3029 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    /*
    public void run() throws IOException{
        StringTokenizer st1 = new StringTokenizer(br.readLine(), ":");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), ":");
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        if (arr1[2] > arr2[2]){
            arr2[1]--;
            arr2[2] += 60;
        } int s = (arr2[2] - arr1[2]);
        if (arr1[1] > arr2[1]){
            arr2[0]--;
            arr2[1] += 60;
        } int m = (arr2[1] - arr1[1]);
        if (arr1[0] > arr2[0]) { arr2[0] += 24; }
        int h = (arr2[0] - arr1[0]);
        
        System.out.println(h + ":" + m + ":" + s);
        br.close();
    }
    */
    public void run() throws IOException, ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date current = sdf.parse(br.readLine());
        Date start = sdf.parse(br.readLine());
        Date tf = sdf.parse("24:00:00");
        long current_mil = current.getTime();
        long start_mil = start.getTime();
        long minus_mil = 0;
        if (start_mil < current_mil) {
            System.out.println("1. tf : " + tf.getTime());
            minus_mil = (tf.getTime() - current_mil) + start_mil;
        }
        else {
            System.out.println("2.");
            minus_mil = start_mil - current_mil;
        }
        int[] result_time = new int[3];
        System.out.println(start_mil + " - " + current_mil + " = " + minus_mil);
        result_time[0] = (int) minus_mil / 1000 * 60 * 60;
        result_time[1] = ((int) minus_mil - result_time[0] * 1000;
        result_time[2] = (int) minus_mil / 1000;
        Date sen = sdf.parse(result_time[0] + ":" + result_time[1] + ":" + result_time[2]);
        System.out.println(sdf.format(sen));
        br.close();
    }
    public static void main(String[] args) throws IOException, ParseException{
        new a_3029().run();
    }
}
