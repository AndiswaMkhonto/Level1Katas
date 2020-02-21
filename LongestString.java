import java.util.Scanner;

public class LongestString {

 public void findLongestString() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of words");
     int size = Integer.parseInt(sc.nextLine());
     String[] array = new String[size];
     System.out.println("Enter " + size + " words to see the longest");
     for (int i = 0; i < array.length;i++){
         array[i] = sc.nextLine();
     }
     int elementLength = array[0].length();
     for (int i = 0; i < array.length; i++) {
         if (array[i].length() >= elementLength) {
             elementLength = array[i].length();
         }
     }
     for (int i = 0; i < array.length; i++) {
         if (array[i].length() == elementLength) {
             System.out.println("The longest string is: "+array[i]);
         }
     }
     //System.out.println("The longest string is: " + elementLength);
  }

}

