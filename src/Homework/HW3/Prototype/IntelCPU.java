package Homework.HW3.Prototype;

public class IntelCPU extends CPU {

    private Force force = Force.PERFORMANCE_PER_CORE;
    private String model;

    public IntelCPU(IntelCPU target) {
        super(target);
        if (target != null)
            this.model = target.model;
    }

    public IntelCPU() {

    }

    @Override
    public CPU clone() {
        return new IntelCPU(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof  IntelCPU) || !super.equals(object2)) return false;
        IntelCPU intelCPU2 = (IntelCPU) object2;
        return intelCPU2.model == model;
    }


    public Force getForce() {
        return force;
    }

    public void setForce(Force force) {
        this.force = force;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
