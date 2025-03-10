import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = 42;//the value is a filler for displaying here only, it will be replaced.

        double favDouble = 3.14;//same as above.

        favInt = SafeInput.getInt(in, "Enter your favorite Integer");

        favDouble = SafeInput.getDouble(in, "Enter your favorite Double");

        System.out.println("\nYour favorite Int is: " + favInt + " and your favorite Double is " + favDouble);
    }
}