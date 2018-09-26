import javax.swing.JOptionPane;
public class ProductordelecheJOptionpane{
  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,"Programa para calcular la produccion de leche");
    double litros = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad de litros que vendio en el dia"));

    double galon = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el precio por galon"));

    int galones = (int)(litros/3.758);
    double paga = galones*galon;

    JOptionPane.showMessageDialog(null,"la cantidad de galones vendidos son  " + galones + " por lo tanto su paga es de $" + paga);
  }}
