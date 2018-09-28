import javax.swing.JOptionPane;
public class ProblemaCuatro{
  public static void main (String[] args){





double CT = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el costo del traje: "));
double DE;
double PF;
if (CT > 2500){
  DE = CT*.15;
  PF =CT-DE;
  JOptionPane.showMessageDialog(null,"El descuento es de 15%: $" + DE + "\nEL total a pagar es de: $" + PF);

}else{
  DE = CT*.08;
  PF =CT-DE;
  JOptionPane.showMessageDialog(null,"El descuento es del 8%: $" + DE + "\nEL total a pagar es de: $" + PF);
  
}



  }
}
