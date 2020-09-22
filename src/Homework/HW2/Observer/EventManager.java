package Homework.HW2.Observer;

import java.util.ArrayList;

public class EventManager {

    public Client client;

    public void subscribe(Client client) {
        this.client = client;
    }

    public void unSubscribe(Client client) {
        this.client = null;
    }

    public void notifyClient() {
        this.client.update();
    }
}
