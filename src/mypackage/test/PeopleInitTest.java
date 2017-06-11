package mypackage.test;

import mypackage.func.Group;
import mypackage.peoples.Professor;
import mypackage.peoples.Student;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
public class PeopleInitTest {
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Professor> professors = new ArrayList();

    @Test
    public void initStudents_test() throws Exception {
        students.add(new Student(1, "Васин", "Дмитрий", true, "09.01.1983"));
        students.get(0).setGroup(Group.GROUP_1);
        students.get(0).setAvgAttendanceRating(8.0);
        students.get(0).setAvgRating(7.0);

        students.add(new Student(2, "Попов", "Константин", true, "01.06.1984"));
        students.get(1).setGroup(Group.GROUP_1);
        students.get(1).setAvgAttendanceRating(6.5);
        students.get(1).setAvgRating(6.0);

        assertEquals(2, students.size());
    }

    @Test
    public void initProffesor_test() throws Exception {
        professors.add(new Professor(1, "Измаилов", "Вениамин", true, "05.05.1954"));
        professors.get(0).setSpecialization("Математика");

        professors.add(new Professor(2, "Попов", "Иван", false, "05.05.1954"));
        professors.get(0).setSpecialization("Физика");

        assertEquals(2, professors.size());
    }
}