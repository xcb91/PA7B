import java.util.Scanner;
public class LeapYear{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a year: ");
    int year = input.nextInt();

    if ((year % 4 == 0 && year % 100 !=0) || (year % 400  == 0)){
   System.out.println( year + " is Leap Year");
 }else {
   System.out.println("is not a leap year ");
 }



  }
}
