import java.util.Scanner;
public class ProblemaCuatro{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

System.out.println("\nEste programa calcula el descuento segun el costo\n");

System.out.println("Introduzca el costo del traje: ");
double CT = input.nextDouble();
double DE;
double PF;
if (CT > 2500){
  DE = CT*.15;
  PF =CT-DE;
  System.out.println("El descuento es de 15%: $" + DE);
  System.out.println("EL total a pagar es de: $" + PF);
}else{
  DE = CT*.08;
  PF =CT-DE;
  System.out.println("El descuento es del 8%: $" + DE);
  System.out.println("EL total a pagar es de: $" + PF);
}



  }
}
