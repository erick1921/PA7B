import java.util.Scanner;
public class Trajes{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("ingrese el precio del traje  ");
   double CT=input.nextDouble();
    System.out.println("-----------------------------");
double DE;
if (CT>=2500) {
 DE= CT*0.15;
}else {
DE= CT*0.08;
}
double PF=CT-DE;
System.out.println("Descuento de :" +DE);
System.out.println("Presio final : "+ PF);
  }
}
