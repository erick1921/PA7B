import java.util.Scanner;
public class Triangulocirculo{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el area de una figura rara");
    System.out.println("Escriba la medida del punto R");
    double medidar = imput.nextDouble();
    System.out.println("Escriba la medida del punto H");
    double medidah = imput.nextDouble();

    double cateto = (medidah*medidah)-(medidar*medidar);
    double cateto1 = Math.sqrt(cateto);

    double areat = (medidar*cateto1)/2;
    double areats = areat*2;

    double areac = (medidar*medidar)*3.1416;
    double areaci = areac/2;

    double areatotal = areats+areaci;

    System.out.println("El area de la figura es " + areatotal);
  }
}
