package Homework.HW1.Builder.components;

public class VideoCard {
    private String name;
    private int frequency;
    private int vRam;

    public VideoCard(String name, int frequency, int vRam) {
        this.name = name;
        this.frequency = frequency;
        this.vRam = vRam;
    }

    public String getName() {
        return name;
    }
}
