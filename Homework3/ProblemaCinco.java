import javax.swing.JOptionPane;
public class ProblemaCinco{
  public static void main(String[] args){



double a = Integer.parseInt(JOptionPane.showInputDialog(null,"\nIntroduzca el primer numero: "));


double b = Integer.parseInt(JOptionPane.showInputDialog(null,"\nIntroduzca el segundo numero: "));


double c = Integer.parseInt(JOptionPane.showInputDialog(null,"\nIntroduzca el tercer numero: "));

if ( a> b) {
  if (a > c) {
    JOptionPane.showMessageDialog(null,"El mayor es: " + a);

  } else {
  JOptionPane.showMessageDialog(null,"el mayor es: " + c);
  }
}
else if (b > c) {
  JOptionPane.showMessageDialog(null,"el mayor es: " + b);
  } else {
  JOptionPane.showMessageDialog(null,"el mayor es: " + c);
        }
  }
}
