import java.util.Scanner;
import java.util.Random;

public class Recipt{
  public static void main(String[] Args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    //print out name of store
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
    //getting amount of books
    System.out.println("Amount of books");
    double books = scan.nextDouble();
    //getting amount of movies
    System.out.println("Amount of movies");
    double movies = scan.nextDouble();
    //getting amount of peanuts
    System.out.println("Amount of peanuts");
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
    double peanutFee = peanuts * 1.72;
    double peanutShip = peanuts * .30;
    double peanutT = peanutFee + peanutShip;
    //total
    double total = bookT + movieT + peanutT;
    //sales tax
    double saleTax = total * .072;
    //shipping total
    double shipping = peanutShip + moviesShip + bookship;
    //item total
    double itemTotal = peanuts + movies + books;




  }
}
