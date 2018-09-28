import javax.swing.JOptionPane;
public class NumeroMayor{
 public static void main(String[] args){




 int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el primer numero: "));

int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el segundo numero: "));


  if(a>b){
    JOptionPane.showMessageDialog(null,"El numero mayor es: "+ a);

  }else{
    JOptionPane.showMessageDialog(null,"El numero mayor es: "+ b);
  }


 }

}
