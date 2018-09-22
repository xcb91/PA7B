import java.util.Scanner;
public class ProblemaCinco{
  public static void main(String[] args){
    Scanner input =new Scanner(System.in);
System.out.println("\nEste programa determina cual de tres cantidades es mayor\n");
System.out.println("\nIntroduzca el primer numero: ");
double A = input.nextDouble();

System.out.println("\nIntroduzca el segundo numero: ");
double B = input.nextDouble();

System.out.println("\nIntroduzca el tercer numero: ");
double C = input.nextDouble();

if ( A> B) {
  if (A > C) {
  System.out.println("El mayor es: " + A);
  } else {
  System.out.println("el mayor es: " + C);
  }
}
else if (B > C) {
  System.out.println("el mayor es: " + B);
  } else {
  System.out.println("el mayor es: " + C);
        }
  }
}
