package Homework.HW1.Builder.components;

public class CPU {
    private String name;
    private int frequency;
    private int coreNum;

    public CPU(String name, int frequency, int cNum) {
        this.name = name;
        this.frequency = frequency;
        this.coreNum = cNum;
    }

    public String getName() {
        return name;
    }
}
