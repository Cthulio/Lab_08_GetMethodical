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
                    for (int lineLength = 0; lineLength < 30; lineLength++)//two halves, which I need to calculate with later.
                    {
                        System.out.print("*");
                    }
                }
                else
                {

                    int sideLen = 30-(messageLen/2);//half, minus half a message.
                    for (int lineLength = 0; lineLength+(messageLen/2) < 30; lineLength++)//stop a half from forming
                        // before half the message's space is taken too.
                    {
                        if(side == 0 && lineLength < 3 )//left side, only as many as 3.
                        {
                            System.out.print("*");
                        }
                        else if (side == 1 && sideLen-lineLength <= 3 )//right side, the last three
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
