import java.util.Scanner;
public class Comparacion{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("comparacion de dos numeros ");
System.out.println("ingrese el primer numero");
int A=input.nextInt();
System.out.println("ingres el segundo numero");
int B=input.nextInt();
System.out.println("-------------------------");
if (A>B) {
  System.out.println(A +" numero mayor \n"+ B + " numero menor");
}else {
System.out.println(B+ " numero mayor \n"+ A +  " numero menor");
}


}

}
