import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Hello h=new Hello();
       h.hello();

        //..................................................................//
        EvenOrOdd evenorodd = new EvenOrOdd();
        evenorodd.odd_or_even();
        System.out.println("..............................................");


        Square s=new Square();
        s.square();
        System.out.println("..............................................");

        RightHandedTriangle r=new RightHandedTriangle();
        r.rightAngledTriangle();
        System.out.println("..............................................");

        IsoscelesTriangle i=new IsoscelesTriangle();
        i.isoscelesTriangle(5);
        System.out.println("................................................");

        LongestString l=new LongestString();
        l.findLongestString();
        System.out.println(".................................................");

        CombineArrays c=new CombineArrays();
        c.combineStrings();

        FrameText f=new FrameText();
     Scanner sca = new Scanner(System.in);
     int size = 0;
     System.out.println("How many words you want to enter?: ");
     size = Integer.parseInt(sca.nextLine());
     String[] inputs = new String[size];
     System.out.println("Now enter " + size + "Words");

     for (int j = 0; j < size; j++) {
      inputs[j] = sca.nextLine();
     }

     System.out.print("*");
        f.frameSomeText(inputs);
     //f.frameSomeText(new String []{"Writers", "good","code","every","day"});
    }
}
