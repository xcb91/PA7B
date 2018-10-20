public class Course{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents = 0;
public Course(){

}
  public Course(String courseName){
    this.courseName = courseName;
    //constructor
  }

  public String getCourseName(){
    return this.courseName;
  }
  public void setCourseName(String courseName){
    this.courseName = courseName;
  }

  public void addStudent(String student){
    this.students[numberOfStudents] = student;
    this.numberOfStudents ++;
  }
public void dropStudent(String student){
  //tarea
  for (int i=0; i <=   this.students.length-1;i++ ) {
      if (student.equals(this.students[i])) {
        this.students[i]=null;
      }else{
      }
    }
}
public String[] getStudents(){
  return this.students;
}
public int getNumberOfStudents(){
  return this.numberOfStudents;
}


}
