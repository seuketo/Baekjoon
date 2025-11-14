import java.io.*;
import java.util.ArrayList;
public class a_1996 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[][] map = new int[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            char[] ar = (br.readLine()).toCharArray();
            for (int j = 0; j < n; j++) {
                if (ar[j] == '.') {
                    arr[i][j] = 0;
                    map[i][j] = 0;
                }
                else {
                    arr[i][j] = -2;
                    map[i][j] = -2;
                    list.add(ar[j] - '0');
                }
            }
        }
        int reuse_index = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr[i][j] == -2) {
                    plus(i, j, arr, map, list, reuse_index, n);
                    reuse_index++;
                    arr[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == -1) sb.append('*');
                else if (arr[i][j] >= 10) sb.append("M");
                else sb.append(arr[i][j]);
                System.out.print(map[i][j]);
            }
            sb.append("\n");
            System.out.println();
        }
        
        System.out.print(sb);
        br.close();
        

    }

    public void plus(int i, int j, int[][] arr, int[][] map, ArrayList<Integer> list, int reuse_index, int n){
        int x_start = Math.max(0, j - 1);
        int y_start = Math.max(0, i - 1);
        int x_end = Math.min(n - 1, j + 1);
        int y_end = Math.min(n - 1, i + 1);

        for (int a = y_start; a <= y_end; a++){
            for (int b = x_start; b <= x_end; b++){
                if ((arr[a][b] == -2 || arr[a][b] == -1) && map[a][b] == -2) continue;
                else if (map[a][b] != -2) arr[a][b] += list.get(reuse_index);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new a_1996().run();
    }
}

/*
        int y_index = 0;
        int x_index = 0;
        boolean tf = false;
        while (true){
            if (y_index == i + 2) break;
            if ((y_index == 0 || x_index == 0) && tf == false){
                if (y_index == 0){
                    if (i != 0 && y_index == 0) y_index = i - 1;
                    else if (i == 0) y_index = 0;
                    if (j != 0 && x_index == 0) x_index = j - 1;
                    else if (j == 0) x_index = 0;
                } else{
                    if (j != 0) x_index = j - 1;
                    else x_index = 0;
                }
                tf = true;
            }      
            if (x_index <= j + 1){
                if(arr[y_index][x_index] == 0) arr[y_index][x_index] += list.get(reuse_index);
                x_index++;
                reuse_index++;
                if (x_index == j + 2){
                    System.out.println("index clear");
                    x_index  = 0;
                    y_index++;
                    tf = false;
                }
            } 
            else if (y_index == i && x_index == j) continue;
            System.out.println("arr[i][j] : " + arr[i][j] + " => " + "arr[" + y_index + "][" + x_index + "] : " + arr[y_index][x_index]);
        }
 */
