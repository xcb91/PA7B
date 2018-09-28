import javax.swing.JOptionPane;
public class AreaCircun {
  public static void main(String[] args){




    double R =Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el valor del Radio en centimetros. : "));


    double Result = (3.1416*(R*R));
    JOptionPane.showMessageDialog(null,"El area dela circunferencia es:  "+ Result+" centimetros cuadrados");

double Metros = Result/100;
JOptionPane.showMessageDialog(null,"En metros son: "+ Metros+" metros cuadrados");

  }
}
