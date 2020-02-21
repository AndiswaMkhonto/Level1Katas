import java.util.ArrayList;
import java.util.Scanner;

public class CombineArrays {
    public void combineStrings(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = Integer.parseInt(sc.nextLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter " + size + " array 1 elements");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter " + size + " array 2 elements");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            list.add(array1[i]);
            for (int j = i; j <= i; j++) {
                list.add(array2[j]);
            }
        }
        System.out.print("The Results : " + list);
        System.out.println(".................................................");
    }
}
