import java.util.*; // Consider removing if not used
public class Variables {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        // Using var keyword for type inference
        var MyNum = 10; // inferred as int
        var MyDouble = 12.6; // inferred as double
        var MyBoolean = true; // inferred as boolean
        var MyString = "Tharun"; // inferred as String
        System.out.println(MyNum);
        System.out.println(MyDouble);
        System.out.println(MyBoolean);
        System.out.println(MyString);
    }
}
