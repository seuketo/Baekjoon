package Silver_5;

import java.io.*;
import java.util.*;
public class a_2508 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException {
        int t = Integer.parseInt(br.readLine());
        // - 시간 효율 코드
        while (t-- > 0) {
            String line;
            do{
                line = br.readLine();
                if (line == null) return;
            } while (line.trim().isEmpty());
            st = new StringTokenizer(line);
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][c];
            int g = 0; int s = 0;
            for (int y = 0; y < r; y++){
                char[] list = br.readLine().toCharArray();
                for (int x = 0; x < c; x++) arr[y][x] = list[x];
            }
            for (int x = 0; x < c; x++) {
                for (int y = 0; y + 2 < r; y++) {
                    if (arr[y][x] == 'v' && arr[y + 1][x] == 'o' && arr[y + 2][x] == '^') s++;
                }
            }
            for (int y = 0; y < r; y++) {
                for (int x = 0; x + 2 < c; x++) {
                    if (arr[y][x] == '>' && arr[y][x + 1] == 'o' && arr[y][x + 2] == '<') g++;
                }
            }
            sb.append(g + s);
            if (t > 0) sb.append("\n");
        }

        /* - 메모리 효율 코드
        while (t --> 0){
            String line;
            do{
                line = br.readLine();
                if (line == null) return;
            } while (line.trim().isEmpty()); // 모든 케이스마다 공백 한 줄 출력, EOF 방지 코드. (NoSuchElement)

            st = new StringTokenizer(line);
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            List<char[]> arr = new ArrayList<>();
            for (int i = 0; i < r; i++) arr.add(br.readLine().toCharArray());

            int g = 0; int s = 0; // 탐색 후 조건 충족 시 +1
            for (int x = 0; x < c; x++) {
                for (int y = 0; y + 2 < r; y++) {
                    if (arr.get(y)[x] == 'v' && arr.get(y + 1)[x] == 'o' && arr.get(y + 2)[x] == '^') s++;
                }
            }
            for (int y = 0; y < r; y++) {
                for (int x = 0; x + 2 < c; x++) {
                    if (arr.get(y)[x] == '>' && arr.get(y)[x + 1] == 'o' && arr.get(y)[x + 2] == '<') g++;
                }
            }
            sb.append(g + s);
            if (t > 0) sb.append("\n");
        }
        */

        System.out.print(sb.toString());
        br.close();

    }
    public static void main(String[] args) throws IOException {
        try{
            new a_2508().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
