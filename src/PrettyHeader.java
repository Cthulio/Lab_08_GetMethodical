import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String myMessage = SafeInput.getNonZeroLenString(in, "Type your message here");//It makes sense to me to use !0len here.
        int messageLen = myMessage.length();

        for(int line = 3; line > 0; line--)
        {
            for (int side = 0; side < 2; side++) {
                if (line != 2)
                {
                    for (int lineLength = 0; lineLength < 15; lineLength++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {

                    int sideLen = 15-(messageLen/2);
                    for (int lineLength = 0; lineLength+(messageLen/2) < 15; lineLength++)
                    {
                        if(side == 0 && lineLength+sideLen < 16 )
                        {
                            System.out.print("*");
                        }
                        else if (side == 1 && lineLength+sideLen > 22)
                        {
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                    }
                    if (side == 0)
                    {
                        System.out.print(myMessage);
                    }
                }
            }
            System.out.println();
        }
    }
}
