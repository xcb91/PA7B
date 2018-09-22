import java.util.Scanner;
public class ProblemaOnce {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Ingrese el tipo de tarjeta : ");
    int tt =input.nextInt();
    System.out.println("Ingrese el limiten de credito actual : ");
    double la = input.nextDouble();

double nc ;
    if (tt < 2){
    nc = la * 1.25;
      System.out.println("Su nuevo limite es de: " + nc);
}
    else if (tt == 2 && tt < 3){
    nc = la * 1.35;
      System.out.println("Su nuevo limite es de: " + nc);
}
    else if (tt ==3 && tt < 4){
    nc = la * 1.40;
      System.out.println("Su nuevo limite es de: " + nc);
}
    else if (tt > 3){
    nc = la * 1.50;




              System.out.println("Su nuevo limite es de: " + nc);
            }

}
}
