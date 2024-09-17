import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
        totalTipAmount = ( (totalTipAmount + .005) - ((totalTipAmount + .005) % .01)); // The '+ .005' and the '%. 01' is for rounding to the nearest two decimal places

        System.out.println("| Total tip amount: $" + totalTipAmount + " |");


    }
}