package Homework.HW1.Builder;

import Homework.HW1.Builder.components.CPU;
import Homework.HW1.Builder.components.VideoCard;

public class PCManual {
    private Type type;
    private CPU cpu;
    private VideoCard videoCard;
    private int RAM;
    private int memory;

    public PCManual(Type type, CPU cpu, VideoCard card, int ram, int memory) {
        this.cpu = cpu;
        this.videoCard = card;
        this.RAM = ram;
        this.memory = memory;
        this.type = type;
    }

    public void print() {
        System.out.println("PC configs:" + "\n" +
                 "Type: " + this.type + "\n" +
                "CPU: " + cpu.getName() + "\n" +
                "VideoCard: " + this.videoCard.getName() + "\n" +
                "Memory: " + this.memory + "\n" +
                "RAM: " + this.RAM);
    }
}
