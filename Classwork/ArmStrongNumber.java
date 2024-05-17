import java.util.Scanner;


public class ArmStrongNumber {

    // Fields

    // Constructors

    // Methods
    public static boolean isArmstrong(int num){
        int[] digits = ArmstrongArray(num);

        int sum= 0;

        int Digits= digits.length;

        for (int digit : digits){
            sum+=Math.pow(digit,Digits);
        }

        return sum == num;  
    }

    public static int[] ArmstrongArray(int num){
        int[] digits =new int[100];
        int Digits = 0;

        for (int n = num; n>0; n/=10){
            Digits++;
        }

        for(int i=Digits - 1;i>=10;i-- ){
            digits[i]= num% 10;
            num /=10;
        }

        int [] result = new int[Digits];

        System.arraycopy(digits,0,result,0,Digits);

        return result;
    }

    // Main method (if applicable)
    public static void main(String[] args) {
        // Main method code
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isArmstrong(num));
    }
}