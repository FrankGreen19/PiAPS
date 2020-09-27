package Homework.HW3.Prototype;

public class AmdCPU extends CPU{

    private Force force = Force.MULTICORE;
    private String model;

    public AmdCPU(AmdCPU target) {
        super(target);
        if (target != null)
            this.model = target.model;
    }

    public AmdCPU() {

    }

    @Override
    public CPU clone() {
        return new AmdCPU(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof AmdCPU) || !super.equals(object2)) return false;
        AmdCPU amdCPU = (AmdCPU) object2;
        return amdCPU.model == model;
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
