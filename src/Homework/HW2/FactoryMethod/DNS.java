package Homework.HW2.FactoryMethod;

import Homework.HW2.Decorator.SsdDecorator;
import Homework.HW2.Observer.Client;

import java.util.ArrayList;

public abstract class DNS {

    private Client client;

    public void subscribe(Client client) {
        this.client = client;
    }

    public void unSubscribe(Client client) {
        this.client = null;
    }

    public void notifyClient() {
        this.client.update();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void testNewPC() {

        PC pc = createPC();
        pc.turnOn();
        pc.reload();

//        pc = new SsdDecorator(pc);
//        pc.turnOn();

        System.out.println("*** Заказ выполнен ***\n");

        notifyClient();
    }

    public abstract PC createPC();

}
