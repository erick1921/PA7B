import javax.swing.JOptionPane;
public class BancoJOptionpane{
  public static void main(String[] args) {
int TT=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tipo de tarjetas "));
int LA=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tipo de tarjetas "));
  if (TT == 1 ){
  double AC=LA*.25;
  double NC=  LA + AC;
  JOptionPane.showMessageDialog(null," nuevo limite es    " + NC);
}
  else if (TT == 2){
  double AC=LA*.35;
  double NC=  LA + AC;
  JOptionPane.showMessageDialog(null," nuevo limite es    " + NC);
}
  if (TT == 3){
  double AC=LA*.40;
  double NC= LA + AC;
  JOptionPane.showMessageDialog(null," nuevo limite es    " + NC);
}
   if (TT > 3){
  double AC=LA*.50;
  double NC=  LA + AC;
JOptionPane.showMessageDialog(null," nuevo limite es    " + NC);
}
}
}
