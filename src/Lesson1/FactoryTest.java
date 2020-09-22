package Lesson1;

class Factory {

    public OS getCurrentOs(String inputos) {
        OS os = null;

        if (inputos.equals("windows")) {
            os = new WindowsOS();
        } else if (inputos.equals("linux")){
            os = new LinuxOS();
        } else if (inputos.equals("mac")) {
            os = new MacOS();
        }

        return os;
    }
}

interface OS {
    void getOS();
}

class WindowsOS implements OS {
    public void getOS() {
        System.out.println("Применить для МАК");
    }
}

class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("For Linux");
    }
}

class MacOS implements OS {
    @Override
    public void getOS() {
        System.out.println("For Mac");
    }
}

public class FactoryTest {

    public static void main(String[] args) {
        String win = "mac";
        Factory factory = new Factory();
        OS os = factory.getCurrentOs(win);
        os.getOS();
    }
}