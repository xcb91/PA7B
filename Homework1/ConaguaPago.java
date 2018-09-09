import java.util.Scanner;
public class ConaguaPago {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      System.out.println("-**Este programa calcula el pago que debe realizar una persona por el total de metros cubicos que consume**-");
      System.out.println("introdusca la altura: ");
      double A= input.nextDouble();
      System.out.println("Introdusca el largo: ");
      double L= input.nextDouble();
      System.out.println("Introduzca el ancho: ");
      double N= input.nextDouble();
      System.out.println("Introdusca el costo del metro cubico: ");
      double CM= input.nextDouble();

      double V=A*L*N;
      double PAG= V*CM;

      System.out.println("El costo total es de: "+PAG);



  }
}
