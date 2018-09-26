import javax.swing.JOptionPane;
public class CircunferenciaJOptionpane{
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Programa para calcular el area de un circulo");
    double radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el radio"));


    double area = (radio*radio)*3.1416;
    JOptionPane.showMessageDialog(null,"EL AREA DEL CIRCULO ES "+ area);

      }
    }
