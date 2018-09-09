import java.util.Scanner;
public class AreaCircun {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("-**Este programa calcula el area de una circunferencia**-");

    System.out.println("Introdusca el valor del Radio en centimetros. : ");
    double R = input.nextDouble();


    double Result = (3.1416*(R*R));
System.out.println("El area dela circunferencia es:  "+ Result+" centimetros cuadrados");
double Metros = Result/100;
System.out.println("En metros son: "+ Metros+" metros cuadrados");

  }
}
