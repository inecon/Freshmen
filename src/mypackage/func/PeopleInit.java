package mypackage.func;

import mypackage.peoples.Professor;
import mypackage.peoples.Student;

import java.util.ArrayList;

/**
 * This class is initialized students and professors
 */
public class PeopleInit {
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Professor> professors = new ArrayList();

    public ArrayList<Student> initStudents() {
        students.add(new Student(students.size() + 1, "Васин", "Дмитрий", true, "09.01.1983"));
        students.get(0).setGroup(Group.GROUP_1);
        students.get(0).setAvgAttendanceRating(8.0);
        students.get(0).setAvgRating(7.0);

        students.add(new Student(students.size() + 1, "Попов", "Константин", true, "01.06.1984"));
        students.get(1).setGroup(Group.GROUP_1);
        students.get(1).setAvgAttendanceRating(6.5);
        students.get(1).setAvgRating(6.0);

        students.add(new Student(students.size() + 1, "Иванов", "Михаил", true, "06.10.1985"));
        students.get(2).setGroup(Group.GROUP_1);
        students.get(2).setAvgAttendanceRating(9.0);
        students.get(2).setAvgRating(8.5);

        students.add(new Student(students.size() + 1, "Шевченко", "Анна", false, "12.15.1984"));
        students.get(3).setGroup(Group.GROUP_1);
        students.get(3).setAvgAttendanceRating(8.0);
        students.get(3).setAvgRating(7.0);

        students.add(new Student(students.size() + 1, "Пархоменко", "Тарас", true, "15.07.1982"));
        students.get(4).setGroup(Group.GROUP_1);
        students.get(4).setAvgAttendanceRating(6.8);
        students.get(4).setAvgRating(8.3);

        return students;
    }

    public ArrayList<Professor> initProffesor() {
        professors.add(new Professor(professors.size() + 1, "Измаилов", "Вениамин", true, "05.05.1954"));
        professors.get(0).setSpecialization("Математика");

        return professors;
    }

    /**
     * Prints table of people of manual (hardcode :) ) initialization
     */
    public void printInit() {
        System.out.println("                                 Список студентов \n " +
                "----------------------------------------------------------------\n");

        for (int i = 0; i < students.size(); i++) {
            students.get(i).printInfo();
        }
        System.out.println(" ----------------------------------------------------------------\n " +
                "                               Список профессоров \n");

        for (int i = 0; i < professors.size(); i++) {
            professors.get(i).printInfo();
        }
        System.out.println("\n\n");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }
}
