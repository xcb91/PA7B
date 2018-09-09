import java.util.Scanner;
public class Modista {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("-**Este programa calcula la cantidad de pulgadas que debe pesir una modista de metros a pulgadas**-");
    System.out.println("Introdusca la contidad de metros: ");
    double CM = input.nextDouble();
     double PG  = CM/0.0254;
     System.out.println("La cantidad en pulgadas son: " + PG);

  }
}
