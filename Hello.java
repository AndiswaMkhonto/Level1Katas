import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public void hello(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        String greeting = "Hello" +" "+name;
        System.out.println(greeting);
    }

}
