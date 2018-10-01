import javax.swing.JOptionPane;
public class PositivoNegativo{
 public static void main(String[] arg){
   



int num = Integer.parseInt(JOptionPane.showInputDialog(null,"\nIntroduzca el valor: "));

if(num == 0){

  JOptionPane.showMessageDialog(null,"\nEl valor es neutro");
}else if(num>0){
  JOptionPane.showMessageDialog(null,"\nEl valor es positivo");

}else{
  JOptionPane.showMessageDialog(null,"\nEl valor el negativo");

}

 }

}
