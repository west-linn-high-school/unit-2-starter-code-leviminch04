import java.util.Scanner;
import java.text.DecimalFormat;

public class math{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("enter your first number:");
    String num1Str = scan.next();
    Float num1  = Float.valueOf(num1Str);

    System.out.println("Enter your second number: ");
    String num2Str = scan.next();
    Float num2 = Float.valueOf(num2Str);

    String sum = String.format("%.2g%n", (num1 + num2));
    String distance = String.format("%.2g%n", Math.abs(num1 - num2));
    String product = String.format("%.2g%n", (num1 * num2));
    String quotient1 = String.format("%.2g%n", (num1 / num2));
    String quotient2 = String.format("%.2g%n", (num2 / num1));

    System.out.println();
    System.out.println("The sum of your numbers is: " + sum);
    System.out.println("The distance between your numbers is: " + distance);
    System.out.println("The product of your numbers is: " + product);
    System.out.println("Your first number divided by your second number is: " + quotient1);
    System.out.println("Your second number divided by your first number is: " + quotient2);
  }
}
