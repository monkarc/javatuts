import com.sun.org.apache.xpath.internal.SourceTree;

public class IfConditionalStatement {
    public static void main(String[] args) {

        int myInt = 20;

        if (myInt < 10) {
            System.out.println("Yes, It's true!");
        }
        else if(myInt > 30){
            System.out.println("No, It's false");
        }
        else {
            System.out.println("None of the above.");
        }
    }
}
