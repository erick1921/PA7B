import java.util.Scanner;
public class Sueldosemanal{
public static void main(String[] args) {
    Scanner imput =new Scanner (System.in);
    System.out.println("Programa para calcular el sueldo semanal");
    System.out.println("Escriba la cantidad de horas que trabajo por dia");
    double horas = imput.nextDouble();
    System.out.println("Escriba la cantidad a pagar por hora");
    double pagar = imput.nextDouble();

    int horast= (int)(horas*5);
    int pago = (int)(pagar*horast);
    System.out.println("las horas trabajadas en la semana fueron " + horast +" horas y su pago semanal es de $" + pago);
  }}
