package Homework.HW1.Builder;

import Homework.HW1.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();

        PCBuilder pcBuilder = new PCBuilder();
        director.createDesktop(pcBuilder);

        PC pc = pcBuilder.getResult();
        System.out.println("PC built: " + pc.getType());

        System.out.println();
        databaseConnection.pcTableQuery(pc);

        PCManualBuilder pcManualBuilder = new PCManualBuilder();
        director.createDesktop(pcManualBuilder);

        PCManual pcManual = pcManualBuilder.getResult();
        pcManual.print();
    }
}

//выбрать 3 паттерна и реализовать в 1 предметной области

