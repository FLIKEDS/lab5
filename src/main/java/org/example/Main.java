package org.example;

import org.example.command.OffDevice;
import org.example.command.OnDevice;
import org.example.executiveClasses.OnOff;
import org.example.interfaces.MainMenu;
import org.example.invoker.Switch;

public class Main {
    public static void main(String[] args) {
        // створюємо об'єкт
        OnOff l=new OnOff();
        // створюємо об'єкти для всіх можливостей:
        MainMenu switchUp=new OnDevice(l);
        MainMenu switchDown=new OffDevice(l);

        // Створюємо invoker,з яким ми будемо контактувати:
        Switch s=new Switch(switchUp,switchDown);

        // вот проверка этого, используем методы:
        s.flipUp();
        s.flipDown();

    }
}