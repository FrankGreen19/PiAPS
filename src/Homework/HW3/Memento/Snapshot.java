package Homework.HW3.Memento;


import Homework.HW3.Bridge.Bios;
import Homework.HW3.Prototype.CPU;

public class Snapshot {

    private Bios bios;
    private double frequency;

    public Snapshot(Bios bios, double frequency) {
        this.bios = bios;
        this.frequency = frequency;
    }

    public void restore() {
        bios.getCpu().setFrequency(frequency);
    }

    public double getFrequency() {
        return frequency;
    }
}
