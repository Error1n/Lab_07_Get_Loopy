import java.util.Scanner;
public class CtoF

{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        boolean done = false;
        double c = 0.0;
        double f = 0.0;
        String trash = "";

        do
        {
            System.out.print("Enter a temperature in celsius: ");
            if(in.hasNextInt())
            {
                c = in.nextInt();
                in.nextLine(); //clears buffer

                f = c * 9/5 + 32;

                System.out.println("Your temperature in farenheit is: " + f);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You typed: " + trash);
                System.out.println("But that is not a valid input. Please enter a number in celsius.");
            }
        } while(!done);


    }
}
