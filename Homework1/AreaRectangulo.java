import java.util.Scanner;
public class AreaRectangulo {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("-**Este programa calcula el area de un rectangulo**-");

    System.out.println("Introdusca la base: ");
    double B = input.nextDouble();

    System.out.println("Introdusca la Altura: ");
    double A = input.nextDouble();

    double Result = A*B;
System.out.println("El area del rectangulo es:  "+ Result);

  }
}
