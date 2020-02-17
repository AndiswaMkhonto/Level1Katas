import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    private String name;

//    public Hello() {
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Function to check if a number is odd or even
    public void odd_or_even() {
        int x;
        System.out.println("Enter an integer to check if it's odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }

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
    //A function to draw an isosceles triangle
    public void isoscelesTriangle(int size) {
        System.out.println("Enter an integer to draw an isosceles triangle");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        for(int row=1; row<=size;row++){
            //for spacing on both sides of columns
            for(int colSpace=size-row;colSpace>=1;colSpace--){
                System.out.print(" ");
            }
            for(int colHashes=1;colHashes<=(row*2)-1;colHashes++){
                System.out.print("#");
            }
            System.out.println();
        }
//
    }
    public void findLongestString(){
        String[] array=new String[]{"once", "upon", "a", "time"};
        int lengthElement = array[0].length();
        for(int i=0;i<array.length;i++) {
                if(array[i].length() >= lengthElement) {

                    lengthElement=array[i].length();
                }
        }

        for(int i=0;i<array.length;i++) {
            if(lengthElement == array[i].length())
                System.out.println(array[i]);
        }
    }

    public void combineStrings(){

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));
    }
}
