package Homework.HW1.Builder;


import Homework.HW1.Builder.components.CPU;
import Homework.HW1.Builder.components.VideoCard;

public class PCManualBuilder implements Builder{
    private Type type;
    private CPU cpu;
    private VideoCard videoCard;
    private int RAM;
    private int memory;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public PCManual getResult() {
        return new PCManual(type, cpu, videoCard, RAM, memory);
    }
}
