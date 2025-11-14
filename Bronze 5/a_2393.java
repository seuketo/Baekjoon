// Clear

public class a_2393 {
    public static void main(String[] args) {
        char a = (char) 95;
        char b = (char) 124;
        char c = (char) 92;
        char d = (char) 47;
        String da = String.valueOf(a).repeat(2);
        int i = 0;

        System.out.println("  " + String.valueOf(a).repeat(3) + "  " + String.valueOf(a).repeat(3) + "  " + String.valueOf(a).repeat(3));
        System.out.println("  " + b + " " + b + da + b + " " + b + da + b + " " + b);
        System.out.println("  " + b + "           " + b);
        System.out.println("   " + c + String.valueOf(a).repeat(9) + d);
        System.out.println("    " + c + String.valueOf(a).repeat(7) + d);
        while (i <= 3){
            System.out.println("     " + b + "     " + b);
            i++;
        }
        System.out.println("     " + b + String.valueOf(a).repeat(5) + b);
        System.out.println("  " + da + d + "       " + c + da);
        System.out.println(" " + d + "             " + c);
        System.out.println("" + d + String.valueOf(a).repeat(15) + c);
    }
}


// ASCII 코드로 그림 그리라는 건줄 알았더니 그냥 직접 작성해서 출력해도 되는 거였음.
