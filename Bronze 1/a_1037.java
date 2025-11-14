// Clear
import java.util.Scanner;

public class a_1037{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String divisor_count_str = sc.nextLine();
        String divisor_str = sc.nextLine();
        String[] divisor_save = divisor_str.split(" ");
        int divisor_count = Integer.parseInt(divisor_count_str);
        int[] divisor_arr = new int[divisor_count];

        

        for (int i = 0; i < divisor_save.length; i++){
            divisor_arr[i] = Integer.parseInt(divisor_save[i]);
        }
        int divisor_max = divisor_arr[0];
        int divisor_min = divisor_arr[0];
        /*
        for(int i = 0; i < divisor_arr.length / 2; i++){
            for (int j = divisor_arr.length / 2; j < divisor_arr.length; j++){
                if (divisor_arr.length == 1){
                    divisor_max = divisor_arr[i];
                    divisor_min = divisor_max;
                    break;
                }
                
                if (divisor_arr[i] <= divisor_arr[j]){
                    System.out.println("if : " + divisor_max + " , " + divisor_min);
                    divisor_max = divisor_arr[j];
                    break;
                }

                else{
                    System.out.println("else : " + divisor_max + " , " + divisor_min);
                    divisor_min = divisor_arr[j];
                    break;
                }
            }

            if (divisor_arr.length == 1){
                break;
            }
        }
        */
        
        int i = 0;
        while(i != divisor_arr.length){
            if (divisor_arr.length == 1){
                divisor_max = divisor_arr[i];
                divisor_min = divisor_max;
                break;
            }
            else if (divisor_arr.length == 2){
                if (divisor_arr[i] < divisor_arr[i + 1]){
                    divisor_max = divisor_arr[i + 1];
                    divisor_min = divisor_arr[i];
                    break;
                }
                else{
                    divisor_max = divisor_arr[i];
                    divisor_min = divisor_arr[i + 1];
                    break;
                }
            }

            if (divisor_max < divisor_arr[i]){
                divisor_max = divisor_arr[i];
                i++;
            }

            else{
                if (divisor_min > divisor_arr[i]){
                 divisor_min = divisor_arr[i];   
                }
                i++;
            }
        }

        System.out.println(divisor_max * divisor_min);
        sc.close();

    }
}