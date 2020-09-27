package Homework.HW3.Command;

import Homework.HW3.Bridge.Bios;
import Homework.HW3.Memento.Snapshot;

public class BackupTeam {

    private Bios bios;
    private Snapshot backup;

    public BackupTeam(Bios bios) {
        this.bios = bios;
        backup = bios.createSnapshot();
    }

    public void makeBackup() {
        if (backup != null)
            backup.restore();
        else
            System.out.println("Stack is empty");
    }
}
