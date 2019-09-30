
public class quizCorrection {
  public static void main(String[] args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String firstFirst = firstName.substring(0,1);
    String firstMiddle = middleName.substring(0,1);
    String firstLast = lastName.substring(0,1);
    String initials =  firstFirst + firstMiddle + firstLast;
    String intLower = initials.toLowerCase();
    System.out.println(intLower);
  }
}
