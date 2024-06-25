import java.util.Scanner;
public class ArmstrongChecker166915$156808 {

    public static boolean checkArmstrong(int number){
        int originalNumber = number; //declares a new integer variable named originalNumber where we store the original value of the number
        int numDigits = countDigits(number);  //call the countDigits variable to count the number of digits in the number and store the answer  in the variable numDigits
        int armstrongSum = 0; 

        while (number > 0) {  //loop to run as long as the number is greater than 0
            int digit = number % 10;  //extract the last digit
            armstrongSum += Math.pow(digit, numDigits); //Add the digits raised to the power of numDigits to the sum
            number /=10;  //removes the last digit by dividing the number by 10                        
        }
        return armstrongSum == originalNumber;  //check if the sum is equal to the original number
    }
    public static int countDigits(int number){  //defines the countdigit method that counts the number of digits in the given number
        int count = 0;  //keep track of the count of digits in the given number
        while (number > 0) {  
            number /= 10;  //divides number by 10 and assign the result back to number effectively removing the last digit
            count++;  
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //Scanner object created to read input from the user
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //reads the number entered by the user
        System.out.println(checkArmstrong(num)); //calls the checkArmstrong method to check.The result of the check is then printed
    }
}