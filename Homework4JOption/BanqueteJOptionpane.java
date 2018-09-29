import javax.swing.JOptionPane;
public class BanqueteJOptionpane{
  public static void main(String[] args) {
int NP=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de personal  "));
int TOT;

if (NP<200) {
  TOT=NP* 95;
  JOptionPane.showMessageDialog(null," el total es de   " + TOT+ " por las  " + NP," Total a pagar en un banquete  ",JOptionPane.WARNING_MESSAGE);
}else if (NP>=200 && NP<=300) {
  TOT=NP*85;
  JOptionPane.showMessageDialog(null," el total es de   " + TOT+ " por las  " + NP," Total a pagar en un banquete  ",JOptionPane.WARNING_MESSAGE);
}else if (NP > 300) {
  TOT=NP *75;
  JOptionPane.showMessageDialog(null," el total es de   " + TOT+ " por las  " + NP," Total a pagar en un banquete  ",JOptionPane.WARNING_MESSAGE);
}




  }
}
