package operator;


public class Unary {
    public static void main(String[] args) {
        int x = 10;
        
        // Unary plus operator
        int result1 = +x;
        System.out.println("Unary plus: " + result1); // Output: 10
        
        // Unary minus operator
        int result2 = -x;
        System.out.println("Unary minus: " + result2); // Output: -10
        
        // Increment operator
        int result3 = ++x; // Increment x by 1 before using its value
        System.out.println("Increment: " + result3); // Output: 11
        
        // Decrement operator
        int result4 = --x; // Decrement x by 1 before using its value
        System.out.println("Decrement: " + result4); // Output: 10
        
        // Logical complement operator
        boolean isTrue = true;
        boolean result5 = !isTrue;
        System.out.println("Logical complement: " + result5); // Output: false
        
        // Bitwise complement operator
        int y = 5;
        int result6 = ~y;
        System.out.println("Bitwise complement: " + result6); // Output: -6
        
        // Assignment operator (no operation)
        int z = 15;
        z += 5; // Equivalent to z = z + 5
        System.out.println("Assignment: " + z); // Output: 20
    }
}
