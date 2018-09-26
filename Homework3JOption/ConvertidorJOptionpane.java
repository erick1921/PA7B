import javax.swing.JOptionPane;
public class ConvertidorJOptionpane{
  public static void main(String[] args) {

   JOptionPane.showMessageDialog(null,"Programa para convertir de metros a pulgadas");
    double metros = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad en metros a convertir"));
    double centimetros = metros*100;
    double pulgadas = centimetros*0.0254;
    JOptionPane.showMessageDialog(null,"la cantidad es igual a " + pulgadas + " pulgadas");
  }}
