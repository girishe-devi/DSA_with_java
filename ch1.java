import java.util.Scanner;

public class ch1{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the set of input digits: ");
        int digits = sc.nextInt();
        System.out.print(digits);
        int no_of_digits = 0;
        int n_digit = digits;
        int digit;
        int small_digit = 100;
        int large_digit = 0;
        int rev = 0;
        int sum = 0;
        int mul = 1;
        while(n_digit != 0){
            no_of_digits ++;
            digit = n_digit % 10;
            rev = rev * 10 + digit;
            sum += digit;
            mul *= digit;
            if(small_digit > digit){
                small_digit = digit;
            }
            if(large_digit < digit){
                large_digit = digit;
            }
            n_digit = n_digit / 10;   
        }
        String result = digits == rev ? "The digits form a palindrome" : "The digits does not form a palindrome";
        System.out.println("No. of dogits: " +no_of_digits);
        System.out.println("Sum of digits: "+sum);
        System.out.println("Product of digits: "+mul);
        System.out.println("Smallest digit: "+small_digit);
        System.out.println("Largest digit: "+large_digit);
        System.out.println(result);

        
    }
}