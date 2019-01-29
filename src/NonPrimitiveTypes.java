public class NonPrimitiveTypes{
    public static void main(String[] args){
        int myInt = 7;

        //string is class (type of object that can hold text)
        String text = "Hello Strings";

        String blank = " ";

        String name = "Bob";

        String greeting = text + blank + name;

        System.out.println(greeting);

        System.out.println(text);

        System.out.println("Hello" + " " + "bob");

        System.out.println("My Integer is: "+ myInt);

        double myDouble = 7.5;

        System.out.println("My Double is: "+ myDouble + ".");
    }
}
