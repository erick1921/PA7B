import javax.swing.JOptionPane;
public class ConaguaJOptionpane{
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Programa para calcular el pago por alberca");
    double altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la altura"));
    double ancho = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el ancho"));
    double largo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el largo"));
    double pagar = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad a pagar por metro cubico"));

    int volumen = (int)(largo*ancho*altura);
    int pago = (int)(volumen*pagar);
    JOptionPane.showMessageDialog(null,"El volumen de la alberca es igual a " + volumen + " metros cubicos y su pago es igual a $" + pago);
  }}
