import java.util.Scanner;
public class AreaFigura {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("-**Este programa calcula el area de una figura**-");
    System.out.println("Introdusca el radio: ");
    double R = input.nextDouble();
    System.out.println("Introdusca la hipotenusa: ");
    double H = input.nextDouble();

    double C = Math.sqrt(H*H-R*R);

    double AC = (3.1416*(R*R)/2);

    double AT = (C*R/2)*2;

    double Area = AC+AT;

    System.out.println("El area de la figura es: "+ Area);

  }
}
