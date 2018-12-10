
public class course{
private String courseName;
private String [] students = new String [100];
private int numberOfStudents = 0;

public course(){

}

public String getCourseName(){
return  this.courseName;

}
public void setCourseName (String courseName){
  this.courseName= courseName;

}
public void addstudent (String student){
  this.students[numberOfStudents] = student;
  this.numberOfStudents ++;

}
public void dropStudent (String student){
//tarea
}
public String [] getStudent(){
  return this.students;
}
public int getNumberOfStudent(){
  return this.numberOfStudents;
}

}
