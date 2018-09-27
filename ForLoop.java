import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {

int i;
int j;
int numero;
String salida="";

do {
  salida="";
   numero = Integer.parseInt(JOptionPane.showInputDialog(null,"escribe un numero"));

      for ( j=1;j<=10 ;j++ ) {
      salida += numero+" x " + j + " = "+(numero*j)+"\n";

      }
  JOptionPane.showMessageDialog(null,salida);
//data = Integer.parseInt(JOptionPane.showInputDialog(null,"enter an int value the program exits if the input is 0"));
} while (numero != 0);
JOptionPane.showMessageDialog(null,"fin");
  }

}
