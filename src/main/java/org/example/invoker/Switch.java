package org.example.invoker;

import org.example.interfaces.MainMenu;
public class Switch {
    private MainMenu flipUpCommand;
    private MainMenu flipDownCommand;

    public Switch(MainMenu flipUpCommand,MainMenu flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}
