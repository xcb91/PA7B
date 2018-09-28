import javax.swing.JOptionPane;
public class ConaguaPago {
  public static void main(String[] args){


      double A= Integer.parseInt(JOptionPane.showInputDialog(null,"introdusca la altura: "));

      double L= Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el largo: "));

      double N= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ancho: "));

      double CM= Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el costo del metro cubico: "));

      double V=A*L*N;
      double PAG= V*CM;

      JOptionPane.showMessageDialog(null,"El costo total es de: "+PAG);



  }
}
