import java.util.Scanner;
public class NumeroMayor{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

System.out.println("\n +Este programa determina cual de dos valares es mayor+\n");


  System.out.println("Introduzca el primer numero: ");
  int A = input.nextInt();

  System.out.println("Introduzca el segundo numero: ");
  int B = input.nextInt();

  if(A>B){
    System.out.println("El numero mayor es: "+ A);
  }else{
    System.out.println("El numero mayor es: "+ B);
  }


 }

}
