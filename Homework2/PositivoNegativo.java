import java.util.Scanner;
public class PositivoNegativo{
 public static void main(String[] arg){
   Scanner input = new Scanner(System.in);

   System.out.println("\nEste programa determina si un numero es positivo o negativo\n");
System.out.println("\nIntroduzca el valor: ");
int num = input.nextInt();

if(num == 0){
  System.out.println("\nEl valor es neutro");
}else if(num>0){
  System.out.println("\nEl valor es positivo");
}else{
  System.out.println("\nEl valor el negativo");
}

 }

}
