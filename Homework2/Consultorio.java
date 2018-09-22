import java.util.Scanner;
public class Consultorio{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Ingrese el numero de citas");
int NC=input.nextInt();
System.out.println("-------------------------------------------------");
  double CC;
 double TOT;
  if (NC<=3) {
  CC=200;
  TOT=NC*CC;
}else if ( NC<=5) {
  CC=150;
  TOT=(NC-3)*CC+600;
}else if (NC<=8) {
  CC=100;
  TOT=(NC-5)*CC+900;
}else {
  CC=50;
  TOT=(NC-8)*CC+1200;
}
System.out.println("costo por cita: "+ CC+"\n"+ "tratamiento Final: "+TOT );

  }
}
