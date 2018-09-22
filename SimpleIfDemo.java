import java.util.Scanner;
public  class SimpleIfDemo{
public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
System.out.println("enter an Intager:");
int number=input.nextInt();
//evaluacion para la toma de decicion ifs
if (number % 2 == 0 ){
  System.out.println("IT is  even number ");
}else {
  System.out.println( " it is an odd number " );
}

  }
}
