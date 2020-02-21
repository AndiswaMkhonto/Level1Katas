import java.util.Scanner;

public class Square {
    //A function to draw a square according to an entered integer
    public void square() {
        int y;
        System.out.println("Enter an integer to draw a square");
        Scanner in = new Scanner(System.in);
        y = in.nextInt();
        for(int i=0; i<y;i++){
            for(int j=0; j<y;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
