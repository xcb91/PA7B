import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    int quest = 0;
    do{
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tabla:"));
    String salida = "";

    for (int i = 0; i <= 10  ; i++ ) {
      int m = n * i;
      //JOptionPane.showMessageDialog(null,"1 x" + i + "=" + m);

      salida += n+" x " + i + "=" + m + "\n";
    }
    JOptionPane.showMessageDialog(null, salida);
    quest = Integer.parseInt(JOptionPane.showInputDialog("deseas otra tabla \n"+ "Presiona 1 Si quieres \n" + "Presiona 0 Si NO quieres"));
    }
    while (quest == 1);


  }
}
