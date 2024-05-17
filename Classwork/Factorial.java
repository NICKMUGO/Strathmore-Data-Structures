import java.util.*;
public class Factorial {
    public static int fct_it(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) { // i++ == i = i+1
        result *= i;
        }
        return result;
    }
        
        // Recursion Approach
        public static int fct_rec(int n) {
        if (n == 0 || n == 1){
        return 1;
        } else {
        return n * fct_rec(n - 1);
        
        }
    }
        // main method for testing
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter the number");
            int n = x.nextInt();
            
            System.out.println("Recursion Approach");
            int result1 = fct_rec(n);
            System.out.println("Factorial of " + n + " using recursion is : " + result1);
        
        }
}
