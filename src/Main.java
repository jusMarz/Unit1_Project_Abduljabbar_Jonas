import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("|Do not put any symbols when entering in data (no % or $)|");
        System.out.print("Enter in the bill($): ");
        String billUnconverted = s.nextLine();
        double bill = Double.parseDouble(billUnconverted);
        System.out.println();
        System.out.print("Enter in the tip amount (Whole Number): ");
        String tipUnconverted = s.nextLine();
        int tipPercent = Integer.parseInt(tipUnconverted);
        System.out.println();


    }
}