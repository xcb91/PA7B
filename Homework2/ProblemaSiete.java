import java.util.Scanner;
public class ProblemaSiete{
  public static void main(String[]args){
    Scanner input= new Scanner(System.in);


       int ti;
       double k, ga, p, ta;
       System.out.print("Ingrese el total de kilos: ");
       k = input.nextDouble();
       System.out.print("Ingrese el precio inicial: ");
       p = input.nextDouble();
       System.out.print("Ingrese el valor de tamano 1 0 2 : ");
       ta = input.nextDouble();
       System.out.print("Seleccione el valor de tipo de uva con numero\n");
       System.out.println("\t1 = A");
       System.out.println("\t2 = B");
       System.out.print("\t: ");
       do {
           ti = input.nextInt();
           if (ti<1||ti>2)
               System.out.print("Valor incorrecto. Intente nuevamente.: ");
       } while (ti<1||ti>2);
       if(ti==1&&ta==1)
          p=p + 0.2;
       if(ti==1&&ta==2)
           p=p + 0.3;
       if(ti==2&&ta==1)
           p=p -0.3;
       if(ti==2&&ta==2)
           p=p - 0.5;
       ga=k*p;
       System.out.println("La ganacia total es: $" + ga);


  }
}
