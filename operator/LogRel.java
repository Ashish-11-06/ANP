package operator;

public class LogRel {

    public static void main(String[] args) {
        // Relational Operators
        int a = 10;
        int b = 20;

        // Equality operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // Greater than and less than operators
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true

        // Greater than or equal to and less than or equal to operators
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;

        // AND operator
        System.out.println("x && y: " + (x && y)); // false

        // OR operator
        System.out.println("x || y: " + (x || y)); // true

        // NOT operator
        System.out.println("!x: " + !x); // false
        System.out.println("!y: " + !y); // true
        
        
    }
}
