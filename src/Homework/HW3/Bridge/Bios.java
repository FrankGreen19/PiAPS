package Homework.HW3.Bridge;

import Homework.HW3.Memento.Snapshot;
import Homework.HW3.Prototype.CPU;

public class Bios {

//    public Snapshot snapshot;
    protected CPU cpu;
    private final double DANGER_FREQ = 5000;

    public Bios(Homework.HW3.Prototype.CPU cpu) {
        this.cpu = cpu;
    }

    public void frequencyUp(double coefficient) {
        double currentFreq = cpu.getFrequency();
        cpu.setFrequency(currentFreq + coefficient);
    }

    public void frequencyDown(double coefficient) throws Exception {
        double currentFreq = cpu.getFrequency();
        if (currentFreq < coefficient)
            throw new Exception("Current frequency lower than coefficient!");
        else
            cpu.setFrequency(currentFreq - coefficient);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, this.getCpu().getFrequency());
    }

//    public void createSnapshot(double frequency) {
//        this.snapshot = new Snapshot(frequency);
//    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(Homework.HW3.Prototype.CPU cpu) {
        this.cpu = cpu;
    }
}
