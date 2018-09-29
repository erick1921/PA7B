import  javax.swing.JOptionPane;
public class ViajeEstudiosJOptionpane{
public static void main(String[] args) {
double PA;
int TT;
int NA=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de alumnos"));
if (NA>=100 ) {
   PA=65;
   TT=NA*65;
   JOptionPane.showMessageDialog(null," pago por estudiante   " + PA  + "  pago total por el viaje  " + TT,"",JOptionPane.WARNING_MESSAGE);
}else if (NA >=50 && NA<100) {
   PA=70;
   TT=NA*70;
   JOptionPane.showMessageDialog(null," pago por estudiante   " + PA  + "  pago total por el viaje  " + TT,"",JOptionPane.WARNING_MESSAGE);
}else if (NA>=30 && NA<=49) {
   PA=95;
   TT=NA*95;
   JOptionPane.showMessageDialog(null," pago por estudiante   " + PA  + "  pago total por el viaje  " + TT,"",JOptionPane.WARNING_MESSAGE);
}else if (NA<30) {
   PA=4000/NA;
   TT=4000;
   JOptionPane.showMessageDialog(null," pago por estudiante   " + PA  + "  pago total por el viaje  " + TT,"",JOptionPane.WARNING_MESSAGE);
}



}
}
