import java.util.Scanner; //Allows the use of the Scanner which allows use to take user input
import java.text.DecimalFormat; // Allows the use of df.format, which allows use give all numbers two decimal places and skip the rounding.
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Allows the use of user input
        DecimalFormat df = new DecimalFormat("0.00"); // Formats each number into the decimal format (i.e 4.1 = 4.10) Thanks Lee!

        System.out.println("|Do not put any symbols when entering in data (no % or $ or ,)|");        // Tells the user not to put any symbols that will mess up the code

        System.out.print("Enter in the bill($): ");          // Bill Amount
        String billUnconverted = s.nextLine();              // s.nextline takes in what user types.
        double bill = Double.parseDouble(billUnconverted); // Double.parseDouble turns what Java thinks is a string into a Double
        System.out.println();

        System.out.print("Enter in the tip amount (Whole Number): ");     // Tip Amount
        String tipUnconverted = s.nextLine();
        double tipPercentage = Double.parseDouble(tipUnconverted) / 100; // Turns the whole number into a percentage
        System.out.println();

        System.out.print("Enter in the party size: ");
        String partySizeUnconverted = s.nextLine();
        int partySize = Integer.parseInt(partySizeUnconverted);                          // Number of People
        System.out.println();

        double totalTipAmount = (bill * tipPercentage);

        System.out.println("--------------------------------");  // Prints Receipt to user
        System.out.println();

        System.out.println(" Total tip amount: $" + df.format(totalTipAmount));
        System.out.println(" Total bill cost: $" + df.format(bill + totalTipAmount)); // df.format gives the numbers two decimal places
        System.out.println(" Tip per person: $" + df.format(totalTipAmount / partySize));
        System.out.println(" Total per person: $" + df.format((bill / partySize)+(totalTipAmount / partySize)));

        System.out.println();
        System.out.println("--------------------------------");

    }
}