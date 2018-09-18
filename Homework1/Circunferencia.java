import java.util.Scanner;
public class Circunferencia{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el area de un circulo");
    System.out.println( "Escriba el radio");
    double radio = imput.nextDouble();

    double area = (radio*radio)*3.1416;
    System.out.println("EL AREA DEL CIRCULO ES "+ area);

      }
    }
