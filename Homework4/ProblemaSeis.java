import javax.swing.JOptionPane;
public class ProblemaSeis{
  public static void main(String[]args){


int NP = Integer.parseInt(JOptionPane.showInputDialog(null,"\nIntroduzca el numero de personas: "));
double TOT;

if(NP <201){
  TOT = NP*95;
  JOptionPane.showMessageDialog(null,"El total a pagar es: $" + TOT);

}if(NP > 200 && NP < 301){
  TOT = NP*85;
  JOptionPane.showMessageDialog(null,"El total a pagar es: $" + TOT);
}else if(NP>300){
  TOT = NP*75;
  JOptionPane.showMessageDialog(null,"El total a pagar es: $" + TOT);

}



  }
}
