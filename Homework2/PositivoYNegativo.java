import java.util.Scanner;
public class PositivoYNegativo{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
System.out.println("determinar los numeros negativos y positivos");
System.out.println("ingrese un numero");
int Num=input.nextInt();
System.out.println("-----------------------------------");
if (Num>=0 ) {
  System.out.println(Num+" este numero es positivo");
}else {
  System.out.println(Num+" este numero es negativo");
}

  }
}
