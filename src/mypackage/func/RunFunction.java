package mypackage.func;

import mypackage.peoples.Professor;
import mypackage.peoples.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  This class makes almost all logic of program
 */
public class RunFunction {
    private ArrayList<Student> workingWithStudents;
    private ArrayList<Professor> workingWithProffesors;

    public RunFunction(ArrayList<Student> student, ArrayList<Professor> professor) {
        this.workingWithStudents = student;
        this.workingWithProffesors = professor;
    }

    /**
     * This method is a choice to enter in student menu or professors
     */
    public void startProgram() {
        Scanner sc = new Scanner(System.in);
        int answer1or2 = 0;
        System.out.println("Меню для студентов введите \"1\" \n Меню для профессоров введите  \"2\" \n" +
                "  Выйти из программы \"3\"");
        answer1or2 = sc.nextInt();
        switch (answer1or2) {
            case 1:
                classLeadElection();
                break;
            case 2:
                rollcall();
                break;
            case 3:
                exitProgram();
                break;
            default:
                System.out.println("Вы сделали неправильный выбор");
                startProgram();
        }
    }
    /**
     * This method is a choice to make class leader elections
     */
    public void classLeadElection() {
        Scanner sc = new Scanner(System.in);
        String answerYorN;
        System.out.println("Перейти к выбору старосты студентов? \n Введите \"Д\" если да или \"Н\" если нет");
        answerYorN = sc.next();
        switch (answerYorN) {
            case "Д":
                processOfElection();
                break;
            case "д":
                processOfElection();
                break;
            case "Н":
                exitProgram();
                break;
            case "н":
                exitProgram();
                break;
            default:
                System.out.println("Вы сделали неправильный выбор \n");
                exitProgram();
                break;
        }
    }
    /**
     * This method for professor to make rollcall
     */
    public void rollcall() {
        System.out.println("Проффесор проведите перекличку \n");
        System.out.println("Если студент присутвует введите \"1\" если отсутвует - \"2\"");
        for (int i = 0; i < workingWithStudents.size(); i++) {
            workingWithStudents.get(i).printInfo();
            boolean temp = isAbsent();
            workingWithStudents.get(i).setAbsent(temp);
        }

        System.out.println("-------------------Список студентов в классе -------------------");
        for (int i = 0; i < workingWithStudents.size(); i++) {
            workingWithStudents.get(i).printInfoWithAbsent();
        }
        exitProgram();
    }
    /**
     * In this method process of election of class leader
     */
    public void processOfElection() {
        System.out.println("Для выбора старосты введи номер студента\n");
        for (int i = 0; i < workingWithStudents.size(); i++) {
            workingWithStudents.get(i).printInfo();
        }

        for (int i = 0; i < workingWithStudents.size(); i++) {
            System.out.println("\n Студент № " + workingWithStudents.get(i).getId() + " " + workingWithStudents.get(i).getSurname() +
                    " " +  workingWithStudents.get(i).getName() + " Сделайте свой выбор");
            setLeadRate();
        }

        System.out.print("\n Старостой группы выбрали ");
        workingWithStudents.get(findStudentsLeadOfClass()).printInfo();
        System.out.print("\n");
        startProgram();
    }
    /**
     * This method need for student to making him/her vote class leader.
     */
    public void setLeadRate() {
        Scanner sc = new Scanner(System.in);
        int answerFrom1To5 = 0;
        answerFrom1To5 = sc.nextInt();
        switch (answerFrom1To5) {
            case 1:
                workingWithStudents.get(0).setLeadRate(workingWithStudents.get(0).getLeadRate() + 1);
                break;
            case 2:
                workingWithStudents.get(1).setLeadRate(workingWithStudents.get(1).getLeadRate() + 1);
                break;
            case 3:
                workingWithStudents.get(2).setLeadRate(workingWithStudents.get(2).getLeadRate() + 1);
                break;
            case 4:
                workingWithStudents.get(3).setLeadRate(workingWithStudents.get(3).getLeadRate() + 1);
                break;
            case 5:
                workingWithStudents.get(4).setLeadRate(workingWithStudents.get(4).getLeadRate() + 1);
                break;
            default:
                System.out.println("Вы сделали неправильный выбор\n Введите существующий номер студента из списка выше");
                setLeadRate();
        }
    }
    /**
     * This method finds class leader, but now if students have the same LeadRate method returns
     * first of ArrayList index student. logic can be improved :)
     */
    public int findStudentsLeadOfClass() {
        int max = 0;
        int studentNumber = -1;

        for (int i = 0; i < workingWithStudents.size(); i++) {
            if (max < workingWithStudents.get(i).getLeadRate()) {
                max = workingWithStudents.get(i).getLeadRate();
                studentNumber = i;
            }
        }
        return studentNumber;
    }
    /**
     * This method for professor to mark stodent is present or no
     */
    public boolean isAbsent() {
        Scanner sc = new Scanner(System.in);
        int answer1or2 = 0;
        boolean absent = false;
        answer1or2 = sc.nextInt();
        switch (answer1or2) {
            case 1:
                absent = true;
                break;
            case 2:
                absent = false;
                break;
            default:
                System.out.println("Вы сделали неправильный выбор. Введите 1 или 2");
                isAbsent();
        }
        return absent;
    }
    /**
     * This method gives to user choice to exit from program or no
     */
    public void exitProgram(){
        Scanner sc = new Scanner(System.in);
        int answer1or2 = 0;
        System.out.println("Выйти из программы \"1\" \n Продолжить  \"2\" ");
        answer1or2 = sc.nextInt();
        switch (answer1or2) {
            case 1:
                break;
            case 2:
                startProgram();
                break;
            default:
                System.out.println("Вы сделали неправильный выбор");
                exitProgram();
        }
    }
}
