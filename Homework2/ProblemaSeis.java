import java.util.Scanner;
public class ProblemaSeis{
  public static void main(String[]args){
    Scanner input= new Scanner(System.in);

    System.out.println("\nEste programa calcula el total a pagar por un banquete\n");
System.out.println("\nIntroduzca el numero de personas: ");
int NP = input.nextInt();
double TOT;

if(NP <201){
  TOT = NP*95;
  System.out.println("El total a pagar es: $" + TOT);
}if(NP > 200 && NP < 301){
  TOT = NP*85;
  System.out.println("El total a pagar es: $" + TOT);
}else if(NP>300){
  TOT = NP*75;
  System.out.println("El total a pagar es: $" + TOT);

}



  }
}
