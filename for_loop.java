public class for_loop{
    public static void main(String[] args) {

        System.out.println("1. Even numbers from 2 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("2. Sum of first 10 natural numbers = " + sum);
        System.out.println();

        int num = 5;
        System.out.println("3. Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
