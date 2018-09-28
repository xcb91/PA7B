import javax.swing.JOptionPane;
public class ProblemaOcho{
  public static void main(String[] args) {



    int na = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el total de alumnos que iran al viaje:"));
    double pa;

    if (na >= 100) {
        pa  = 65;
        double tot=na*pa;
        JOptionPane.showMessageDialog(null,"El pago por cada alumno: $"+ pa + "\nEl pago total es de: $"+ tot);


    }else if (na > 50) {
      pa=70;
      double tot=na*pa;
      JOptionPane.showMessageDialog(null,"El pago por cada alumno: $"+ pa + "\nEl pago total es de: $"+ tot);

    }else if (na >30) {
      pa=95;
      double tot=na*pa;
      JOptionPane.showMessageDialog(null,"El pago por cada alumno: $"+ pa + "\nEl pago total es de: $"+ tot);
    }else{
        double tot=4000;
        pa=4000/na;
        JOptionPane.showMessageDialog(null,"El pago por cada alumno: $"+ pa + "\nEl pago total es de: $"+ tot);
    }
  }
}
