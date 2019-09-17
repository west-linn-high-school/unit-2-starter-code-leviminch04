import java.util.Scanner;

public class Receipt{
  public static void main(String[] Args){
    Scanner scan = new Scanner(System.in);
    //print out name of store
    System.out.println("Steve’s S-Mart");
    //name of cashier
    System.out.println("Name of Cashier: ");
    String cashierName = scan.next();
    //time and date
    String dateTime = "9/17/2019 9:48 AM";
    System.out.println("The time and Date are: " + dateTime);
    System.out.println();
    //getting amount of books, movies and peanuts from user
    System.out.println("Amount of books");
    double books = scan.nextDouble();
    System.out.println("Amount of movies")
    double movies = scan.nextDouble();

  }
}
