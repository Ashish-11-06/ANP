package array;

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the elements of the 2D array
        System.out.println("Printing the 2D array:");
        
        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[i].length; j++) 
            {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

