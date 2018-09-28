import javax.swing.JOptionPane;
public class AreaFigura {
  public static void main(String[] args){


    double R = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el radio: "));

    double H = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la hipotenusa: "));

    double C = Math.sqrt(H*H-R*R);

    double AC = (3.1416*(R*R)/2);

    double AT = (C*R/2)*2;

    double Area = AC+AT;

    JOptionPane.showMessageDialog(null,"El area de la figura es: "+ Area);

  }
}
