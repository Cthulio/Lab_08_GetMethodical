import java.util.Random;
import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        getInt(new Scanner(System.in),"Test");
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        int temporaryInput = 0;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space

            //reusing the basic structure of the code from previous models in this assignment, downscaling for fewer inputs.
            do {
                do {
                    if (pipe.hasNextInt()) {
                        temporaryInput = pipe.nextInt();
                        pipe.nextLine();
                        trash = "";//empty the trash.
                        //checking for negatives
                        if (temporaryInput <= 0) {
                            System.out.println("Please use a number between <> and <>!");
                        } else {
                            retInt = temporaryInput;
                        }
                    } else {
                        trash = pipe.nextLine();
                        if(!trash.isEmpty()) {//avoiding a weird but mostly harmless bug if the user puts a blank line.
                            System.out.println(trash + " is not an integer. Please insert an integer!");
                        }
                    }
                }
                while (!trash.isEmpty());
            }
            while (temporaryInput <= 0);
        } while (retInt == 0);

        return retInt;
    }
















    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
            return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        int temporaryInput = 0;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space

            //reusing the basic structure of the code from previous models in this assignment, downscaling for fewer inputs.
            do {
                do {
                    System.out.println("Choose a number 1-10");
                    if (in.hasNextInt()) {
                        temporaryInput = in.nextInt();
                        in.nextLine();
                        trash = "";//empty the trash.
                        //checking for negatives
                        if (temporaryInput <= 0 || temporaryInput > 10) {
                            System.out.println("Please use a number between <> and <>!");
                        } else {
                            retInt = temporaryInput;
                        }

                    } else {
                        trash = in.nextLine();
                        System.out.println(trash + " is not an integer. Please insert an integer!");
                    }
                }
                while (!trash.isEmpty());
            }
            while (temporaryInput <= 0 || temporaryInput > 10);
        } while (retInt == 0);

        int retRangedInt = 0;
        return retRangedInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt)
    {
        double retRangedDouble = 0;
        return retRangedDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retIsYN = true;
        return retIsYN;
    }

    public static String getRegExString(Scanner pipe, String prompt)
    {
        String retRegExString = "";
        return retRegExString;
    }



    public static void CtoFConverter()
    {
        //borrowing my own code from exercise 6, modifying as necessary
//        Scanner in = new Scanner(System.in);
//        double temperatureToConvert = 0.0;
//        String trash = "";
//        do {
//            System.out.println("Please provide a temperature in Celsius:");
//            if (in.hasNextDouble()) {
//                temperatureToConvert = in.nextDouble();
//                in.nextLine();
//                trash = "";//empty the trash.
//            } else {
//                trash = in.nextLine();
//                System.out.println(trash + " is not a valid temperature!");
//            }
//        }
//        while (!trash.isEmpty());//I find this more effective than storing a "done" value, we would only need to clear it on valid input, and it's a bit funny.
//        CtoFTableDisplay convert = new CtoFTableDisplay(System.in, "Your temperature in Fahrenheit is: ");
    }

}
