package mypackage.peoples;

/**
 *
 */
public abstract class Human {

    private String surname;
    private String name;
    private int id;
    /*
    * sex if true - male, false - female
     */
    private boolean sex;
    private String birthDate;

    public Human(int id, String surname, String name, boolean sex, String birthDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public void printInfo() {
        System.out.printf("#" + id + " " + surname + " " + name + " (%s) ", sex == true ? "м" : "ж");
        System.out.print("(" + birthDate + "), ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
