import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String yourSSN = "";
        String studentID = "";
        String menuItem = "";

        yourSSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        studentID = SafeInput.getRegExString(in, "Enter your Student ID", "(M|m)\\d{5}$");
        //M numbers are longer than this aren't they?
        menuItem = SafeInput.getRegExString(in, "Open, Save, View, or Quit?", "^[OoSsVvQq]$");

        System.out.println("Your SSN: "+yourSSN+ ", your Student ID: "+studentID+" your final option: "+menuItem);
    }
}
