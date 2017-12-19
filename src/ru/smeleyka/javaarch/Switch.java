package ru.smeleyka.javaarch;

/**
 * Created by smeleyka on 19.12.17.
 */
public class Switch {
    private int id;
    private String vendor;
    private String model;
    private String location;

    public Switch(String vendor, String model, String location) {
        this.id = -1;
        this.vendor = vendor;
        this.model = model;
        this.location = location;
    }

    public Switch(int id, String vendor, String model, String location) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.location = location;
    }
}
