import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Day of the Week:");
        System.out.print("Enter a number (1 to 3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println(); 

        System.out.println("2. Vowel Checker:");
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }

        sc.close();
    }
}
