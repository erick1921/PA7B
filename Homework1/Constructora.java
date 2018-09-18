import java.util.Scanner;
public class Constructora{
  public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el area de un terreno");
    System.out.println("Escriba la medida del punto A");
    double medidaa = imput.nextDouble();
    System.out.println("Escriba la medida del punto B");
    double medidab = imput.nextDouble();
    System.out.println("Escriba la medida del punto C");
    double medidac = imput.nextDouble();

    double baset = medidaa-medidac;
    double areat = (baset*medidab)/2;

    double arear = medidab*medidac;
    double areatotal = areat+arear;

    System.out.println("El area del terreno es " + areatotal);

  }
}
