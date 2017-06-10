package mypackage.peoples;

import mypackage.func.Group;

/**
 *
 */
public class Student extends Human {

    private Group group;
    private double avgRating;
    private double avgAttendanceRating;
    private int leadRate = 0;

    private boolean absent;

    public Student(int id, String surname, String name, boolean sex, String birthDate) {
        super(id, surname, name, sex, birthDate);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Группа: " + group + ", успеваемость: " + avgRating + ", посещаемость: " + avgAttendanceRating);
    }

    public void printInfoWithAbsent() {
        super.printInfo();
        System.out.printf("Группа: " + group + " (%s) ", absent ? "присутствует" : "отсутсвует");
        System.out.println("\n");
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

    public int getLeadRate() {
        return leadRate;
    }

    public void setLeadRate(int leadRate) {
        this.leadRate = leadRate;
    }

    public boolean getAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }
}
