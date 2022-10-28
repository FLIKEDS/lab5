package org.example.command;

import org.example.executiveClasses.OnOff;
import org.example.interfaces.MainMenu;

public class OffDevice implements MainMenu {
    private OnOff theOnOff;
    public OffDevice(OnOff onOff){
        this.theOnOff=onOff;
    }
    public void execute(){
        theOnOff.turnOff();
    }
}
