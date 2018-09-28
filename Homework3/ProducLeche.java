import javax.swing.JOptionPane;
public class ProducLeche {
  public static void main(String[] args){


    int L =Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la cantidad de leche en litros cerrados: "));


    double PG = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el precio de la leche por galon: "));

    double TG = L/3.785;

    double GA = TG*PG;
    JOptionPane.showMessageDialog(null,"La Ganacia es de: " + GA);
  }
}
