package Homework.HW2.Observer;

public class Client implements Observer {

    private String name;
    private String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void update() {
        System.out.println("Сообщение об окончании работ доставлено клиенту: " + this.name);
    }
}
