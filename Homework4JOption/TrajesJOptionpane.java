import javax.swing.JOptionPane;
public class TrajesJOptionpane{
  public static void main(String[] args) {
double CT=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de metros de tela que requiera "));
double DE;
if (CT>=2500) {
 DE= CT*0.15;
}else {
DE= CT*0.08;
}
double PF=CT-DE;
JOptionPane.showMessageDialog(null, "el decuento es "+ DE+ " precio final :" + PF," Descuento de trajes", JOptionPane.WARNING_MESSAGE);

  }
}
