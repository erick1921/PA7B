import java.util.Scanner;
public class Convertidor{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para convertir de metros a pulgadas");
    System.out.println("Escriba la cantidad en metros a convertir");
    double metros = imput.nextDouble();
    double centimetros = metros*100;
    double pulgadas = centimetros*0.0254;
    System.out.println("la cantidad es igual a " + pulgadas + "pulgadas");
  }}
