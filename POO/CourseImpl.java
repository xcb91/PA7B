import javax.swing.*;
public class CourseImpl{
public static void main(String[] args) {

  /*JOptionPane.showMessageDialog(null,curso1.getCourseName());

  Course curso3 = new Course("Programacion");
  curso3.addStudent("Agustin");
  curso3.addStudent("juan");
  curso3.addStudent("tou");




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
*/

Course curso1 = new Course();

int opc=0;

 do {
     opc= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ingresar nuevo Curso"+" \n"+"2.Ingresar alumno"+
     "\n" +"4.Mostrar alumno"+ "\n"+"3.Eliminar alumno" ,"¿Que desea hacer?",JOptionPane.WARNING_MESSAGE));
     switch(opc){
       case 1:
       String cn = JOptionPane.showInputDialog(null,"Introduse el nombre del Curso");
       curso1.setCourseName(cn);
         JOptionPane.showMessageDialog(null,curso1.getCourseName());
         break;
       case 2:
       String as= JOptionPane.showInputDialog(null,"Introduzca el nombre del alumno");
       curso1.addStudent(as);

       break;

       case 3:
       String Alum=JOptionPane.showInputDialog(null, "\nIngrese el nombre del alumno que desea eliminar");
       curso1.dropStudent(Alum);


       break;
       case 4:
         JOptionPane.showMessageDialog(null,curso1.getStudents());
       break;

     }
 }while(true);




}
}
