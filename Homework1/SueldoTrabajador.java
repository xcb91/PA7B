import java.util.Scanner;
public class SueldoTrabajador {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("**Este programa calcula el sueldo semanal de un trabajador**");
    System.out.println("Introduzca las horas trabajadas en la semana: ");
    double HT = input.nextDouble();

    System.out.println("Introduzca el Precio por hora: ");
    double PH= input.nextDouble();

    double SS= HT*PH;

    System.out.println("El sueldo total es de: "+ SS);

  }
}
