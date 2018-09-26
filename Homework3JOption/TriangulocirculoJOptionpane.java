import javax.swing.JOptionPane;
public class TriangulocirculoJOptionpane{
  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,"Programa para calcular el area de una figura rara");
    double medidar = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la medida del punto R"));

    double medidah = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la medida del punto H"));

    double cateto = (medidah*medidah)-(medidar*medidar);
    double cateto1 = Math.sqrt(cateto);

    double areat = (medidar*cateto1)/2;
    double areats = areat*2;

    double areac = (medidar*medidar)*3.1416;
    double areaci = areac/2;

    double areatotal = areats+areaci;

    JOptionPane.showMessageDialog(null,"El area de la figura es " + areatotal);
  }
}
