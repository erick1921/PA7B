import java.util.Scanner;
public class Productordeleche{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular la produccion de leche");
    System.out.println("Escriba la cantidad de litros que vendio en el dia");
    double litros = imput.nextDouble();
    System.out.println("Escriba el precio por galon");
    double galon = imput.nextDouble();

    int galones = (int)(litros/3.758);
    double paga = galones*galon;

    System.out.println("la cantidad de galones vendidos son  " + galones + " por lo tanto su paga es de $" + paga);
  }}
