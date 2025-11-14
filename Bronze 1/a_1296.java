import java.io.*;
public class a_1296 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        String green = br.readLine();
        sp sp = new sp();
        sp.str_split_green(green);
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] result_arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
            result_arr[i] = sp.str_split(arr[i]);
        }
        String a = sort(arr, result_arr);
        System.out.println(a);
        br.close();
    }

    static String sort(String[] str_arr, int[] arr){
        int max = Integer.MIN_VALUE;
        String max_str = "";
        int same_count = 0;
        String[] res_arr = new String[str_arr.length];
        int res_index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)max = arr[i];
            else if (arr[i] == max) {
                same_count++;
                res_arr[res_index] = str_arr[i];
                res_index++;
            }
        }
        max_str = ascent(str_arr);
        return max_str;
    }

    static String ascent(String[] str_arr){
        if (str_arr.length == 1) return str_arr[0];
        char[] one = (str_arr[0]).toCharArray();
        char[] two = (str_arr[1]).toCharArray();
        char[] result = new char[20];
        for (int i = 2; i < str_arr.length; i++){
            if (cal_ascent(str_arr, one, two) == one) two = (str_arr[i]).toCharArray();
            else one = (str_arr[i].toCharArray());
            if (i == str_arr.length - 1){
                if (cal_ascent(str_arr, one, two) == one) result = one;
                else result = two;
            }
        }
        return result.toString();
    }

    static char[] cal_ascent(String[] str_arr, char[] one, char[] two){
        char[] result = new char[20];
        for (int j = 0; j < one.length; j++){
            if ((int) one[j] > (int) two[j]) result = one;
            else if ((int) one[j] < (int) two[j]) result = two;
        }
        return result;
    }
}

class sp{
    int[] green_count;
    int[] team_count;

    sp(){
        this.green_count = new int[4];
        this.team_count = new int[4];
    }

    void str_split_green(String sen){
        String[] arr = sen.split("");
        for (String a : arr) cal_green(a);
    }

    int str_split(String sen){
        String[] arr = sen.split("");
        for (String a : arr) cal_team(a);
        return cal();
    }

    void cal_green(String token){
        if (token.equals("L")) green_count[0]++;
        else if (token.equals("O")) green_count[1]++;
        else if (token.equals("V")) green_count[2]++;
        else if (token.equals("E")) green_count[3]++;
    }
    
    void cal_team(String token){
        if (token.equals("L")) team_count[0]++;
        else if (token.equals("O")) team_count[1]++;
        else if (token.equals("V")) team_count[2]++;
        else if (token.equals("E")) team_count[3]++;
    }

    void clear(){
        for (int i = 0; i < team_count.length; i++) team_count[i] = 0;
    }

    int cal(){
        int L = green_count[0] + team_count[0];
        int O = green_count[1] + team_count[1];
        int V = green_count[2] + team_count[2];
        int E = green_count[3] + team_count[3];
        int result = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;         // mod 100 = 100으로 나눈 후의 나머지
        System.out.println(result);
        clear();
        return result;
    }
}


/*
import java.io.*;
import java.util.StringTokenizer;
public class a_1296 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String green = br.readLine();
        sp sp = new sp();
        sp.str_split(green);
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] result_arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
            result_arr[i] = sp.str_split_team(arr[i]);
        }
        int index = sort(result_arr);
        System.out.println(arr[index]);
        br.close();
    }

    static int sort(int[] arr){
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        String[] str_arr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                max_index = i;
            } else if (arr[i] == max){
                str_arr[i] = 
            }
        return max_index;
    }
}
// 가장 적은 수를 가진 애와 비교 -> 만약 얘와 동일하면 배열에 넣어서 다시 반복
// 배열 안에 단 하나만 들어있을 때 그 수를 배출.
    char[] min_arr = arr[0].toCharArray();
    int min = (int) min_arr[0]
    for (int i = 0; i < )


class sp{
    int[] green_count;
    int[] team_count;

    sp(){
        this.green_count = new int[4];
        this.team_count = new int[4];

    }

    void str_split_green(String sen){
        String[] arr = sen.split("");
        for (String a : arr) cal_green(a);
    }

    int str_split(String sen){
        String[] arr = sen.split("");
        for (String a : arr) cal_team(a);
        return cal();
    }

    void cal_green(String token){
        if (token.equals("L")) green_count[0]++;
        else if (token.equals("O")) green_count[1]++;
        else if (token.equals("V")) green_count[2]++;
        else if (token.equals("E")) green_count[3]++;
    }
    
    void cal_team(String token){
        if (token.equals("L")) team_count[0]++;
        else if (token.equals("O")) team_count[1]++;
        else if (token.equals("V")) team_count[2]++;
        else if (token.equals("E")) team_count[3]++;
    }

    void clear(){
        team_count = new int[4];
    }

    int cal(){
        int L = green_count[0] + team_count[0];
        int O = green_count[1] + team_count[1];
        int V = green_count[2] + team_count[2];
        int E = green_count[3] + team_count[3];
        int result = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;         // mod 100 = 100으로 나눈 후의 나머지
        clear();
        return result;
    }
}
 */