package org.example.executiveClasses;

public class Devices {
    String name;
    int capacity;
    String color;
    int weight;
    boolean onOff;
    Devices devices[] = new Devices[10];

    public Devices(String name, int capacity, String color, int weight) {
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.weight = weight;
        this.onOff = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isOnOff() {
        return onOff;
    }
}
