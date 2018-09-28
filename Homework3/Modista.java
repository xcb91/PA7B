import javax.swing.JOptionPane;
public class Modista {
  public static void main(String[] args){


    double CM = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca la contidad de metros: "));
     double PG  = CM/0.0254;
     JOptionPane.showMessageDialog(null,"La cantidad en pulgadas son: " + PG);

  }
}
