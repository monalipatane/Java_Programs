public class NestedFor {
    public static void main(String[] args) {

        System.out.println("1. 3x3 Square of Stars:");
        for (int i = 1; i <= 3; i++) {          
            for (int j = 1; j <= 3; j++) {      
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); 

        System.out.println("2. Right-angled Triangle of Stars:");
        for (int i = 1; i <= 3; i++) {          
            for (int j = 1; j <= i; j++) {     
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
