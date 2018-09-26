import javax.swing.JOptionPane;;
public class ArearectanguloJOptionpane{
  public static void main(String[] args) {


    JOptionPane.showMessageDialog(null,"Programa para calcular el area de un rectangulo");
    double base =  Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la base"));

    double altura =  Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la altura"));


    double area = base * altura;

    JOptionPane.showMessageDialog(null,"El area del rectangulo es " + area +"cm");

  }
}
