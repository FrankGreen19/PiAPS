package Homework.HW2.Decorator;

import Homework.HW2.FactoryMethod.PC;

public class SsdDecorator extends BaseDecorator {

    public SsdDecorator(PC pc) {
        super(pc);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("* Вместе с SSD-диском!");
    }

    @Override
    public void reload() {
        super.reload();
        System.out.println("* Вместе с SSD-диском!");
    }
}
