import javax.swing.JOptionPane;
public class CompaniaTelefonicaJOptionpane{
  public static void main(String[] args) {
double TI=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el tiempo de la llamada "));
String DI=JOptionPane.showInputDialog(null,"ingrese el tipo de dia  ");
String TU=JOptionPane.showInputDialog(null,"ingrese el turno ");
double PAG;
double IMP;
if (TI<5) {
   PAG=TI*1;
}else if (TI<8) {
   PAG=(TI-5)*0.8+5;

}else if (TI < 10) {
   PAG=(TI-8)*0.7+7.4;
}else {
   PAG=(TI-10)*0.5+8.8;
}

if (DI=="Domingo") {
   IMP=PAG+0.05;
}else if (TU=="Matutino") {
   IMP=PAG*0.15;
}else {
   IMP=PAG*0.10;
}
double TOT=PAG+IMP;

JOptionPane.showMessageDialog(null,"pago " + PAG + "\nimpuesto " + IMP +"\nTotal "+ TOT ," cargo por llamada  ",JOptionPane.WARNING_MESSAGE);
  }
}
