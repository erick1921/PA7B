import javax.swing.*;
public class courseimp{
  public static void main(String[] args) {
    int opc = 0;
    do{
      //aki un JOptionPane.imputdialog
      switch (opc) {
        case 1:
        //crearcurso
        break;
        case 2:
        //agregar estudiantes
        break;
        case 3:
        //eliminar estudiantes
        break;
        case 4:
        //mostrar estudiantes
        break;
        case 5:
        //mostrar numero de estudiantes
        break;
        default:
        //mensaje de elija opcion correcta
      }
    }
    course curso3 = new course("Programacion");
    curso3.addstudent("Agustin");
    curso3.addstudent("JuanCarlos");
    curso3.addstudent("You");
    course curso1 = new course();
    //curso1.courseName = "ingles";
    curso1.setCourseName("ingles");
    curso1.addstudent("luis");
    curso1.addstudent("maria");
    curso1.addstudent("lucero");

    String [] studentsDeIngles = curso1.getStudent();
      String students="";
    for (int i=0; i < curso1.getNumberOfStudent(); i++){
      students += studentsDeIngles[i]+"\n";
    }
JOptionPane.showMessageDialog(null, students);
      course curso2 = new course();
    curso2.setCourseName("math");
    curso2.addstudent("brandom");
    curso2.addstudent("angel");
    curso2.addstudent("steven");

    JOptionPane.showMessageDialog(null,curso1.getCourseName());
  }
}
