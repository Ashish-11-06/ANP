package operator;

public class assignment {

    public static void main(String[] args) {
        // Assigning a value to a variable using =
        int a = 10;
        System.out.println("Initial value of a: " + a);
        
        // Using += to add and assign
        a += 5;  // equivalent to: a = a + 5;
        System.out.println("After adding 5, value of a: " + a);
        
        // Using -= to subtract and assign
        a -= 3;  // equivalent to: a = a - 3;
        System.out.println("After subtracting 3, value of a: " + a);
        
        // Using *= to multiply and assign
        a *= 2;  // equivalent to: a = a * 2;
        System.out.println("After multiplying by 2, value of a: " + a);
        
        // Using /= to divide and assign
        a /= 4;  // equivalent to: a = a / 4;
        System.out.println("After dividing by 4, value of a: " + a);
        
        // Using %= to calculate remainder and assign
        a %= 2;  // equivalent to: a = a % 2;
        System.out.println("After taking remainder by 2, value of a: " + a);
    }
}
