public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int sum = a + b;
        System.out.println("Arithmetic (a + b): " + sum); 

        boolean isGreater = a > b;
        System.out.println("Relational (a > b): " + isGreater);

        boolean x = true, y = false;
        boolean result = x && y;
        System.out.println("Logical (x && y): " + result);

         int num = 5;
        num += 3;  
        System.out.println("Assignment (num += 3): " + num);  

          int z = 7;
        System.out.println("Unary (++z): " + (++z)); 

        String message = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Ternary (a > b ? ...): " + message);  

        int p = 5, q = 3;  
        int bitwiseAnd = p & q;  
        System.out.println("Bitwise (p & q): " + bitwiseAnd); 
    }
}



