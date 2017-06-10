package mypackage.test;

import mypackage.peoples.Professor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 09.06.2017.
 */
public class ProfessorTest {
    @Test
    public void ProffessorShouldTakeCorrectData() {
        Professor professor = new Professor(1, "Павлов", "Борис", true, "01.01.1954");
        professor.setSpecialization("Математика");

        assertEquals("Павлов", professor.getSurname());
        assertEquals("Борис", professor.getName());
        assertEquals(true, professor.getSex());
        assertEquals("01.01.1954", professor.getBirthDate());
        assertEquals("Математика", professor.getSpecialization());
    }

}