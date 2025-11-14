import java.io.*;
import java.util.*;
public class a_15738 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int change_index = k - 1, first_k = arr[change_index];
        for (int i = 0; i < m; i++){
            int a = Integer.parseInt(br.readLine());
            List<Integer> list;
            List<Integer> fixlist;
            if (a >= 0) {
                list = Arrays.asList(Arrays.copyOfRange(arr, 0, a));
                Collections.reverse(list);
                for (int j = 0; j < list.size(); j++) arr[j] = (int) (list.get(j));
                if (change_index <= a) change_index = (a - 1) - change_index;
            }
            else {
                list = Arrays.asList(Arrays.copyOfRange(arr, n + a, n));
                fixlist = new ArrayList<>(list);
                for (int j = 0; j < n - list.size(); j++) fixlist.add(0);
                Collections.reverse(fixlist);
                for (int j = n + a; j <= n; j++) {
                    if (fixlist.get(j) == 0) continue;
                    arr[j] = (int) fixlist.get(j);
                    System.out.println("arr[" + j + "] = " + arr[j]);
                };
                if (change_index >= n + a) change_index = n - (change_index - 1);
            }
            System.out.println(list);
            for (int j = 0; j < arr.length; j++) System.out.print(arr[j] + " ");
            System.out.println();
            //System.out.println("change_index : " + change_index + ", arr[change_index] : " + arr[change_index]);
        }
        for (int i = 0; i < n; i++)
            if (arr[i] == first_k && i == change_index) {
                System.out.println(i + 1);
                break;
            }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_15738().run();
    }
}

// 배열 A의 크기 => N = 5
// K번째에 있던 수 (최종 결과) => K = 1
// 총 연산 개수 => M = 2
// 배열 A에 들어있는 수 => 1 3 2 4 5
// 연산을 나타내는 정수 i => 3, -4
/*
 - 1 3 2 4 5
 */