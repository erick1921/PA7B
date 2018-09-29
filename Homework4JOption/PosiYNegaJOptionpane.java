import javax.swing.JOptionPane;
public class PosiYNegaJOptionpane{
  public static void main(String[] args) {
int Num=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero "));
if (Num>=0 ) {
  JOptionPane.showMessageDialog(null," el numero    " + Num + "es positivo","numero negativo o positivo",JOptionPane.WARNING_MESSAGE);

}else {
    JOptionPane.showMessageDialog(null," es un numero negativo " + Num + " es negativo ","numero negativo o positivo",JOptionPane.WARNING_MESSAGE);
}

  }
}
