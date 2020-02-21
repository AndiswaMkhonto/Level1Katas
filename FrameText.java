import java.util.Scanner;

public class FrameText {
    static void frameSomeText(String[] words) {
        int maxsize = 0;
         //For the maximum length of the words
         //word with the max length stars get printed according to it
        for (String word : words) {
            if (word.length() > maxsize) {
                maxsize = word.length();
            }
        }
        //To control the top stars
        for (int i = -1; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*\n");

        for (int j = 0; j < words.length; j++) {
            System.out.print("* " + words[j]);
            for (int i = words[j].length(); i <= maxsize; i++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
        System.out.print("*");

        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*\n");

    }
}
