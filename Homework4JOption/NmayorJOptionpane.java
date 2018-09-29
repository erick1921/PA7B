import javax.swing.JOptionPane;
public class NmayorJOptionpane{
  public static void main(String[] args) {
int  A=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese tres numero \ningrese el primero"));
int B=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el segundo numero "));
int C=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tercer numero "));
int M;
if (A>=B && A>=C) {
  M=A;
}else if (B>=A && B>=C) {
M=B;
}else {
M=C;
}
JOptionPane.showMessageDialog(null," el numero mayor es   " + M," numero mayor",JOptionPane.WARNING_MESSAGE);

  }
}
