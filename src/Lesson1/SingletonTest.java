package Lesson1;

class Singleton
{
    private static Singleton instance = null;
    private String login;

    private Singleton()
    {
        login = "NAME";
    }


    private Singleton(String login)
    {
        this.login = login;
    }

    public static Singleton getInstance() {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public void setUp (String login)
    {
        this.login= login;
        System.out.println(login);
    }

    public void output()
    {
        System.out.println(login);
    }
}

public class SingletonTest
{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        singleton.output();
        singleton1.output();
        singleton.setUp("LOGIN");
        singleton.output();
        singleton1.output();
    }
}