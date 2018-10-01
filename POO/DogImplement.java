import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color="black";
    fido.eyesColor="blue";
    fido.heigt= 0.50d;
    fido.weight= 30.0d;

    Dog chilaquil =new Dog();
    chilaquil.color="brown";
    chilaquil.eyesColor="green";
    chilaquil.heigt=0.78d;
    chilaquil.weight=25.0d;

    JOptionPane.showMessageDialog(null,"FIDO es de color: "+ fido.color);
    JOptionPane.showMessageDialog(null,"chilaquil es de color: "+ chilaquil.color);
    System.out.println(fido.sit());

fido.sit();
fido.layDown("fido ");
fido.sleep();

  }
}
