import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Printing numbers from 1 to 10:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); 

        System.out.println(); 

        System.out.println("2. Sum of digits of a number:");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num; 

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits of " + originalNum + " is: " + sum);

        sc.close();
    }
}

