import javax.swing.JOptionPane;
public class ConsultorioJOptionpane{
  public static void main(String[] args) {
int NC=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de citas"));
  double CC;
 double TOT;
  if (NC<=3) {
  CC=200;
  TOT=NC*CC;
}else if ( NC<=5) {
  CC=150;
  TOT=(NC-3)*CC+600;
}else if (NC<=8) {
  CC=100;
  TOT=(NC-5)*CC+900;
}else {
  CC=50;
  TOT=(NC-8)*CC+1200;
}
JOptionPane.showMessageDialog(null,"costo por cita " + CC + "\n tratamiento: " + TOT," costo por cita ",JOptionPane.WARNING_MESSAGE);

  }
}
