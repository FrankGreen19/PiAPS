package Homework.HW2;

import Homework.HW2.FactoryMethod.AmdWorker;
import Homework.HW2.FactoryMethod.DNS;
import Homework.HW2.Observer.Client;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Bob", "333333");
        DNS dns = new AmdWorker();

        dns.setClient(client);

        dns.testNewPC();
    }
}
