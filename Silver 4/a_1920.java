import java.io.*;
import java.util.*;
public class a_1920 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) arr.add(Integer.parseInt(st.nextToken()));
        Collections.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int tf = 0;
            int left = 0; int right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr.get(mid) == num) {
                    tf += 1;
                    break;
                }
                else if (arr.get(mid) > num) right = mid - 1;
                else if (arr.get(mid) < num) left = mid + 1;
            }
            sb.append(tf);
            if (st.hasMoreTokens()) sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_1920().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 정공법으로 contains()를 사용했다면 걸리는 시간이 n이라서 너무 오래 걸림.
    - 범위가 굉장히 크다고 가정되어있기 때문에 시간초과로 간주.
    - 그래서 Collections.sort() + 이분 탐색 사용 -> 해결 (해당 방법을 사용하면 절반으로 시간 절약 가능)
 */
