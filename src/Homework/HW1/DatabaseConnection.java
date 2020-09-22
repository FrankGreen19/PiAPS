package Homework.HW1;

import Homework.HW1.Builder.PC;

public class DatabaseConnection {

    private String host = "localhost";
    private String database = "OnlinePcShop";
    private String password = "1234";
    private String port = "3306";

    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if (instance == null)
            instance = new DatabaseConnection();

        return instance;
    }

    public void pcTableQuery(PC pc) {
        System.out.println("**********************************************");
        System.out.println("Выполняется добавление в базу данных конфигурации ПК");
        System.out.println("PC configs:" + "\n" +
                "Type: " + pc.getType()+ "\n" +
                "CPU: " + pc.getCpu().getName() + "\n" +
                "VideoCard: " + pc.getVideoCard().getName() + "\n" +
                "Memory: " + pc.getMemory() + "\n" +
                "RAM: " + pc.getRAM());
        System.out.println("**********************************************");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }



    public static void main(String[] args) {

        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println(connection.port);
        connection.setPort("3307");
        System.out.println(connection.port);

    }


}
