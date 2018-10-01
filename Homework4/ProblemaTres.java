import javax.swing.JOptionPane;
 public class ProblemaTres{
 public static void main(String[] arg){


int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la cantidad de Lapices: "));
double pag;
if (x >= 1000){
    pag= x*.85;
}else{
  pag = x*.90;
}

 JOptionPane.showMessageDialog(null,"El Total a pagar es: $"+ pag);
}
}
