public class a_factorial {
    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];
    
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
    
    public static String factorial(int n) {
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = multiply(result, Integer.toString(i));
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 100;
        String fact = factorial(n);
        System.out.println(n + " 팩토리얼: " + fact);
    }
}
