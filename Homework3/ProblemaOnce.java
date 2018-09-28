import javax.swing.JOptionPane;
public class ProblemaOnce {
  public static void main(String[] args){



    int tt =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tipo de tarjeta : "));

    double la = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el limiten de credito actual : "));

double nc ;
    if (tt < 2){
    nc = la * 1.25;

      JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + nc);
}
    else if (tt == 2 && tt < 3){
    nc = la * 1.35;
      JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + nc);
}
    else if (tt ==3 && tt < 4){
    nc = la * 1.40;
      JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + nc);
}
    else if (tt > 3){
    nc = la * 1.50;




              JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + nc);
            }

}
}
