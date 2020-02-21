import java.util.Scanner;

public class RightHandedTriangle {
    //A function to draw a right angled triangle
    public void rightAngledTriangle() {
        int z;
        System.out.println("Enter an integer to draw a right angled triangle");
        Scanner in = new Scanner(System.in);
        z = in.nextInt();

        for(int i=0; i<z; i++){
            for(int j=0; j<i+1;j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
