package org.example.command;

import org.example.executiveClasses.OnOff;
import org.example.interfaces.MainMenu;

public class OnDevice implements MainMenu {
    private OnOff theOnOff;
    public OnDevice(OnOff onOff){
        this.theOnOff=onOff;
    }
    public void execute(){
        theOnOff.turnOn();
    }
}
