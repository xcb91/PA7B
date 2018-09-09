import java.util.Scanner;
public class ProducLeche {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("-**Este programa calcula a ganacia de un productor de leche**-");
    System.out.println("Introdusca la cantidad de leche en litros cerrados: ");
    int L = input.nextInt();

    System.out.println("Introdusca el precio de la leche por galon: ");
    double PG = input.nextDouble();

    double TG = L/3.785;

    double GA = TG*PG;
    System.out.println("La Ganacia es de: " + GA);
  }
}
