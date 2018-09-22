import  java.util.Scanner;
public class ViajeEstudios{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Ingrese numero de alumnos");
int NA=input.nextInt();
System.out.println("-----------------------------------------");

if (NA>=100 ) {
  int PA=65;
  int TOT=NA*65;
  System.out.println("Pago por estudiante: "+ PA);
  System.out.println("Pago total del viage: "+ TOT);
}else if (NA >=50 && NA<=90) {
  int PA=70;
  int TOT=NA*70;
  System.out.println("Pago por estudiante: "+ PA);
  System.out.println("Pago total del viage: "+ TOT);
}else if (NA>=30 && NA<=49) {
  int PA=95;
  int TOT=NA*95;
  System.out.println("Pago por estudiante: "+ PA);
  System.out.println("Pago total del viage: "+ TOT);
}else if (NA<30) {
  double PA=4000/NA;
  int TOT=4000;
  System.out.println("Pago por estudiante: "+ PA);
  System.out.println("Pago total del viage: "+ TOT);
}


}
}
