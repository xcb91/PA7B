import java.util.Scanner;
public class AreaTerreno {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("**Este programa calcula el area de un Terreno**");

    System.out.println("Introdusca la base del Terreno: ");
    double B = input.nextDouble();

    System.out.println("Introdusca la Altura del lado Izquierdo del Terreno: ");
    double A = input.nextDouble();

    System.out.println("Introdusca la Altura del lado Derecho del Terreno: ");
    double C = input.nextDouble();

    double Al = A-C;
    double AT = B*Al/2;
    double AR = (B*C);
    double Area = AT+AR;
System.out.println("El area total del terreno es:  "+ Area);

  }
}
