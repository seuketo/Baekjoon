import java.io.*;
import java.util.*;

public class a_4659 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException {
        String word = "0";

        while (true) {
            word = br.readLine();
            if (word.equals("end")) break;
            else sb.append("\n");
            boolean vowel_least = false;
            boolean word_three_continue = false;
            int vowel_count = 0;
            int consonant_count = 0;
            boolean same_word = false;
            char before_word = '0';
            char[] arr = word.toCharArray();
            List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
            for (int i = 0; i < arr.length; i++) {
                if (vowels.contains(arr[i])) {
                    vowel_least = true;
                    if (before_word == arr[i]) {
                        vowel_count++;
                        if ((before_word != 'e' && arr[i] != 'e') || (before_word != 'o' && arr[i] != 'o')) same_word = true;
                    } else if (before_word != arr[i] && (vowels.contains(before_word))) {
                        vowel_count++;
                    }
                } else {
                    if (!vowels.contains(arr[i])) {
                        consonant_count++;
                        if (before_word == arr[i]) same_word = true;
                    }
                }
                before_word = arr[i];
                if (vowel_count == 3 || consonant_count == 3) word_three_continue = true;
            }
            if (!vowel_least || same_word || word_three_continue) sb.append("<" + word + "> is acceptable.");
            else sb.append("<" + word + "> is not acceptable.");
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_4659().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
