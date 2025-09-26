import java.util.Scanner;

public class IfStatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Simple if statement:");
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("The number is positive.");
        }
        System.out.println(); 

        
        System.out.println("2. if-else statement:");
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        if (num2 % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        System.out.println();

        System.out.println("3. if-else ladder:");
        System.out.print("Enter your grade (A/B/C/D): ");
        char grade = sc.next().charAt(0);
        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B') {
            System.out.println("Good job!");
        } else if (grade == 'C') {
            System.out.println("Well done.");
        } else if (grade == 'D') {
            System.out.println("You passed.");
        } else {
            System.out.println("Invalid grade.");
        }
        System.out.println();

        System.out.println("4. Nested if-else:");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.print("Do you have a driving license? (yes/no): ");
            String hasLicense = sc.next();
            if (hasLicense.equalsIgnoreCase("yes")) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a license to drive.");
            }
        } else {
            System.out.println("You are underage for driving.");
        }

        sc.close();
    }
}
