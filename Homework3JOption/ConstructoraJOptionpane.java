import javax.swing.JOptionPane;
public class ConstructoraJOptionpane{
  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,"Programa para calcular el area de un terreno");
    double medidaa = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la medida del punto A"));
    double medidab = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la medida del punto B"));
    double medidac = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la medida del punto C"));

    double baset = medidaa-medidac;
    double areat = (baset*medidab)/2;

    double arear = medidab*medidac;
    double areatotal = areat+arear;

    JOptionPane.showMessageDialog(null,"El area del terreno es " + areatotal);

  }
}
