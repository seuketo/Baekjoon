import java.io.*;
/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
*/
import java.util.StringTokenizer;
public class a_29722 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine(), "-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        if (n / 30 == 0) month += n / 30;
        else if (n >= 30){
            month += n / 30;
            day += n % 30;
            if (day > 30){
                month += 1;
                day = day % 30;
            }
            if (day == 0) day = 1;
        }
        if (month > 12){
            year += month / 12;
            month = (month % 12) - 1;
            if (month == 0) month = 1;
        }
        String formattedMonth = "";
        String formattedDay = "";
        if (month < 10) formattedMonth = "0" + Integer.toString(month);
        else formattedMonth = Integer.toString(month);
        if (day < 10) formattedDay = "0" + Integer.toString(day);
        else formattedDay = Integer.toString(day);
        /*
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
        */
        System.out.println(year + "-" + formattedMonth + "-" + formattedDay);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_29722().run();
    }
}
