package mypackage.test;

import mypackage.func.Group;
import mypackage.peoples.Student;
import org.junit.Test;

import static mypackage.func.Group.*;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void StudentShouldTakeCorrectData() {
        Student student = new Student(1, "Васин", "Дмитрий", true, "09.01.1983");
        student.setGroup(Group.GROUP_1);
        student.setAvgAttendanceRating(9.0);
        student.setAvgRating(8.5);

        assertEquals("Васин", student.getSurname());
        assertEquals("Дмитрий", student.getName());
        assertEquals(true, student.getSex());
        assertEquals("09.01.1983", student.getBirthDate());
        assertEquals(GROUP_1, student.getGroup());
        assertEquals(0, (Double.compare(9.0, student.getAvgAttendanceRating())));
        assertEquals(0, (Double.compare(8.5, student.getAvgRating())));
    }

}