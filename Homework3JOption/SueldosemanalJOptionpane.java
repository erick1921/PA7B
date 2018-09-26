import javax.swing.JOptionPane;
public class SueldosemanalJOptionpane{
public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,"Programa para calcular el sueldo semanal");
    double horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cantidad de horas que trabajo por dia"));
    double pagar = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cantidad a pagar por hora"));


    int horast= (int)(horas*5);
    int pago = (int)(pagar*horast);
    JOptionPane.showMessageDialog(null,"las horas trabajadas en la semana fueron " + horast +" horas y su pago semanal es de $" + pago);
  }}
