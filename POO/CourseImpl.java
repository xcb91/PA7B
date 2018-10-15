import javax.swing.*;
public class CourseImpl{
public static void main(String[] args) {
  Course curso1 =new Course();
  //curso1.courseNae = "Ingles";
curso1.setCourseName("inglés");
curso1.addStudent("Luis");
curso1.addStudent("maria");
curso1.addStudent("pedro");

String [] studentsDeIngles = curso1.getStudents();
String students = "";
for (int i =0;i< curso1.getNumberOfStudents(); i++){
 students += studentsDeIngles[i] + "\n";
}

JOptionPane.showMessageDialog(null, students);

Course curso2 = new Course();
curso2.setCourseName("Mate");
curso2.addStudent("Angel");
curso2.addStudent("steven");


  JOptionPane.showMessageDialog(null,curso1.getCourseName());


}
}
