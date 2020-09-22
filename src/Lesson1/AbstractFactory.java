package Lesson1;

interface Lada {
    long getLadaPrice();
}

interface Ferrari {
    long getFerrariPrice();
}

interface Porsche {
    long getPorschePrice();
}

interface InteAbsFactory {
    Lada getLada();
    Ferrari getFerrari();
    Porsche getPorshe(int d);
}

class UaLadaTnpl implements Lada {
    @Override
    public long getLadaPrice() {
        return 1000;
    }
}

class UaFferrariTmpl implements  Ferrari {
    @Override
    public long getFerrariPrice() {
        return 10000;
    }
}

class UaPorsheTmpl implements Porsche {
    @Override
    public long getPorschePrice() {
        return 100000;
    }
}

class UaCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new UaLadaTnpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new UaFferrariTmpl();
    }

    @Override
    public Porsche getPorshe(int d) {
        if (d == 1)
            return new UaPorsheTmpl();
        if (d == 2)
            return new UaPorsheTmpl();
        return null;
    }
}

class RuLadaTmpl implements Lada {
    @Override
    public long getLadaPrice() {
        return 1000;
    }
}

class RuFerrariTmpl implements Ferrari {
    @Override
    public long getFerrariPrice() {
        return 10000;
    }
}

class RuPorsheTmol implements Porsche {
    @Override
    public long getPorschePrice() {
        return 1010100;
    }
}

class RuPorshe1Tmpl implements Porsche {
    @Override
    public long getPorschePrice() {
        return 1989890;
    }
}

class RuCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new RuLadaTmpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new RuFerrariTmpl();
    }

    @Override
    public Porsche getPorshe(int d) {
        if (d == 1)
            return new RuPorsheTmol();
        if (d == 2)
            return new RuPorshe1Tmpl();
        return null;
    }
}


public class AbstractFactory {
    public static void main(String[] args) {
        String country = "RU";
        InteAbsFactory inteAbsFactory = null;
        if (country.equals("UA")) {
                inteAbsFactory = new UaCarPriceAbsFactory();
        }
        else if (country.equals("RU")) {
            inteAbsFactory = new RuCarPriceAbsFactory();
        }

        Porsche porsche = inteAbsFactory.getPorshe(2);
        System.out.println(porsche.getPorschePrice());
    }
}
