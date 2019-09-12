import java.util.Scanner;
import java.text.DecimalFormat;

public class xyCords{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("enter your X coordinate");
    String xCordStr = scan.next();
    Integer xCord = Integer.valueOf(xCordStr);

    System.out.println("Enter your Y coordinate");
    String yCordStr = scan.next();
    Integer yCord = Integer.valueOf(yCordStr);

    System.out.println();
    System.out.println("Your coordinates are: (" + xCord + "," + yCord + ")");
    System.out.println("The distance between your coordinates is: " + Math.abs(xCord - yCord));

  }
}
