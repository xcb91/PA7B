import java.util.Scanner;
public class Banco {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Ingrese el tipo de tarjeta : ");
    int TT =input.nextInt();
    System.out.println("Ingrese el limiten de credito actual : ");
    double LA = input.nextDouble();

double NC ;
    if (TT < 2){
    NC = LA * 1.25;
      System.out.println("Su nuevo limite es de: " + NC);
}
    else if (TT == 2 && TT < 3){
    NC = LA * 1.35;
      System.out.println("Su nuevo limite es de: " + NC);
}
    else if (TT ==3 && TT < 4){
    NC = LA * 1.40;
      System.out.println("Su nuevo limite es de: " + NC);
}
    else if (TT > 3){
    NC = LA * 1.50;




              System.out.println("Su nuevo limite es de: " + NC);
            }

}
}
