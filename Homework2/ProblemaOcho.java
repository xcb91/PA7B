import java.util.Scanner;
public class ProblemaOcho{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nEste programa calcula los costos a pagar por un viaje segun el numero de alumnos\n");
    System.out.println("Introduzca el total de alumno:");
    int na = input.nextInt();
    double pa;

    if (na >= 100) {
        pa  = 65;
        double tot=na*pa;
        System.out.println("El pago por cada alumno: $"+ pa);
        System.out.println("El pago total es de: $"+ tot);
    }else if (na > 50) {
      pa=70;
      double tot=na*pa;
      System.out.println("El pago por cada alumno: $"+ pa);
      System.out.println("El pagototal es de: $"+ tot);
    }else if (na >30) {
      pa=95;
      double tot=na*pa;
      System.out.println("El pago por cada alumno: $"+ pa);
      System.out.println("El pago total es de: $"+ tot);
    }else{
        double tot=4000;
        pa=4000/na;
        System.out.println("El pago por cada alumno: "+ pa);
        System.out.println("El pago total es de: "+ tot);
    }
  }
}
