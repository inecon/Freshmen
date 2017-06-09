package mypackage;

import mypackage.func.PeopelsInit;

public class Main {

    public static void main(String[] args) {
        PeopelsInit peopleInit = new PeopelsInit();
        peopleInit.initStudents();
        peopleInit.initProffesor();

        System.out.println("                                 Студенты \n " +
                "----------------------------------------------------------------\n");

        for (int i = 0; i < peopleInit.getStudents().size(); i++) {
            peopleInit.getStudents().get(i).printInfo();
        }
        System.out.println(" ----------------------------------------------------------------\n " +
                "                               Профессоры \n");

        for (int i = 0; i < peopleInit.getProfessors().size(); i++) {
            peopleInit.getProfessors().get(i).printInfo();
        }

    }
}
