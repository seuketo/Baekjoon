import java.time.LocalDate;
public class a_16170 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
