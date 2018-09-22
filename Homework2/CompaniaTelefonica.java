import java.util.Scanner;
public class CompaniaTelefonica{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese el tiempo de la llamada ");
double TI=input.nextDouble();
System.out.println("ingrese tipo de dia ");
String DI=input.next();
System.out.println("Ingrese el Turno");
String TU=input.next();
double PAG;
double IMP;
if (TI<5) {
   PAG=TI*1;
}else if (TI<8) {
   PAG=(TI-5)*0.8+5;

}else if (TI < 10) {
   PAG=(TI-8)*0.7+7.4;
}else {
   PAG=(TI-10)*0.5+8.8;
}

if (DI=="Domingo") {
   IMP=PAG+0.05;
}else if (TU=="M") {
   IMP=PAG*0.15;
}else {
   IMP=PAG*0.10;
}

double TOT=PAG+IMP;

System.out.println("Pago:"+PAG +"\n"+ "impuesto:"+ IMP+"\n"+"Total"+ TOT);



  }

}
