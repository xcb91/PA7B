import java.util.Scanner;
public class GuessBirtday {
  public static void main(String[] args){

    String set1 = "1 3 5 7 \n" +
                  "9 11 13 15 \n" +
                  "17 19 21 23 \n"+
                  "25 27 29 31";

   String set2 = "2 3 6 7 \n" +
                 "10 11 14 15 \n" +
                 "18 19 22 23 \n"+
                 "26 27 30 31";

   String set3 = "4 5 6 7 \n" +
                 "12 13 14 15 \n" +
                 "20 21 22 23 \n"+
                 "28 29 30 31";

  String set4 = "8 9 10 11 \n" +
                "12 13 14 15 \n" +
                "24 25 26 27 \n"+
                "28 29 30 31";

  String set5 = "16 17 18 19 \n" +
               "20 21 22 23 \n" +
               "24 25 26 27 \n"+
               "28 29 30 31";
  Scanner input = new Scanner(System.in);
  int day = 0;
  System.out.println("Is your birthday in set1??\n");
  System.out.println(set1);
  System.out.println("\nEnter 0 for No and 1 for yes ");
  int answer = input.nextInt();

if (answer ==1) {
  day = day +1;// es un acumulador o puede ser day+=1;

}

System.out.println("Is your birthday in set2??\n");
System.out.println(set2);
System.out.println("\nEnter 0 for No and 1 for yes ");
 answer = input.nextInt();

if (answer == 1) {
  day +=2;
}

System.out.println("Is your birthday in set3??\n");
System.out.println(set3);
System.out.println("\nEnter 0 for No and 1 for yes ");
 answer = input.nextInt();

if (answer == 1) {
  day +=4;
}

System.out.println("Is your birthday in set4??\n");
System.out.println(set4);
System.out.println("\nEnter 0 for No and 1 for yes ");
 answer = input.nextInt();

if (answer == 1) {
  day +=8;
}

System.out.println("Is your birthday in set5??\n");
System.out.println(set5);
System.out.println("\nEnter 0 for No and 1 for yes ");
 answer = input.nextInt();

if (answer == 1) {
  day +=16;
}

System.out.println("\n Your birthday is "+ day);

  }
}
