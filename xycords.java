import java.util.Scanner;

public class xyCords{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your X coordinate of your first set");
    Double xCord1 = scan.nextDouble();

    System.out.println("Enter your Y coordinate of your first set");
    Double yCord1 = scan.nextDouble();

    System.out.println("Enter your X coordinate of your second set");
    Double xCord2 = scan.nextDouble();

    System.out.println("Enter your Y coordinate of your second set");
    Double yCord2 = scan.nextDouble();

    System.out.println();
    double xnum = (xCord1 - xCord2);
    Double xSquare = Math.pow(xnum, 2);
    double ynum = (yCord1 - yCord2);
    Double ySquare = Math.pow(ynum, 2);
    Double xySquare = (ySquare + xSquare);
    Double difference = Math.sqrt(xySquare);
    System.out.println(difference);
  }
}
