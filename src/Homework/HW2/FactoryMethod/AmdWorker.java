package Homework.HW2.FactoryMethod;

public class AmdWorker extends DNS {

    @Override
    public PC createPC() {
        return new AmdPC();
    }
}
