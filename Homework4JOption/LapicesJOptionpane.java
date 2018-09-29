import javax.swing.JOptionPane;
public class LapicesJOptionpane{
  public static void main(String[] args) {
int X=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de lapices "));
double PAG;
if (X>=1000) {
   PAG=X*0.85;
}else {
PAG=X*0.90;
}
JOptionPane.showMessageDialog(null," total a pagar de "+ X + "  lapices es  " + PAG," total a pagar por lapices ",JOptionPane.WARNING_MESSAGE);

  }
}
