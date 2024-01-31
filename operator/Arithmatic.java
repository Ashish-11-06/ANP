package operator;

public class Arithmatic {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        
        // Subtraction
        int sub = num1 - num2;
        System.out.println("Subtraction: " + sub);
        
        // Multiplication
        int mult = num1 * num2;
        System.out.println("Multiplication: " + mult);
        
        // Division
        int div = num1 / num2;
        System.out.println("Division: " + div);
        
        // Modulus
        int mod = num1 % num2;
        System.out.println("Modulus: " + mod);
        
        // Increment
        int increment = num1++;
        System.out.println("Increment: " + increment);
        
        // Decrement
        int decrement = num1--;
        System.out.println("Decrement: " + decrement);
    }
}
