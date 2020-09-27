package Homework.HW2.FactoryMethod;

public class IntelPC implements PC {

    @Override
    public void turnOn() {
        System.out.println("IntelCPU PC is turning on");
    };

    @Override
    public void reload() {
        System.out.println("IntelCPU PC is reloading");
    }
}
