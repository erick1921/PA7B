import java.util.Scanner;
public class Lalangosta{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Ingrese el numero de personas");
int NP=input.nextInt();
System.out.println("------------------------------");
double TOT;
if (NP<200) {
  TOT=NP* 95;
  System.out.println("total a pagar : " + TOT );
}else if (NP>=200 && NP<=300) {
  TOT=NP*85;
  System.out.println("total a pagar : " + TOT );
}else if (NP > 300) {
  TOT=NP *75;
  System.out.println("total a pagar : " + TOT );
}
  }
}
