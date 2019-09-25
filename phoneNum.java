import java.util.Random;

public class phoneNum {
  public static void main(String[] args){
    Random rand = new Random();

    //Area Code
    int first = rand.nextInt(8) + 2;
    int second = rand.nextInt(9);
    int third = rand.nextInt(10);
    String areaCode = "(" + first + second + third + ")";
    //exchange Code
    int fourth = rand.nextInt(9) + 1;
    int fifth = rand.nextInt(10);
    int sixth = rand.nextInt(10);
    String exCode = "" + fourth + fifth + sixth;
    //line number
    int seventh = rand.nextInt(10);
    int eighth = rand.nextInt(10);
    int ninth = rand.nextInt(10);
    int tenth = rand.nextInt(10);
    String lineNum = "" +seventh + eighth + ninth + tenth;
    //printing
    String phoneNum = areaCode + "" + exCode + "-" + lineNum;
    System.out.println(phoneNum);

  }
}
