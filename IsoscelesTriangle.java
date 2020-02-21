import java.util.Scanner;

public class IsoscelesTriangle {
    //A function to draw an isosceles triangle
    public void isoscelesTriangle(int size) {
        System.out.println("Enter an integer to draw an isosceles triangle");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        for (int row = 1; row <= size; row++) {
            //for spacing on both sides of columns
            for (int colSpace = size - row; colSpace >= 1; colSpace--) {
                System.out.print(" ");
            }
            for (int colHashes = 1; colHashes <= (row * 2) - 1; colHashes++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
