import javax.swing.JOptionPane;
public class UvasJOptionpane{
public static void main(String[] args) {
double P=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio inicial por kilo "));
double K=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese los kilos de uva "));
double TI=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tipo de uva \n1.-A\n2.-B "));
double TA=Integer.parseInt( JOptionPane.showInputDialog(null,"inserte el tamañano de uva \n1\n2"));
double GA;
if (TI==1 && TA==1) {
  GA=(P+0.20) * K ;
JOptionPane.showMessageDialog(null," Ganancia octenida es de : "+ GA,"Ganancia de uvas ",JOptionPane.WARNING_MESSAGE);
}else if (TI==1&& TA==2 ) {
  GA=(P+0.50)*K;
  JOptionPane.showMessageDialog(null," Ganancia octenida es de : "+ GA,"Ganancia de uvas ",JOptionPane.WARNING_MESSAGE);
}else if ( TI==2 && TA==1) {
  GA=(P-0.30)*K;
JOptionPane.showMessageDialog(null," Ganancia octenida es de : "+ GA,"Ganancia de uvas ",JOptionPane.WARNING_MESSAGE);;
}else if (TI==2 && TA==2 ) {
  GA=(P-0.50)*K;
JOptionPane.showMessageDialog(null," Ganancia octenida es de : "+ GA,"Ganancia de uvas ",JOptionPane.WARNING_MESSAGE);
}




  }
}
