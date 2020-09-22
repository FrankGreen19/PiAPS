package Homework.HW2.FactoryMethod;

public class IntelWorker extends DNS {

    @Override
    public PC createPC() {
        return new IntelPC();
    }
}
