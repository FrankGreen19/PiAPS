package Homework.HW3.Prototype;

import Homework.HW3.Bridge.Bios;
import Homework.HW3.Command.BackupTeam;
import Homework.HW3.Memento.Snapshot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Homework.HW3.Prototype.CPU> cpus = new ArrayList<Homework.HW3.Prototype.CPU>();
        ArrayList<Homework.HW3.Prototype.CPU> cpuClones = new ArrayList<Homework.HW3.Prototype.CPU>();

        IntelCPU coreI3 = new IntelCPU();
        coreI3.setModel("I3 10100");
        cpus.add(coreI3);

        IntelCPU anotherIntelI3 = (IntelCPU) coreI3.clone();
        cpus.add(anotherIntelI3);

        System.out.println(anotherIntelI3.getModel());

        AmdCPU ryzen3 = new AmdCPU();
        ryzen3.setModel("Ryzen 3 1200");
        ryzen3.setFrequency(4000);
        cpus.add(ryzen3);

        //мост, снимок
        Bios bios = new Bios(ryzen3);
        BackupTeam backupTeam = new BackupTeam(bios);
        bios.frequencyUp(200);
        System.out.println(ryzen3.getFrequency() + " Мгц");
        backupTeam.makeBackup();
        System.out.println(ryzen3.getFrequency());



    }

}
