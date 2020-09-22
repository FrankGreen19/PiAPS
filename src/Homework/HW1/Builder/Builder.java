package Homework.HW1.Builder;


import Homework.HW1.Builder.components.CPU;
import Homework.HW1.Builder.components.VideoCard;

public interface Builder {
    void setType(Type type);
    void setCPU(CPU cpu);
    void setVideoCard(VideoCard card);
    void setRAM(int ram);
    void setMemory(int memory);
}
