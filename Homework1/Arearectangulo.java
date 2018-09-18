import java.util.Scanner;
public class Arearectangulo{
  public static void main(String[] args) {

    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el area de un rectangulo");
    System.out.println( "Escriba la base");
    double base = imput.nextDouble();
    System.out.println("Escriba la altura");
    double altura = imput.nextDouble();

    double area = base * altura;

    System.out.println("El area del rectangulo es " + area);

  }
}
