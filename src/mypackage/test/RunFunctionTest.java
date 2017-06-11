package mypackage.test;

import mypackage.func.Group;
import mypackage.func.RunFunction;
import mypackage.peoples.Professor;
import mypackage.peoples.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RunFunctionTest {
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Professor> professors = new ArrayList();

    @Before
    public void init() {
        students.add(new Student(1, "Васин", "Дмитрий", true, "09.01.1983"));
        students.get(0).setGroup(Group.GROUP_1);
        students.get(0).setAvgAttendanceRating(8.0);
        students.get(0).setAvgRating(7.0);
        students.get(0).setLeadRate(1);

        students.add(new Student(2, "Попов", "Константин", true, "01.06.1984"));
        students.get(1).setGroup(Group.GROUP_1);
        students.get(1).setAvgAttendanceRating(6.5);
        students.get(1).setAvgRating(6.0);
        students.get(1).setLeadRate(2);

        students.add(new Student(students.size() + 1, "Иванов", "Михаил", true, "06.10.1985"));
        students.get(2).setGroup(Group.GROUP_1);
        students.get(2).setAvgAttendanceRating(9.0);
        students.get(2).setAvgRating(8.5);
        students.get(2).setLeadRate(3);

        professors.add(new Professor(1, "Измаилов", "Вениамин", true, "05.05.1954"));
        professors.get(0).setSpecialization("Математика");

        professors.add(new Professor(2, "Попов", "Иван", false, "05.05.1954"));
        professors.get(0).setSpecialization("Физика");
    }

    @Test
    public void findStudentsLeadOfClass_test_ShouldReturnCorrectNumberOfStudentsLead() {
        RunFunction runFunction = new RunFunction(students, professors);
        assertEquals(2, runFunction.findStudentsLeadOfClass());
    }
}