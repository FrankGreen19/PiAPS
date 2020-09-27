package Homework.HW3.Prototype;

import Homework.HW3.Memento.Snapshot;

public abstract class CPU {

    private double frequency;
    private int cores;

    public CPU() {
    }

    public CPU(CPU target) {
        if (target != null) {
            this.frequency = target.frequency;
            this.cores = target.cores;
        }
    }

    public abstract CPU clone();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CPU)) return false;
        CPU cpu2 = (CPU) object;
        return cpu2.cores == cores && cpu2.frequency == frequency;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
