package mypackage.peoples;

import mypackage.func.Group;

/**
 *
 */
public class Student extends Human {

    private Group group;
    private double avgRating;
    private double avgAttendanceRating;//посматреть про инициализацию

    public Student(String surname, String name, boolean sex, String birthDate) {
        super(surname, name, sex, birthDate);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Группа: " + group + ", успеваемость: " + avgRating + ", посещаемость: " + avgAttendanceRating);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public double getAvgAttendanceRating() {
        return avgAttendanceRating;
    }

    public void setAvgAttendanceRating(double avgAttendanceRating) {
        this.avgAttendanceRating = avgAttendanceRating;
    }
}
