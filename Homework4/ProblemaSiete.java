import javax.swing.JOptionPane;
public class ProblemaSiete{
  public static void main(String[]args){



       int ti;
       double k, ga, p, ta;

       k = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el total de kilos: "));

       p = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio inicial: "));

       ta = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de tamano 1 0 2 : "));




       do {
           ti = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione el valor de tipo de uva con numero\n"+"\n1 = A"+"\n2 = B"+"\t: "));
           if (ti<1||ti>2)
               JOptionPane.showMessageDialog(null,"Valor incorrecto. Intente nuevamente.: ");

       } while (ti<1||ti>2);
       if(ti==1&&ta==1)
          p=p + 0.2;
       if(ti==1&&ta==2)
           p=p + 0.3;
       if(ti==2&&ta==1)
           p=p -0.3;
       if(ti==2&&ta==2)
           p=p - 0.5;
       ga=k*p;
       JOptionPane.showMessageDialog(null,"La ganacia total es: $" + ga);


  }
}
