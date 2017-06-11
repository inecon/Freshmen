package mypackage;

import mypackage.func.PeopelsInit;
import mypackage.func.RunFunction;

public class Main {

    public static void main(String[] args) {
        PeopelsInit peopleInit = new PeopelsInit();
        //manual initialization
        peopleInit.initStudents();
        peopleInit.initProffesor();
        //print list of students and professors
        peopleInit.printInit();

        RunFunction runFunction = new RunFunction(peopleInit.getStudents(), peopleInit.getProfessors());
        runFunction.startProgram();
    }
}
