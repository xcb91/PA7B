import java.util.Scanner;
 public class ProblemaTres{
 public static void main(String[] arg){
  Scanner input = new Scanner (System.in);

System.out.println("\nEste programa calcula el costo total por cierta cantidad de lapices\n");

System.out.println("Introduzca la cantidad de Lapices: ");
int x = input.nextInt();
double pag;
if (x >= 1000){
    pag= x*.85;
}else{
  pag = x*.90;
}

System.out.println("El Total a pagar es: $"+ pag);
}
}
