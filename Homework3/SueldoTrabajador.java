import javax.swing.JOptionPane;
public class SueldoTrabajador {
  public static void main(String[]args){


    double HT = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las horas trabajadas en la semana: "));


    double PH= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el Precio por hora: "));

    double SS= HT*PH;

JOptionPane.showMessageDialog(null,"El sueldo total es de: "+ SS);

  }
}
