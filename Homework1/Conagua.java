import java.util.Scanner;
public class Conagua{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el pago por alberca");
    System.out.println("Escriba la altura");
    double altura = imput.nextDouble();
    System.out.println("Escriba el largo");
    double largo = imput.nextDouble();
    System.out.println("Escriba el ancho");
    double ancho = imput.nextDouble();
    System.out.println("Escriba la cantidad a pagar por metro cubico");
    double pagar = imput.nextDouble();

    int volumen = (int)(largo*ancho*altura);
    int pago = (int)(volumen*pagar);
    System.out.println("El volumen de la alberca es igual a " + volumen + " metros cubicos y su pago es igual a $" + pago);
  }}
