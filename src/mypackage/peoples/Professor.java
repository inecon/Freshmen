package mypackage.peoples;

/**
 *
 */
public class Professor extends Human {

    String specialization;

    public Professor(int id, String surname, String name, boolean sex, String birthDate) {
        super(id, surname, name, sex, birthDate);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Специальность: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
