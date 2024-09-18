import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Allows the use of user input
        DecimalFormat df = new DecimalFormat("0.00"); // Formats each number into the decimal format (i.e 4.1 = 4.10) Thanks Lee!

        System.out.println("|Do not put any symbols when entering in data (no % or $)|");        // Tells the user not to put any symbols that will mess up the code

        System.out.print("Enter in the bill($): ");
        String billUnconverted = s.nextLine();                                                 // Bill Amount
        double bill = Double.parseDouble(billUnconverted);
        System.out.println();

        System.out.print("Enter in the tip amount (Whole Number): ");
        String tipUnconverted = s.nextLine();
        double tipPercentage = Double.parseDouble(tipUnconverted) / 100;                          // Tip Amount
        System.out.println();

        System.out.print("Enter in the party size: ");
        String partySizeUnconverted = s.nextLine();
        int partySize = Integer.parseInt(partySizeUnconverted);                          // Number of People
        System.out.println();

        double totalTipAmount = (bill * tipPercentage);

        System.out.println(" Total tip amount: $" + df.format(totalTipAmount));     // Prints Receipt
        System.out.println(" Total bill cost: $" + df.format(bill + totalTipAmount)); // Holy Skibidi the df.format saved me life Thanks Lee
        System.out.println(" Tip per person: $" + df.format(totalTipAmount / partySize));
        System.out.println("  bill per person: $" + df.format((bill / partySize)+(totalTipAmount / partySize))); // YOSHAAAAA I DID IT !!!!


    }
}