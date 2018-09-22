import java.util.Scanner;
  public class ProblemaDiez{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("\nEste programa calcula el costo por cita y el coto total de tratamiento\n");
      System.out.println("Introduzca el numero de cita:");
      int nc = input.nextInt();
      double cc, tot;
      if (nc <= 3) {
        cc =200;
        tot=nc*cc;
      }else if (nc <= 5) {
        cc=150;
        tot=(nc-3)*150+600;
      }else if (nc <= 8) {
        cc=100;
        tot=(nc-5)*100+600;
      }else {
        cc=50;
        tot=(nc-8)*50+1200;
      }
      System.out.println("Costo de la cita: $"
            +cc +"\nEl costo total por tratamiento es de: $"+ tot);
    }
  }
