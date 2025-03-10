import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {

    }

    public static double CtoF(double Celsius)
    {
        double tempInFahrenheit = (Celsius * 1.8)+32;
        return tempInFahrenheit;
    }

    public static void CtoFDisplay()
    {
        System.out.println("Celsius  |  Fahrenheit");
        System.out.print("----------------------");
        for (double degreesCelc = -100; degreesCelc <= 100; degreesCelc++)
        {
            System.out.printf("\n %.2f  |  %.2f", degreesCelc, CtoF(degreesCelc));
        }
    }
}
