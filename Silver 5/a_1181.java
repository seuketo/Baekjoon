/*
import java.io.*;
import java.util.Arrays;
public class a_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
            arr2[i] = arr[i].length();
        }
        Arrays.sort(arr2);
        for (int num : arr2){
            System.out.println(num);
        }

    }
}
*/

import java.io.*;
import java.util.*;
public class a_1181{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++){
            String a = br.readLine();
            hm.put(a, a.length());
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(hm.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getKey));
        int pre_value = 0;
        String pre_key = "";
        for (Map.Entry<String, Integer> entry : entries){
            if (pre_value == entry.getValue()) {
                System.out.println(entry.getValue() + "same");
                pre_value = entry.getValue();
                pre_key = entry.getKey();
            }
            else System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}