import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class a_30403 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        // Set을 썼다면 좀 더 간단하게 코드 작성이 가능했을 것 같다.
        // Set<Character small = new HashSet<>(), big = new HashSet<>(); (순서가 중요하면 LinkedHashSet으로 선언)
        List<Character> small = new ArrayList<>(), big = new ArrayList<>();
        boolean checks = false, checkb = false;
        String result = "";
        for (int i = 0; i < n; i++){
            if ((arr[i] - 'a') >= 0 && (arr[i] - 'a') <= 25) small.add(arr[i]);
            else big.add(arr[i]);
        }
        checks = checksmall(small);
        checkb = checkbig(big);
        if (checks == true){
            if (checkb == false) result = "yes";
            else result = "YeS";
        } else {
            if (checkb == true) result = "YES";
            else result = "NO!";
        }
        System.out.println(result);
        br.close();
    }
    
    public boolean checksmall(List<Character> small){
        int count = 0;
        if (small.size() == 0) return false;
        else{
            char[] arr = {'r', 'o', 'y', 'g', 'b', 'i', 'v'};
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < small.size(); j++){
                    if (arr[i] == small.get(j)){
                        arr[i] = '0';
                        count++;
                    }
                }
            }
        }
        if (count == 7) return true;
        else return false;
    }

    public boolean checkbig(List<Character> big){
        int count = 0;
        if (big.size() == 0) return false;
        else{
            char[] arr = {'R', 'O', 'Y', 'G', 'B', 'I', 'V'};
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < big.size(); j++){
                    if (arr[i] == big.get(j)){
                        arr[i] = '0';
                        count++;
                    }
                }
            }
        }
        if (count == 7) return true;
        else return false;
    }

    public static void main(String[] args) {
        try{
            new a_30403().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }    
}
