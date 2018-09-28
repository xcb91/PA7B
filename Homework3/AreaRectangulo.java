import javax.swing.JOptionPane;
public class AreaRectangulo {
  public static void main(String[] args){




    double B = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la base: "));


    double A = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la Altura: "));

    double Result = A*B;
JOptionPane.showMessageDialog(null,"El area del rectangulo es:  "+ Result);

  }
}
