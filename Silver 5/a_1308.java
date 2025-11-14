package Silver_5;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
class a_1308 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws  IOException {
        st = new StringTokenizer(br.readLine());
        LocalDate d1 = LocalDate.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        LocalDate d2 = LocalDate.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        long days = ChronoUnit.DAYS.between(d1, d2);
        long mdays = d1.getDayOfMonth() - d2.getDayOfMonth();
        long mmonths = d1.getMonthValue() - d2.getMonthValue();
        long years = ChronoUnit.YEARS.between(d1, d2);
        if (years > 1000 || (years == 1000 && mmonths == 0 && mdays == 0)) System.out.print("gg");
        //else System.out.println(years + "\n" + mmonths + "\n" + mdays + "\n");
        else System.out.print("D-" + days);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_1308().run();
        } catch (IOException e){
            System.err.println("오류 : " + e.getMessage());
        }
    }
}