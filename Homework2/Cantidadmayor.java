import java.util.Scanner;
public class Cantidadmayor{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Determinar cual numero es mayor  ");
System.out.println("ingrese el primer numero");
double A=input.nextDouble();
System.out.println("ingrese el segunndo numero ");
double B=input.nextDouble();
System.out.println("ingrese el tercer numero  ");
double C=input.nextDouble();
if (A>=B && A>=C) {
 System.out.println("El numero mayor es: "+A);
}else if (B>=A && B>=C) {
  System.out.println("El numero mayor es: "+B);
}else {
  System.out.println("el numero mayor es: "+C);
}
}
}
