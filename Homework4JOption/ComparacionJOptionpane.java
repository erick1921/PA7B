import javax.swing.JOptionPane;
public class ComparacionJOptionpane{
public static void main(String[] args) {
int A=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
int B=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
if (A>B) {
JOptionPane.showMessageDialog(null," el numero: "+ A + "es mayor  que el numero: "+ B," comparacion de numeros", JOptionPane.WARNING_MESSAGE);

}else {
JOptionPane.showMessageDialog(null,"el numero: "+ B + "es mayor  que el numero: "+A," comparacion de numeros", JOptionPane.WARNING_MESSAGE);
}


}

}
