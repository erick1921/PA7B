import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {
    Dog fido =new Dog();
    fido.color= "black";
    fido.eyeColor= "blue";
    fido.height= 0.50d;
    fido.weight =30d;

    Dog chilakil = new Dog();
    chilakil.color="brown";
    chilakil.eyeColor="green";
    chilakil.height=0.78d;
    chilakil.weight=25d;

JOptionPane.showMessageDialog(null,"Fido es de color: " + fido.color );

JOptionPane.showMessageDialog(null,"Chilakil es de color: " + chilakil.color );
System.out.println(fido.sit());
fido.sit();
fido.layDown("fido");
fido.sleep();
  }
}
