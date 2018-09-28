import javax.swing.JOptionPane;
public class AreaTerreno {
  public static void main(String[] args){




    double B = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la base del Terreno: "));


    double A = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la Altura del lado Izquierdo del Terreno: "));


    double C = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la Altura del lado Derecho del Terreno: "));

    double Al = A-C;
    double AT = B*Al/2;
    double AR = (B*C);
    double Area = AT+AR;
JOptionPane.showMessageDialog(null,"El area total del terreno es:  "+ Area);

  }
}
