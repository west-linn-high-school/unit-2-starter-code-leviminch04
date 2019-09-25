import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Store{
  public static void main(String[] Args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.00");
    Random rand = new Random();
    //getting amount of books
    System.out.println("Amount of books");
    double books = scan.nextDouble();
    //getting amount of movies
    System.out.println("Amount of movies");
    double movies = scan.nextDouble();
    //getting amount of peanuts
    System.out.println("Pounds of peanuts (to the tenth)");
    double peanuts = scan.nextDouble();
    //bookprice and fee
    double bookPrice = books * 9.0;
    double bookship = bookPrice * .95;
    double bookT = bookship + bookPrice;
    //movie price and fee
    double moviesPrice = movies * 13.97;
    double moviesShip = moviesPrice * .04;
    double movieT = moviesShip + moviesPrice;
    //peanut price and fee
    double peanutPrice = peanuts * 1.72;
    double peanutShip = peanuts * .30;
    double peanutT = peanutPrice + peanutShip;
    //total
    double total = bookT + movieT + peanutT;
    //sales tax
    double saleTax = total * .072;
    //shipping total
    double shipping = peanutShip + moviesShip + bookship;
    //item total
    double itemTotal = peanuts + movies + books;
    //total and sales tax
    double salesTotal = total + saleTax;
    //rounding
    String fmtPeanutPrice = fmt.format(peanutPrice);
    String fmtMoviesPrice = fmt.format(moviesPrice);
    String fmtBookPrice = fmt.format(bookPrice);
    String fmtBookShip = fmt.format(bookship);
    String fmtMovieShip = fmt.format(moviesShip);
    String fmtPeanutShip = fmt.format(peanutShip);
    String fmtItemTotal = fmt.format(itemTotal);
    String fmtTotal = fmt.format(total);
    String fmtSaleTax = fmt.format(saleTax);
    String fmtSaleTotal = fmt.format(salesTotal);
    //spaces
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    //name of store
    System.out.println("Steve’s S-Mart");
    //name of cashier
    System.out.println("Name of Cashier: ");
    String cashierName = scan.next();
    //time and date
    int year = rand.nextInt(2019) + 1;
    int month = rand.nextInt(12) + 1;
    int day = rand.nextInt(28) + 1;
    int sec = rand.nextInt(60) + 1;
    int min = rand.nextInt(60) + 1;
    int hour = rand.nextInt(24) + 1;
    String date = month + "/" + day + "/" + year;
    String time = hour + ":" + min + ":" + sec;
    System.out.println("The time is " + time + " The date is " + date);
    System.out.println();
    //printing
    System.out.println("Amount of books: " + books + "  Price: " + fmtBookPrice);
    System.out.println("Shipping fee for books: " + fmtBookShip);
    System.out.println("Amount of movies: " + movies + "  Price: " + fmtMoviesPrice);
    System.out.println("Shipping fee for movies: " + fmtMovieShip);
    System.out.println("Pounds of peanuts: " + peanuts + " Price: " + fmtPeanutPrice);
    System.out.println("Shipping fee for peanuts: " + fmtPeanutShip);
    System.out.println("Sales tax: " + fmtSaleTax);
    System.out.println("---------------------------------");
    System.out.println("Total: " + fmtTotal);
    System.out.println("Total with sales tax: " + fmtSaleTot);



  }
}
