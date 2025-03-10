import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = 1984;//the value is a filler for displaying here only, it will be replaced.
        int birthMonth = 1;
        int birthDay = 1;
        int lo = 1;
        int hi = 31;//this gets overwritten about half the time.
        int birthHour = 0;
        int birthMinute = 0;
        birthYear = SafeInput.getRangedInt(in, "Enter your Birth Year", 1800, 2025);//AI could answer this year.
        birthMonth = SafeInput.getRangedInt(in, "Enter your Birth Month", 1, 12);
        switch(birthMonth)//this was the only way I could think to split this into 3 "groups".
        {
            case 9:
            case 4:
            case 6:
            case 10:
                hi = 30;
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
                hi = 31;
            break;
            case 2:
                hi = 29;//I could do some MOD math to figure out leap years too...
            break;
        }
        birthDay = SafeInput.getRangedInt(in, "Enter your Birth Day", lo, hi);
        birthHour = SafeInput.getRangedInt(in, "Enter your Birth Hour", 1, 24);//24h format so I don't have to ask for am/pm
        birthMinute = SafeInput.getRangedInt(in,"Enter your Birth Minute", 0, 59);
        System.out.println("\nYour birthday is: " + birthMonth+"/"+birthDay+"/"+birthYear+", "+birthHour+":"+birthMinute);
    }
}
