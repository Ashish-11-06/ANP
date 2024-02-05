package operator;

public class Shift {

    public static void main(String[] args) {
        int num1 = 10;
        
        
        // Left Shift Operator (<<)
        System.out.println("Left Shift Operator (<<)");
        System.out.println("Before shifting: " + num1 + " binary: " + Integer.toBinaryString(num1));
        System.out.println("After shifting by 2 bits: " + (num1 << 2) + " binary: " + Integer.toBinaryString(num1 << 2));
        System.out.println();
        
        // Right Shift Operator (>>)
        System.out.println("Right Shift Operator (>>)");
        System.out.println("Before shifting: " + num1 + " binary: " + Integer.toBinaryString(num1));
        System.out.println("After shifting by 2 bits: " + (num1 >> 2) + " binary: " + Integer.toBinaryString(num1 >> 2));
        
       }
}
