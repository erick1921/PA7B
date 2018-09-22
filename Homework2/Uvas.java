import java.util.Scanner;
public class Uvas{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Ingrese el precio inicial por kilo ");
double P=input.nextDouble();

System.out.println("Inserte los kilos de uva ");
double K=input.nextDouble();

System.out.println("Inserte el Tipo de uva");
System.out.println("1.-A\n2.-B");
System.out.println("---------------------------");
 int TI=input.nextInt();

System.out.println("inserte el Tamaño la uva");
System.out.println("1\n2" );
System.out.println("-------------------------");
int TA=input.nextInt();

System.out.println("---------------------------");
double GA;
if (TI==1 && TA==1) {
  GA=(P+0.20) * K ;
  System.out.println("Ganancia odtenida " + GA);
}else if (TI==1&& TA==2 ) {
  GA=(P+0.50)*K;
  System.out.println("Ganancia odtenida " + GA);
}else if ( TI==2 && TA==1) {
  GA=(P-0.30)*K;
  System.out.println("Ganancia odtenida " + GA);
}else if (TI==2 && TA==2 ) {
  GA=(P-0.50)*K;
System.out.println("Ganancia odtenida " + GA);
}

  }
}
