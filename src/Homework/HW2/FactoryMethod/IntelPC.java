package Homework.HW2.FactoryMethod;

public class IntelPC implements PC {

    @Override
    public void turnOn() {
        System.out.println("Intel PC is turning on");
    };

    @Override
    public void reload() {
        System.out.println("Intel PC is reloading");
    }
}
