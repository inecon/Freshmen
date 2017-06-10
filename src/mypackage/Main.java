package mypackage;

import mypackage.func.PeopelsInit;
import mypackage.func.RunFunction;

public class Main {

    public static void main(String[] args) {
        PeopelsInit peopleInit = new PeopelsInit();
        peopleInit.initStudents();
        peopleInit.initProffesor();

        System.out.println("                                 Список студентов \n " +
                "----------------------------------------------------------------\n");

        for (int i = 0; i < peopleInit.getStudents().size(); i++) {
            peopleInit.getStudents().get(i).printInfo();
        }
        System.out.println(" ----------------------------------------------------------------\n " +
                "                               Список профессоров \n");

        for (int i = 0; i < peopleInit.getProfessors().size(); i++) {
            peopleInit.getProfessors().get(i).printInfo();
        }
        System.out.println("\n\n");

        RunFunction runFunction = new RunFunction(peopleInit.getStudents(), peopleInit.getProfessors());
        runFunction.makingChoise();
    }
}
