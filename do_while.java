import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        do {
            int digit = num % 10;             
            reversed = reversed * 10 + digit;  
            num /= 10;                         
        } while (num > 0);

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);

        if (original == reversed) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        System.out.println("\n--------------------------------\n");

        System.out.print("Enter a number to find sum of digits: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        do {
            int digit = temp % 10;   
            sum += digit;            
            temp /= 10;              
        } while (temp > 0);

        System.out.println("Number: " + number);
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
