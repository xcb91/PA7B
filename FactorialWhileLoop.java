import javax.swing.JOptionPane;

public class FactorialWhileLoop{
  public static void main(String[] args) {
//numero para el limite del factorial
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a new value"));
// numero del factorial
int fact = 1;
//Sentinela
int i=1;
while(i<= value){
fact=fact * i;
i++;
}
JOptionPane.showMessageDialog(null,"el facorial de "+ value +" es "+ fact,"Calcular Factorial",JOptionPane.WARNING_MESSAGE);




  }
}
