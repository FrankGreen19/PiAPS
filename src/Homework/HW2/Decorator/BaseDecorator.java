package Homework.HW2.Decorator;

import Homework.HW2.FactoryMethod.PC;

public class BaseDecorator implements PC {

    protected PC wrappedPC;

    public BaseDecorator(PC pc) {
        wrappedPC = pc;
    }

    @Override
    public void turnOn() {
        wrappedPC.turnOn();
    }

    @Override
    public void reload() {
        wrappedPC.reload();
    }
}
