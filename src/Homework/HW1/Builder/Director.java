package Homework.HW1.Builder;


import Homework.HW1.Builder.components.CPU;
import Homework.HW1.Builder.components.VideoCard;

public class Director {

    public void createDesktop(Builder builder) {
        builder.setType(Type.DESKTOP);
        builder.setCPU(new CPU("AMD", 4500, 8));
        builder.setVideoCard(new VideoCard("NVIDIA", 1500, 4));
        builder.setMemory(2);
        builder.setRAM(16);
    }

    public void createNotebook(Builder builder) {
        builder.setType(Type.NOTEBOOK);
        builder.setCPU(new CPU("IntelCPU", 2300, 4));
        builder.setVideoCard(new VideoCard("NVIDIA", 1500, 4));
        builder.setMemory(1);
        builder.setRAM(8);
    }

    public void createTablet(Builder builder) {
        builder.setType(Type.TABLET);
        builder.setCPU(new CPU("Snapdragon", 1500, 2));
        builder.setVideoCard(null);
        builder.setMemory(1);
        builder.setRAM(16);
    }
}
