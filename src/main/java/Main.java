public class Main {
    public static void main(String[] args){
        Hello h=new Hello();
        h.setName("Tshepo");
        String greeting = "Hello" +" "+h.getName();
        System.out.println(greeting);

        //..................................................................//
        h.odd_or_even();
        System.out.println("..............................................");
        h.square();
        System.out.println("..............................................");
        h.rightAngledTriangle();
        System.out.println("..............................................");
        h.isoscelesTriangle(5);
        System.out.println("................................................");
        h.findLongestString();
        System.out.println(".................................................");
        h.combineStrings();
    }
}
