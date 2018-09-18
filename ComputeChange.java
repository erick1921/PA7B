import java.util.Scanner;
public class ComputeChange{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("enter an amount in double");
    double amount = imput.nextDouble();


int cents = (int)(amount * 100); //convertir a centavos forsando (int)
//encontar el numero de dolar en los centavos
int numberOfDolar = cents / 100;// dividir para calcular los dolares
cents = cents % 100; // guardar el residuo
// encontar los cuartos de dolar en el sobrante

int numberOfQuarters = cents /25;
cents = cents % 25;
// number of dimes
int numberOfDimes = cents /10;
cents = cents % 10;
//number of nickels
int numberOfNickels = cents / 5;
cents = cents % 5;
 //number of pennies
 int numberOfPennies = cents;

 System.out.println( "your amount" + amount + "consist of \n" +
  "\t" + numberOfDolar +  "dollars" +
  "\t" + numberOfQuarters + " quarters" +
  "\t" + numberOfDimes + "dimes" +
  "\t" + numberOfNickels + "nickels" +
 "\t" + numberOfPennies + "pennies");


  }
}
