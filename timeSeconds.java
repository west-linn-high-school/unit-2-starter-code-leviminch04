import java.util.Scanner;
import java.text.DecimalFormat;

public class timeSeconds{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter in your hours: ");
    String hoursStr = scan.next();
    Integer hours = Integer.valueOf(hoursStr);

    System.out.println("Enter in your minutes: ");
    String minStr = scan.next();
    Integer min = Integer.valueOf(minStr);

    System.out.println("Enter in your seconds: ");
    String secStr = scan.next();
    Integer sec = Integer.valueOf(secStr);

    System.out.println("Your time is: " + hoursStr + ":" + minStr + ":" + secStr);
    int totalSec = (hours * 3600) + (min * 60) + (sec);
    System.out.println("Your total time in seconds: " + totalSec);

  }
}
