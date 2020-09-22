package Homework.HW1.Builder;


import Homework.HW1.Builder.components.CPU;
import Homework.HW1.Builder.components.VideoCard;

public class PC {
    private final Type type;
    private final CPU cpu;
    private final VideoCard videoCard;
    private final int RAM;
    private final int memory;

    public PC(Type type, CPU cpu, VideoCard card,
              int ram, int memory) {
        this.cpu = cpu;
        this.videoCard = card;
        this.RAM = ram;
        this.memory = memory;
        this.type = type;
    }

    public CPU getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getRAM() {
        return RAM;
    }

    public Type getType() {
        return type;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
