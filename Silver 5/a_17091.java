import java.io.*;
public class a_17091 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String[] hour_arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] minute_arr = {"o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};
        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if (m == 0) System.out.println(hour_arr[h - 1] + " " + minute_arr[m]);
        else if (1 <= m && m <= 30) {
            if (m == 1) System.out.println(minute_arr[m] + " minute past " + hour_arr[h - 1]);
            else if (m % 15 == 0) System.out.println(minute_arr[m] + " past " + hour_arr[h - 1]);
            else System.out.println(minute_arr[m] + " minutes past " + hour_arr[h - 1]);
        }
        else {
            if (h == 12) h = 0;
            if (60 - m == 1) System.out.println(minute_arr[60 - m] + " minute to " + hour_arr[h]);
            else if (m % 15 == 0) System.out.println(minute_arr[60 - m] + " to " + hour_arr[h]);
            else System.out.println(minute_arr[60 - m] + " minutes to " + hour_arr[h]);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_17091().run();
    }
}
