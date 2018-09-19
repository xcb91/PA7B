import java.util.Scanner;
public class MayorMenor {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Inserte el primer numero: ");
    int num1 = input.nextInt();

    System.out.println("Inserte el segundo numero: ");
    int num2 = input.nextInt();

    System.out.println("Inserte el tercer numero: ");
    int num3 = input.nextInt();

    int mayor;
    int medio;
    int menor;

if(num1 > num2 && num1 > num3 ){
  mayor=num1;
  if(num2>num3){
    medio =num2;
    menor = num3;
  }else{
    medio=num2;
    menor=num3;
  }
  System.out.println("Ordenado de mayor a menor "+ mayor + medio + menor);

}
if(num2>num1 && num2>num3){
  mayor=num2;
  if(num1>num3){
    medio=num1;
    menor=num3;

  }else{
    medio=num3;
    menor=num1;
  }

System.out.println("Ordenado de mayor a menor "+ mayor + medio + menor);


}

if(num3>num1 && num3>num2){
  mayor=num3;
  if(num2>num1){
    medio=num2;
    menor=num1;
  }else{
    medio= num1;
    menor= num2;
  }
  System.out.println("Ordenado de mayor a menor "+ mayor + medio + menor);
}
  }
}
