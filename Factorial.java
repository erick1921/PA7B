import javax.swing.JOptionPane;
public class Factorial{
public static void main(String[] args) {
//pedir valor para sacar factorial
  int value = Integer.parseInt(JOptionPane.showInputDialog(null, " Introduce un numero cualquiera"));

//numero del factorial
  int fact = 1;

  // Sentinela
  int i = 1 ;

  while ( i <= value){
    fact = fact * i;
    i++;
  }
  JOptionPane.showMessageDialog(null, "el factorial de  "  + value + "es  " + fact, "calcular factorial ", JOptionPane.WARNING_MESSAGE);
}
}
