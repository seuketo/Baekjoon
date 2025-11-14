import java.io.*;
import java.util.*;

public class a_7568{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] kg = new int[n];
        int[] cm = new int[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            kg[i] = Integer.parseInt(st.nextToken());
            cm[i] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++){
            rank[i] = 1;
            for (int j = 0; j < n; j++){
                if (kg[i] < kg[j] && cm[i] < cm[j]) rank[i]++;
            }
        }
        
        for (int i : rank) System.out.print(i + " ");
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_7568().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}


/*
class body{
    List<Integer> kg;
    List<Integer> cm;
    int[] point;
    int[] result;

    body(int n){
        kg = new ArrayList<>();
        cm = new ArrayList<>();
        point = new int[n];
        result = new int[n];
    }

    void addkgcm(int kg, int cm){
        this.kg.add(kg);
        this.cm.add(cm);
    }

    void setHighkg(int n){
        List<Integer> copykg = new ArrayList<>();
        for (int i : kg) copykg.add(i);
        Collections.sort(copykg);
        int prize = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (kg.get(j).equals(copykg.get(i))) point[j] = prize;
            }
            prize++;
        }
    }

    void setHighcm(int n){
        List<Integer> copycm = new ArrayList<>();
        for (int i : cm) copycm.add(i);
        Collections.sort(copycm);
        int prize = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (cm.get(j).equals(copycm.get(i))) point[j] += prize;
            }    
            prize += 1;
        }
    }

    void sortarr(int n){
        int[] copypoint = new int[n];
        for (int i = 0; i < n; i++) copypoint[i] = point[i];
        Arrays.sort(copypoint);
        int prize = 1;
        for (int i = n - 1; i >= 0; i--){
            for (int j = 0; j < n; j++){
                if (copypoint[i] == point[j]) {
                    point[j] = 0;
                    result[j] = prize;
                }
            }
            prize++;
        }
    }

    int[] getlist(){
        return result;
    }
}


public class a_7568 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        body bd = new body(n);
        for (int i = 0; i < n; i++){ 
            st = new StringTokenizer(br.readLine());
            int kg = Integer.parseInt(st.nextToken());
            int cm = Integer.parseInt(st.nextToken());
            bd.addkgcm(kg, cm);
        }
        bd.setHighkg(n);
        bd.setHighcm(n);
        bd.sortarr(n);
        int[] arr = bd.getlist();
        for (int i = 0; i < n; i++) sb.append(arr[i]).append(" ");
        sb.trimToSize();
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_7568().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
*/

/*
 - A의 몸무게 = x
 - A의 키 = y
    = (x, y)

 - B의 몸무게 = p
 - B의 키 = q
    = (p, q)

 - 만약 x > p, y > q라면 A가 덩치가 더 크다.
    => 키와 몸무게 모두 상대방보다 커야 덩치다 더 크다라고 간주.

 - 
 */
