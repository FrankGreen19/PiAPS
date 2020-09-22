package Homework.HW2.FactoryMethod;

public class AmdPC implements PC{

    @Override
    public void turnOn() {
        System.out.println("AMD PC is turning on");
    };

    @Override
    public void reload() {
        System.out.println("AMD PC is reloading");
    }
}
