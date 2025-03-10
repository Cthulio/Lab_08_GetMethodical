import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0;

        do
        {
            totalCost+= SafeInput.getRangedDouble(in, "Please input an item cost from the $10 Store", 0.00,10.00);
        }
        while(SafeInput.getYNConfirm(in, "Do you have any more items (Y/N)?"));
        System.out.printf("\nYour total amounts to: $%.2f%n",totalCost);
    }
}
